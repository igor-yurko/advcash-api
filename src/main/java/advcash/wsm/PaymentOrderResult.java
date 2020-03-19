/**
 * PaymentOrderResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class PaymentOrderResult  extends PaymentOrderRequest  implements java.io.Serializable {
    private String buyerEmail;

    private CoinName coinName;

    private String cryptoCurrencyAddress;

    private java.math.BigDecimal cryptoCurrencyAmount;

    private java.util.Calendar cryptoCurrencyInvoiceCreated;

    private CryptoCurrencyDepositPaymentStatus cryptoCurrencyInvoiceStatus;

    private java.util.Calendar cryptoCurrencyPaymentCompleted;

    private java.util.Calendar cryptoCurrencyPaymentReceived;

    private java.util.Calendar cryptoCurrencyPaymentRefundRequested;

    private java.util.Calendar cryptoCurrencyPaymentRefunded;

    private String cryptoCurrencyTransactionId;

    private java.util.Calendar paymentCreated;

    private advcash.wsm.SciAllowedPaymentSystems paymentMethod;

    private advcash.wsm.PaymentRequestStatus paymentStatus;

    private java.math.BigDecimal receivedCryptoCurrencyAmount;

    private String refundAddress;

    private String srcWalletId;

    private java.math.BigDecimal transactionAmount;

    private java.util.Calendar transactionCanceled;

    private java.util.Calendar transactionCompleted;

    private java.util.Calendar transactionCreated;

    private Currency transactionCurrency;

    private String transactionId;

    private TransactionStatus transactionStatus;

    public PaymentOrderResult() {
    }

    public PaymentOrderResult(
           String orderId,
           String sciName,
           String buyerEmail,
           CoinName coinName,
           String cryptoCurrencyAddress,
           java.math.BigDecimal cryptoCurrencyAmount,
           java.util.Calendar cryptoCurrencyInvoiceCreated,
           CryptoCurrencyDepositPaymentStatus cryptoCurrencyInvoiceStatus,
           java.util.Calendar cryptoCurrencyPaymentCompleted,
           java.util.Calendar cryptoCurrencyPaymentReceived,
           java.util.Calendar cryptoCurrencyPaymentRefundRequested,
           java.util.Calendar cryptoCurrencyPaymentRefunded,
           String cryptoCurrencyTransactionId,
           java.util.Calendar paymentCreated,
           advcash.wsm.SciAllowedPaymentSystems paymentMethod,
           advcash.wsm.PaymentRequestStatus paymentStatus,
           java.math.BigDecimal receivedCryptoCurrencyAmount,
           String refundAddress,
           String srcWalletId,
           java.math.BigDecimal transactionAmount,
           java.util.Calendar transactionCanceled,
           java.util.Calendar transactionCompleted,
           java.util.Calendar transactionCreated,
           Currency transactionCurrency,
           String transactionId,
           TransactionStatus transactionStatus) {
        super(
            orderId,
            sciName);
        this.buyerEmail = buyerEmail;
        this.coinName = coinName;
        this.cryptoCurrencyAddress = cryptoCurrencyAddress;
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
        this.cryptoCurrencyInvoiceCreated = cryptoCurrencyInvoiceCreated;
        this.cryptoCurrencyInvoiceStatus = cryptoCurrencyInvoiceStatus;
        this.cryptoCurrencyPaymentCompleted = cryptoCurrencyPaymentCompleted;
        this.cryptoCurrencyPaymentReceived = cryptoCurrencyPaymentReceived;
        this.cryptoCurrencyPaymentRefundRequested = cryptoCurrencyPaymentRefundRequested;
        this.cryptoCurrencyPaymentRefunded = cryptoCurrencyPaymentRefunded;
        this.cryptoCurrencyTransactionId = cryptoCurrencyTransactionId;
        this.paymentCreated = paymentCreated;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
        this.receivedCryptoCurrencyAmount = receivedCryptoCurrencyAmount;
        this.refundAddress = refundAddress;
        this.srcWalletId = srcWalletId;
        this.transactionAmount = transactionAmount;
        this.transactionCanceled = transactionCanceled;
        this.transactionCompleted = transactionCompleted;
        this.transactionCreated = transactionCreated;
        this.transactionCurrency = transactionCurrency;
        this.transactionId = transactionId;
        this.transactionStatus = transactionStatus;
    }


    /**
     * Gets the buyerEmail value for this PaymentOrderResult.
     *
     * @return buyerEmail
     */
    public String getBuyerEmail() {
        return buyerEmail;
    }


    /**
     * Sets the buyerEmail value for this PaymentOrderResult.
     *
     * @param buyerEmail
     */
    public void setBuyerEmail(String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }


    /**
     * Gets the coinName value for this PaymentOrderResult.
     *
     * @return coinName
     */
    public CoinName getCoinName() {
        return coinName;
    }


    /**
     * Sets the coinName value for this PaymentOrderResult.
     *
     * @param coinName
     */
    public void setCoinName(CoinName coinName) {
        this.coinName = coinName;
    }


    /**
     * Gets the cryptoCurrencyAddress value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyAddress
     */
    public String getCryptoCurrencyAddress() {
        return cryptoCurrencyAddress;
    }


    /**
     * Sets the cryptoCurrencyAddress value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyAddress
     */
    public void setCryptoCurrencyAddress(String cryptoCurrencyAddress) {
        this.cryptoCurrencyAddress = cryptoCurrencyAddress;
    }


    /**
     * Gets the cryptoCurrencyAmount value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyAmount
     */
    public java.math.BigDecimal getCryptoCurrencyAmount() {
        return cryptoCurrencyAmount;
    }


    /**
     * Sets the cryptoCurrencyAmount value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyAmount
     */
    public void setCryptoCurrencyAmount(java.math.BigDecimal cryptoCurrencyAmount) {
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
    }


    /**
     * Gets the cryptoCurrencyInvoiceCreated value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyInvoiceCreated
     */
    public java.util.Calendar getCryptoCurrencyInvoiceCreated() {
        return cryptoCurrencyInvoiceCreated;
    }


    /**
     * Sets the cryptoCurrencyInvoiceCreated value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyInvoiceCreated
     */
    public void setCryptoCurrencyInvoiceCreated(java.util.Calendar cryptoCurrencyInvoiceCreated) {
        this.cryptoCurrencyInvoiceCreated = cryptoCurrencyInvoiceCreated;
    }


    /**
     * Gets the cryptoCurrencyInvoiceStatus value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyInvoiceStatus
     */
    public CryptoCurrencyDepositPaymentStatus getCryptoCurrencyInvoiceStatus() {
        return cryptoCurrencyInvoiceStatus;
    }


    /**
     * Sets the cryptoCurrencyInvoiceStatus value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyInvoiceStatus
     */
    public void setCryptoCurrencyInvoiceStatus(CryptoCurrencyDepositPaymentStatus cryptoCurrencyInvoiceStatus) {
        this.cryptoCurrencyInvoiceStatus = cryptoCurrencyInvoiceStatus;
    }


    /**
     * Gets the cryptoCurrencyPaymentCompleted value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyPaymentCompleted
     */
    public java.util.Calendar getCryptoCurrencyPaymentCompleted() {
        return cryptoCurrencyPaymentCompleted;
    }


    /**
     * Sets the cryptoCurrencyPaymentCompleted value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyPaymentCompleted
     */
    public void setCryptoCurrencyPaymentCompleted(java.util.Calendar cryptoCurrencyPaymentCompleted) {
        this.cryptoCurrencyPaymentCompleted = cryptoCurrencyPaymentCompleted;
    }


    /**
     * Gets the cryptoCurrencyPaymentReceived value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyPaymentReceived
     */
    public java.util.Calendar getCryptoCurrencyPaymentReceived() {
        return cryptoCurrencyPaymentReceived;
    }


    /**
     * Sets the cryptoCurrencyPaymentReceived value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyPaymentReceived
     */
    public void setCryptoCurrencyPaymentReceived(java.util.Calendar cryptoCurrencyPaymentReceived) {
        this.cryptoCurrencyPaymentReceived = cryptoCurrencyPaymentReceived;
    }


    /**
     * Gets the cryptoCurrencyPaymentRefundRequested value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyPaymentRefundRequested
     */
    public java.util.Calendar getCryptoCurrencyPaymentRefundRequested() {
        return cryptoCurrencyPaymentRefundRequested;
    }


    /**
     * Sets the cryptoCurrencyPaymentRefundRequested value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyPaymentRefundRequested
     */
    public void setCryptoCurrencyPaymentRefundRequested(java.util.Calendar cryptoCurrencyPaymentRefundRequested) {
        this.cryptoCurrencyPaymentRefundRequested = cryptoCurrencyPaymentRefundRequested;
    }


    /**
     * Gets the cryptoCurrencyPaymentRefunded value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyPaymentRefunded
     */
    public java.util.Calendar getCryptoCurrencyPaymentRefunded() {
        return cryptoCurrencyPaymentRefunded;
    }


    /**
     * Sets the cryptoCurrencyPaymentRefunded value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyPaymentRefunded
     */
    public void setCryptoCurrencyPaymentRefunded(java.util.Calendar cryptoCurrencyPaymentRefunded) {
        this.cryptoCurrencyPaymentRefunded = cryptoCurrencyPaymentRefunded;
    }


    /**
     * Gets the cryptoCurrencyTransactionId value for this PaymentOrderResult.
     *
     * @return cryptoCurrencyTransactionId
     */
    public String getCryptoCurrencyTransactionId() {
        return cryptoCurrencyTransactionId;
    }


    /**
     * Sets the cryptoCurrencyTransactionId value for this PaymentOrderResult.
     *
     * @param cryptoCurrencyTransactionId
     */
    public void setCryptoCurrencyTransactionId(String cryptoCurrencyTransactionId) {
        this.cryptoCurrencyTransactionId = cryptoCurrencyTransactionId;
    }


    /**
     * Gets the paymentCreated value for this PaymentOrderResult.
     *
     * @return paymentCreated
     */
    public java.util.Calendar getPaymentCreated() {
        return paymentCreated;
    }


    /**
     * Sets the paymentCreated value for this PaymentOrderResult.
     *
     * @param paymentCreated
     */
    public void setPaymentCreated(java.util.Calendar paymentCreated) {
        this.paymentCreated = paymentCreated;
    }


    /**
     * Gets the paymentMethod value for this PaymentOrderResult.
     *
     * @return paymentMethod
     */
    public advcash.wsm.SciAllowedPaymentSystems getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this PaymentOrderResult.
     *
     * @param paymentMethod
     */
    public void setPaymentMethod(advcash.wsm.SciAllowedPaymentSystems paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the paymentStatus value for this PaymentOrderResult.
     *
     * @return paymentStatus
     */
    public advcash.wsm.PaymentRequestStatus getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this PaymentOrderResult.
     *
     * @param paymentStatus
     */
    public void setPaymentStatus(advcash.wsm.PaymentRequestStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the receivedCryptoCurrencyAmount value for this PaymentOrderResult.
     *
     * @return receivedCryptoCurrencyAmount
     */
    public java.math.BigDecimal getReceivedCryptoCurrencyAmount() {
        return receivedCryptoCurrencyAmount;
    }


    /**
     * Sets the receivedCryptoCurrencyAmount value for this PaymentOrderResult.
     *
     * @param receivedCryptoCurrencyAmount
     */
    public void setReceivedCryptoCurrencyAmount(java.math.BigDecimal receivedCryptoCurrencyAmount) {
        this.receivedCryptoCurrencyAmount = receivedCryptoCurrencyAmount;
    }


    /**
     * Gets the refundAddress value for this PaymentOrderResult.
     *
     * @return refundAddress
     */
    public String getRefundAddress() {
        return refundAddress;
    }


    /**
     * Sets the refundAddress value for this PaymentOrderResult.
     *
     * @param refundAddress
     */
    public void setRefundAddress(String refundAddress) {
        this.refundAddress = refundAddress;
    }


    /**
     * Gets the srcWalletId value for this PaymentOrderResult.
     *
     * @return srcWalletId
     */
    public String getSrcWalletId() {
        return srcWalletId;
    }


    /**
     * Sets the srcWalletId value for this PaymentOrderResult.
     *
     * @param srcWalletId
     */
    public void setSrcWalletId(String srcWalletId) {
        this.srcWalletId = srcWalletId;
    }


    /**
     * Gets the transactionAmount value for this PaymentOrderResult.
     *
     * @return transactionAmount
     */
    public java.math.BigDecimal getTransactionAmount() {
        return transactionAmount;
    }


    /**
     * Sets the transactionAmount value for this PaymentOrderResult.
     *
     * @param transactionAmount
     */
    public void setTransactionAmount(java.math.BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    /**
     * Gets the transactionCanceled value for this PaymentOrderResult.
     *
     * @return transactionCanceled
     */
    public java.util.Calendar getTransactionCanceled() {
        return transactionCanceled;
    }


    /**
     * Sets the transactionCanceled value for this PaymentOrderResult.
     *
     * @param transactionCanceled
     */
    public void setTransactionCanceled(java.util.Calendar transactionCanceled) {
        this.transactionCanceled = transactionCanceled;
    }


    /**
     * Gets the transactionCompleted value for this PaymentOrderResult.
     *
     * @return transactionCompleted
     */
    public java.util.Calendar getTransactionCompleted() {
        return transactionCompleted;
    }


    /**
     * Sets the transactionCompleted value for this PaymentOrderResult.
     *
     * @param transactionCompleted
     */
    public void setTransactionCompleted(java.util.Calendar transactionCompleted) {
        this.transactionCompleted = transactionCompleted;
    }


    /**
     * Gets the transactionCreated value for this PaymentOrderResult.
     *
     * @return transactionCreated
     */
    public java.util.Calendar getTransactionCreated() {
        return transactionCreated;
    }


    /**
     * Sets the transactionCreated value for this PaymentOrderResult.
     *
     * @param transactionCreated
     */
    public void setTransactionCreated(java.util.Calendar transactionCreated) {
        this.transactionCreated = transactionCreated;
    }


    /**
     * Gets the transactionCurrency value for this PaymentOrderResult.
     *
     * @return transactionCurrency
     */
    public Currency getTransactionCurrency() {
        return transactionCurrency;
    }


    /**
     * Sets the transactionCurrency value for this PaymentOrderResult.
     *
     * @param transactionCurrency
     */
    public void setTransactionCurrency(Currency transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }


    /**
     * Gets the transactionId value for this PaymentOrderResult.
     *
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentOrderResult.
     *
     * @param transactionId
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the transactionStatus value for this PaymentOrderResult.
     *
     * @return transactionStatus
     */
    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }


    /**
     * Sets the transactionStatus value for this PaymentOrderResult.
     *
     * @param transactionStatus
     */
    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaymentOrderResult)) return false;
        PaymentOrderResult other = (PaymentOrderResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.buyerEmail==null && other.getBuyerEmail()==null) ||
             (this.buyerEmail!=null &&
              this.buyerEmail.equals(other.getBuyerEmail()))) &&
            ((this.coinName==null && other.getCoinName()==null) ||
             (this.coinName!=null &&
              this.coinName.equals(other.getCoinName()))) &&
            ((this.cryptoCurrencyAddress==null && other.getCryptoCurrencyAddress()==null) ||
             (this.cryptoCurrencyAddress!=null &&
              this.cryptoCurrencyAddress.equals(other.getCryptoCurrencyAddress()))) &&
            ((this.cryptoCurrencyAmount==null && other.getCryptoCurrencyAmount()==null) ||
             (this.cryptoCurrencyAmount!=null &&
              this.cryptoCurrencyAmount.equals(other.getCryptoCurrencyAmount()))) &&
            ((this.cryptoCurrencyInvoiceCreated==null && other.getCryptoCurrencyInvoiceCreated()==null) ||
             (this.cryptoCurrencyInvoiceCreated!=null &&
              this.cryptoCurrencyInvoiceCreated.equals(other.getCryptoCurrencyInvoiceCreated()))) &&
            ((this.cryptoCurrencyInvoiceStatus==null && other.getCryptoCurrencyInvoiceStatus()==null) ||
             (this.cryptoCurrencyInvoiceStatus!=null &&
              this.cryptoCurrencyInvoiceStatus.equals(other.getCryptoCurrencyInvoiceStatus()))) &&
            ((this.cryptoCurrencyPaymentCompleted==null && other.getCryptoCurrencyPaymentCompleted()==null) ||
             (this.cryptoCurrencyPaymentCompleted!=null &&
              this.cryptoCurrencyPaymentCompleted.equals(other.getCryptoCurrencyPaymentCompleted()))) &&
            ((this.cryptoCurrencyPaymentReceived==null && other.getCryptoCurrencyPaymentReceived()==null) ||
             (this.cryptoCurrencyPaymentReceived!=null &&
              this.cryptoCurrencyPaymentReceived.equals(other.getCryptoCurrencyPaymentReceived()))) &&
            ((this.cryptoCurrencyPaymentRefundRequested==null && other.getCryptoCurrencyPaymentRefundRequested()==null) ||
             (this.cryptoCurrencyPaymentRefundRequested!=null &&
              this.cryptoCurrencyPaymentRefundRequested.equals(other.getCryptoCurrencyPaymentRefundRequested()))) &&
            ((this.cryptoCurrencyPaymentRefunded==null && other.getCryptoCurrencyPaymentRefunded()==null) ||
             (this.cryptoCurrencyPaymentRefunded!=null &&
              this.cryptoCurrencyPaymentRefunded.equals(other.getCryptoCurrencyPaymentRefunded()))) &&
            ((this.cryptoCurrencyTransactionId==null && other.getCryptoCurrencyTransactionId()==null) ||
             (this.cryptoCurrencyTransactionId!=null &&
              this.cryptoCurrencyTransactionId.equals(other.getCryptoCurrencyTransactionId()))) &&
            ((this.paymentCreated==null && other.getPaymentCreated()==null) ||
             (this.paymentCreated!=null &&
              this.paymentCreated.equals(other.getPaymentCreated()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) ||
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) ||
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.receivedCryptoCurrencyAmount==null && other.getReceivedCryptoCurrencyAmount()==null) ||
             (this.receivedCryptoCurrencyAmount!=null &&
              this.receivedCryptoCurrencyAmount.equals(other.getReceivedCryptoCurrencyAmount()))) &&
            ((this.refundAddress==null && other.getRefundAddress()==null) ||
             (this.refundAddress!=null &&
              this.refundAddress.equals(other.getRefundAddress()))) &&
            ((this.srcWalletId==null && other.getSrcWalletId()==null) ||
             (this.srcWalletId!=null &&
              this.srcWalletId.equals(other.getSrcWalletId()))) &&
            ((this.transactionAmount==null && other.getTransactionAmount()==null) ||
             (this.transactionAmount!=null &&
              this.transactionAmount.equals(other.getTransactionAmount()))) &&
            ((this.transactionCanceled==null && other.getTransactionCanceled()==null) ||
             (this.transactionCanceled!=null &&
              this.transactionCanceled.equals(other.getTransactionCanceled()))) &&
            ((this.transactionCompleted==null && other.getTransactionCompleted()==null) ||
             (this.transactionCompleted!=null &&
              this.transactionCompleted.equals(other.getTransactionCompleted()))) &&
            ((this.transactionCreated==null && other.getTransactionCreated()==null) ||
             (this.transactionCreated!=null &&
              this.transactionCreated.equals(other.getTransactionCreated()))) &&
            ((this.transactionCurrency==null && other.getTransactionCurrency()==null) ||
             (this.transactionCurrency!=null &&
              this.transactionCurrency.equals(other.getTransactionCurrency()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) ||
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.transactionStatus==null && other.getTransactionStatus()==null) ||
             (this.transactionStatus!=null &&
              this.transactionStatus.equals(other.getTransactionStatus())));
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
        if (getBuyerEmail() != null) {
            _hashCode += getBuyerEmail().hashCode();
        }
        if (getCoinName() != null) {
            _hashCode += getCoinName().hashCode();
        }
        if (getCryptoCurrencyAddress() != null) {
            _hashCode += getCryptoCurrencyAddress().hashCode();
        }
        if (getCryptoCurrencyAmount() != null) {
            _hashCode += getCryptoCurrencyAmount().hashCode();
        }
        if (getCryptoCurrencyInvoiceCreated() != null) {
            _hashCode += getCryptoCurrencyInvoiceCreated().hashCode();
        }
        if (getCryptoCurrencyInvoiceStatus() != null) {
            _hashCode += getCryptoCurrencyInvoiceStatus().hashCode();
        }
        if (getCryptoCurrencyPaymentCompleted() != null) {
            _hashCode += getCryptoCurrencyPaymentCompleted().hashCode();
        }
        if (getCryptoCurrencyPaymentReceived() != null) {
            _hashCode += getCryptoCurrencyPaymentReceived().hashCode();
        }
        if (getCryptoCurrencyPaymentRefundRequested() != null) {
            _hashCode += getCryptoCurrencyPaymentRefundRequested().hashCode();
        }
        if (getCryptoCurrencyPaymentRefunded() != null) {
            _hashCode += getCryptoCurrencyPaymentRefunded().hashCode();
        }
        if (getCryptoCurrencyTransactionId() != null) {
            _hashCode += getCryptoCurrencyTransactionId().hashCode();
        }
        if (getPaymentCreated() != null) {
            _hashCode += getPaymentCreated().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getReceivedCryptoCurrencyAmount() != null) {
            _hashCode += getReceivedCryptoCurrencyAmount().hashCode();
        }
        if (getRefundAddress() != null) {
            _hashCode += getRefundAddress().hashCode();
        }
        if (getSrcWalletId() != null) {
            _hashCode += getSrcWalletId().hashCode();
        }
        if (getTransactionAmount() != null) {
            _hashCode += getTransactionAmount().hashCode();
        }
        if (getTransactionCanceled() != null) {
            _hashCode += getTransactionCanceled().hashCode();
        }
        if (getTransactionCompleted() != null) {
            _hashCode += getTransactionCompleted().hashCode();
        }
        if (getTransactionCreated() != null) {
            _hashCode += getTransactionCreated().hashCode();
        }
        if (getTransactionCurrency() != null) {
            _hashCode += getTransactionCurrency().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getTransactionStatus() != null) {
            _hashCode += getTransactionStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentOrderResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "paymentOrderResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buyerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coinName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coinName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "coinName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cryptoCurrencyInvoiceCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyInvoiceCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyInvoiceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyInvoiceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyDepositPaymentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyPaymentCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyPaymentCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyPaymentReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyPaymentReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyPaymentRefundRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyPaymentRefundRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyPaymentRefunded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyPaymentRefunded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "sciAllowedPaymentSystems"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "paymentRequestStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedCryptoCurrencyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receivedCryptoCurrencyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refundAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcWalletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcWalletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCanceled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCanceled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCompleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCompleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currency"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionStatus"));
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
