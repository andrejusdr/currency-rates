package com.andrey.currencyrates.services.impl;

import com.andrey.currencyrates.services.CurrencyRatesService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.w3c.dom.NodeList;


@SpringBootTest
public class CurrencyRateServiceTest {
    private CurrencyRatesService service;

    @Before
    public void init() {
        service = new DefaultCurrencyRatesService();
    }

    @Ignore
    @Test
    public void shouldReturnCurrencyRates() {
        final String date = "2013-01-01";
        final NodeList result = service.getExchangeRatesByDate(date);
        Assert.assertNotNull("result should not be null", result);
        Assert.assertTrue("result should not be empty", result.getLength() > 0);
    }
}