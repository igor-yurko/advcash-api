/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class Currency implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Currency(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _USD = "USD";
    public static final String _EUR = "EUR";
    public static final String _RUR = "RUR";
    public static final String _GBP = "GBP";
    public static final String _UAH = "UAH";
    public static final String _KZT = "KZT";
    public static final String _BRL = "BRL";
    public static final String _TRY = "TRY";
    public static final String _AZN = "AZN";
    public static final Currency USD = new Currency(_USD);
    public static final Currency EUR = new Currency(_EUR);
    public static final Currency RUR = new Currency(_RUR);
    public static final Currency GBP = new Currency(_GBP);
    public static final Currency UAH = new Currency(_UAH);
    public static final Currency KZT = new Currency(_KZT);
    public static final Currency BRL = new Currency(_BRL);
    public static final Currency TRY = new Currency(_TRY);
    public static final Currency AZN = new Currency(_AZN);
    public String getValue() { return _value_;}
    public static Currency fromValue(String value)
          throws IllegalArgumentException {
        Currency enumeration = (Currency)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static Currency fromString(String value)
          throws IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public String toString() { return _value_;}
    public Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Currency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "currency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
