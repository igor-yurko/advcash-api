/**
 * BankCardTransferRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class BankCardTransferRequest  extends advcash.wsm.MoneyRequest  implements java.io.Serializable {
    private java.lang.String cardHolder;

    private java.lang.String cardHolderAddress;

    private java.lang.String cardHolderCity;

    private java.lang.String cardHolderCountry;

    private java.lang.String cardHolderDOB;

    private java.lang.String cardHolderIp;

    private java.lang.String cardHolderMobilePhoneNumber;

    private java.lang.String cardNumber;

    private java.lang.String expiryMonth;

    private java.lang.String expiryYear;

    public BankCardTransferRequest() {
    }

    public BankCardTransferRequest(
           java.math.BigDecimal amount,
           advcash.wsm.Currency currency,
           java.lang.String note,
           java.lang.Boolean savePaymentTemplate,
           java.lang.String cardHolder,
           java.lang.String cardHolderAddress,
           java.lang.String cardHolderCity,
           java.lang.String cardHolderCountry,
           java.lang.String cardHolderDOB,
           java.lang.String cardHolderIp,
           java.lang.String cardHolderMobilePhoneNumber,
           java.lang.String cardNumber,
           java.lang.String expiryMonth,
           java.lang.String expiryYear) {
        super(
            amount,
            currency,
            note,
            savePaymentTemplate);
        this.cardHolder = cardHolder;
        this.cardHolderAddress = cardHolderAddress;
        this.cardHolderCity = cardHolderCity;
        this.cardHolderCountry = cardHolderCountry;
        this.cardHolderDOB = cardHolderDOB;
        this.cardHolderIp = cardHolderIp;
        this.cardHolderMobilePhoneNumber = cardHolderMobilePhoneNumber;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }


    /**
     * Gets the cardHolder value for this BankCardTransferRequest.
     * 
     * @return cardHolder
     */
    public java.lang.String getCardHolder() {
        return cardHolder;
    }


    /**
     * Sets the cardHolder value for this BankCardTransferRequest.
     * 
     * @param cardHolder
     */
    public void setCardHolder(java.lang.String cardHolder) {
        this.cardHolder = cardHolder;
    }


    /**
     * Gets the cardHolderAddress value for this BankCardTransferRequest.
     * 
     * @return cardHolderAddress
     */
    public java.lang.String getCardHolderAddress() {
        return cardHolderAddress;
    }


    /**
     * Sets the cardHolderAddress value for this BankCardTransferRequest.
     * 
     * @param cardHolderAddress
     */
    public void setCardHolderAddress(java.lang.String cardHolderAddress) {
        this.cardHolderAddress = cardHolderAddress;
    }


    /**
     * Gets the cardHolderCity value for this BankCardTransferRequest.
     * 
     * @return cardHolderCity
     */
    public java.lang.String getCardHolderCity() {
        return cardHolderCity;
    }


    /**
     * Sets the cardHolderCity value for this BankCardTransferRequest.
     * 
     * @param cardHolderCity
     */
    public void setCardHolderCity(java.lang.String cardHolderCity) {
        this.cardHolderCity = cardHolderCity;
    }


    /**
     * Gets the cardHolderCountry value for this BankCardTransferRequest.
     * 
     * @return cardHolderCountry
     */
    public java.lang.String getCardHolderCountry() {
        return cardHolderCountry;
    }


    /**
     * Sets the cardHolderCountry value for this BankCardTransferRequest.
     * 
     * @param cardHolderCountry
     */
    public void setCardHolderCountry(java.lang.String cardHolderCountry) {
        this.cardHolderCountry = cardHolderCountry;
    }


    /**
     * Gets the cardHolderDOB value for this BankCardTransferRequest.
     * 
     * @return cardHolderDOB
     */
    public java.lang.String getCardHolderDOB() {
        return cardHolderDOB;
    }


    /**
     * Sets the cardHolderDOB value for this BankCardTransferRequest.
     * 
     * @param cardHolderDOB
     */
    public void setCardHolderDOB(java.lang.String cardHolderDOB) {
        this.cardHolderDOB = cardHolderDOB;
    }


    /**
     * Gets the cardHolderIp value for this BankCardTransferRequest.
     * 
     * @return cardHolderIp
     */
    public java.lang.String getCardHolderIp() {
        return cardHolderIp;
    }


    /**
     * Sets the cardHolderIp value for this BankCardTransferRequest.
     * 
     * @param cardHolderIp
     */
    public void setCardHolderIp(java.lang.String cardHolderIp) {
        this.cardHolderIp = cardHolderIp;
    }


    /**
     * Gets the cardHolderMobilePhoneNumber value for this BankCardTransferRequest.
     * 
     * @return cardHolderMobilePhoneNumber
     */
    public java.lang.String getCardHolderMobilePhoneNumber() {
        return cardHolderMobilePhoneNumber;
    }


    /**
     * Sets the cardHolderMobilePhoneNumber value for this BankCardTransferRequest.
     * 
     * @param cardHolderMobilePhoneNumber
     */
    public void setCardHolderMobilePhoneNumber(java.lang.String cardHolderMobilePhoneNumber) {
        this.cardHolderMobilePhoneNumber = cardHolderMobilePhoneNumber;
    }


    /**
     * Gets the cardNumber value for this BankCardTransferRequest.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this BankCardTransferRequest.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the expiryMonth value for this BankCardTransferRequest.
     * 
     * @return expiryMonth
     */
    public java.lang.String getExpiryMonth() {
        return expiryMonth;
    }


    /**
     * Sets the expiryMonth value for this BankCardTransferRequest.
     * 
     * @param expiryMonth
     */
    public void setExpiryMonth(java.lang.String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }


    /**
     * Gets the expiryYear value for this BankCardTransferRequest.
     * 
     * @return expiryYear
     */
    public java.lang.String getExpiryYear() {
        return expiryYear;
    }


    /**
     * Sets the expiryYear value for this BankCardTransferRequest.
     * 
     * @param expiryYear
     */
    public void setExpiryYear(java.lang.String expiryYear) {
        this.expiryYear = expiryYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankCardTransferRequest)) return false;
        BankCardTransferRequest other = (BankCardTransferRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cardHolder==null && other.getCardHolder()==null) || 
             (this.cardHolder!=null &&
              this.cardHolder.equals(other.getCardHolder()))) &&
            ((this.cardHolderAddress==null && other.getCardHolderAddress()==null) || 
             (this.cardHolderAddress!=null &&
              this.cardHolderAddress.equals(other.getCardHolderAddress()))) &&
            ((this.cardHolderCity==null && other.getCardHolderCity()==null) || 
             (this.cardHolderCity!=null &&
              this.cardHolderCity.equals(other.getCardHolderCity()))) &&
            ((this.cardHolderCountry==null && other.getCardHolderCountry()==null) || 
             (this.cardHolderCountry!=null &&
              this.cardHolderCountry.equals(other.getCardHolderCountry()))) &&
            ((this.cardHolderDOB==null && other.getCardHolderDOB()==null) || 
             (this.cardHolderDOB!=null &&
              this.cardHolderDOB.equals(other.getCardHolderDOB()))) &&
            ((this.cardHolderIp==null && other.getCardHolderIp()==null) || 
             (this.cardHolderIp!=null &&
              this.cardHolderIp.equals(other.getCardHolderIp()))) &&
            ((this.cardHolderMobilePhoneNumber==null && other.getCardHolderMobilePhoneNumber()==null) || 
             (this.cardHolderMobilePhoneNumber!=null &&
              this.cardHolderMobilePhoneNumber.equals(other.getCardHolderMobilePhoneNumber()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.expiryMonth==null && other.getExpiryMonth()==null) || 
             (this.expiryMonth!=null &&
              this.expiryMonth.equals(other.getExpiryMonth()))) &&
            ((this.expiryYear==null && other.getExpiryYear()==null) || 
             (this.expiryYear!=null &&
              this.expiryYear.equals(other.getExpiryYear())));
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
        if (getCardHolder() != null) {
            _hashCode += getCardHolder().hashCode();
        }
        if (getCardHolderAddress() != null) {
            _hashCode += getCardHolderAddress().hashCode();
        }
        if (getCardHolderCity() != null) {
            _hashCode += getCardHolderCity().hashCode();
        }
        if (getCardHolderCountry() != null) {
            _hashCode += getCardHolderCountry().hashCode();
        }
        if (getCardHolderDOB() != null) {
            _hashCode += getCardHolderDOB().hashCode();
        }
        if (getCardHolderIp() != null) {
            _hashCode += getCardHolderIp().hashCode();
        }
        if (getCardHolderMobilePhoneNumber() != null) {
            _hashCode += getCardHolderMobilePhoneNumber().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getExpiryMonth() != null) {
            _hashCode += getExpiryMonth().hashCode();
        }
        if (getExpiryYear() != null) {
            _hashCode += getExpiryYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankCardTransferRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("cardHolderCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolderCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHolderCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolderCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardHolderDOB");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolderDOB"));
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
        elemField.setFieldName("cardHolderMobilePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardHolderMobilePhoneNumber"));
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
