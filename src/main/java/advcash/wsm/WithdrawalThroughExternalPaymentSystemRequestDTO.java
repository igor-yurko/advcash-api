/**
 * WithdrawalThroughExternalPaymentSystemRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class WithdrawalThroughExternalPaymentSystemRequestDTO  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private String comment;

    private Currency currency;

    private ExternalSystemWithdrawalType externalPaymentSystem;

    private String receiver;

    private boolean savePaymentTemplate;

    public WithdrawalThroughExternalPaymentSystemRequestDTO() {
    }

    public WithdrawalThroughExternalPaymentSystemRequestDTO(
           java.math.BigDecimal amount,
           String comment,
           Currency currency,
           ExternalSystemWithdrawalType externalPaymentSystem,
           String receiver,
           boolean savePaymentTemplate) {
           this.amount = amount;
           this.comment = comment;
           this.currency = currency;
           this.externalPaymentSystem = externalPaymentSystem;
           this.receiver = receiver;
           this.savePaymentTemplate = savePaymentTemplate;
    }


    /**
     * Gets the amount value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the comment value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @return comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * Gets the currency value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the externalPaymentSystem value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @return externalPaymentSystem
     */
    public ExternalSystemWithdrawalType getExternalPaymentSystem() {
        return externalPaymentSystem;
    }


    /**
     * Sets the externalPaymentSystem value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @param externalPaymentSystem
     */
    public void setExternalPaymentSystem(ExternalSystemWithdrawalType externalPaymentSystem) {
        this.externalPaymentSystem = externalPaymentSystem;
    }


    /**
     * Gets the receiver value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @param receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the savePaymentTemplate value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @return savePaymentTemplate
     */
    public boolean isSavePaymentTemplate() {
        return savePaymentTemplate;
    }


    /**
     * Sets the savePaymentTemplate value for this WithdrawalThroughExternalPaymentSystemRequestDTO.
     *
     * @param savePaymentTemplate
     */
    public void setSavePaymentTemplate(boolean savePaymentTemplate) {
        this.savePaymentTemplate = savePaymentTemplate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WithdrawalThroughExternalPaymentSystemRequestDTO)) return false;
        WithdrawalThroughExternalPaymentSystemRequestDTO other = (WithdrawalThroughExternalPaymentSystemRequestDTO) obj;
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
            ((this.comment==null && other.getComment()==null) ||
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.currency==null && other.getCurrency()==null) ||
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.externalPaymentSystem==null && other.getExternalPaymentSystem()==null) ||
             (this.externalPaymentSystem!=null &&
              this.externalPaymentSystem.equals(other.getExternalPaymentSystem()))) &&
            ((this.receiver==null && other.getReceiver()==null) ||
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            this.savePaymentTemplate == other.isSavePaymentTemplate();
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getExternalPaymentSystem() != null) {
            _hashCode += getExternalPaymentSystem().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        _hashCode += (isSavePaymentTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WithdrawalThroughExternalPaymentSystemRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawalThroughExternalPaymentSystemRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("externalPaymentSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalPaymentSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "externalSystemWithdrawalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savePaymentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "savePaymentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
