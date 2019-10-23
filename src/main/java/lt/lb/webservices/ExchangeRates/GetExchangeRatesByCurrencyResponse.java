/**
 * GetExchangeRatesByCurrencyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class GetExchangeRatesByCurrencyResponse  implements java.io.Serializable {
    private lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult getExchangeRatesByCurrencyResult;

    public GetExchangeRatesByCurrencyResponse() {
    }

    public GetExchangeRatesByCurrencyResponse(
           lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult getExchangeRatesByCurrencyResult) {
           this.getExchangeRatesByCurrencyResult = getExchangeRatesByCurrencyResult;
    }


    /**
     * Gets the getExchangeRatesByCurrencyResult value for this GetExchangeRatesByCurrencyResponse.
     * 
     * @return getExchangeRatesByCurrencyResult
     */
    public lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult getGetExchangeRatesByCurrencyResult() {
        return getExchangeRatesByCurrencyResult;
    }


    /**
     * Sets the getExchangeRatesByCurrencyResult value for this GetExchangeRatesByCurrencyResponse.
     * 
     * @param getExchangeRatesByCurrencyResult
     */
    public void setGetExchangeRatesByCurrencyResult(lt.lb.webservices.ExchangeRates.GetExchangeRatesByCurrencyResponseGetExchangeRatesByCurrencyResult getExchangeRatesByCurrencyResult) {
        this.getExchangeRatesByCurrencyResult = getExchangeRatesByCurrencyResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExchangeRatesByCurrencyResponse)) return false;
        GetExchangeRatesByCurrencyResponse other = (GetExchangeRatesByCurrencyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getExchangeRatesByCurrencyResult==null && other.getGetExchangeRatesByCurrencyResult()==null) ||
             (this.getExchangeRatesByCurrencyResult!=null &&
              this.getExchangeRatesByCurrencyResult.equals(other.getGetExchangeRatesByCurrencyResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetExchangeRatesByCurrencyResult() != null) {
            _hashCode += getGetExchangeRatesByCurrencyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExchangeRatesByCurrencyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByCurrencyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExchangeRatesByCurrencyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByCurrencyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeRatesByCurrencyResponse>getExchangeRatesByCurrencyResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
