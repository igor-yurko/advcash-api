/**
 * Ecurrency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class Ecurrency implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ecurrency(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BITCOIN = "BITCOIN";
    public static final String _CAPITALIST = "CAPITALIST";
    public static final String _ECOIN = "ECOIN";
    public static final String _OKPAY = "OKPAY";
    public static final String _PAXUM = "PAXUM";
    public static final String _PAYEER = "PAYEER";
    public static final String _PAYZA = "PAYZA";
    public static final String _PERFECT_MONEY = "PERFECT_MONEY";
    public static final String _WEB_MONEY = "WEB_MONEY";
    public static final String _QIWI = "QIWI";
    public static final String _YANDEX_MONEY = "YANDEX_MONEY";
    public static final String _EPESE = "EPESE";
    public static final String _ETHEREUM = "ETHEREUM";
    public static final String _BITCOIN_CASH = "BITCOIN_CASH";
    public static final String _LITECOIN = "LITECOIN";
    public static final String _RIPPLE = "RIPPLE";
    public static final String _ZCASH = "ZCASH";
    public static final String _USDTETHER = "USDTETHER";
    public static final Ecurrency BITCOIN = new Ecurrency(_BITCOIN);
    public static final Ecurrency CAPITALIST = new Ecurrency(_CAPITALIST);
    public static final Ecurrency ECOIN = new Ecurrency(_ECOIN);
    public static final Ecurrency OKPAY = new Ecurrency(_OKPAY);
    public static final Ecurrency PAXUM = new Ecurrency(_PAXUM);
    public static final Ecurrency PAYEER = new Ecurrency(_PAYEER);
    public static final Ecurrency PAYZA = new Ecurrency(_PAYZA);
    public static final Ecurrency PERFECT_MONEY = new Ecurrency(_PERFECT_MONEY);
    public static final Ecurrency WEB_MONEY = new Ecurrency(_WEB_MONEY);
    public static final Ecurrency QIWI = new Ecurrency(_QIWI);
    public static final Ecurrency YANDEX_MONEY = new Ecurrency(_YANDEX_MONEY);
    public static final Ecurrency EPESE = new Ecurrency(_EPESE);
    public static final Ecurrency ETHEREUM = new Ecurrency(_ETHEREUM);
    public static final Ecurrency BITCOIN_CASH = new Ecurrency(_BITCOIN_CASH);
    public static final Ecurrency LITECOIN = new Ecurrency(_LITECOIN);
    public static final Ecurrency RIPPLE = new Ecurrency(_RIPPLE);
    public static final Ecurrency ZCASH = new Ecurrency(_ZCASH);
    public static final Ecurrency USDTETHER = new Ecurrency(_USDTETHER);
    public String getValue() { return _value_;}
    public static Ecurrency fromValue(String value)
          throws IllegalArgumentException {
        Ecurrency enumeration = (Ecurrency)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static Ecurrency fromString(String value)
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
        new org.apache.axis.description.TypeDesc(Ecurrency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "ecurrency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
