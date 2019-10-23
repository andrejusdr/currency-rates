/**
 * GetExchangeRatesByDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class GetExchangeRatesByDateResponse  implements java.io.Serializable {
    private lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult getExchangeRatesByDateResult;

    public GetExchangeRatesByDateResponse() {
    }

    public GetExchangeRatesByDateResponse(
           lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult getExchangeRatesByDateResult) {
           this.getExchangeRatesByDateResult = getExchangeRatesByDateResult;
    }


    /**
     * Gets the getExchangeRatesByDateResult value for this GetExchangeRatesByDateResponse.
     * 
     * @return getExchangeRatesByDateResult
     */
    public lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult getGetExchangeRatesByDateResult() {
        return getExchangeRatesByDateResult;
    }


    /**
     * Sets the getExchangeRatesByDateResult value for this GetExchangeRatesByDateResponse.
     * 
     * @param getExchangeRatesByDateResult
     */
    public void setGetExchangeRatesByDateResult(lt.lb.webservices.ExchangeRates.GetExchangeRatesByDateResponseGetExchangeRatesByDateResult getExchangeRatesByDateResult) {
        this.getExchangeRatesByDateResult = getExchangeRatesByDateResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExchangeRatesByDateResponse)) return false;
        GetExchangeRatesByDateResponse other = (GetExchangeRatesByDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getExchangeRatesByDateResult==null && other.getGetExchangeRatesByDateResult()==null) ||
             (this.getExchangeRatesByDateResult!=null &&
              this.getExchangeRatesByDateResult.equals(other.getGetExchangeRatesByDateResult())));
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
        if (getGetExchangeRatesByDateResult() != null) {
            _hashCode += getGetExchangeRatesByDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExchangeRatesByDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExchangeRatesByDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">>getExchangeRatesByDateResponse>getExchangeRatesByDateResult"));
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
