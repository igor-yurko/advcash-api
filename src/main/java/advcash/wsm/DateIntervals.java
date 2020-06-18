/**
 * DateIntervals.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class DateIntervals implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DateIntervals(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _hour = "hour";
    public static final java.lang.String _day = "day";
    public static final java.lang.String _week = "week";
    public static final java.lang.String _month = "month";
    public static final java.lang.String _year = "year";
    public static final java.lang.String _wrong = "wrong";
    public static final DateIntervals hour = new DateIntervals(_hour);
    public static final DateIntervals day = new DateIntervals(_day);
    public static final DateIntervals week = new DateIntervals(_week);
    public static final DateIntervals month = new DateIntervals(_month);
    public static final DateIntervals year = new DateIntervals(_year);
    public static final DateIntervals wrong = new DateIntervals(_wrong);
    public java.lang.String getValue() { return _value_;}
    public static DateIntervals fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DateIntervals enumeration = (DateIntervals)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DateIntervals fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateIntervals.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "dateIntervals"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
