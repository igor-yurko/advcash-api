/**
 * WithdrawToEcurrencyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class WithdrawToEcurrencyRequest  extends advcash.wsm.MoneyRequest  implements java.io.Serializable {
    private advcash.wsm.Ecurrency ecurrency;

    private java.lang.String receiver;

    private java.lang.String destinationTag;

    private java.math.BigDecimal cryptoCurrencyAmount;

    private java.lang.String orderId;

    private java.lang.String depositMethod;

    public WithdrawToEcurrencyRequest() {
    }

    public WithdrawToEcurrencyRequest(
           java.math.BigDecimal amount,
           advcash.wsm.Currency currency,
           java.lang.String note,
           java.lang.Boolean savePaymentTemplate,
           advcash.wsm.Ecurrency ecurrency,
           java.lang.String receiver,
           java.lang.String destinationTag,
           java.math.BigDecimal cryptoCurrencyAmount,
           java.lang.String orderId,
           java.lang.String depositMethod) {
        super(
            amount,
            currency,
            note,
            savePaymentTemplate);
        this.ecurrency = ecurrency;
        this.receiver = receiver;
        this.destinationTag = destinationTag;
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
        this.orderId = orderId;
        this.depositMethod = depositMethod;
    }


    /**
     * Gets the ecurrency value for this WithdrawToEcurrencyRequest.
     * 
     * @return ecurrency
     */
    public advcash.wsm.Ecurrency getEcurrency() {
        return ecurrency;
    }


    /**
     * Sets the ecurrency value for this WithdrawToEcurrencyRequest.
     * 
     * @param ecurrency
     */
    public void setEcurrency(advcash.wsm.Ecurrency ecurrency) {
        this.ecurrency = ecurrency;
    }


    /**
     * Gets the receiver value for this WithdrawToEcurrencyRequest.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this WithdrawToEcurrencyRequest.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the destinationTag value for this WithdrawToEcurrencyRequest.
     * 
     * @return destinationTag
     */
    public java.lang.String getDestinationTag() {
        return destinationTag;
    }


    /**
     * Sets the destinationTag value for this WithdrawToEcurrencyRequest.
     * 
     * @param destinationTag
     */
    public void setDestinationTag(java.lang.String destinationTag) {
        this.destinationTag = destinationTag;
    }


    /**
     * Gets the cryptoCurrencyAmount value for this WithdrawToEcurrencyRequest.
     * 
     * @return cryptoCurrencyAmount
     */
    public java.math.BigDecimal getCryptoCurrencyAmount() {
        return cryptoCurrencyAmount;
    }


    /**
     * Sets the cryptoCurrencyAmount value for this WithdrawToEcurrencyRequest.
     * 
     * @param cryptoCurrencyAmount
     */
    public void setCryptoCurrencyAmount(java.math.BigDecimal cryptoCurrencyAmount) {
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
    }


    /**
     * Gets the orderId value for this WithdrawToEcurrencyRequest.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this WithdrawToEcurrencyRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the depositMethod value for this WithdrawToEcurrencyRequest.
     * 
     * @return depositMethod
     */
    public java.lang.String getDepositMethod() {
        return depositMethod;
    }


    /**
     * Sets the depositMethod value for this WithdrawToEcurrencyRequest.
     * 
     * @param depositMethod
     */
    public void setDepositMethod(java.lang.String depositMethod) {
        this.depositMethod = depositMethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WithdrawToEcurrencyRequest)) return false;
        WithdrawToEcurrencyRequest other = (WithdrawToEcurrencyRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ecurrency==null && other.getEcurrency()==null) || 
             (this.ecurrency!=null &&
              this.ecurrency.equals(other.getEcurrency()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.destinationTag==null && other.getDestinationTag()==null) || 
             (this.destinationTag!=null &&
              this.destinationTag.equals(other.getDestinationTag()))) &&
            ((this.cryptoCurrencyAmount==null && other.getCryptoCurrencyAmount()==null) || 
             (this.cryptoCurrencyAmount!=null &&
              this.cryptoCurrencyAmount.equals(other.getCryptoCurrencyAmount()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.depositMethod==null && other.getDepositMethod()==null) || 
             (this.depositMethod!=null &&
              this.depositMethod.equals(other.getDepositMethod())));
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
        if (getEcurrency() != null) {
            _hashCode += getEcurrency().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getDestinationTag() != null) {
            _hashCode += getDestinationTag().hashCode();
        }
        if (getCryptoCurrencyAmount() != null) {
            _hashCode += getCryptoCurrencyAmount().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getDepositMethod() != null) {
            _hashCode += getDepositMethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WithdrawToEcurrencyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "ecurrency"));
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
        elemField.setFieldName("destinationTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationTag"));
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
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositMethod"));
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
