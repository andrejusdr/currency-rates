/**
 * GetExchangeRatesByDate_XmlStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class GetExchangeRatesByDate_XmlStringResponse  implements java.io.Serializable {
    private String getExchangeRatesByDate_XmlStringResult;

    public GetExchangeRatesByDate_XmlStringResponse() {
    }

    public GetExchangeRatesByDate_XmlStringResponse(
           String getExchangeRatesByDate_XmlStringResult) {
           this.getExchangeRatesByDate_XmlStringResult = getExchangeRatesByDate_XmlStringResult;
    }


    /**
     * Gets the getExchangeRatesByDate_XmlStringResult value for this GetExchangeRatesByDate_XmlStringResponse.
     *
     * @return getExchangeRatesByDate_XmlStringResult
     */
    public String getGetExchangeRatesByDate_XmlStringResult() {
        return getExchangeRatesByDate_XmlStringResult;
    }


    /**
     * Sets the getExchangeRatesByDate_XmlStringResult value for this GetExchangeRatesByDate_XmlStringResponse.
     *
     * @param getExchangeRatesByDate_XmlStringResult
     */
    public void setGetExchangeRatesByDate_XmlStringResult(String getExchangeRatesByDate_XmlStringResult) {
        this.getExchangeRatesByDate_XmlStringResult = getExchangeRatesByDate_XmlStringResult;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExchangeRatesByDate_XmlStringResponse)) return false;
        GetExchangeRatesByDate_XmlStringResponse other = (GetExchangeRatesByDate_XmlStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.getExchangeRatesByDate_XmlStringResult==null && other.getGetExchangeRatesByDate_XmlStringResult()==null) ||
             (this.getExchangeRatesByDate_XmlStringResult!=null &&
              this.getExchangeRatesByDate_XmlStringResult.equals(other.getGetExchangeRatesByDate_XmlStringResult())));
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
        if (getGetExchangeRatesByDate_XmlStringResult() != null) {
            _hashCode += getGetExchangeRatesByDate_XmlStringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExchangeRatesByDate_XmlStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByDate_XmlStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExchangeRatesByDate_XmlStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "getExchangeRatesByDate_XmlStringResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
