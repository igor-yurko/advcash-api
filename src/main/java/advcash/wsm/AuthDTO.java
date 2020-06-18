/**
 * AuthDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class AuthDTO  implements java.io.Serializable {
    private java.lang.String accountEmail;

    private java.lang.String accountId;

    private java.lang.String apiName;

    private java.lang.String authenticationToken;

    private java.lang.String ipAddress;

    private java.lang.String systemAccountName;

    public AuthDTO() {
    }

    public AuthDTO(
           java.lang.String accountEmail,
           java.lang.String accountId,
           java.lang.String apiName,
           java.lang.String authenticationToken,
           java.lang.String ipAddress,
           java.lang.String systemAccountName) {
           this.accountEmail = accountEmail;
           this.accountId = accountId;
           this.apiName = apiName;
           this.authenticationToken = authenticationToken;
           this.ipAddress = ipAddress;
           this.systemAccountName = systemAccountName;
    }


    /**
     * Gets the accountEmail value for this AuthDTO.
     * 
     * @return accountEmail
     */
    public java.lang.String getAccountEmail() {
        return accountEmail;
    }


    /**
     * Sets the accountEmail value for this AuthDTO.
     * 
     * @param accountEmail
     */
    public void setAccountEmail(java.lang.String accountEmail) {
        this.accountEmail = accountEmail;
    }


    /**
     * Gets the accountId value for this AuthDTO.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this AuthDTO.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the apiName value for this AuthDTO.
     * 
     * @return apiName
     */
    public java.lang.String getApiName() {
        return apiName;
    }


    /**
     * Sets the apiName value for this AuthDTO.
     * 
     * @param apiName
     */
    public void setApiName(java.lang.String apiName) {
        this.apiName = apiName;
    }


    /**
     * Gets the authenticationToken value for this AuthDTO.
     * 
     * @return authenticationToken
     */
    public java.lang.String getAuthenticationToken() {
        return authenticationToken;
    }


    /**
     * Sets the authenticationToken value for this AuthDTO.
     * 
     * @param authenticationToken
     */
    public void setAuthenticationToken(java.lang.String authenticationToken) {
        this.authenticationToken = authenticationToken;
    }


    /**
     * Gets the ipAddress value for this AuthDTO.
     * 
     * @return ipAddress
     */
    public java.lang.String getIpAddress() {
        return ipAddress;
    }


    /**
     * Sets the ipAddress value for this AuthDTO.
     * 
     * @param ipAddress
     */
    public void setIpAddress(java.lang.String ipAddress) {
        this.ipAddress = ipAddress;
    }


    /**
     * Gets the systemAccountName value for this AuthDTO.
     * 
     * @return systemAccountName
     */
    public java.lang.String getSystemAccountName() {
        return systemAccountName;
    }


    /**
     * Sets the systemAccountName value for this AuthDTO.
     * 
     * @param systemAccountName
     */
    public void setSystemAccountName(java.lang.String systemAccountName) {
        this.systemAccountName = systemAccountName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthDTO)) return false;
        AuthDTO other = (AuthDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountEmail==null && other.getAccountEmail()==null) || 
             (this.accountEmail!=null &&
              this.accountEmail.equals(other.getAccountEmail()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.apiName==null && other.getApiName()==null) || 
             (this.apiName!=null &&
              this.apiName.equals(other.getApiName()))) &&
            ((this.authenticationToken==null && other.getAuthenticationToken()==null) || 
             (this.authenticationToken!=null &&
              this.authenticationToken.equals(other.getAuthenticationToken()))) &&
            ((this.ipAddress==null && other.getIpAddress()==null) || 
             (this.ipAddress!=null &&
              this.ipAddress.equals(other.getIpAddress()))) &&
            ((this.systemAccountName==null && other.getSystemAccountName()==null) || 
             (this.systemAccountName!=null &&
              this.systemAccountName.equals(other.getSystemAccountName())));
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
        if (getAccountEmail() != null) {
            _hashCode += getAccountEmail().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getApiName() != null) {
            _hashCode += getApiName().hashCode();
        }
        if (getAuthenticationToken() != null) {
            _hashCode += getAuthenticationToken().hashCode();
        }
        if (getIpAddress() != null) {
            _hashCode += getIpAddress().hashCode();
        }
        if (getSystemAccountName() != null) {
            _hashCode += getSystemAccountName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apiName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
