/**
 * ConfirmCryptoCurrencyWithdrawalInvoiceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class ConfirmCryptoCurrencyWithdrawalInvoiceRequest  implements java.io.Serializable {
    private String destinationTag;

    private String invoiceId;

    private String receiver;

    public ConfirmCryptoCurrencyWithdrawalInvoiceRequest() {
    }

    public ConfirmCryptoCurrencyWithdrawalInvoiceRequest(
           String destinationTag,
           String invoiceId,
           String receiver) {
           this.destinationTag = destinationTag;
           this.invoiceId = invoiceId;
           this.receiver = receiver;
    }


    /**
     * Gets the destinationTag value for this ConfirmCryptoCurrencyWithdrawalInvoiceRequest.
     *
     * @return destinationTag
     */
    public String getDestinationTag() {
        return destinationTag;
    }


    /**
     * Sets the destinationTag value for this ConfirmCryptoCurrencyWithdrawalInvoiceRequest.
     *
     * @param destinationTag
     */
    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }


    /**
     * Gets the invoiceId value for this ConfirmCryptoCurrencyWithdrawalInvoiceRequest.
     *
     * @return invoiceId
     */
    public String getInvoiceId() {
        return invoiceId;
    }


    /**
     * Sets the invoiceId value for this ConfirmCryptoCurrencyWithdrawalInvoiceRequest.
     *
     * @param invoiceId
     */
    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }


    /**
     * Gets the receiver value for this ConfirmCryptoCurrencyWithdrawalInvoiceRequest.
     *
     * @return receiver
     */
    public String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this ConfirmCryptoCurrencyWithdrawalInvoiceRequest.
     *
     * @param receiver
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConfirmCryptoCurrencyWithdrawalInvoiceRequest)) return false;
        ConfirmCryptoCurrencyWithdrawalInvoiceRequest other = (ConfirmCryptoCurrencyWithdrawalInvoiceRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.destinationTag==null && other.getDestinationTag()==null) ||
             (this.destinationTag!=null &&
              this.destinationTag.equals(other.getDestinationTag()))) &&
            ((this.invoiceId==null && other.getInvoiceId()==null) ||
             (this.invoiceId!=null &&
              this.invoiceId.equals(other.getInvoiceId()))) &&
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
        int _hashCode = 1;
        if (getDestinationTag() != null) {
            _hashCode += getDestinationTag().hashCode();
        }
        if (getInvoiceId() != null) {
            _hashCode += getInvoiceId().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfirmCryptoCurrencyWithdrawalInvoiceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "confirmCryptoCurrencyWithdrawalInvoiceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
