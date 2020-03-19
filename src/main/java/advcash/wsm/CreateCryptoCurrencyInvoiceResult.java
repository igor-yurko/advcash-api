/**
 * CreateCryptoCurrencyInvoiceResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CreateCryptoCurrencyInvoiceResult  extends CreateCryptoCurrencyInvoiceRequest  implements java.io.Serializable {
    private String address;

    private String addressOldFormat;

    private java.math.BigDecimal cryptoCurrencyAmount;

    private String destinationTag;

    public CreateCryptoCurrencyInvoiceResult() {
    }

    public CreateCryptoCurrencyInvoiceResult(
           java.math.BigDecimal amount,
           Currency currency,
           String note,
           Boolean savePaymentTemplate,
           CoinName coinName,
           String orderId,
           String sciName,
           String subMerchantURL,
           String address,
           String addressOldFormat,
           java.math.BigDecimal cryptoCurrencyAmount,
           String destinationTag) {
        super(
            amount,
            currency,
            note,
            savePaymentTemplate,
            coinName,
            orderId,
            sciName,
            subMerchantURL);
        this.address = address;
        this.addressOldFormat = addressOldFormat;
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
        this.destinationTag = destinationTag;
    }


    /**
     * Gets the address value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the addressOldFormat value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @return addressOldFormat
     */
    public String getAddressOldFormat() {
        return addressOldFormat;
    }


    /**
     * Sets the addressOldFormat value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @param addressOldFormat
     */
    public void setAddressOldFormat(String addressOldFormat) {
        this.addressOldFormat = addressOldFormat;
    }


    /**
     * Gets the cryptoCurrencyAmount value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @return cryptoCurrencyAmount
     */
    public java.math.BigDecimal getCryptoCurrencyAmount() {
        return cryptoCurrencyAmount;
    }


    /**
     * Sets the cryptoCurrencyAmount value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @param cryptoCurrencyAmount
     */
    public void setCryptoCurrencyAmount(java.math.BigDecimal cryptoCurrencyAmount) {
        this.cryptoCurrencyAmount = cryptoCurrencyAmount;
    }


    /**
     * Gets the destinationTag value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @return destinationTag
     */
    public String getDestinationTag() {
        return destinationTag;
    }


    /**
     * Sets the destinationTag value for this CreateCryptoCurrencyInvoiceResult.
     *
     * @param destinationTag
     */
    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateCryptoCurrencyInvoiceResult)) return false;
        CreateCryptoCurrencyInvoiceResult other = (CreateCryptoCurrencyInvoiceResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.address==null && other.getAddress()==null) ||
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.addressOldFormat==null && other.getAddressOldFormat()==null) ||
             (this.addressOldFormat!=null &&
              this.addressOldFormat.equals(other.getAddressOldFormat()))) &&
            ((this.cryptoCurrencyAmount==null && other.getCryptoCurrencyAmount()==null) ||
             (this.cryptoCurrencyAmount!=null &&
              this.cryptoCurrencyAmount.equals(other.getCryptoCurrencyAmount()))) &&
            ((this.destinationTag==null && other.getDestinationTag()==null) ||
             (this.destinationTag!=null &&
              this.destinationTag.equals(other.getDestinationTag())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddressOldFormat() != null) {
            _hashCode += getAddressOldFormat().hashCode();
        }
        if (getCryptoCurrencyAmount() != null) {
            _hashCode += getCryptoCurrencyAmount().hashCode();
        }
        if (getDestinationTag() != null) {
            _hashCode += getDestinationTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateCryptoCurrencyInvoiceResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "createCryptoCurrencyInvoiceResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressOldFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressOldFormat"));
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
        elemField.setFieldName("destinationTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationTag"));
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
