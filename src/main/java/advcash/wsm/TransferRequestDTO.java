/**
 * TransferRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class TransferRequestDTO  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private String comment;

    private String destWalletId;

    private boolean savePaymentTemplate;

    private String srcWalletId;

    public TransferRequestDTO() {
    }

    public TransferRequestDTO(
           java.math.BigDecimal amount,
           String comment,
           String destWalletId,
           boolean savePaymentTemplate,
           String srcWalletId) {
           this.amount = amount;
           this.comment = comment;
           this.destWalletId = destWalletId;
           this.savePaymentTemplate = savePaymentTemplate;
           this.srcWalletId = srcWalletId;
    }


    /**
     * Gets the amount value for this TransferRequestDTO.
     *
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferRequestDTO.
     *
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the comment value for this TransferRequestDTO.
     *
     * @return comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this TransferRequestDTO.
     *
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * Gets the destWalletId value for this TransferRequestDTO.
     *
     * @return destWalletId
     */
    public String getDestWalletId() {
        return destWalletId;
    }


    /**
     * Sets the destWalletId value for this TransferRequestDTO.
     *
     * @param destWalletId
     */
    public void setDestWalletId(String destWalletId) {
        this.destWalletId = destWalletId;
    }


    /**
     * Gets the savePaymentTemplate value for this TransferRequestDTO.
     *
     * @return savePaymentTemplate
     */
    public boolean isSavePaymentTemplate() {
        return savePaymentTemplate;
    }


    /**
     * Sets the savePaymentTemplate value for this TransferRequestDTO.
     *
     * @param savePaymentTemplate
     */
    public void setSavePaymentTemplate(boolean savePaymentTemplate) {
        this.savePaymentTemplate = savePaymentTemplate;
    }


    /**
     * Gets the srcWalletId value for this TransferRequestDTO.
     *
     * @return srcWalletId
     */
    public String getSrcWalletId() {
        return srcWalletId;
    }


    /**
     * Sets the srcWalletId value for this TransferRequestDTO.
     *
     * @param srcWalletId
     */
    public void setSrcWalletId(String srcWalletId) {
        this.srcWalletId = srcWalletId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransferRequestDTO)) return false;
        TransferRequestDTO other = (TransferRequestDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.amount==null && other.getAmount()==null) ||
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.comment==null && other.getComment()==null) ||
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.destWalletId==null && other.getDestWalletId()==null) ||
             (this.destWalletId!=null &&
              this.destWalletId.equals(other.getDestWalletId()))) &&
            this.savePaymentTemplate == other.isSavePaymentTemplate() &&
            ((this.srcWalletId==null && other.getSrcWalletId()==null) ||
             (this.srcWalletId!=null &&
              this.srcWalletId.equals(other.getSrcWalletId())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getDestWalletId() != null) {
            _hashCode += getDestWalletId().hashCode();
        }
        _hashCode += (isSavePaymentTemplate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSrcWalletId() != null) {
            _hashCode += getSrcWalletId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
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
        elemField.setFieldName("destWalletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destWalletId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savePaymentTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "savePaymentTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcWalletId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcWalletId"));
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
