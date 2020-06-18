/**
 * CryptoCurrencyDepositPaymentStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class CryptoCurrencyDepositPaymentStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CryptoCurrencyDepositPaymentStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NEW = "NEW";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _PAYMENT_RECEIVED = "PAYMENT_RECEIVED";
    public static final java.lang.String _UNDERPAYMENT_RECEIVED = "UNDERPAYMENT_RECEIVED";
    public static final java.lang.String _OVERPAYMENT_RECEIVED = "OVERPAYMENT_RECEIVED";
    public static final java.lang.String _EXPIRED_PAYMENT_RECEIVED = "EXPIRED_PAYMENT_RECEIVED";
    public static final java.lang.String _EXPIRED_UNDERPAYMENT_RECEIVED = "EXPIRED_UNDERPAYMENT_RECEIVED";
    public static final java.lang.String _EXPIRED_OVERPAYMENT_RECEIVED = "EXPIRED_OVERPAYMENT_RECEIVED";
    public static final java.lang.String _EXPIRED_PAYMENT_REFUND_REQUESTED = "EXPIRED_PAYMENT_REFUND_REQUESTED";
    public static final java.lang.String _UNDERPAYMENT_REFUND_REQUESTED = "UNDERPAYMENT_REFUND_REQUESTED";
    public static final java.lang.String _EXPIRED_UNDERPAYMENT_REFUND_REQUESTED = "EXPIRED_UNDERPAYMENT_REFUND_REQUESTED";
    public static final java.lang.String _OVERPAYMENT_REFUND_REQUESTED = "OVERPAYMENT_REFUND_REQUESTED";
    public static final java.lang.String _FULL_OVERPAYMENT_REFUND_REQUESTED = "FULL_OVERPAYMENT_REFUND_REQUESTED";
    public static final java.lang.String _EXPIRED_PAYMENT_REFUNDED = "EXPIRED_PAYMENT_REFUNDED";
    public static final java.lang.String _UNDERPAYMENT_REFUNDED = "UNDERPAYMENT_REFUNDED";
    public static final java.lang.String _OVERPAYMENT_REFUNDED = "OVERPAYMENT_REFUNDED";
    public static final java.lang.String _FULL_OVERPAYMENT_REFUNDED = "FULL_OVERPAYMENT_REFUNDED";
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
    public java.lang.String getValue() { return _value_;}
    public static CryptoCurrencyDepositPaymentStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CryptoCurrencyDepositPaymentStatus enumeration = (CryptoCurrencyDepositPaymentStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CryptoCurrencyDepositPaymentStatus fromString(java.lang.String value)
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
