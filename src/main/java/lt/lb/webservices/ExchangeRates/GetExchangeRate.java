/**
 * GetExchangeRate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class GetExchangeRate  implements java.io.Serializable {
    private String currency;

    private String date;

    public GetExchangeRate() {
    }

    public GetExchangeRate(
           String currency,
           String date) {
           this.currency = currency;
           this.date = date;
    }


    /**
     * Gets the currency value for this GetExchangeRate.
     *
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this GetExchangeRate.
     *
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }


    /**
     * Gets the date value for this GetExchangeRate.
     *
     * @return date
     */
    public String getDate() {
        return date;
    }


    /**
     * Sets the date value for this GetExchangeRate.
     *
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExchangeRate)) return false;
        GetExchangeRate other = (GetExchangeRate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.currency==null && other.getCurrency()==null) ||
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.date==null && other.getDate()==null) ||
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExchangeRate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Date"));
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
