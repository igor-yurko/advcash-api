/**
 * BankCardTransferRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class BankCardTransferRequestDTO  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String cardHolder;

    private java.lang.String cardHolderAddress;

    private java.lang.String cardHolderCountryCode;

    private java.lang.String cardHolderIp;

    private java.lang.String cardNumber;

    private java.lang.String destCurrency;

    private java.lang.String expiryMonth;

    private java.lang.String expiryYear;

    private boolean savePaymentTemplate;

    private java.lang.String srcWalletId;

    public BankCardTransferRequestDTO() {
    }

    public BankCardTransferRequestDTO(
           java.math.BigDecimal amount,
           java.lang.String cardHolder,
           java.lang.String cardHolderAddress,
           java.lang.String cardHolderCountryCode,
           java.lang.String cardHolderIp,
           java.lang.String cardNumber,
           java.lang.String destCurrency,
           java.lang.String expiryMonth,
           java.lang.String expiryYear,
           boolean savePaymentTemplate,
           java.lang.String srcWalletId) {
           this.amount = amount;
           this.cardHolder = cardHolder;
           this.cardHolderAddress = cardHolderAddress;
           this.cardHolderCountryCode = cardHolderCountryCode;
           this.cardHolderIp = cardHolderIp;
           this.cardNumber = cardNumber;
           this.destCurrency = destCurrency;
           this.expiryMonth = expiryMonth;
           this.expiryYear = expiryYear;
           this.savePaymentTemplate = savePaymentTemplate;
           this.srcWalletId = srcWalletId;
    }


    /**
     * Gets the amount value for this BankCardTransferRequestDTO.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BankCardTransferRequestDTO.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the cardHolder value for this BankCardTransferRequestDTO.
     * 
     * @return cardHolder
     */
    public java.lang.String getCardHolder() {
        return cardHolder;
    }


    /**
     * Sets the cardHolder value for this BankCardTransferRequestDTO.
     * 
     * @param cardHolder
     */
    public void setCardHolder(java.lang.String cardHolder) {
        this.cardHolder = cardHolder;
    }


    /**
     * Gets the cardHolderAddress value for this BankCardTransferRequestDTO.
     * 
     * @return cardHolderAddress
     */
    public java.lang.String getCardHolderAddress() {
        return cardHolderAddress;
    }


    /**
     * Sets the cardHolderAddress value for this BankCardTransferRequestDTO.
     * 
     * @param cardHolderAddress
     */
    public void setCardHolderAddress(java.lang.String cardHolderAddress) {
        this.cardHolderAddress = cardHolderAddress;
    }


    /**
     * Gets the cardHolderCountryCode value for this BankCardTransferRequestDTO.
     * 
     * @return cardHolderCountryCode
     */
    public java.lang.String getCardHolderCountryCode() {
        return cardHolderCountryCode;
    }


    /**
     * Sets the cardHolderCountryCode value for this BankCardTransferRequestDTO.
     * 
     * @param cardHolderCountryCode
     */
    public void setCardHolderCountryCode(java.lang.String cardHolderCountryCode) {
        this.cardHolderCountryCode = cardHolderCountryCode;
    }


    /**
     * Gets the cardHolderIp value for this BankCardTransferRequestDTO.
     * 
     * @return cardHolderIp
     */
    public java.lang.String getCardHolderIp() {
        return cardHolderIp;
    }


    /**
     * Sets the cardHolderIp value for this BankCardTransferRequestDTO.
     * 
     * @param cardHolderIp
     */
    public void setCardHolderIp(java.lang.String cardHolderIp) {
        this.cardHolderIp = cardHolderIp;
    }


    /**
     * Gets the cardNumber value for this BankCardTransferRequestDTO.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this BankCardTransferRequestDTO.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the destCurrency value for this BankCardTransferRequestDTO.
     * 
     * @return destCurrency
     */
    public java.lang.String getDestCurrency() {
        return destCurrency;
    }


    /**
     * Sets the destCurrency value for this BankCardTransferRequestDTO.
     * 
     * @param destCurrency
     */
    public void setDestCurrency(java.lang.String destCurrency) {
        this.destCurrency = destCurrency;
    }


    /**
     * Gets the expiryMonth value for this BankCardTransferRequestDTO.
     * 
     * @return expiryMonth
     */
    public java.lang.String getExpiryMonth() {
        return expiryMonth;
    }


    /**
     * Sets the expiryMonth value for this BankCardTransferRequestDTO.
     * 
     * @param expiryMonth
     */
    public void setExpiryMonth(java.lang.String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }


    /**
     * Gets the expiryYear value for this BankCardTransferRequestDTO.
     * 
     * @return expiryYear
     */
    public java.lang.String getExpiryYear() {
        return expiryYear;
    }


    /**
     * Sets the expiryYear value for this BankCardTransferRequestDTO.
     * 
     * @param expiryYear
     */
    public void setExpiryYear(java.lang.String expiryYear) {
        this.expiryYear = expiryYear;
    }


    /**
     * Gets the savePaymentTemplate value for this BankCardTransferRequestDTO.
     * 
     * @return savePaymentTemplate
     */
    public boolean isSavePaymentTemplate() {
        return savePaymentTemplate;
    }


    /**
     * Sets the savePaymentTemplate value for this BankCardTransferRequestDTO.
     * 
     * @param savePaymentTemplate
     */
    public void setSavePaymentTemplate(boolean savePaymentTemplate) {
        this.savePaymentTemplate = savePaymentTemplate;
    }


    /**
     * Gets the srcWalletId value for this BankCardTransferRequestDTO.
     * 
     * @return srcWalletId
     */
    public java.lang.String getSrcWalletId() {
        return srcWalletId;
    }


    /**
     * Sets the srcWalletId value for this BankCardTransferRequestDTO.
     * 
     * @param srcWalletId
     */
    public void setSrcWalletId(java.lang.String srcWalletId) {
        this.srcWalletId = srcWalletId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankCardTransferRequestDTO)) return false;
        BankCardTransferRequestDTO other = (BankCardTransferRequestDTO) obj;
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
            ((this.cardHolder==null && other.getCardHolder()==null) || 
             (this.cardHolder!=null &&
              this.cardHolder.equals(other.getCardHolder()))) &&
            ((this.cardHolderAddress==null && other.getCardHolderAddress()==null) || 
             (this.cardHolderAddress!=null &&
              this.cardHolderAddress.equals(other.getCardHolderAddress()))) &&
            ((this.cardHolderCountryCode==null && other.getCardHolderCountryCode()==null) || 
             (this.cardHolderCountryCode!=null &&
              this.cardHolderCountryCode.equals(other.getCardHolderCountryCode()))) &&
            ((this.cardHolderIp==null && other.getCardHolderIp()==null) || 
             (this.cardHolderIp!=null &&
              this.cardHolderIp.equals(other.getCardHolderIp()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.destCurrency==null && other.getDestCurrency()==null) || 
             (this.destCurrency!=null &&
              this.destCurrency.equals(other.getDestCurrency()))) &&
            ((this.expiryMonth==null && other.getExpiryMonth()==null) || 
             (this.expiryMonth!=null &&
              this.expiryMonth.equals(other.getExpiryMonth()))) &&
            ((this.expiryYear==null && other.getExpiryYear()==null) || 
             (this.expiryYear!=null &&
              this.expiryYear.equals(other.getExpiryYear()))) &&
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
        if (getCardHolder() != null) {
            _hashCode += getCardHolder().hashCode();
        }
        if (getCardHolderAddress() != null) {
            _hashCode += getCardHolderAddress().hashCode();
        }
        if (getCardHolderCountryCode() != null) {
            _hashCode += getCardHolderCountryCode().hashCode();
        }
        if (getCardHolderIp() != null) {
            _hashCode += getCardHolderIp().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getDestCurrency() != null) {
            _hashCode += getDestCurrency().hashCode();
        }
        if (getExpiryMonth() != null) {
            _hashCode += getExpiryMonth().hashCode();
        }
        if (getExpiryYear() != null) {
            _hashCode += getExpiryYear().hashCode();
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
        new org.apache.axis.description.TypeDesc(BankCardTransferRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHolderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHolderCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolderCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHolderIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolderIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiryYear"));
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
