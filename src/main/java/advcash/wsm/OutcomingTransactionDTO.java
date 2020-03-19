/**
 * OutcomingTransactionDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class OutcomingTransactionDTO  extends AbstractBaseDTO  implements java.io.Serializable {
    private String accountName;

    private int activityLevel;

    private java.math.BigDecimal amount;

    private java.math.BigDecimal amountInUSD;

    private String comment;

    private java.math.BigDecimal cryptoCurrencyAmount;

    private CoinName cryptoCurrencyCoinName;

    private Currency currency;

    private TransactionDirection direction;

    private java.math.BigDecimal fullCommission;

    private String orderId;

    private String parentTransactionId;

    private String receiverEmail;

    private boolean sci;

    private String senderEmail;

    private java.util.Calendar startTime;

    private TransactionStatus status;

    private TransactionName transactionName;

    private java.util.Calendar updatedTime;

    private VerificationStatus verificationStatus;

    private String walletDestId;

    private String walletSrcId;

    public OutcomingTransactionDTO() {
    }

    public OutcomingTransactionDTO(
           String id,
           String accountName,
           int activityLevel,
           java.math.BigDecimal amount,
           java.math.BigDecimal amountInUSD,
           String comment,
           java.math.BigDecimal cryptoCurrencyAmount,
           CoinName cryptoCurrencyCoinName,
           Currency currency,
           TransactionDirection direction,
           java.math.BigDecimal fullCommission,
           String orderId,
           String parentTransactionId,
           String receiverEmail,
           boolean sci,
           String senderEmail,
           java.util.Calendar startTime,
           TransactionStatus status,
           TransactionName transactionName,
           java.util.Calendar updatedTime,
           VerificationStatus verificationStatus,
           String walletDestId,
           String walletSrcId) {
        super(
            id);
        this.accountName = accountName;
        this.activityLevel = activityLevel;
        this.amount = amount;
        this.amountInUSD = amountInUSD;
        this.comment = comment;
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
        this.cryptoCurrencyCoinName = cryptoCurrencyCoinName;
        this.currency = currency;
        this.direction = direction;
        this.fullCommission = fullCommission;
        this.orderId = orderId;
        this.parentTransactionId = parentTransactionId;
        this.receiverEmail = receiverEmail;
        this.sci = sci;
        this.senderEmail = senderEmail;
        this.startTime = startTime;
        this.status = status;
        this.transactionName = transactionName;
        this.updatedTime = updatedTime;
        this.verificationStatus = verificationStatus;
        this.walletDestId = walletDestId;
        this.walletSrcId = walletSrcId;
    }


    /**
     * Gets the accountName value for this OutcomingTransactionDTO.
     *
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }


    /**
     * Sets the accountName value for this OutcomingTransactionDTO.
     *
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


    /**
     * Gets the activityLevel value for this OutcomingTransactionDTO.
     *
     * @return activityLevel
     */
    public int getActivityLevel() {
        return activityLevel;
    }


    /**
     * Sets the activityLevel value for this OutcomingTransactionDTO.
     *
     * @param activityLevel
     */
    public void setActivityLevel(int activityLevel) {
        this.activityLevel = activityLevel;
    }


    /**
     * Gets the amount value for this OutcomingTransactionDTO.
     *
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OutcomingTransactionDTO.
     *
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountInUSD value for this OutcomingTransactionDTO.
     *
     * @return amountInUSD
     */
    public java.math.BigDecimal getAmountInUSD() {
        return amountInUSD;
    }


    /**
     * Sets the amountInUSD value for this OutcomingTransactionDTO.
     *
     * @param amountInUSD
     */
    public void setAmountInUSD(java.math.BigDecimal amountInUSD) {
        this.amountInUSD = amountInUSD;
    }


    /**
     * Gets the comment value for this OutcomingTransactionDTO.
     *
     * @return comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this OutcomingTransactionDTO.
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * Gets the cryptoCurrencyAmount value for this OutcomingTransactionDTO.
     *
     * @return cryptoCurrencyAmount
     */
    public java.math.BigDecimal getCryptoCurrencyAmount() {
        return cryptoCurrencyAmount;
    }


    /**
     * Sets the cryptoCurrencyAmount value for this OutcomingTransactionDTO.
     *
     * @param cryptoCurrencyAmount
     */
    public void setCryptoCurrencyAmount(java.math.BigDecimal cryptoCurrencyAmount) {
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
    }


    /**
     * Gets the cryptoCurrencyCoinName value for this OutcomingTransactionDTO.
     *
     * @return cryptoCurrencyCoinName
     */
    public CoinName getCryptoCurrencyCoinName() {
        return cryptoCurrencyCoinName;
    }


    /**
     * Sets the cryptoCurrencyCoinName value for this OutcomingTransactionDTO.
     *
     * @param cryptoCurrencyCoinName
     */
    public void setCryptoCurrencyCoinName(CoinName cryptoCurrencyCoinName) {
        this.cryptoCurrencyCoinName = cryptoCurrencyCoinName;
    }


    /**
     * Gets the currency value for this OutcomingTransactionDTO.
     *
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OutcomingTransactionDTO.
     *
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the direction value for this OutcomingTransactionDTO.
     *
     * @return direction
     */
    public TransactionDirection getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this OutcomingTransactionDTO.
     *
     * @param direction
     */
    public void setDirection(TransactionDirection direction) {
        this.direction = direction;
    }


    /**
     * Gets the fullCommission value for this OutcomingTransactionDTO.
     *
     * @return fullCommission
     */
    public java.math.BigDecimal getFullCommission() {
        return fullCommission;
    }


    /**
     * Sets the fullCommission value for this OutcomingTransactionDTO.
     *
     * @param fullCommission
     */
    public void setFullCommission(java.math.BigDecimal fullCommission) {
        this.fullCommission = fullCommission;
    }


    /**
     * Gets the orderId value for this OutcomingTransactionDTO.
     *
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this OutcomingTransactionDTO.
     *
     * @param orderId
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the parentTransactionId value for this OutcomingTransactionDTO.
     *
     * @return parentTransactionId
     */
    public String getParentTransactionId() {
        return parentTransactionId;
    }


    /**
     * Sets the parentTransactionId value for this OutcomingTransactionDTO.
     *
     * @param parentTransactionId
     */
    public void setParentTransactionId(String parentTransactionId) {
        this.parentTransactionId = parentTransactionId;
    }


    /**
     * Gets the receiverEmail value for this OutcomingTransactionDTO.
     *
     * @return receiverEmail
     */
    public String getReceiverEmail() {
        return receiverEmail;
    }


    /**
     * Sets the receiverEmail value for this OutcomingTransactionDTO.
     *
     * @param receiverEmail
     */
    public void setReceiverEmail(String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }


    /**
     * Gets the sci value for this OutcomingTransactionDTO.
     *
     * @return sci
     */
    public boolean isSci() {
        return sci;
    }


    /**
     * Sets the sci value for this OutcomingTransactionDTO.
     *
     * @param sci
     */
    public void setSci(boolean sci) {
        this.sci = sci;
    }


    /**
     * Gets the senderEmail value for this OutcomingTransactionDTO.
     *
     * @return senderEmail
     */
    public String getSenderEmail() {
        return senderEmail;
    }


    /**
     * Sets the senderEmail value for this OutcomingTransactionDTO.
     *
     * @param senderEmail
     */
    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }


    /**
     * Gets the startTime value for this OutcomingTransactionDTO.
     *
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this OutcomingTransactionDTO.
     *
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the status value for this OutcomingTransactionDTO.
     *
     * @return status
     */
    public TransactionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OutcomingTransactionDTO.
     *
     * @param status
     */
    public void setStatus(TransactionStatus status) {
        this.status = status;
    }


    /**
     * Gets the transactionName value for this OutcomingTransactionDTO.
     *
     * @return transactionName
     */
    public TransactionName getTransactionName() {
        return transactionName;
    }


    /**
     * Sets the transactionName value for this OutcomingTransactionDTO.
     *
     * @param transactionName
     */
    public void setTransactionName(TransactionName transactionName) {
        this.transactionName = transactionName;
    }


    /**
     * Gets the updatedTime value for this OutcomingTransactionDTO.
     *
     * @return updatedTime
     */
    public java.util.Calendar getUpdatedTime() {
        return updatedTime;
    }


    /**
     * Sets the updatedTime value for this OutcomingTransactionDTO.
     *
     * @param updatedTime
     */
    public void setUpdatedTime(java.util.Calendar updatedTime) {
        this.updatedTime = updatedTime;
    }


    /**
     * Gets the verificationStatus value for this OutcomingTransactionDTO.
     *
     * @return verificationStatus
     */
    public VerificationStatus getVerificationStatus() {
        return verificationStatus;
    }


    /**
     * Sets the verificationStatus value for this OutcomingTransactionDTO.
     *
     * @param verificationStatus
     */
    public void setVerificationStatus(VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus;
    }


    /**
     * Gets the walletDestId value for this OutcomingTransactionDTO.
     *
     * @return walletDestId
     */
    public String getWalletDestId() {
        return walletDestId;
    }


    /**
     * Sets the walletDestId value for this OutcomingTransactionDTO.
     *
     * @param walletDestId
     */
    public void setWalletDestId(String walletDestId) {
        this.walletDestId = walletDestId;
    }


    /**
     * Gets the walletSrcId value for this OutcomingTransactionDTO.
     *
     * @return walletSrcId
     */
    public String getWalletSrcId() {
        return walletSrcId;
    }


    /**
     * Sets the walletSrcId value for this OutcomingTransactionDTO.
     *
     * @param walletSrcId
     */
    public void setWalletSrcId(String walletSrcId) {
        this.walletSrcId = walletSrcId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OutcomingTransactionDTO)) return false;
        OutcomingTransactionDTO other = (OutcomingTransactionDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.accountName==null && other.getAccountName()==null) ||
             (this.accountName!=null &&
              this.accountName.equals(other.getAccountName()))) &&
            this.activityLevel == other.getActivityLevel() &&
            ((this.amount==null && other.getAmount()==null) ||
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountInUSD==null && other.getAmountInUSD()==null) ||
             (this.amountInUSD!=null &&
              this.amountInUSD.equals(other.getAmountInUSD()))) &&
            ((this.comment==null && other.getComment()==null) ||
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.cryptoCurrencyAmount==null && other.getCryptoCurrencyAmount()==null) ||
             (this.cryptoCurrencyAmount!=null &&
              this.cryptoCurrencyAmount.equals(other.getCryptoCurrencyAmount()))) &&
            ((this.cryptoCurrencyCoinName==null && other.getCryptoCurrencyCoinName()==null) ||
             (this.cryptoCurrencyCoinName!=null &&
              this.cryptoCurrencyCoinName.equals(other.getCryptoCurrencyCoinName()))) &&
            ((this.currency==null && other.getCurrency()==null) ||
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.direction==null && other.getDirection()==null) ||
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.fullCommission==null && other.getFullCommission()==null) ||
             (this.fullCommission!=null &&
              this.fullCommission.equals(other.getFullCommission()))) &&
            ((this.orderId==null && other.getOrderId()==null) ||
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.parentTransactionId==null && other.getParentTransactionId()==null) ||
             (this.parentTransactionId!=null &&
              this.parentTransactionId.equals(other.getParentTransactionId()))) &&
            ((this.receiverEmail==null && other.getReceiverEmail()==null) ||
             (this.receiverEmail!=null &&
              this.receiverEmail.equals(other.getReceiverEmail()))) &&
            this.sci == other.isSci() &&
            ((this.senderEmail==null && other.getSenderEmail()==null) ||
             (this.senderEmail!=null &&
              this.senderEmail.equals(other.getSenderEmail()))) &&
            ((this.startTime==null && other.getStartTime()==null) ||
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.status==null && other.getStatus()==null) ||
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transactionName==null && other.getTransactionName()==null) ||
             (this.transactionName!=null &&
              this.transactionName.equals(other.getTransactionName()))) &&
            ((this.updatedTime==null && other.getUpdatedTime()==null) ||
             (this.updatedTime!=null &&
              this.updatedTime.equals(other.getUpdatedTime()))) &&
            ((this.verificationStatus==null && other.getVerificationStatus()==null) ||
             (this.verificationStatus!=null &&
              this.verificationStatus.equals(other.getVerificationStatus()))) &&
            ((this.walletDestId==null && other.getWalletDestId()==null) ||
             (this.walletDestId!=null &&
              this.walletDestId.equals(other.getWalletDestId()))) &&
            ((this.walletSrcId==null && other.getWalletSrcId()==null) ||
             (this.walletSrcId!=null &&
              this.walletSrcId.equals(other.getWalletSrcId())));
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
        if (getAccountName() != null) {
            _hashCode += getAccountName().hashCode();
        }
        _hashCode += getActivityLevel();
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountInUSD() != null) {
            _hashCode += getAmountInUSD().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getCryptoCurrencyAmount() != null) {
            _hashCode += getCryptoCurrencyAmount().hashCode();
        }
        if (getCryptoCurrencyCoinName() != null) {
            _hashCode += getCryptoCurrencyCoinName().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getFullCommission() != null) {
            _hashCode += getFullCommission().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getParentTransactionId() != null) {
            _hashCode += getParentTransactionId().hashCode();
        }
        if (getReceiverEmail() != null) {
            _hashCode += getReceiverEmail().hashCode();
        }
        _hashCode += (isSci() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSenderEmail() != null) {
            _hashCode += getSenderEmail().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransactionName() != null) {
            _hashCode += getTransactionName().hashCode();
        }
        if (getUpdatedTime() != null) {
            _hashCode += getUpdatedTime().hashCode();
        }
        if (getVerificationStatus() != null) {
            _hashCode += getVerificationStatus().hashCode();
        }
        if (getWalletDestId() != null) {
            _hashCode += getWalletDestId().hashCode();
        }
        if (getWalletSrcId() != null) {
            _hashCode += getWalletSrcId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutcomingTransactionDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "outcomingTransactionDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activityLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("amountInUSD");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountInUSD"));
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
        elemField.setFieldName("cryptoCurrencyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyCoinName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyCoinName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "coinName"));
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
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("parentTransactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentTransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "receiverEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sci");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "senderEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "verificationStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletDestId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "walletDestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletSrcId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "walletSrcId"));
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
