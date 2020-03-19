/**
 * CryptoCurrencyWithdrawalInvoiceStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CryptoCurrencyWithdrawalInvoiceStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CryptoCurrencyWithdrawalInvoiceStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _NEW = "NEW";
    public static final String _EXPIRED = "EXPIRED";
    public static final String _COMPLETED = "COMPLETED";
    public static final CryptoCurrencyWithdrawalInvoiceStatus NEW = new CryptoCurrencyWithdrawalInvoiceStatus(_NEW);
    public static final CryptoCurrencyWithdrawalInvoiceStatus EXPIRED = new CryptoCurrencyWithdrawalInvoiceStatus(_EXPIRED);
    public static final CryptoCurrencyWithdrawalInvoiceStatus COMPLETED = new CryptoCurrencyWithdrawalInvoiceStatus(_COMPLETED);
    public String getValue() { return _value_;}
    public static CryptoCurrencyWithdrawalInvoiceStatus fromValue(String value)
          throws IllegalArgumentException {
        CryptoCurrencyWithdrawalInvoiceStatus enumeration = (CryptoCurrencyWithdrawalInvoiceStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CryptoCurrencyWithdrawalInvoiceStatus fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CryptoCurrencyWithdrawalInvoiceStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
