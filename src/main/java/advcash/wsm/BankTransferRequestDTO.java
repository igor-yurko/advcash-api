/**
 * BankTransferRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class BankTransferRequestDTO  implements java.io.Serializable {
    private java.lang.String abaRoutingNumber;

    private java.lang.String accountName;

    private java.lang.String accountNumber;

    private java.lang.String accountNumberPrefix;

    private java.lang.String accountNumberSuffix;

    private java.lang.String accountType;

    private java.math.BigDecimal amount;

    private java.lang.String bankCode;

    private java.lang.String bankName;

    private java.lang.String bic;

    private java.lang.String branchCode;

    private java.lang.String countryCode;

    private java.lang.String currencyCode;

    private java.lang.String destCurrency;

    private java.lang.String iban;

    private java.lang.String recipientAddress;

    private java.lang.String recipientCity;

    private java.lang.String recipientCompanyName;

    private java.lang.String recipientFirstName;

    private java.lang.String recipientSecondName;

    private java.lang.String sortCode;

    private java.lang.String swiftBic;

    private java.lang.String walletId;

    public BankTransferRequestDTO() {
    }

    public BankTransferRequestDTO(
           java.lang.String abaRoutingNumber,
           java.lang.String accountName,
           java.lang.String accountNumber,
           java.lang.String accountNumberPrefix,
           java.lang.String accountNumberSuffix,
           java.lang.String accountType,
           java.math.BigDecimal amount,
           java.lang.String bankCode,
           java.lang.String bankName,
           java.lang.String bic,
           java.lang.String branchCode,
           java.lang.String countryCode,
           java.lang.String currencyCode,
           java.lang.String destCurrency,
           java.lang.String iban,
           java.lang.String recipientAddress,
           java.lang.String recipientCity,
           java.lang.String recipientCompanyName,
           java.lang.String recipientFirstName,
           java.lang.String recipientSecondName,
           java.lang.String sortCode,
           java.lang.String swiftBic,
           java.lang.String walletId) {
           this.abaRoutingNumber = abaRoutingNumber;
           this.accountName = accountName;
           this.accountNumber = accountNumber;
           this.accountNumberPrefix = accountNumberPrefix;
           this.accountNumberSuffix = accountNumberSuffix;
           this.accountType = accountType;
           this.amount = amount;
           this.bankCode = bankCode;
           this.bankName = bankName;
           this.bic = bic;
           this.branchCode = branchCode;
           this.countryCode = countryCode;
           this.currencyCode = currencyCode;
           this.destCurrency = destCurrency;
           this.iban = iban;
           this.recipientAddress = recipientAddress;
           this.recipientCity = recipientCity;
           this.recipientCompanyName = recipientCompanyName;
           this.recipientFirstName = recipientFirstName;
           this.recipientSecondName = recipientSecondName;
           this.sortCode = sortCode;
           this.swiftBic = swiftBic;
           this.walletId = walletId;
    }


    /**
     * Gets the abaRoutingNumber value for this BankTransferRequestDTO.
     * 
     * @return abaRoutingNumber
     */
    public java.lang.String getAbaRoutingNumber() {
        return abaRoutingNumber;
    }


    /**
     * Sets the abaRoutingNumber value for this BankTransferRequestDTO.
     * 
     * @param abaRoutingNumber
     */
    public void setAbaRoutingNumber(java.lang.String abaRoutingNumber) {
        this.abaRoutingNumber = abaRoutingNumber;
    }


    /**
     * Gets the accountName value for this BankTransferRequestDTO.
     * 
     * @return accountName
     */
    public java.lang.String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this BankTransferRequestDTO.
     * 
     * @param accountName
     */
    public void setAccountName(java.lang.String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the accountNumber value for this BankTransferRequestDTO.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this BankTransferRequestDTO.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountNumberPrefix value for this BankTransferRequestDTO.
     * 
     * @return accountNumberPrefix
     */
    public java.lang.String getAccountNumberPrefix() {
        return accountNumberPrefix;
    }


    /**
     * Sets the accountNumberPrefix value for this BankTransferRequestDTO.
     * 
     * @param accountNumberPrefix
     */
    public void setAccountNumberPrefix(java.lang.String accountNumberPrefix) {
        this.accountNumberPrefix = accountNumberPrefix;
    }


    /**
     * Gets the accountNumberSuffix value for this BankTransferRequestDTO.
     * 
     * @return accountNumberSuffix
     */
    public java.lang.String getAccountNumberSuffix() {
        return accountNumberSuffix;
    }


    /**
     * Sets the accountNumberSuffix value for this BankTransferRequestDTO.
     * 
     * @param accountNumberSuffix
     */
    public void setAccountNumberSuffix(java.lang.String accountNumberSuffix) {
        this.accountNumberSuffix = accountNumberSuffix;
    }


    /**
     * Gets the accountType value for this BankTransferRequestDTO.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this BankTransferRequestDTO.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the amount value for this BankTransferRequestDTO.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BankTransferRequestDTO.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the bankCode value for this BankTransferRequestDTO.
     * 
     * @return bankCode
     */
    public java.lang.String getBankCode() {
        return bankCode;
    }


    /**
     * Sets the bankCode value for this BankTransferRequestDTO.
     * 
     * @param bankCode
     */
    public void setBankCode(java.lang.String bankCode) {
        this.bankCode = bankCode;
    }


    /**
     * Gets the bankName value for this BankTransferRequestDTO.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this BankTransferRequestDTO.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the bic value for this BankTransferRequestDTO.
     * 
     * @return bic
     */
    public java.lang.String getBic() {
        return bic;
    }


    /**
     * Sets the bic value for this BankTransferRequestDTO.
     * 
     * @param bic
     */
    public void setBic(java.lang.String bic) {
        this.bic = bic;
    }


    /**
     * Gets the branchCode value for this BankTransferRequestDTO.
     * 
     * @return branchCode
     */
    public java.lang.String getBranchCode() {
        return branchCode;
    }


    /**
     * Sets the branchCode value for this BankTransferRequestDTO.
     * 
     * @param branchCode
     */
    public void setBranchCode(java.lang.String branchCode) {
        this.branchCode = branchCode;
    }


    /**
     * Gets the countryCode value for this BankTransferRequestDTO.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this BankTransferRequestDTO.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the currencyCode value for this BankTransferRequestDTO.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this BankTransferRequestDTO.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the destCurrency value for this BankTransferRequestDTO.
     * 
     * @return destCurrency
     */
    public java.lang.String getDestCurrency() {
        return destCurrency;
    }


    /**
     * Sets the destCurrency value for this BankTransferRequestDTO.
     * 
     * @param destCurrency
     */
    public void setDestCurrency(java.lang.String destCurrency) {
        this.destCurrency = destCurrency;
    }


    /**
     * Gets the iban value for this BankTransferRequestDTO.
     * 
     * @return iban
     */
    public java.lang.String getIban() {
        return iban;
    }


    /**
     * Sets the iban value for this BankTransferRequestDTO.
     * 
     * @param iban
     */
    public void setIban(java.lang.String iban) {
        this.iban = iban;
    }


    /**
     * Gets the recipientAddress value for this BankTransferRequestDTO.
     * 
     * @return recipientAddress
     */
    public java.lang.String getRecipientAddress() {
        return recipientAddress;
    }


    /**
     * Sets the recipientAddress value for this BankTransferRequestDTO.
     * 
     * @param recipientAddress
     */
    public void setRecipientAddress(java.lang.String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }


    /**
     * Gets the recipientCity value for this BankTransferRequestDTO.
     * 
     * @return recipientCity
     */
    public java.lang.String getRecipientCity() {
        return recipientCity;
    }


    /**
     * Sets the recipientCity value for this BankTransferRequestDTO.
     * 
     * @param recipientCity
     */
    public void setRecipientCity(java.lang.String recipientCity) {
        this.recipientCity = recipientCity;
    }


    /**
     * Gets the recipientCompanyName value for this BankTransferRequestDTO.
     * 
     * @return recipientCompanyName
     */
    public java.lang.String getRecipientCompanyName() {
        return recipientCompanyName;
    }


    /**
     * Sets the recipientCompanyName value for this BankTransferRequestDTO.
     * 
     * @param recipientCompanyName
     */
    public void setRecipientCompanyName(java.lang.String recipientCompanyName) {
        this.recipientCompanyName = recipientCompanyName;
    }


    /**
     * Gets the recipientFirstName value for this BankTransferRequestDTO.
     * 
     * @return recipientFirstName
     */
    public java.lang.String getRecipientFirstName() {
        return recipientFirstName;
    }


    /**
     * Sets the recipientFirstName value for this BankTransferRequestDTO.
     * 
     * @param recipientFirstName
     */
    public void setRecipientFirstName(java.lang.String recipientFirstName) {
        this.recipientFirstName = recipientFirstName;
    }


    /**
     * Gets the recipientSecondName value for this BankTransferRequestDTO.
     * 
     * @return recipientSecondName
     */
    public java.lang.String getRecipientSecondName() {
        return recipientSecondName;
    }


    /**
     * Sets the recipientSecondName value for this BankTransferRequestDTO.
     * 
     * @param recipientSecondName
     */
    public void setRecipientSecondName(java.lang.String recipientSecondName) {
        this.recipientSecondName = recipientSecondName;
    }


    /**
     * Gets the sortCode value for this BankTransferRequestDTO.
     * 
     * @return sortCode
     */
    public java.lang.String getSortCode() {
        return sortCode;
    }


    /**
     * Sets the sortCode value for this BankTransferRequestDTO.
     * 
     * @param sortCode
     */
    public void setSortCode(java.lang.String sortCode) {
        this.sortCode = sortCode;
    }


    /**
     * Gets the swiftBic value for this BankTransferRequestDTO.
     * 
     * @return swiftBic
     */
    public java.lang.String getSwiftBic() {
        return swiftBic;
    }


    /**
     * Sets the swiftBic value for this BankTransferRequestDTO.
     * 
     * @param swiftBic
     */
    public void setSwiftBic(java.lang.String swiftBic) {
        this.swiftBic = swiftBic;
    }


    /**
     * Gets the walletId value for this BankTransferRequestDTO.
     * 
     * @return walletId
     */
    public java.lang.String getWalletId() {
        return walletId;
    }


    /**
     * Sets the walletId value for this BankTransferRequestDTO.
     * 
     * @param walletId
     */
    public void setWalletId(java.lang.String walletId) {
        this.walletId = walletId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankTransferRequestDTO)) return false;
        BankTransferRequestDTO other = (BankTransferRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abaRoutingNumber==null && other.getAbaRoutingNumber()==null) || 
             (this.abaRoutingNumber!=null &&
              this.abaRoutingNumber.equals(other.getAbaRoutingNumber()))) &&
            ((this.accountName==null && other.getAccountName()==null) || 
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountNumberPrefix==null && other.getAccountNumberPrefix()==null) || 
             (this.accountNumberPrefix!=null &&
              this.accountNumberPrefix.equals(other.getAccountNumberPrefix()))) &&
            ((this.accountNumberSuffix==null && other.getAccountNumberSuffix()==null) || 
             (this.accountNumberSuffix!=null &&
              this.accountNumberSuffix.equals(other.getAccountNumberSuffix()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.bankCode==null && other.getBankCode()==null) || 
             (this.bankCode!=null &&
              this.bankCode.equals(other.getBankCode()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.bic==null && other.getBic()==null) || 
             (this.bic!=null &&
              this.bic.equals(other.getBic()))) &&
            ((this.branchCode==null && other.getBranchCode()==null) || 
             (this.branchCode!=null &&
              this.branchCode.equals(other.getBranchCode()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.destCurrency==null && other.getDestCurrency()==null) || 
             (this.destCurrency!=null &&
              this.destCurrency.equals(other.getDestCurrency()))) &&
            ((this.iban==null && other.getIban()==null) || 
             (this.iban!=null &&
              this.iban.equals(other.getIban()))) &&
            ((this.recipientAddress==null && other.getRecipientAddress()==null) || 
             (this.recipientAddress!=null &&
              this.recipientAddress.equals(other.getRecipientAddress()))) &&
            ((this.recipientCity==null && other.getRecipientCity()==null) || 
             (this.recipientCity!=null &&
              this.recipientCity.equals(other.getRecipientCity()))) &&
            ((this.recipientCompanyName==null && other.getRecipientCompanyName()==null) || 
             (this.recipientCompanyName!=null &&
              this.recipientCompanyName.equals(other.getRecipientCompanyName()))) &&
            ((this.recipientFirstName==null && other.getRecipientFirstName()==null) || 
             (this.recipientFirstName!=null &&
              this.recipientFirstName.equals(other.getRecipientFirstName()))) &&
            ((this.recipientSecondName==null && other.getRecipientSecondName()==null) || 
             (this.recipientSecondName!=null &&
              this.recipientSecondName.equals(other.getRecipientSecondName()))) &&
            ((this.sortCode==null && other.getSortCode()==null) || 
             (this.sortCode!=null &&
              this.sortCode.equals(other.getSortCode()))) &&
            ((this.swiftBic==null && other.getSwiftBic()==null) || 
             (this.swiftBic!=null &&
              this.swiftBic.equals(other.getSwiftBic()))) &&
            ((this.walletId==null && other.getWalletId()==null) || 
             (this.walletId!=null &&
              this.walletId.equals(other.getWalletId())));
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
        if (getAbaRoutingNumber() != null) {
            _hashCode += getAbaRoutingNumber().hashCode();
        }
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountNumberPrefix() != null) {
            _hashCode += getAccountNumberPrefix().hashCode();
        }
        if (getAccountNumberSuffix() != null) {
            _hashCode += getAccountNumberSuffix().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBankCode() != null) {
            _hashCode += getBankCode().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getBic() != null) {
            _hashCode += getBic().hashCode();
        }
        if (getBranchCode() != null) {
            _hashCode += getBranchCode().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getDestCurrency() != null) {
            _hashCode += getDestCurrency().hashCode();
        }
        if (getIban() != null) {
            _hashCode += getIban().hashCode();
        }
        if (getRecipientAddress() != null) {
            _hashCode += getRecipientAddress().hashCode();
        }
        if (getRecipientCity() != null) {
            _hashCode += getRecipientCity().hashCode();
        }
        if (getRecipientCompanyName() != null) {
            _hashCode += getRecipientCompanyName().hashCode();
        }
        if (getRecipientFirstName() != null) {
            _hashCode += getRecipientFirstName().hashCode();
        }
        if (getRecipientSecondName() != null) {
            _hashCode += getRecipientSecondName().hashCode();
        }
        if (getSortCode() != null) {
            _hashCode += getSortCode().hashCode();
        }
        if (getSwiftBic() != null) {
            _hashCode += getSwiftBic().hashCode();
        }
        if (getWalletId() != null) {
            _hashCode += getWalletId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankTransferRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "bankTransferRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abaRoutingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "abaRoutingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumberPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumberPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumberSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumberSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "branchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currencyCode"));
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
        elemField.setFieldName("iban");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iban"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipientAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipientCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipientCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipientFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientSecondName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipientSecondName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swiftBic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swiftBic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "walletId"));
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
