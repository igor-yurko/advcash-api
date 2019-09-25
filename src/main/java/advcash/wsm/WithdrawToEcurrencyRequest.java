/**
 * WithdrawToEcurrencyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class WithdrawToEcurrencyRequest  extends advcash.wsm.MoneyRequest  implements java.io.Serializable {
    private java.math.BigDecimal btcAmount;

    private advcash.wsm.Ecurrency ecurrency;

    private java.math.BigDecimal ethAmount;

    private java.lang.String receiver;

    public WithdrawToEcurrencyRequest() {
    }

    public WithdrawToEcurrencyRequest(
           java.math.BigDecimal amount,
           advcash.wsm.Currency currency,
           java.lang.String note,
           boolean savePaymentTemplate,
           java.math.BigDecimal btcAmount,
           advcash.wsm.Ecurrency ecurrency,
           java.math.BigDecimal ethAmount,
           java.lang.String receiver) {
        super(
            amount,
            currency,
            note,
            savePaymentTemplate);
        this.btcAmount = btcAmount;
        this.ecurrency = ecurrency;
        this.ethAmount = ethAmount;
        this.receiver = receiver;
    }


    /**
     * Gets the btcAmount value for this WithdrawToEcurrencyRequest.
     * 
     * @return btcAmount
     */
    public java.math.BigDecimal getBtcAmount() {
        return btcAmount;
    }


    /**
     * Sets the btcAmount value for this WithdrawToEcurrencyRequest.
     * 
     * @param btcAmount
     */
    public void setBtcAmount(java.math.BigDecimal btcAmount) {
        this.btcAmount = btcAmount;
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
     * Gets the ethAmount value for this WithdrawToEcurrencyRequest.
     * 
     * @return ethAmount
     */
    public java.math.BigDecimal getEthAmount() {
        return ethAmount;
    }


    /**
     * Sets the ethAmount value for this WithdrawToEcurrencyRequest.
     * 
     * @param ethAmount
     */
    public void setEthAmount(java.math.BigDecimal ethAmount) {
        this.ethAmount = ethAmount;
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
            ((this.btcAmount==null && other.getBtcAmount()==null) || 
             (this.btcAmount!=null &&
              this.btcAmount.equals(other.getBtcAmount()))) &&
            ((this.ecurrency==null && other.getEcurrency()==null) || 
             (this.ecurrency!=null &&
              this.ecurrency.equals(other.getEcurrency()))) &&
            ((this.ethAmount==null && other.getEthAmount()==null) || 
             (this.ethAmount!=null &&
              this.ethAmount.equals(other.getEthAmount()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver())));
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
        if (getBtcAmount() != null) {
            _hashCode += getBtcAmount().hashCode();
        }
        if (getEcurrency() != null) {
            _hashCode += getEcurrency().hashCode();
        }
        if (getEthAmount() != null) {
            _hashCode += getEthAmount().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
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
        elemField.setFieldName("btcAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "btcAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "ecurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ethAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
