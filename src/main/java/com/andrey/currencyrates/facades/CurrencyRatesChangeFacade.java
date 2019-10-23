package com.andrey.currencyrates.facades;

import com.andrey.currencyrates.data.CurrencyRateChangeData;

import java.util.List;

public interface CurrencyRatesChangeFacade {
    List<CurrencyRateChangeData> getCurrencyRatesChangeByDate(final String date);
}
