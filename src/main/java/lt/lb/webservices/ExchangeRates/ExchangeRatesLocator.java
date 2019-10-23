/**
 * ExchangeRatesLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class ExchangeRatesLocator extends org.apache.axis.client.Service implements lt.lb.webservices.ExchangeRates.ExchangeRates {

/**
 * WebService provides official (established by Bank of Lithuania)
 * exchange rates of the Litas against Foreign Currencies.
 */

    public ExchangeRatesLocator() {
    }


    public ExchangeRatesLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExchangeRatesLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExchangeRatesSoap
    private String ExchangeRatesSoap_address = "http://www.lb.lt/webservices/exchangerates/exchangerates.asmx";

    public String getExchangeRatesSoapAddress() {
        return ExchangeRatesSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String ExchangeRatesSoapWSDDServiceName = "ExchangeRatesSoap";

    public String getExchangeRatesSoapWSDDServiceName() {
        return ExchangeRatesSoapWSDDServiceName;
    }

    public void setExchangeRatesSoapWSDDServiceName(String name) {
        ExchangeRatesSoapWSDDServiceName = name;
    }

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExchangeRatesSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExchangeRatesSoap(endpoint);
    }

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lt.lb.webservices.ExchangeRates.ExchangeRatesSoapStub _stub = new lt.lb.webservices.ExchangeRates.ExchangeRatesSoapStub(portAddress, this);
            _stub.setPortName(getExchangeRatesSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExchangeRatesSoapEndpointAddress(String address) {
        ExchangeRatesSoap_address = address;
    }


    // Use to get a proxy class for ExchangeRatesSoap12
    private String ExchangeRatesSoap12_address = "http://www.lb.lt/webservices/exchangerates/exchangerates.asmx";

    public String getExchangeRatesSoap12Address() {
        return ExchangeRatesSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String ExchangeRatesSoap12WSDDServiceName = "ExchangeRatesSoap12";

    public String getExchangeRatesSoap12WSDDServiceName() {
        return ExchangeRatesSoap12WSDDServiceName;
    }

    public void setExchangeRatesSoap12WSDDServiceName(String name) {
        ExchangeRatesSoap12WSDDServiceName = name;
    }

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExchangeRatesSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExchangeRatesSoap12(endpoint);
    }

    public lt.lb.webservices.ExchangeRates.ExchangeRatesSoap getExchangeRatesSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lt.lb.webservices.ExchangeRates.ExchangeRatesSoap12Stub _stub = new lt.lb.webservices.ExchangeRates.ExchangeRatesSoap12Stub(portAddress, this);
            _stub.setPortName(getExchangeRatesSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExchangeRatesSoap12EndpointAddress(String address) {
        ExchangeRatesSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (lt.lb.webservices.ExchangeRates.ExchangeRatesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                lt.lb.webservices.ExchangeRates.ExchangeRatesSoapStub _stub = new lt.lb.webservices.ExchangeRates.ExchangeRatesSoapStub(new java.net.URL(ExchangeRatesSoap_address), this);
                _stub.setPortName(getExchangeRatesSoapWSDDServiceName());
                return _stub;
            }
            if (lt.lb.webservices.ExchangeRates.ExchangeRatesSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                lt.lb.webservices.ExchangeRates.ExchangeRatesSoap12Stub _stub = new lt.lb.webservices.ExchangeRates.ExchangeRatesSoap12Stub(new java.net.URL(ExchangeRatesSoap12_address), this);
                _stub.setPortName(getExchangeRatesSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("ExchangeRatesSoap".equals(inputPortName)) {
            return getExchangeRatesSoap();
        }
        else if ("ExchangeRatesSoap12".equals(inputPortName)) {
            return getExchangeRatesSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "lt/lb/webservices/ExchangeRates");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "ExchangeRatesSoap"));
            ports.add(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "ExchangeRatesSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

if ("ExchangeRatesSoap".equals(portName)) {
            setExchangeRatesSoapEndpointAddress(address);
        }
        else
if ("ExchangeRatesSoap12".equals(portName)) {
            setExchangeRatesSoap12EndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
