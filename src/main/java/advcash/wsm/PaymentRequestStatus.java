/**
 * PaymentRequestStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class PaymentRequestStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentRequestStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NEW = "NEW";
    public static final java.lang.String _PENDING_REFUND = "PENDING_REFUND";
    public static final java.lang.String _COMPLETED = "COMPLETED";
    public static final java.lang.String _CANCELED = "CANCELED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _REFUNDED = "REFUNDED";
    public static final java.lang.String _COMPLETED_OVERPAYMENT_REFUND = "COMPLETED_OVERPAYMENT_REFUND";
    public static final java.lang.String _COMPLETED_OVERPAYMENT_REFUNDED = "COMPLETED_OVERPAYMENT_REFUNDED";
    public static final java.lang.String _PENDING_APPROVAL = "PENDING_APPROVAL";
    public static final java.lang.String _PENDING_THIRD_PARTY_CONFIRMATION = "PENDING_THIRD_PARTY_CONFIRMATION";
    public static final PaymentRequestStatus NEW = new PaymentRequestStatus(_NEW);
    public static final PaymentRequestStatus PENDING_REFUND = new PaymentRequestStatus(_PENDING_REFUND);
    public static final PaymentRequestStatus COMPLETED = new PaymentRequestStatus(_COMPLETED);
    public static final PaymentRequestStatus CANCELED = new PaymentRequestStatus(_CANCELED);
    public static final PaymentRequestStatus EXPIRED = new PaymentRequestStatus(_EXPIRED);
    public static final PaymentRequestStatus REFUNDED = new PaymentRequestStatus(_REFUNDED);
    public static final PaymentRequestStatus COMPLETED_OVERPAYMENT_REFUND = new PaymentRequestStatus(_COMPLETED_OVERPAYMENT_REFUND);
    public static final PaymentRequestStatus COMPLETED_OVERPAYMENT_REFUNDED = new PaymentRequestStatus(_COMPLETED_OVERPAYMENT_REFUNDED);
    public static final PaymentRequestStatus PENDING_APPROVAL = new PaymentRequestStatus(_PENDING_APPROVAL);
    public static final PaymentRequestStatus PENDING_THIRD_PARTY_CONFIRMATION = new PaymentRequestStatus(_PENDING_THIRD_PARTY_CONFIRMATION);
    public java.lang.String getValue() { return _value_;}
    public static PaymentRequestStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PaymentRequestStatus enumeration = (PaymentRequestStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentRequestStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentRequestStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "paymentRequestStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
