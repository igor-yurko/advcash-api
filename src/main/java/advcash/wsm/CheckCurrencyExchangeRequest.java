/**
 * CheckCurrencyExchangeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CheckCurrencyExchangeRequest  implements java.io.Serializable {
    private advcash.wsm.CurrencyExchangeAction action;

    private java.math.BigDecimal amount;

    private java.lang.String depositMethod;

    private java.lang.String from;

    private java.lang.String to;

    public CheckCurrencyExchangeRequest() {
    }

    public CheckCurrencyExchangeRequest(
           advcash.wsm.CurrencyExchangeAction action,
           java.math.BigDecimal amount,
           java.lang.String depositMethod,
           java.lang.String from,
           java.lang.String to) {
           this.action = action;
           this.amount = amount;
           this.depositMethod = depositMethod;
           this.from = from;
           this.to = to;
    }


    /**
     * Gets the action value for this CheckCurrencyExchangeRequest.
     * 
     * @return action
     */
    public advcash.wsm.CurrencyExchangeAction getAction() {
        return action;
    }


    /**
     * Sets the action value for this CheckCurrencyExchangeRequest.
     * 
     * @param action
     */
    public void setAction(advcash.wsm.CurrencyExchangeAction action) {
        this.action = action;
    }


    /**
     * Gets the amount value for this CheckCurrencyExchangeRequest.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CheckCurrencyExchangeRequest.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the depositMethod value for this CheckCurrencyExchangeRequest.
     * 
     * @return depositMethod
     */
    public java.lang.String getDepositMethod() {
        return depositMethod;
    }


    /**
     * Sets the depositMethod value for this CheckCurrencyExchangeRequest.
     * 
     * @param depositMethod
     */
    public void setDepositMethod(java.lang.String depositMethod) {
        this.depositMethod = depositMethod;
    }


    /**
     * Gets the from value for this CheckCurrencyExchangeRequest.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this CheckCurrencyExchangeRequest.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this CheckCurrencyExchangeRequest.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this CheckCurrencyExchangeRequest.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CheckCurrencyExchangeRequest)) return false;
        CheckCurrencyExchangeRequest other = (CheckCurrencyExchangeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.depositMethod==null && other.getDepositMethod()==null) || 
             (this.depositMethod!=null &&
              this.depositMethod.equals(other.getDepositMethod()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getDepositMethod() != null) {
            _hashCode += getDepositMethod().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CheckCurrencyExchangeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeAction"));
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
        elemField.setFieldName("depositMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "depositMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
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
