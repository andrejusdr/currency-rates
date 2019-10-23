/**
 * GetCurrentExchangeRateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class GetCurrentExchangeRateResponse  implements java.io.Serializable {
    private java.math.BigDecimal getCurrentExchangeRateResult;

    public GetCurrentExchangeRateResponse() {
    }

    public GetCurrentExchangeRateResponse(
           java.math.BigDecimal getCurrentExchangeRateResult) {
           this.getCurrentExchangeRateResult = getCurrentExchangeRateResult;
    }


    /**
     * Gets the getCurrentExchangeRateResult value for this GetCurrentExchangeRateResponse.
     * 
     * @return getCurrentExchangeRateResult
     */
    public java.math.BigDecimal getGetCurrentExchangeRateResult() {
        return getCurrentExchangeRateResult;
    }


    /**
     * Sets the getCurrentExchangeRateResult value for this GetCurrentExchangeRateResponse.
     * 
     * @param getCurrentExchangeRateResult
     */
    public void setGetCurrentExchangeRateResult(java.math.BigDecimal getCurrentExchangeRateResult) {
        this.getCurrentExchangeRateResult = getCurrentExchangeRateResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCurrentExchangeRateResponse)) return false;
        GetCurrentExchangeRateResponse other = (GetCurrentExchangeRateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getCurrentExchangeRateResult==null && other.getGetCurrentExchangeRateResult()==null) ||
             (this.getCurrentExchangeRateResult!=null &&
              this.getCurrentExchangeRateResult.equals(other.getGetCurrentExchangeRateResult())));
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
        if (getGetCurrentExchangeRateResult() != null) {
            _hashCode += getGetCurrentExchangeRateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCurrentExchangeRateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getCurrentExchangeRateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentExchangeRateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getCurrentExchangeRateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
