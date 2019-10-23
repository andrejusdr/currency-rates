package com.andrey.currencyrates.converters;

import com.andrey.currencyrates.data.CurrencyRateData;
import com.andrey.currencyrates.services.CurrencyRatesService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.NodeList;

import java.math.BigDecimal;

import static com.andrey.currencyrates.utils.NodeListParserUtil.getNodeList;
import static org.mockito.Mockito.atLeastOnce;


@SpringBootTest
public class NodeToCurrencyRateDataConverterTest {

    private final static String DATE_ACTUAL = "2013-01-02";
    private final static String ACTUAL_XML_RESPONSE = "src/test/resources/getExchangeRatesByDate.xml";

    @Mock
    private CurrencyRatesService service;

    private NodeToCurrencyRateDataConverter nodeToCurrencyRateDataConverter;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        Mockito.reset(service);

        final NodeList actualDateNodeList = getNodeList(ACTUAL_XML_RESPONSE);
        Mockito.when(service.getExchangeRatesByDate(DATE_ACTUAL)).thenReturn(actualDateNodeList);

        nodeToCurrencyRateDataConverter = new NodeToCurrencyRateDataConverter();
    }

    @Test
    public void shouldConvertNodeToRateData() {
        final NodeList result = service.getExchangeRatesByDate(DATE_ACTUAL);
        Assert.assertEquals(88, result.getLength());

        final CurrencyRateData currencyRateData = nodeToCurrencyRateDataConverter.convert(result.item(0));

        Mockito.verify(service, atLeastOnce()).getExchangeRatesByDate(DATE_ACTUAL);

        Assert.assertNotNull("currencyRateData should not be null", currencyRateData);
        Assert.assertEquals("currencyRateData should contain date value", "2013.01.02", currencyRateData.getDate());
        Assert.assertEquals("currencyRateData should contain currency value", "AED", currencyRateData.getCurrency());
        Assert.assertEquals("currencyRateData should contain quantity value", "10", currencyRateData.getQuantity());
        Assert.assertEquals("currencyRateData should contain rate value", BigDecimal.valueOf(7.0949),
                currencyRateData.getRate());
        Assert.assertEquals("currencyRateData should contain unit value", "LTL per 10 currency units",
                currencyRateData.getUnit());
    }
}