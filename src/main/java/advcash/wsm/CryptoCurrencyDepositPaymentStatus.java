/**
 * CryptoCurrencyDepositPaymentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CryptoCurrencyDepositPaymentStatus implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CryptoCurrencyDepositPaymentStatus(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _NEW = "NEW";
    public static final String _EXPIRED = "EXPIRED";
    public static final String _PAYMENT_RECEIVED = "PAYMENT_RECEIVED";
    public static final String _UNDERPAYMENT_RECEIVED = "UNDERPAYMENT_RECEIVED";
    public static final String _OVERPAYMENT_RECEIVED = "OVERPAYMENT_RECEIVED";
    public static final String _EXPIRED_PAYMENT_RECEIVED = "EXPIRED_PAYMENT_RECEIVED";
    public static final String _EXPIRED_UNDERPAYMENT_RECEIVED = "EXPIRED_UNDERPAYMENT_RECEIVED";
    public static final String _EXPIRED_OVERPAYMENT_RECEIVED = "EXPIRED_OVERPAYMENT_RECEIVED";
    public static final String _EXPIRED_PAYMENT_REFUND_REQUESTED = "EXPIRED_PAYMENT_REFUND_REQUESTED";
    public static final String _UNDERPAYMENT_REFUND_REQUESTED = "UNDERPAYMENT_REFUND_REQUESTED";
    public static final String _EXPIRED_UNDERPAYMENT_REFUND_REQUESTED = "EXPIRED_UNDERPAYMENT_REFUND_REQUESTED";
    public static final String _OVERPAYMENT_REFUND_REQUESTED = "OVERPAYMENT_REFUND_REQUESTED";
    public static final String _FULL_OVERPAYMENT_REFUND_REQUESTED = "FULL_OVERPAYMENT_REFUND_REQUESTED";
    public static final String _EXPIRED_PAYMENT_REFUNDED = "EXPIRED_PAYMENT_REFUNDED";
    public static final String _UNDERPAYMENT_REFUNDED = "UNDERPAYMENT_REFUNDED";
    public static final String _OVERPAYMENT_REFUNDED = "OVERPAYMENT_REFUNDED";
    public static final String _FULL_OVERPAYMENT_REFUNDED = "FULL_OVERPAYMENT_REFUNDED";
    public static final CryptoCurrencyDepositPaymentStatus NEW = new CryptoCurrencyDepositPaymentStatus(_NEW);
    public static final CryptoCurrencyDepositPaymentStatus EXPIRED = new CryptoCurrencyDepositPaymentStatus(_EXPIRED);
    public static final CryptoCurrencyDepositPaymentStatus PAYMENT_RECEIVED = new CryptoCurrencyDepositPaymentStatus(_PAYMENT_RECEIVED);
    public static final CryptoCurrencyDepositPaymentStatus UNDERPAYMENT_RECEIVED = new CryptoCurrencyDepositPaymentStatus(_UNDERPAYMENT_RECEIVED);
    public static final CryptoCurrencyDepositPaymentStatus OVERPAYMENT_RECEIVED = new CryptoCurrencyDepositPaymentStatus(_OVERPAYMENT_RECEIVED);
    public static final CryptoCurrencyDepositPaymentStatus EXPIRED_PAYMENT_RECEIVED = new CryptoCurrencyDepositPaymentStatus(_EXPIRED_PAYMENT_RECEIVED);
    public static final CryptoCurrencyDepositPaymentStatus EXPIRED_UNDERPAYMENT_RECEIVED = new CryptoCurrencyDepositPaymentStatus(_EXPIRED_UNDERPAYMENT_RECEIVED);
    public static final CryptoCurrencyDepositPaymentStatus EXPIRED_OVERPAYMENT_RECEIVED = new CryptoCurrencyDepositPaymentStatus(_EXPIRED_OVERPAYMENT_RECEIVED);
    public static final CryptoCurrencyDepositPaymentStatus EXPIRED_PAYMENT_REFUND_REQUESTED = new CryptoCurrencyDepositPaymentStatus(_EXPIRED_PAYMENT_REFUND_REQUESTED);
    public static final CryptoCurrencyDepositPaymentStatus UNDERPAYMENT_REFUND_REQUESTED = new CryptoCurrencyDepositPaymentStatus(_UNDERPAYMENT_REFUND_REQUESTED);
    public static final CryptoCurrencyDepositPaymentStatus EXPIRED_UNDERPAYMENT_REFUND_REQUESTED = new CryptoCurrencyDepositPaymentStatus(_EXPIRED_UNDERPAYMENT_REFUND_REQUESTED);
    public static final CryptoCurrencyDepositPaymentStatus OVERPAYMENT_REFUND_REQUESTED = new CryptoCurrencyDepositPaymentStatus(_OVERPAYMENT_REFUND_REQUESTED);
    public static final CryptoCurrencyDepositPaymentStatus FULL_OVERPAYMENT_REFUND_REQUESTED = new CryptoCurrencyDepositPaymentStatus(_FULL_OVERPAYMENT_REFUND_REQUESTED);
    public static final CryptoCurrencyDepositPaymentStatus EXPIRED_PAYMENT_REFUNDED = new CryptoCurrencyDepositPaymentStatus(_EXPIRED_PAYMENT_REFUNDED);
    public static final CryptoCurrencyDepositPaymentStatus UNDERPAYMENT_REFUNDED = new CryptoCurrencyDepositPaymentStatus(_UNDERPAYMENT_REFUNDED);
    public static final CryptoCurrencyDepositPaymentStatus OVERPAYMENT_REFUNDED = new CryptoCurrencyDepositPaymentStatus(_OVERPAYMENT_REFUNDED);
    public static final CryptoCurrencyDepositPaymentStatus FULL_OVERPAYMENT_REFUNDED = new CryptoCurrencyDepositPaymentStatus(_FULL_OVERPAYMENT_REFUNDED);
    public String getValue() { return _value_;}
    public static CryptoCurrencyDepositPaymentStatus fromValue(String value)
          throws IllegalArgumentException {
        CryptoCurrencyDepositPaymentStatus enumeration = (CryptoCurrencyDepositPaymentStatus)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static CryptoCurrencyDepositPaymentStatus fromString(String value)
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
        new org.apache.axis.description.TypeDesc(CryptoCurrencyDepositPaymentStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyDepositPaymentStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
