/**
 * EmailTransferRequestDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class EmailTransferRequestDTO  implements java.io.Serializable {
    private java.math.BigDecimal amount;

    private java.lang.String comment;

    private java.lang.String destCurrency;

    private java.lang.String email;

    private java.lang.String srcWalletId;

    public EmailTransferRequestDTO() {
    }

    public EmailTransferRequestDTO(
           java.math.BigDecimal amount,
           java.lang.String comment,
           java.lang.String destCurrency,
           java.lang.String email,
           java.lang.String srcWalletId) {
           this.amount = amount;
           this.comment = comment;
           this.destCurrency = destCurrency;
           this.email = email;
           this.srcWalletId = srcWalletId;
    }


    /**
     * Gets the amount value for this EmailTransferRequestDTO.
     * 
     * @return amount
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this EmailTransferRequestDTO.
     * 
     * @param amount
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the comment value for this EmailTransferRequestDTO.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this EmailTransferRequestDTO.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the destCurrency value for this EmailTransferRequestDTO.
     * 
     * @return destCurrency
     */
    public java.lang.String getDestCurrency() {
        return destCurrency;
    }


    /**
     * Sets the destCurrency value for this EmailTransferRequestDTO.
     * 
     * @param destCurrency
     */
    public void setDestCurrency(java.lang.String destCurrency) {
        this.destCurrency = destCurrency;
    }


    /**
     * Gets the email value for this EmailTransferRequestDTO.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EmailTransferRequestDTO.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the srcWalletId value for this EmailTransferRequestDTO.
     * 
     * @return srcWalletId
     */
    public java.lang.String getSrcWalletId() {
        return srcWalletId;
    }


    /**
     * Sets the srcWalletId value for this EmailTransferRequestDTO.
     * 
     * @param srcWalletId
     */
    public void setSrcWalletId(java.lang.String srcWalletId) {
        this.srcWalletId = srcWalletId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailTransferRequestDTO)) return false;
        EmailTransferRequestDTO other = (EmailTransferRequestDTO) obj;
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
            ((this.destCurrency==null && other.getDestCurrency()==null) || 
             (this.destCurrency!=null &&
              this.destCurrency.equals(other.getDestCurrency()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
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
        if (getDestCurrency() != null) {
            _hashCode += getDestCurrency().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getSrcWalletId() != null) {
            _hashCode += getSrcWalletId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailTransferRequestDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransferRequestDTO"));
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
        elemField.setFieldName("destCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
