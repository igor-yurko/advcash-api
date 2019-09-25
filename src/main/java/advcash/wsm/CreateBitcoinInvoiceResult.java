/**
 * CreateBitcoinInvoiceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CreateBitcoinInvoiceResult  extends advcash.wsm.CreateBitcoinInvoiceRequest  implements java.io.Serializable {
    private java.lang.String bitcoinAddress;

    private java.math.BigDecimal bitcoinAmount;

    public CreateBitcoinInvoiceResult() {
    }

    public CreateBitcoinInvoiceResult(
           java.math.BigDecimal amount,
           advcash.wsm.Currency currency,
           java.lang.String note,
           boolean savePaymentTemplate,
           java.lang.String orderId,
           java.lang.String sciName,
           java.lang.String bitcoinAddress,
           java.math.BigDecimal bitcoinAmount) {
        super(
            amount,
            currency,
            note,
            savePaymentTemplate,
            orderId,
            sciName);
        this.bitcoinAddress = bitcoinAddress;
        this.bitcoinAmount = bitcoinAmount;
    }


    /**
     * Gets the bitcoinAddress value for this CreateBitcoinInvoiceResult.
     * 
     * @return bitcoinAddress
     */
    public java.lang.String getBitcoinAddress() {
        return bitcoinAddress;
    }


    /**
     * Sets the bitcoinAddress value for this CreateBitcoinInvoiceResult.
     * 
     * @param bitcoinAddress
     */
    public void setBitcoinAddress(java.lang.String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }


    /**
     * Gets the bitcoinAmount value for this CreateBitcoinInvoiceResult.
     * 
     * @return bitcoinAmount
     */
    public java.math.BigDecimal getBitcoinAmount() {
        return bitcoinAmount;
    }


    /**
     * Sets the bitcoinAmount value for this CreateBitcoinInvoiceResult.
     * 
     * @param bitcoinAmount
     */
    public void setBitcoinAmount(java.math.BigDecimal bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateBitcoinInvoiceResult)) return false;
        CreateBitcoinInvoiceResult other = (CreateBitcoinInvoiceResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bitcoinAddress==null && other.getBitcoinAddress()==null) || 
             (this.bitcoinAddress!=null &&
              this.bitcoinAddress.equals(other.getBitcoinAddress()))) &&
            ((this.bitcoinAmount==null && other.getBitcoinAmount()==null) || 
             (this.bitcoinAmount!=null &&
              this.bitcoinAmount.equals(other.getBitcoinAmount())));
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
        if (getBitcoinAddress() != null) {
            _hashCode += getBitcoinAddress().hashCode();
        }
        if (getBitcoinAmount() != null) {
            _hashCode += getBitcoinAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateBitcoinInvoiceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitcoinAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bitcoinAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bitcoinAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bitcoinAmount"));
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

    @Override
	public String toString() {
		return "CreateBitcoinInvoiceResult [bitcoinAddress=" + bitcoinAddress + ", bitcoinAmount=" + bitcoinAmount
				+ ", getOrderId()=" + getOrderId() + ", getSciName()=" + getSciName() + ", getAmount()=" + getAmount()
				+ ", getCurrency()=" + getCurrency() + ", getNote()=" + getNote() + "]";
	}

}
