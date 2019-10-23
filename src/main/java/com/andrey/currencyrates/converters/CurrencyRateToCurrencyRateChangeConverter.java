package com.andrey.currencyrates.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.andrey.currencyrates.data.CurrencyRateChangeData;
import com.andrey.currencyrates.data.CurrencyRateData;

@Component
public class CurrencyRateToCurrencyRateChangeConverter implements Converter<CurrencyRateData, CurrencyRateChangeData> {
    @Override
    public CurrencyRateChangeData convert(final CurrencyRateData currencyRateData) {
        final CurrencyRateChangeData currencyRateChangeData = new CurrencyRateChangeData();
        currencyRateChangeData.setDate(currencyRateData.getDate());
        currencyRateChangeData.setCurrency(currencyRateData.getCurrency());
        currencyRateChangeData.setRate(currencyRateData.getRate());
        return currencyRateChangeData;
    }
}
