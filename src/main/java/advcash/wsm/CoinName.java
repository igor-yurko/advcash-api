/**
 * CoinName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CoinName implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CoinName(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BTC = "BTC";
    public static final java.lang.String _ETH = "ETH";
    public static final java.lang.String _XRP = "XRP";
    public static final java.lang.String _BCH = "BCH";
    public static final java.lang.String _LTC = "LTC";
    public static final java.lang.String _BTG = "BTG";
    public static final java.lang.String _DOGE = "DOGE";
    public static final java.lang.String _ZEC = "ZEC";
    public static final java.lang.String _DASH = "DASH";
    public static final java.lang.String _XLM = "XLM";
    public static final java.lang.String _USDT = "USDT";
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
    public java.lang.String getValue() { return _value_;}
    public static CoinName fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CoinName enumeration = (CoinName)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CoinName fromString(java.lang.String value)
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
