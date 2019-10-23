package com.andrey.currencyrates.data;

import java.math.BigDecimal;

public class CurrencyRateData {
    private String date;
    private String currency;
    private String quantity;
    private BigDecimal rate;
    private String unit;

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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(final BigDecimal rate) {
        this.rate = rate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(final String unit) {
        this.unit = unit;
    }
}
