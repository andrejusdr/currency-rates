package com.andrey.currencyrates.facades.impl;

import static com.andrey.currencyrates.utils.NodeListParserUtil.getNodeList;
import static org.mockito.Mockito.atLeastOnce;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.NodeList;

import com.andrey.currencyrates.converters.CurrencyRateToCurrencyRateChangeConverter;
import com.andrey.currencyrates.converters.NodeToCurrencyRateDataConverter;
import com.andrey.currencyrates.data.CurrencyRateChangeData;
import com.andrey.currencyrates.services.CurrencyRatesService;


@SpringBootTest
public class CurrencyRatesChangeFacadeTest
{

	private final static String DATE_ACTUAL = "2013-01-02";
	private final static String DATE_BEFORE = "2013-01-01";
	private final static String ACTUAL_XML_RESPONSE = "src/test/resources/getExchangeRatesByDate.xml";
	private final static String PREVIOUS_DAY_XML_RESPONSE = "src/test/resources/getExchangeRatesDayBefore.xml";

	@Mock
	private CurrencyRatesService service;

	private CurrencyRateToCurrencyRateChangeConverter currencyRateToCurrencyRateChangeConverter;
	private NodeToCurrencyRateDataConverter nodeToCurrencyRateDataConverter;
	private DefaultCurrencyRatesChangeFacade facade;

	@Before
	public void init()
	{
		MockitoAnnotations.initMocks(this);
		Mockito.reset(service);

		final NodeList actualDateNodeList = getNodeList(ACTUAL_XML_RESPONSE);
		final NodeList previousDayNodeList = getNodeList(PREVIOUS_DAY_XML_RESPONSE);

		Mockito.when(service.getExchangeRatesByDate(DATE_ACTUAL)).thenReturn(actualDateNodeList);
		Mockito.when(service.getExchangeRatesByDate(DATE_BEFORE)).thenReturn(previousDayNodeList);

		currencyRateToCurrencyRateChangeConverter = new CurrencyRateToCurrencyRateChangeConverter();
		nodeToCurrencyRateDataConverter = new NodeToCurrencyRateDataConverter();
		facade = new DefaultCurrencyRatesChangeFacade(service, nodeToCurrencyRateDataConverter,
				currencyRateToCurrencyRateChangeConverter);
	}

	@Test
	public void shouldReturnListOfCurrencyChanges()
	{
		final List<CurrencyRateChangeData> currencyRateChangeDataList = facade
				.getCurrencyRatesChangeByDate(DATE_ACTUAL);

		Mockito.verify(service, atLeastOnce()).getExchangeRatesByDate(DATE_ACTUAL);
		Mockito.verify(service, atLeastOnce()).getExchangeRatesByDate(DATE_BEFORE);

		Assert.assertFalse("currencyRateChangeDataList should not be empty", currencyRateChangeDataList.isEmpty());
		Assert.assertNotNull("CurrencyRateChangeData should not be null", currencyRateChangeDataList.get(0));
	}

	@Test
	public void shouldReturnSortedList()
	{
		final List<CurrencyRateChangeData> currencyRateChangeDataList = facade
				.getCurrencyRatesChangeByDate(DATE_ACTUAL);
		final CurrencyRateChangeData first = currencyRateChangeDataList.get(0);
		final CurrencyRateChangeData last = currencyRateChangeDataList.get(currencyRateChangeDataList.size() - 1);

		Assert.assertTrue("currencyRateChangeDataList should be reverse sorted by rate change",
				first.getRateChange().doubleValue() > last.getRateChange().doubleValue());
	}
}