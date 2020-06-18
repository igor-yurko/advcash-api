/**
 * CheckCurrencyExchangeResultHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CheckCurrencyExchangeResultHolder  extends advcash.wsm.CheckCurrencyExchangeRequest  implements java.io.Serializable {
    private java.math.BigDecimal amountExchanged;

    private java.math.BigDecimal cryptoCurrencyAmountWithFee;

    private java.math.BigDecimal cryptoCurrencyWithdrawalFee;

    private java.math.BigDecimal rate;

    public CheckCurrencyExchangeResultHolder() {
    }

    public CheckCurrencyExchangeResultHolder(
           advcash.wsm.CurrencyExchangeAction action,
           java.math.BigDecimal amount,
           java.lang.String depositMethod,
           java.lang.String from,
           java.lang.String to,
           java.math.BigDecimal amountExchanged,
           java.math.BigDecimal cryptoCurrencyAmountWithFee,
           java.math.BigDecimal cryptoCurrencyWithdrawalFee,
           java.math.BigDecimal rate) {
        super(
            action,
            amount,
            depositMethod,
            from,
            to);
        this.amountExchanged = amountExchanged;
        this.cryptoCurrencyAmountWithFee = cryptoCurrencyAmountWithFee;
        this.cryptoCurrencyWithdrawalFee = cryptoCurrencyWithdrawalFee;
        this.rate = rate;
    }


    /**
     * Gets the amountExchanged value for this CheckCurrencyExchangeResultHolder.
     * 
     * @return amountExchanged
     */
    public java.math.BigDecimal getAmountExchanged() {
        return amountExchanged;
    }


    /**
     * Sets the amountExchanged value for this CheckCurrencyExchangeResultHolder.
     * 
     * @param amountExchanged
     */
    public void setAmountExchanged(java.math.BigDecimal amountExchanged) {
        this.amountExchanged = amountExchanged;
    }


    /**
     * Gets the cryptoCurrencyAmountWithFee value for this CheckCurrencyExchangeResultHolder.
     * 
     * @return cryptoCurrencyAmountWithFee
     */
    public java.math.BigDecimal getCryptoCurrencyAmountWithFee() {
        return cryptoCurrencyAmountWithFee;
    }


    /**
     * Sets the cryptoCurrencyAmountWithFee value for this CheckCurrencyExchangeResultHolder.
     * 
     * @param cryptoCurrencyAmountWithFee
     */
    public void setCryptoCurrencyAmountWithFee(java.math.BigDecimal cryptoCurrencyAmountWithFee) {
        this.cryptoCurrencyAmountWithFee = cryptoCurrencyAmountWithFee;
    }


    /**
     * Gets the cryptoCurrencyWithdrawalFee value for this CheckCurrencyExchangeResultHolder.
     * 
     * @return cryptoCurrencyWithdrawalFee
     */
    public java.math.BigDecimal getCryptoCurrencyWithdrawalFee() {
        return cryptoCurrencyWithdrawalFee;
    }


    /**
     * Sets the cryptoCurrencyWithdrawalFee value for this CheckCurrencyExchangeResultHolder.
     * 
     * @param cryptoCurrencyWithdrawalFee
     */
    public void setCryptoCurrencyWithdrawalFee(java.math.BigDecimal cryptoCurrencyWithdrawalFee) {
        this.cryptoCurrencyWithdrawalFee = cryptoCurrencyWithdrawalFee;
    }


    /**
     * Gets the rate value for this CheckCurrencyExchangeResultHolder.
     * 
     * @return rate
     */
    public java.math.BigDecimal getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this CheckCurrencyExchangeResultHolder.
     * 
     * @param rate
     */
    public void setRate(java.math.BigDecimal rate) {
        this.rate = rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCurrencyExchangeResultHolder)) return false;
        CheckCurrencyExchangeResultHolder other = (CheckCurrencyExchangeResultHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amountExchanged==null && other.getAmountExchanged()==null) || 
             (this.amountExchanged!=null &&
              this.amountExchanged.equals(other.getAmountExchanged()))) &&
            ((this.cryptoCurrencyAmountWithFee==null && other.getCryptoCurrencyAmountWithFee()==null) || 
             (this.cryptoCurrencyAmountWithFee!=null &&
              this.cryptoCurrencyAmountWithFee.equals(other.getCryptoCurrencyAmountWithFee()))) &&
            ((this.cryptoCurrencyWithdrawalFee==null && other.getCryptoCurrencyWithdrawalFee()==null) || 
             (this.cryptoCurrencyWithdrawalFee!=null &&
              this.cryptoCurrencyWithdrawalFee.equals(other.getCryptoCurrencyWithdrawalFee()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate())));
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
        if (getAmountExchanged() != null) {
            _hashCode += getAmountExchanged().hashCode();
        }
        if (getCryptoCurrencyAmountWithFee() != null) {
            _hashCode += getCryptoCurrencyAmountWithFee().hashCode();
        }
        if (getCryptoCurrencyWithdrawalFee() != null) {
            _hashCode += getCryptoCurrencyWithdrawalFee().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCurrencyExchangeResultHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeResultHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountExchanged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amountExchanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyAmountWithFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyAmountWithFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cryptoCurrencyWithdrawalFee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cryptoCurrencyWithdrawalFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
