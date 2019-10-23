package com.andrey.currencyrates.converters;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.andrey.currencyrates.data.CurrencyRateChangeData;
import com.andrey.currencyrates.data.CurrencyRateData;

@SpringBootTest
public class CurrencyRateToCurrencyRateChangeConverterTest {

    private CurrencyRateToCurrencyRateChangeConverter currencyRateToCurrencyRateChangeConverter;
    private CurrencyRateData currencyRateData;

    @Before
    public void init() {
        currencyRateToCurrencyRateChangeConverter = new CurrencyRateToCurrencyRateChangeConverter();

        currencyRateData = new CurrencyRateData();
        currencyRateData.setDate("2013.01.01");
        currencyRateData.setCurrency("AED");
        currencyRateData.setQuantity("10");
        currencyRateData.setRate(BigDecimal.valueOf(7.0949));
        currencyRateData.setUnit("LTL per 10 currency units");
    }

    @Test
    public void shouldConvertToCurrencyRateChange() {
        final CurrencyRateChangeData currencyRateChangeData = currencyRateToCurrencyRateChangeConverter.convert(currencyRateData);

        Assert.assertNotNull("currencyRateChangeData should not be null", currencyRateChangeData);
        Assert.assertEquals("currencyRateData and currencyRateChangeData should contain same date value", currencyRateData.getDate(), currencyRateChangeData.getDate());
        Assert.assertEquals("currencyRateData and currencyRateChangeData should contain same currency value", currencyRateData.getCurrency(), currencyRateChangeData.getCurrency());
        Assert.assertEquals("currencyRateData and currencyRateChangeData should contain same rate value", currencyRateData.getRate(), currencyRateChangeData.getRate());
    }
}