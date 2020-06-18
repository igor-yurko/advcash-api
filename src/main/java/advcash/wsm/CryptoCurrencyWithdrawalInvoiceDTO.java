/**
 * CryptoCurrencyWithdrawalInvoiceDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CryptoCurrencyWithdrawalInvoiceDTO  implements java.io.Serializable {
    private advcash.wsm.CoinName coinName;

    private java.lang.Long created;

    private java.math.BigDecimal cryptoCurrencyAmount;

    private advcash.wsm.SciAllowedPaymentSystems depositMethod;

    private java.lang.Long expiresOn;

    private java.math.BigDecimal fiatAmount;

    private advcash.wsm.Currency fiatCurrency;

    private java.lang.String id;

    private java.lang.String orderId;

    private java.lang.String receiver;

    private advcash.wsm.CryptoCurrencyWithdrawalInvoiceStatus status;

    private java.lang.String transactionId;

    public CryptoCurrencyWithdrawalInvoiceDTO() {
    }

    public CryptoCurrencyWithdrawalInvoiceDTO(
           advcash.wsm.CoinName coinName,
           java.lang.Long created,
           java.math.BigDecimal cryptoCurrencyAmount,
           advcash.wsm.SciAllowedPaymentSystems depositMethod,
           java.lang.Long expiresOn,
           java.math.BigDecimal fiatAmount,
           advcash.wsm.Currency fiatCurrency,
           java.lang.String id,
           java.lang.String orderId,
           java.lang.String receiver,
           advcash.wsm.CryptoCurrencyWithdrawalInvoiceStatus status,
           java.lang.String transactionId) {
           this.coinName = coinName;
           this.created = created;
           this.cryptoCurrencyAmount = cryptoCurrencyAmount;
           this.depositMethod = depositMethod;
           this.expiresOn = expiresOn;
           this.fiatAmount = fiatAmount;
           this.fiatCurrency = fiatCurrency;
           this.id = id;
           this.orderId = orderId;
           this.receiver = receiver;
           this.status = status;
           this.transactionId = transactionId;
    }


    /**
     * Gets the coinName value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return coinName
     */
    public advcash.wsm.CoinName getCoinName() {
        return coinName;
    }


    /**
     * Sets the coinName value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param coinName
     */
    public void setCoinName(advcash.wsm.CoinName coinName) {
        this.coinName = coinName;
    }


    /**
     * Gets the created value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return created
     */
    public java.lang.Long getCreated() {
        return created;
    }


    /**
     * Sets the created value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param created
     */
    public void setCreated(java.lang.Long created) {
        this.created = created;
    }


    /**
     * Gets the cryptoCurrencyAmount value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return cryptoCurrencyAmount
     */
    public java.math.BigDecimal getCryptoCurrencyAmount() {
        return cryptoCurrencyAmount;
    }


    /**
     * Sets the cryptoCurrencyAmount value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param cryptoCurrencyAmount
     */
    public void setCryptoCurrencyAmount(java.math.BigDecimal cryptoCurrencyAmount) {
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
    }


    /**
     * Gets the depositMethod value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return depositMethod
     */
    public advcash.wsm.SciAllowedPaymentSystems getDepositMethod() {
        return depositMethod;
    }


    /**
     * Sets the depositMethod value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param depositMethod
     */
    public void setDepositMethod(advcash.wsm.SciAllowedPaymentSystems depositMethod) {
        this.depositMethod = depositMethod;
    }


    /**
     * Gets the expiresOn value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return expiresOn
     */
    public java.lang.Long getExpiresOn() {
        return expiresOn;
    }


    /**
     * Sets the expiresOn value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param expiresOn
     */
    public void setExpiresOn(java.lang.Long expiresOn) {
        this.expiresOn = expiresOn;
    }


    /**
     * Gets the fiatAmount value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return fiatAmount
     */
    public java.math.BigDecimal getFiatAmount() {
        return fiatAmount;
    }


    /**
     * Sets the fiatAmount value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param fiatAmount
     */
    public void setFiatAmount(java.math.BigDecimal fiatAmount) {
        this.fiatAmount = fiatAmount;
    }


    /**
     * Gets the fiatCurrency value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return fiatCurrency
     */
    public advcash.wsm.Currency getFiatCurrency() {
        return fiatCurrency;
    }


    /**
     * Sets the fiatCurrency value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param fiatCurrency
     */
    public void setFiatCurrency(advcash.wsm.Currency fiatCurrency) {
        this.fiatCurrency = fiatCurrency;
    }


    /**
     * Gets the id value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the orderId value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the receiver value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the status value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return status
     */
    public advcash.wsm.CryptoCurrencyWithdrawalInvoiceStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param status
     */
    public void setStatus(advcash.wsm.CryptoCurrencyWithdrawalInvoiceStatus status) {
        this.status = status;
    }


    /**
     * Gets the transactionId value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this CryptoCurrencyWithdrawalInvoiceDTO.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CryptoCurrencyWithdrawalInvoiceDTO)) return false;
        CryptoCurrencyWithdrawalInvoiceDTO other = (CryptoCurrencyWithdrawalInvoiceDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.coinName==null && other.getCoinName()==null) || 
             (this.coinName!=null &&
              this.coinName.equals(other.getCoinName()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.cryptoCurrencyAmount==null && other.getCryptoCurrencyAmount()==null) || 
             (this.cryptoCurrencyAmount!=null &&
              this.cryptoCurrencyAmount.equals(other.getCryptoCurrencyAmount()))) &&
            ((this.depositMethod==null && other.getDepositMethod()==null) || 
             (this.depositMethod!=null &&
              this.depositMethod.equals(other.getDepositMethod()))) &&
            ((this.expiresOn==null && other.getExpiresOn()==null) || 
             (this.expiresOn!=null &&
              this.expiresOn.equals(other.getExpiresOn()))) &&
            ((this.fiatAmount==null && other.getFiatAmount()==null) || 
             (this.fiatAmount!=null &&
              this.fiatAmount.equals(other.getFiatAmount()))) &&
            ((this.fiatCurrency==null && other.getFiatCurrency()==null) || 
             (this.fiatCurrency!=null &&
              this.fiatCurrency.equals(other.getFiatCurrency()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId())));
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
        if (getCoinName() != null) {
            _hashCode += getCoinName().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCryptoCurrencyAmount() != null) {
            _hashCode += getCryptoCurrencyAmount().hashCode();
        }
        if (getDepositMethod() != null) {
            _hashCode += getDepositMethod().hashCode();
        }
        if (getExpiresOn() != null) {
            _hashCode += getExpiresOn().hashCode();
        }
        if (getFiatAmount() != null) {
            _hashCode += getFiatAmount().hashCode();
        }
        if (getFiatCurrency() != null) {
            _hashCode += getFiatCurrency().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CryptoCurrencyWithdrawalInvoiceDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coinName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coinName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "coinName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "sciAllowedPaymentSystems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiresOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiresOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiatAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fiatAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiatCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fiatCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
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
