package com.andrey.currencyrates.data;

import java.math.BigDecimal;

public class CurrencyRateChangeData {
    private String date;
    private String currency;
    private BigDecimal rate;
    private BigDecimal rateChange;

    public String getDate() {
        return date;
    }

    public void setDate(final String date) {
        this.date = date;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(final String currency) {
        this.currency = currency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(final BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal getRateChange() {
        return rateChange;
    }

    public void setRateChange(final BigDecimal rateChange) {
        this.rateChange = rateChange;
    }
}
