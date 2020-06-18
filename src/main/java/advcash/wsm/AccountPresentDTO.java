/**
 * AccountPresentDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class AccountPresentDTO  implements java.io.Serializable {
    private java.lang.Boolean isUserVerified;

    private java.lang.Boolean present;

    private java.lang.String systemAccountName;

    private int transactionScore;

    public AccountPresentDTO() {
    }

    public AccountPresentDTO(
           java.lang.Boolean isUserVerified,
           java.lang.Boolean present,
           java.lang.String systemAccountName,
           int transactionScore) {
           this.isUserVerified = isUserVerified;
           this.present = present;
           this.systemAccountName = systemAccountName;
           this.transactionScore = transactionScore;
    }


    /**
     * Gets the isUserVerified value for this AccountPresentDTO.
     * 
     * @return isUserVerified
     */
    public java.lang.Boolean getIsUserVerified() {
        return isUserVerified;
    }


    /**
     * Sets the isUserVerified value for this AccountPresentDTO.
     * 
     * @param isUserVerified
     */
    public void setIsUserVerified(java.lang.Boolean isUserVerified) {
        this.isUserVerified = isUserVerified;
    }


    /**
     * Gets the present value for this AccountPresentDTO.
     * 
     * @return present
     */
    public java.lang.Boolean getPresent() {
        return present;
    }


    /**
     * Sets the present value for this AccountPresentDTO.
     * 
     * @param present
     */
    public void setPresent(java.lang.Boolean present) {
        this.present = present;
    }


    /**
     * Gets the systemAccountName value for this AccountPresentDTO.
     * 
     * @return systemAccountName
     */
    public java.lang.String getSystemAccountName() {
        return systemAccountName;
    }


    /**
     * Sets the systemAccountName value for this AccountPresentDTO.
     * 
     * @param systemAccountName
     */
    public void setSystemAccountName(java.lang.String systemAccountName) {
        this.systemAccountName = systemAccountName;
    }


    /**
     * Gets the transactionScore value for this AccountPresentDTO.
     * 
     * @return transactionScore
     */
    public int getTransactionScore() {
        return transactionScore;
    }


    /**
     * Sets the transactionScore value for this AccountPresentDTO.
     * 
     * @param transactionScore
     */
    public void setTransactionScore(int transactionScore) {
        this.transactionScore = transactionScore;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountPresentDTO)) return false;
        AccountPresentDTO other = (AccountPresentDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isUserVerified==null && other.getIsUserVerified()==null) || 
             (this.isUserVerified!=null &&
              this.isUserVerified.equals(other.getIsUserVerified()))) &&
            ((this.present==null && other.getPresent()==null) || 
             (this.present!=null &&
              this.present.equals(other.getPresent()))) &&
            ((this.systemAccountName==null && other.getSystemAccountName()==null) || 
             (this.systemAccountName!=null &&
              this.systemAccountName.equals(other.getSystemAccountName()))) &&
            this.transactionScore == other.getTransactionScore();
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
        if (getIsUserVerified() != null) {
            _hashCode += getIsUserVerified().hashCode();
        }
        if (getPresent() != null) {
            _hashCode += getPresent().hashCode();
        }
        if (getSystemAccountName() != null) {
            _hashCode += getSystemAccountName().hashCode();
        }
        _hashCode += getTransactionScore();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccountPresentDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "accountPresentDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUserVerified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isUserVerified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("present");
        elemField.setXmlName(new javax.xml.namespace.QName("", "present"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemAccountName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemAccountName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionScore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
