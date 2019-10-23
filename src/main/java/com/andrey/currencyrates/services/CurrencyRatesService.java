package com.andrey.currencyrates.services;

import org.w3c.dom.NodeList;

public interface CurrencyRatesService {
    NodeList getExchangeRatesByDate(final String date);
}
