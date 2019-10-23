/**
 * ExchangeRatesSoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class ExchangeRatesSoap12Stub extends org.apache.axis.client.Stub implements lt.lb.webservices.ExchangeRates.ExchangeRatesSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[9];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListOfCurrencies");
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getListOfCurrenciesResponse>getListOfCurrenciesResult"));
        oper.setReturnClass(lt.lb.webservices.ExchangeRates.GetListOfCurrenciesResponseGetListOfCurrenciesResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getListOfCurrenciesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentExchangeRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        oper.setReturnClass(java.math.BigDecimal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getCurrentExchangeRateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExchangeRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        oper.setReturnClass(java.math.BigDecimal.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExchangeRatesByDate_XmlString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByDate_XmlStringResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExchangeRatesByCurrency_XmlString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateLow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateHigh"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByCurrency_XmlStringResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExchangeRatesByDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeRatesByDateResponse>getExchangeRatesByDateResult"));
        oper.setReturnClass(lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExchangeRatesXmlSchema");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesXmlSchemaResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExchangeRatesByCurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateLow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateHigh"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeRatesByCurrencyResponse>getExchangeRatesByCurrencyResult"));
        oper.setReturnClass(lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByCurrencyResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExchangeAvgRate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Currency"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateLow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateHigh"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeAvgRateResponse>getExchangeAvgRateResult"));
        oper.setReturnClass(lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponseGetExchangeAvgRateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeAvgRateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

    }

    public ExchangeRatesSoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ExchangeRatesSoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ExchangeRatesSoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeAvgRateResponse>getExchangeAvgRateResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponseGetExchangeAvgRateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeRatesByCurrencyResponse>getExchangeRatesByCurrencyResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeRatesByDateResponse>getExchangeRatesByDateResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getListOfCurrenciesResponse>getListOfCurrenciesResult");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetListOfCurrenciesResponseGetListOfCurrenciesResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getCurrentExchangeRate");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetCurrentExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getCurrentExchangeRateResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetCurrentExchangeRateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeAvgRate");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeAvgRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeAvgRateResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRate");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRateResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByCurrency");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByCurrency_XmlString");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrency_XmlString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByCurrency_XmlStringResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrency_XmlStringResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByCurrencyResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByDate");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByDate_XmlString");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByDate_XmlString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByDate_XmlStringResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByDate_XmlStringResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByDateResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesXmlSchema");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesXmlSchema.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesXmlSchemaResponse");
            cachedSerQNames.add(qName);
            cls = lt.lb.webservices.ExchangeRates.GetExchangeRatesXmlSchemaResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public lt.lb.webservices.ExchangeRates.GetListOfCurrenciesResponseGetListOfCurrenciesResult getListOfCurrencies() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getListOfCurrencies");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getListOfCurrencies"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.webservices.ExchangeRates.GetListOfCurrenciesResponseGetListOfCurrenciesResult) _resp;
            } catch (Exception _exception) {
                return (lt.lb.webservices.ExchangeRates.GetListOfCurrenciesResponseGetListOfCurrenciesResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.webservices.ExchangeRates.GetListOfCurrenciesResponseGetListOfCurrenciesResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.math.BigDecimal getCurrentExchangeRate(String currency) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getCurrentExchangeRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getCurrentExchangeRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currency});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.math.BigDecimal) _resp;
            } catch (Exception _exception) {
                return (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.math.BigDecimal getExchangeRate(String currency, String date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getExchangeRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currency, date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.math.BigDecimal) _resp;
            } catch (Exception _exception) {
                return (java.math.BigDecimal) org.apache.axis.utils.JavaUtils.convert(_resp, java.math.BigDecimal.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String getExchangeRatesByDate_XmlString(String date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getExchangeRatesByDate_XmlString");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByDate_XmlString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String getExchangeRatesByCurrency_XmlString(String currency, String dateLow, String dateHigh) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getExchangeRatesByCurrency_XmlString");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByCurrency_XmlString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currency, dateLow, dateHigh});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult getExchangeRatesByDate(String date) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getExchangeRatesByDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {date});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult) _resp;
            } catch (Exception _exception) {
                return (lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public String getExchangeRatesXmlSchema() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getExchangeRatesXmlSchema");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesXmlSchema"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult getExchangeRatesByCurrency(String currency, String dateLow, String dateHigh) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getExchangeRatesByCurrency");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByCurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currency, dateLow, dateHigh});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult) _resp;
            } catch (Exception _exception) {
                return (lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponseGetExchangeAvgRateResult getExchangeAvgRate(String currency, String dateLow, String dateHigh) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://webservices.lb.lt/ExchangeRates/getExchangeAvgRate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeAvgRate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {currency, dateLow, dateHigh});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponseGetExchangeAvgRateResult) _resp;
            } catch (Exception _exception) {
                return (lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponseGetExchangeAvgRateResult) org.apache.axis.utils.JavaUtils.convert(_resp, lt.lb.webservices.ExchangeRates.GetExchangeAvgRateResponseGetExchangeAvgRateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
