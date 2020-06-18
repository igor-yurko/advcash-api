/**
 * CreateBitcoinInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CreateBitcoinInvoiceRequest  extends advcash.wsm.MoneyRequest  implements java.io.Serializable {
    private java.lang.String orderId;

    private java.lang.String sciName;

    private java.lang.String subMerchantURL;

    public CreateBitcoinInvoiceRequest() {
    }

    public CreateBitcoinInvoiceRequest(
           java.math.BigDecimal amount,
           advcash.wsm.Currency currency,
           java.lang.String note,
           java.lang.Boolean savePaymentTemplate,
           java.lang.String orderId,
           java.lang.String sciName,
           java.lang.String subMerchantURL) {
        super(
            amount,
            currency,
            note,
            savePaymentTemplate);
        this.orderId = orderId;
        this.sciName = sciName;
        this.subMerchantURL = subMerchantURL;
    }


    /**
     * Gets the orderId value for this CreateBitcoinInvoiceRequest.
     * 
     * @return orderId
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this CreateBitcoinInvoiceRequest.
     * 
     * @param orderId
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the sciName value for this CreateBitcoinInvoiceRequest.
     * 
     * @return sciName
     */
    public java.lang.String getSciName() {
        return sciName;
    }


    /**
     * Sets the sciName value for this CreateBitcoinInvoiceRequest.
     * 
     * @param sciName
     */
    public void setSciName(java.lang.String sciName) {
        this.sciName = sciName;
    }


    /**
     * Gets the subMerchantURL value for this CreateBitcoinInvoiceRequest.
     * 
     * @return subMerchantURL
     */
    public java.lang.String getSubMerchantURL() {
        return subMerchantURL;
    }


    /**
     * Sets the subMerchantURL value for this CreateBitcoinInvoiceRequest.
     * 
     * @param subMerchantURL
     */
    public void setSubMerchantURL(java.lang.String subMerchantURL) {
        this.subMerchantURL = subMerchantURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateBitcoinInvoiceRequest)) return false;
        CreateBitcoinInvoiceRequest other = (CreateBitcoinInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.sciName==null && other.getSciName()==null) || 
             (this.sciName!=null &&
              this.sciName.equals(other.getSciName()))) &&
            ((this.subMerchantURL==null && other.getSubMerchantURL()==null) || 
             (this.subMerchantURL!=null &&
              this.subMerchantURL.equals(other.getSubMerchantURL())));
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
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getSciName() != null) {
            _hashCode += getSciName().hashCode();
        }
        if (getSubMerchantURL() != null) {
            _hashCode += getSubMerchantURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateBitcoinInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sciName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sciName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subMerchantURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subMerchantURL"));
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
