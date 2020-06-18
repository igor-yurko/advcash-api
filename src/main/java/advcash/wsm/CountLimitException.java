/**
 * CountLimitException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CountLimitException  extends org.apache.axis.AxisFault  implements java.io.Serializable {
    private java.lang.Long limitCount;

    private advcash.wsm.DateIntervals dateInterval;

    private advcash.wsm.ExceptionType type;

    public CountLimitException() {
    }

    public CountLimitException(
           java.lang.Long limitCount,
           advcash.wsm.DateIntervals dateInterval,
           advcash.wsm.ExceptionType type) {
        this.limitCount = limitCount;
        this.dateInterval = dateInterval;
        this.type = type;
    }


    /**
     * Gets the limitCount value for this CountLimitException.
     * 
     * @return limitCount
     */
    public java.lang.Long getLimitCount() {
        return limitCount;
    }


    /**
     * Sets the limitCount value for this CountLimitException.
     * 
     * @param limitCount
     */
    public void setLimitCount(java.lang.Long limitCount) {
        this.limitCount = limitCount;
    }


    /**
     * Gets the dateInterval value for this CountLimitException.
     * 
     * @return dateInterval
     */
    public advcash.wsm.DateIntervals getDateInterval() {
        return dateInterval;
    }


    /**
     * Sets the dateInterval value for this CountLimitException.
     * 
     * @param dateInterval
     */
    public void setDateInterval(advcash.wsm.DateIntervals dateInterval) {
        this.dateInterval = dateInterval;
    }


    /**
     * Gets the type value for this CountLimitException.
     * 
     * @return type
     */
    public advcash.wsm.ExceptionType getType() {
        return type;
    }


    /**
     * Sets the type value for this CountLimitException.
     * 
     * @param type
     */
    public void setType(advcash.wsm.ExceptionType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CountLimitException)) return false;
        CountLimitException other = (CountLimitException) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitCount==null && other.getLimitCount()==null) || 
             (this.limitCount!=null &&
              this.limitCount.equals(other.getLimitCount()))) &&
            ((this.dateInterval==null && other.getDateInterval()==null) || 
             (this.dateInterval!=null &&
              this.dateInterval.equals(other.getDateInterval()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getLimitCount() != null) {
            _hashCode += getLimitCount().hashCode();
        }
        if (getDateInterval() != null) {
            _hashCode += getDateInterval().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CountLimitException.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "dateIntervals"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "exceptionType"));
        elemField.setNillable(true);
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}
