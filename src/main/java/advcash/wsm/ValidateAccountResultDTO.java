/**
 * ValidateAccountResultDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class ValidateAccountResultDTO  extends advcash.wsm.ValidateAccountRequestDTO  implements java.io.Serializable {
    private double firstNameMatchingPercentage;

    private double lastNameMatchingPercentage;

    private boolean verified;

    public ValidateAccountResultDTO() {
    }

    public ValidateAccountResultDTO(
           java.lang.String email,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String walletId,
           double firstNameMatchingPercentage,
           double lastNameMatchingPercentage,
           boolean verified) {
        super(
            email,
            firstName,
            lastName,
            walletId);
        this.firstNameMatchingPercentage = firstNameMatchingPercentage;
        this.lastNameMatchingPercentage = lastNameMatchingPercentage;
        this.verified = verified;
    }


    /**
     * Gets the firstNameMatchingPercentage value for this ValidateAccountResultDTO.
     * 
     * @return firstNameMatchingPercentage
     */
    public double getFirstNameMatchingPercentage() {
        return firstNameMatchingPercentage;
    }


    /**
     * Sets the firstNameMatchingPercentage value for this ValidateAccountResultDTO.
     * 
     * @param firstNameMatchingPercentage
     */
    public void setFirstNameMatchingPercentage(double firstNameMatchingPercentage) {
        this.firstNameMatchingPercentage = firstNameMatchingPercentage;
    }


    /**
     * Gets the lastNameMatchingPercentage value for this ValidateAccountResultDTO.
     * 
     * @return lastNameMatchingPercentage
     */
    public double getLastNameMatchingPercentage() {
        return lastNameMatchingPercentage;
    }


    /**
     * Sets the lastNameMatchingPercentage value for this ValidateAccountResultDTO.
     * 
     * @param lastNameMatchingPercentage
     */
    public void setLastNameMatchingPercentage(double lastNameMatchingPercentage) {
        this.lastNameMatchingPercentage = lastNameMatchingPercentage;
    }


    /**
     * Gets the verified value for this ValidateAccountResultDTO.
     * 
     * @return verified
     */
    public boolean isVerified() {
        return verified;
    }


    /**
     * Sets the verified value for this ValidateAccountResultDTO.
     * 
     * @param verified
     */
    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidateAccountResultDTO)) return false;
        ValidateAccountResultDTO other = (ValidateAccountResultDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.firstNameMatchingPercentage == other.getFirstNameMatchingPercentage() &&
            this.lastNameMatchingPercentage == other.getLastNameMatchingPercentage() &&
            this.verified == other.isVerified();
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
        _hashCode += new Double(getFirstNameMatchingPercentage()).hashCode();
        _hashCode += new Double(getLastNameMatchingPercentage()).hashCode();
        _hashCode += (isVerified() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidateAccountResultDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountResultDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstNameMatchingPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstNameMatchingPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNameMatchingPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastNameMatchingPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
