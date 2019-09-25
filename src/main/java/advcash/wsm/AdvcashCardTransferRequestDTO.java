/**
 * AdvcashCardTransferRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class AdvcashCardTransferRequestDTO  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private advcash.wsm.CardType cardType;

    private advcash.wsm.Currency currency;

    private java.lang.String email;

    private boolean savePaymentTemplate;

    private java.lang.String srcWalletId;

    public AdvcashCardTransferRequestDTO() {
    }

    public AdvcashCardTransferRequestDTO(
           java.math.BigDecimal amount,
           advcash.wsm.CardType cardType,
           advcash.wsm.Currency currency,
           java.lang.String email,
           boolean savePaymentTemplate,
           java.lang.String srcWalletId) {
           this.amount = amount;
           this.cardType = cardType;
           this.currency = currency;
           this.email = email;
           this.savePaymentTemplate = savePaymentTemplate;
           this.srcWalletId = srcWalletId;
    }


    /**
     * Gets the amount value for this AdvcashCardTransferRequestDTO.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this AdvcashCardTransferRequestDTO.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardType value for this AdvcashCardTransferRequestDTO.
     * 
     * @return cardType
     */
    public advcash.wsm.CardType getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this AdvcashCardTransferRequestDTO.
     * 
     * @param cardType
     */
    public void setCardType(advcash.wsm.CardType cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the currency value for this AdvcashCardTransferRequestDTO.
     * 
     * @return currency
     */
    public advcash.wsm.Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AdvcashCardTransferRequestDTO.
     * 
     * @param currency
     */
    public void setCurrency(advcash.wsm.Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the email value for this AdvcashCardTransferRequestDTO.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AdvcashCardTransferRequestDTO.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the savePaymentTemplate value for this AdvcashCardTransferRequestDTO.
     * 
     * @return savePaymentTemplate
     */
    public boolean isSavePaymentTemplate() {
        return savePaymentTemplate;
    }


    /**
     * Sets the savePaymentTemplate value for this AdvcashCardTransferRequestDTO.
     * 
     * @param savePaymentTemplate
     */
    public void setSavePaymentTemplate(boolean savePaymentTemplate) {
        this.savePaymentTemplate = savePaymentTemplate;
    }


    /**
     * Gets the srcWalletId value for this AdvcashCardTransferRequestDTO.
     * 
     * @return srcWalletId
     */
    public java.lang.String getSrcWalletId() {
        return srcWalletId;
    }


    /**
     * Sets the srcWalletId value for this AdvcashCardTransferRequestDTO.
     * 
     * @param srcWalletId
     */
    public void setSrcWalletId(java.lang.String srcWalletId) {
        this.srcWalletId = srcWalletId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvcashCardTransferRequestDTO)) return false;
        AdvcashCardTransferRequestDTO other = (AdvcashCardTransferRequestDTO) obj;
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
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.savePaymentTemplate == other.isSavePaymentTemplate() &&
            ((this.srcWalletId==null && other.getSrcWalletId()==null) || 
             (this.srcWalletId!=null &&
              this.srcWalletId.equals(other.getSrcWalletId())));
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
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += (isSavePaymentTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSrcWalletId() != null) {
            _hashCode += getSrcWalletId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvcashCardTransferRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "cardType"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcWalletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcWalletId"));
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
