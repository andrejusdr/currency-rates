/**
 * ExchangeRatesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public interface ExchangeRatesSoap extends java.rmi.Remote {

    /**
     * Returns a list of currencies.
     */
    public lt.lb.webservices.ExchangeRates.GetListOfCurrenciesResponseGetListOfCurrenciesResult getListOfCurrencies() throws java.rmi.RemoteException;

    /**
     * Returns the current exchange rate (expressed in Litas per 1
     * currency unit) for the specified currency.
     */
    public java.math.BigDecimal getCurrentExchangeRate(String currency) throws java.rmi.RemoteException;

    /**
     * Returns an exchange rate (expressed in Litas per 1 currency
     * unit) for the specified currency and date.
     */
    public java.math.BigDecimal getExchangeRate(String currency, String date) throws java.rmi.RemoteException;

    /**
     * Returns a XML formatted string containing exchange rates for
     * the specified date.
     */
    public String getExchangeRatesByDate_XmlString(String date) throws java.rmi.RemoteException;

    /**
     * Returns a XML formatted string containing exchange rates for
     * the specified currency that are between specified dates.
     */
    public String getExchangeRatesByCurrency_XmlString(String currency, String dateLow, String dateHigh) throws java.rmi.RemoteException;

    /**
     * Returns a list containing exchange rates for the specified
     * date.
     */
    public lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult getExchangeRatesByDate(String date) throws java.rmi.RemoteException;

    /**
     * Returns a Xml Schema of provided Exchange Rates.
     */
    public String getExchangeRatesXmlSchema() throws java.rmi.RemoteException;

    /**
     * Returns a list containing exchange rates for the specified
     * currency that are between specified dates.
     */
    public lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult getExchangeRatesByCurrency(String currency, String dateLow, String dateHigh) throws java.rmi.RemoteException;

    /**
     * Returns a average exchange rate for the specified currency,
     * between specified dates.
     */
    public lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponseGetExchangeAvgRateResult getExchangeAvgRate(String currency, String dateLow, String dateHigh) throws java.rmi.RemoteException;
}
