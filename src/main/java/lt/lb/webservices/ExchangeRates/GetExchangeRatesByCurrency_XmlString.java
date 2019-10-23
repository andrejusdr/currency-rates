/**
 * GetExchangeRatesByCurrency_XmlString.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lt.lb.webservices.ExchangeRates;

public class GetExchangeRatesByCurrency_XmlString  implements java.io.Serializable {
    private String currency;

    private String dateLow;

    private String dateHigh;

    public GetExchangeRatesByCurrency_XmlString() {
    }

    public GetExchangeRatesByCurrency_XmlString(
           String currency,
           String dateLow,
           String dateHigh) {
           this.currency = currency;
           this.dateLow = dateLow;
           this.dateHigh = dateHigh;
    }


    /**
     * Gets the currency value for this GetExchangeRatesByCurrency_XmlString.
     *
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this GetExchangeRatesByCurrency_XmlString.
     *
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }


    /**
     * Gets the dateLow value for this GetExchangeRatesByCurrency_XmlString.
     *
     * @return dateLow
     */
    public String getDateLow() {
        return dateLow;
    }


    /**
     * Sets the dateLow value for this GetExchangeRatesByCurrency_XmlString.
     *
     * @param dateLow
     */
    public void setDateLow(String dateLow) {
        this.dateLow = dateLow;
    }


    /**
     * Gets the dateHigh value for this GetExchangeRatesByCurrency_XmlString.
     *
     * @return dateHigh
     */
    public String getDateHigh() {
        return dateHigh;
    }


    /**
     * Sets the dateHigh value for this GetExchangeRatesByCurrency_XmlString.
     *
     * @param dateHigh
     */
    public void setDateHigh(String dateHigh) {
        this.dateHigh = dateHigh;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetExchangeRatesByCurrency_XmlString)) return false;
        GetExchangeRatesByCurrency_XmlString other = (GetExchangeRatesByCurrency_XmlString) obj;
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
            ((this.dateLow==null && other.getDateLow()==null) ||
             (this.dateLow!=null &&
              this.dateLow.equals(other.getDateLow()))) &&
            ((this.dateHigh==null && other.getDateHigh()==null) ||
             (this.dateHigh!=null &&
              this.dateHigh.equals(other.getDateHigh())));
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
        if (getDateLow() != null) {
            _hashCode += getDateLow().hashCode();
        }
        if (getDateHigh() != null) {
            _hashCode += getDateHigh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExchangeRatesByCurrency_XmlString.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", ">getExchangeRatesByCurrency_XmlString"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateLow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.lb.lt/ExchangeRates", "DateHigh"));
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
