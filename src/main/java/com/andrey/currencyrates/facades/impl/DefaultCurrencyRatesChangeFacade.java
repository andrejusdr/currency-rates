package com.andrey.currencyrates.facades.impl;

import static com.andrey.currencyrates.utils.DateFormatResolvingUtil.getLocalDateFromString;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.NodeList;

import com.andrey.currencyrates.converters.CurrencyRateToCurrencyRateChangeConverter;
import com.andrey.currencyrates.converters.NodeToCurrencyRateDataConverter;
import com.andrey.currencyrates.data.CurrencyRateChangeData;
import com.andrey.currencyrates.data.CurrencyRateData;
import com.andrey.currencyrates.facades.CurrencyRatesChangeFacade;
import com.andrey.currencyrates.services.CurrencyRatesService;

@Component
public class DefaultCurrencyRatesChangeFacade implements CurrencyRatesChangeFacade {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultCurrencyRatesChangeFacade.class);

    private final CurrencyRatesService currencyRatesService;
    private final NodeToCurrencyRateDataConverter nodeToCurrencyRateDataConverter;
    private final CurrencyRateToCurrencyRateChangeConverter currencyRateToCurrencyRateChangeConverter;

    @Autowired
    public DefaultCurrencyRatesChangeFacade(final CurrencyRatesService currencyRatesService,
                                            final NodeToCurrencyRateDataConverter nodeToCurrencyRateDataConverter,
                                            final CurrencyRateToCurrencyRateChangeConverter currencyRateToCurrencyRateChangeConverter) {
        this.currencyRatesService = currencyRatesService;
        this.nodeToCurrencyRateDataConverter = nodeToCurrencyRateDataConverter;
        this.currencyRateToCurrencyRateChangeConverter = currencyRateToCurrencyRateChangeConverter;
    }

    @Override
    public List<CurrencyRateChangeData> getCurrencyRatesChangeByDate(final String dateValue) {
        final LocalDate date = getLocalDateFromString(dateValue);

        final NodeList actualCurrencyRates = currencyRatesService.getExchangeRatesByDate(date.toString());
        final NodeList oneDayBeforeCurrencyRates = currencyRatesService.getExchangeRatesByDate(date.minusDays(1).toString());

        if (actualCurrencyRates == null || oneDayBeforeCurrencyRates == null) {
            LOG.error("Unable to process currency rates. actualCurrencyRates or oneDayBeforeCurrencyRates can not be empty");
            return Collections.emptyList();
        }

        return getCurrencyRateChangeData(actualCurrencyRates, oneDayBeforeCurrencyRates);
    }

    private List<CurrencyRateChangeData> getCurrencyRateChangeData(final NodeList actualCurrencyRates, final NodeList oneDayBeforeCurrencyRates) {
        final Map<String, CurrencyRateData> actualCurrencyRateData = getCurrencyRateDataList(actualCurrencyRates);
        final Map<String, CurrencyRateData> oneDayBeforeCurrencyRateData = getCurrencyRateDataList(oneDayBeforeCurrencyRates);

        return getSortedCurrencyRateChangeList(actualCurrencyRateData, oneDayBeforeCurrencyRateData);
    }

    private Map<String, CurrencyRateData> getCurrencyRateDataList(final NodeList nodeList) {
        return IntStream.range(0, nodeList.getLength()).mapToObj(i -> nodeToCurrencyRateDataConverter.convert(nodeList.item(i))).filter(Objects::nonNull).collect(Collectors.toMap(CurrencyRateData::getCurrency, convertedCurrencyRateData -> convertedCurrencyRateData));
    }

    private List<CurrencyRateChangeData> getSortedCurrencyRateChangeList(final Map<String, CurrencyRateData> actual, final Map<String, CurrencyRateData> oneDayBefore) {
        final List<CurrencyRateChangeData> currencyRateChangeDataList =
                actual.values().stream().map(currencyRateToCurrencyRateChangeConverter::convert).collect(Collectors.toList());

        currencyRateChangeDataList.forEach(currencyRateChange -> currencyRateChange.setRateChange(
                actual.get(currencyRateChange.getCurrency()).getRate().subtract(
                        oneDayBefore.get(currencyRateChange.getCurrency()).getRate())));

        return sortByBiggerRateIncrease(currencyRateChangeDataList);
    }

    private List<CurrencyRateChangeData> sortByBiggerRateIncrease(final List<CurrencyRateChangeData> unsortedList) {
        return unsortedList.stream().sorted(Comparator.comparing(CurrencyRateChangeData::getRateChange)
                .reversed()).collect(Collectors.toList());
    }
}
