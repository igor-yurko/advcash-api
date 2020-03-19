/**
 * CoinName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CoinName implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CoinName(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _BTC = "BTC";
    public static final String _ETH = "ETH";
    public static final String _XRP = "XRP";
    public static final String _BCH = "BCH";
    public static final String _LTC = "LTC";
    public static final String _BTG = "BTG";
    public static final String _DOGE = "DOGE";
    public static final String _ZEC = "ZEC";
    public static final String _DASH = "DASH";
    public static final String _XLM = "XLM";
    public static final String _USDT = "USDT";
    public static final CoinName BTC = new CoinName(_BTC);
    public static final CoinName ETH = new CoinName(_ETH);
    public static final CoinName XRP = new CoinName(_XRP);
    public static final CoinName BCH = new CoinName(_BCH);
    public static final CoinName LTC = new CoinName(_LTC);
    public static final CoinName BTG = new CoinName(_BTG);
    public static final CoinName DOGE = new CoinName(_DOGE);
    public static final CoinName ZEC = new CoinName(_ZEC);
    public static final CoinName DASH = new CoinName(_DASH);
    public static final CoinName XLM = new CoinName(_XLM);
    public static final CoinName USDT = new CoinName(_USDT);
    public String getValue() { return _value_;}
    public static CoinName fromValue(String value)
          throws IllegalArgumentException {
        CoinName enumeration = (CoinName)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CoinName fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CoinName.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "coinName"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
