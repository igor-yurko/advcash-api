/**
 * CurrencyExchangeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CurrencyExchangeRequest  extends advcash.wsm.MoneyRequest  implements java.io.Serializable {
    private advcash.wsm.CurrencyExchangeAction action;

    private advcash.wsm.Currency from;

    private advcash.wsm.Currency to;

    public CurrencyExchangeRequest() {
    }

    public CurrencyExchangeRequest(
           java.math.BigDecimal amount,
           advcash.wsm.Currency currency,
           java.lang.String note,
           java.lang.Boolean savePaymentTemplate,
           advcash.wsm.CurrencyExchangeAction action,
           advcash.wsm.Currency from,
           advcash.wsm.Currency to) {
        super(
            amount,
            currency,
            note,
            savePaymentTemplate);
        this.action = action;
        this.from = from;
        this.to = to;
    }


    /**
     * Gets the action value for this CurrencyExchangeRequest.
     * 
     * @return action
     */
    public advcash.wsm.CurrencyExchangeAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this CurrencyExchangeRequest.
     * 
     * @param action
     */
    public void setAction(advcash.wsm.CurrencyExchangeAction action) {
        this.action = action;
    }


    /**
     * Gets the from value for this CurrencyExchangeRequest.
     * 
     * @return from
     */
    public advcash.wsm.Currency getFrom() {
        return from;
    }


    /**
     * Sets the from value for this CurrencyExchangeRequest.
     * 
     * @param from
     */
    public void setFrom(advcash.wsm.Currency from) {
        this.from = from;
    }


    /**
     * Gets the to value for this CurrencyExchangeRequest.
     * 
     * @return to
     */
    public advcash.wsm.Currency getTo() {
        return to;
    }


    /**
     * Sets the to value for this CurrencyExchangeRequest.
     * 
     * @param to
     */
    public void setTo(advcash.wsm.Currency to) {
        this.to = to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrencyExchangeRequest)) return false;
        CurrencyExchangeRequest other = (CurrencyExchangeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyExchangeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeAction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currency"));
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
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
