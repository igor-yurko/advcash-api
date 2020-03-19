/**
 * MoneyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public abstract class MoneyRequest  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private Currency currency;

    private String note;

    private Boolean savePaymentTemplate;

    public MoneyRequest() {
    }

    public MoneyRequest(
           java.math.BigDecimal amount,
           Currency currency,
           String note,
           Boolean savePaymentTemplate) {
           this.amount = amount;
           this.currency = currency;
           this.note = note;
           this.savePaymentTemplate = savePaymentTemplate;
    }


    /**
     * Gets the amount value for this MoneyRequest.
     *
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this MoneyRequest.
     *
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this MoneyRequest.
     *
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this MoneyRequest.
     *
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the note value for this MoneyRequest.
     *
     * @return note
     */
    public String getNote() {
        return note;
    }


    /**
     * Sets the note value for this MoneyRequest.
     *
     * @param note
     */
    public void setNote(String note) {
        this.note = note;
    }


    /**
     * Gets the savePaymentTemplate value for this MoneyRequest.
     *
     * @return savePaymentTemplate
     */
    public Boolean getSavePaymentTemplate() {
        return savePaymentTemplate;
    }


    /**
     * Sets the savePaymentTemplate value for this MoneyRequest.
     *
     * @param savePaymentTemplate
     */
    public void setSavePaymentTemplate(Boolean savePaymentTemplate) {
        this.savePaymentTemplate = savePaymentTemplate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MoneyRequest)) return false;
        MoneyRequest other = (MoneyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.amount==null && other.getAmount()==null) ||
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) ||
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.note==null && other.getNote()==null) ||
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.savePaymentTemplate==null && other.getSavePaymentTemplate()==null) ||
             (this.savePaymentTemplate!=null &&
              this.savePaymentTemplate.equals(other.getSavePaymentTemplate())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getSavePaymentTemplate() != null) {
            _hashCode += getSavePaymentTemplate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "moneyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savePaymentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "savePaymentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
