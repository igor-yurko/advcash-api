/**
 * AdvcashCardMaxAllowedBalanceExceededException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class AdvcashCardMaxAllowedBalanceExceededException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.math.BigDecimal maxAllowedBalance;

    private java.math.BigDecimal currentBalance;

    private java.math.BigDecimal allowedAmount;

    private Currency currency;

    private ExceptionType type;

    public AdvcashCardMaxAllowedBalanceExceededException() {
    }

    public AdvcashCardMaxAllowedBalanceExceededException(
           java.math.BigDecimal maxAllowedBalance,
           java.math.BigDecimal currentBalance,
           java.math.BigDecimal allowedAmount,
           Currency currency,
           ExceptionType type) {
        this.maxAllowedBalance = maxAllowedBalance;
        this.currentBalance = currentBalance;
        this.allowedAmount = allowedAmount;
        this.currency = currency;
        this.type = type;
    }


    /**
     * Gets the maxAllowedBalance value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @return maxAllowedBalance
     */
    public java.math.BigDecimal getMaxAllowedBalance() {
        return maxAllowedBalance;
    }


    /**
     * Sets the maxAllowedBalance value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @param maxAllowedBalance
     */
    public void setMaxAllowedBalance(java.math.BigDecimal maxAllowedBalance) {
        this.maxAllowedBalance = maxAllowedBalance;
    }


    /**
     * Gets the currentBalance value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @return currentBalance
     */
    public java.math.BigDecimal getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @param currentBalance
     */
    public void setCurrentBalance(java.math.BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the allowedAmount value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @return allowedAmount
     */
    public java.math.BigDecimal getAllowedAmount() {
        return allowedAmount;
    }


    /**
     * Sets the allowedAmount value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @param allowedAmount
     */
    public void setAllowedAmount(java.math.BigDecimal allowedAmount) {
        this.allowedAmount = allowedAmount;
    }


    /**
     * Gets the currency value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the type value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @return type
     */
    public ExceptionType getType() {
        return type;
    }


    /**
     * Sets the type value for this AdvcashCardMaxAllowedBalanceExceededException.
     *
     * @param type
     */
    public void setType(ExceptionType type) {
        this.type = type;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AdvcashCardMaxAllowedBalanceExceededException)) return false;
        AdvcashCardMaxAllowedBalanceExceededException other = (AdvcashCardMaxAllowedBalanceExceededException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.maxAllowedBalance==null && other.getMaxAllowedBalance()==null) ||
             (this.maxAllowedBalance!=null &&
              this.maxAllowedBalance.equals(other.getMaxAllowedBalance()))) &&
            ((this.currentBalance==null && other.getCurrentBalance()==null) ||
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.allowedAmount==null && other.getAllowedAmount()==null) ||
             (this.allowedAmount!=null &&
              this.allowedAmount.equals(other.getAllowedAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) ||
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.type==null && other.getType()==null) ||
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getMaxAllowedBalance() != null) {
            _hashCode += getMaxAllowedBalance().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getAllowedAmount() != null) {
            _hashCode += getAllowedAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvcashCardMaxAllowedBalanceExceededException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAllowedBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxAllowedBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currency"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "exceptionType"));
        elemField.setNillable(true);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
