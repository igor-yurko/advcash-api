/**
 * CreateApiRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CreateApiRequest  implements java.io.Serializable {
    private String apiIp;

    private String apiKey;

    private String apiName;

    private String userEmail;

    public CreateApiRequest() {
    }

    public CreateApiRequest(
           String apiIp,
           String apiKey,
           String apiName,
           String userEmail) {
           this.apiIp = apiIp;
           this.apiKey = apiKey;
           this.apiName = apiName;
           this.userEmail = userEmail;
    }


    /**
     * Gets the apiIp value for this CreateApiRequest.
     *
     * @return apiIp
     */
    public String getApiIp() {
        return apiIp;
    }


    /**
     * Sets the apiIp value for this CreateApiRequest.
     *
     * @param apiIp
     */
    public void setApiIp(String apiIp) {
        this.apiIp = apiIp;
    }


    /**
     * Gets the apiKey value for this CreateApiRequest.
     *
     * @return apiKey
     */
    public String getApiKey() {
        return apiKey;
    }


    /**
     * Sets the apiKey value for this CreateApiRequest.
     *
     * @param apiKey
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }


    /**
     * Gets the apiName value for this CreateApiRequest.
     *
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }


    /**
     * Sets the apiName value for this CreateApiRequest.
     *
     * @param apiName
     */
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }


    /**
     * Gets the userEmail value for this CreateApiRequest.
     *
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }


    /**
     * Sets the userEmail value for this CreateApiRequest.
     *
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreateApiRequest)) return false;
        CreateApiRequest other = (CreateApiRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.apiIp==null && other.getApiIp()==null) ||
             (this.apiIp!=null &&
              this.apiIp.equals(other.getApiIp()))) &&
            ((this.apiKey==null && other.getApiKey()==null) ||
             (this.apiKey!=null &&
              this.apiKey.equals(other.getApiKey()))) &&
            ((this.apiName==null && other.getApiName()==null) ||
             (this.apiName!=null &&
              this.apiName.equals(other.getApiName()))) &&
            ((this.userEmail==null && other.getUserEmail()==null) ||
             (this.userEmail!=null &&
              this.userEmail.equals(other.getUserEmail())));
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
        if (getApiIp() != null) {
            _hashCode += getApiIp().hashCode();
        }
        if (getApiKey() != null) {
            _hashCode += getApiKey().hashCode();
        }
        if (getApiName() != null) {
            _hashCode += getApiName().hashCode();
        }
        if (getUserEmail() != null) {
            _hashCode += getUserEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateApiRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "createApiRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apiIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apiKey"));
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
        elemField.setFieldName("userEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userEmail"));
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
