/**
 * lt.lb.webservices.ExchangeRates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public interface ExchangeRates extends javax.xml.rpc.Service {

/**
 * WebService provides official (established by Bank of Lithuania)
 * exchange rates of the Litas against Foreign Currencies.
 */
    public String getExchangeRatesSoapAddress();

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap() throws javax.xml.rpc.ServiceException;

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public String getExchangeRatesSoap12Address();

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap12() throws javax.xml.rpc.ServiceException;

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
