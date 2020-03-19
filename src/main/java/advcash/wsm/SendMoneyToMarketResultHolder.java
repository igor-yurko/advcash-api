/**
 * SendMoneyToMarketResultHolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public abstract class SendMoneyToMarketResultHolder  implements java.io.Serializable {
    private String coupon;

    private String id;

    public SendMoneyToMarketResultHolder() {
    }

    public SendMoneyToMarketResultHolder(
           String coupon,
           String id) {
           this.coupon = coupon;
           this.id = id;
    }


    /**
     * Gets the coupon value for this SendMoneyToMarketResultHolder.
     *
     * @return coupon
     */
    public String getCoupon() {
        return coupon;
    }


    /**
     * Sets the coupon value for this SendMoneyToMarketResultHolder.
     *
     * @param coupon
     */
    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }


    /**
     * Gets the id value for this SendMoneyToMarketResultHolder.
     *
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this SendMoneyToMarketResultHolder.
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SendMoneyToMarketResultHolder)) return false;
        SendMoneyToMarketResultHolder other = (SendMoneyToMarketResultHolder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.coupon==null && other.getCoupon()==null) ||
             (this.coupon!=null &&
              this.coupon.equals(other.getCoupon()))) &&
            ((this.id==null && other.getId()==null) ||
             (this.id!=null &&
              this.id.equals(other.getId())));
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
        if (getCoupon() != null) {
            _hashCode += getCoupon().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendMoneyToMarketResultHolder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToMarketResultHolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coupon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
