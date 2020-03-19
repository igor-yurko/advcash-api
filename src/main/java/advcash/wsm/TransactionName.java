/**
 * TransactionName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class TransactionName implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionName(String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final String _ALL = "ALL";
    public static final String _CHECK_DEPOSIT = "CHECK_DEPOSIT";
    public static final String _WIRE_TRANSFER_DEPOSIT = "WIRE_TRANSFER_DEPOSIT";
    public static final String _WIRE_TRANSFER_WITHDRAW = "WIRE_TRANSFER_WITHDRAW";
    public static final String _CHECK_WITHDRAW = "CHECK_WITHDRAW";
    public static final String _INNER_ACCOUNT = "INNER_ACCOUNT";
    public static final String _INNER_SYSTEM = "INNER_SYSTEM";
    public static final String _CURRENCY_EXCHANGE = "CURRENCY_EXCHANGE";
    public static final String _MONEY_REQUEST = "MONEY_REQUEST";
    public static final String _REFERRAL_PAYMENT = "REFERRAL_PAYMENT";
    public static final String _SYSTEM_PAYMENT = "SYSTEM_PAYMENT";
    public static final String _REPAYMENT = "REPAYMENT";
    public static final String _SCI_PAYMENT_OTHER_SYSTEM = "SCI_PAYMENT_OTHER_SYSTEM";
    public static final String _BANK_CARD_TRANSFER = "BANK_CARD_TRANSFER";
    public static final String _ADVCASH_CARD_TRANSFER = "ADVCASH_CARD_TRANSFER";
    public static final String _WIRE_TRANSFER_DEPOSIT_3RD_PARTY = "WIRE_TRANSFER_DEPOSIT_3RD_PARTY";
    public static final String _EXTERNAL_SYSTEM_DEPOSIT = "EXTERNAL_SYSTEM_DEPOSIT";
    public static final String _EXTERNAL_SYSTEM_WITHDRAWAL = "EXTERNAL_SYSTEM_WITHDRAWAL";
    public static final String _BALANCE_ADJUSTMENT_DEPOSIT = "BALANCE_ADJUSTMENT_DEPOSIT";
    public static final String _BALANCE_ADJUSTMENT_WITHDRAWAL = "BALANCE_ADJUSTMENT_WITHDRAWAL";
    public static final String _SEPA_TRANSFER_DEPOSIT = "SEPA_TRANSFER_DEPOSIT";
    public static final String _SEPA_TRANSFER_DEPOSIT_3RD_PARTY = "SEPA_TRANSFER_DEPOSIT_3RD_PARTY";
    public static final String _BONUS_PAYMENT = "BONUS_PAYMENT";
    public static final String _ADVCASH_CARD_UNLOAD = "ADVCASH_CARD_UNLOAD";
    public static final String _BANK_TRANSFER_REFUND = "BANK_TRANSFER_REFUND";
    public static final String _SYSTEM_PAYMENT_DEPOSIT = "SYSTEM_PAYMENT_DEPOSIT";
    public static final String _ADVCASH_SCI_CRYPTO_EXCHANGE_DEPOSIT = "ADVCASH_SCI_CRYPTO_EXCHANGE_DEPOSIT";
    public static final String _ADVCASH_SCI_CRYPTO_EXCHANGE_WITHDRAWAL = "ADVCASH_SCI_CRYPTO_EXCHANGE_WITHDRAWAL";
    public static final TransactionName ALL = new TransactionName(_ALL);
    public static final TransactionName CHECK_DEPOSIT = new TransactionName(_CHECK_DEPOSIT);
    public static final TransactionName WIRE_TRANSFER_DEPOSIT = new TransactionName(_WIRE_TRANSFER_DEPOSIT);
    public static final TransactionName WIRE_TRANSFER_WITHDRAW = new TransactionName(_WIRE_TRANSFER_WITHDRAW);
    public static final TransactionName CHECK_WITHDRAW = new TransactionName(_CHECK_WITHDRAW);
    public static final TransactionName INNER_ACCOUNT = new TransactionName(_INNER_ACCOUNT);
    public static final TransactionName INNER_SYSTEM = new TransactionName(_INNER_SYSTEM);
    public static final TransactionName CURRENCY_EXCHANGE = new TransactionName(_CURRENCY_EXCHANGE);
    public static final TransactionName MONEY_REQUEST = new TransactionName(_MONEY_REQUEST);
    public static final TransactionName REFERRAL_PAYMENT = new TransactionName(_REFERRAL_PAYMENT);
    public static final TransactionName SYSTEM_PAYMENT = new TransactionName(_SYSTEM_PAYMENT);
    public static final TransactionName REPAYMENT = new TransactionName(_REPAYMENT);
    public static final TransactionName SCI_PAYMENT_OTHER_SYSTEM = new TransactionName(_SCI_PAYMENT_OTHER_SYSTEM);
    public static final TransactionName BANK_CARD_TRANSFER = new TransactionName(_BANK_CARD_TRANSFER);
    public static final TransactionName ADVCASH_CARD_TRANSFER = new TransactionName(_ADVCASH_CARD_TRANSFER);
    public static final TransactionName WIRE_TRANSFER_DEPOSIT_3RD_PARTY = new TransactionName(_WIRE_TRANSFER_DEPOSIT_3RD_PARTY);
    public static final TransactionName EXTERNAL_SYSTEM_DEPOSIT = new TransactionName(_EXTERNAL_SYSTEM_DEPOSIT);
    public static final TransactionName EXTERNAL_SYSTEM_WITHDRAWAL = new TransactionName(_EXTERNAL_SYSTEM_WITHDRAWAL);
    public static final TransactionName BALANCE_ADJUSTMENT_DEPOSIT = new TransactionName(_BALANCE_ADJUSTMENT_DEPOSIT);
    public static final TransactionName BALANCE_ADJUSTMENT_WITHDRAWAL = new TransactionName(_BALANCE_ADJUSTMENT_WITHDRAWAL);
    public static final TransactionName SEPA_TRANSFER_DEPOSIT = new TransactionName(_SEPA_TRANSFER_DEPOSIT);
    public static final TransactionName SEPA_TRANSFER_DEPOSIT_3RD_PARTY = new TransactionName(_SEPA_TRANSFER_DEPOSIT_3RD_PARTY);
    public static final TransactionName BONUS_PAYMENT = new TransactionName(_BONUS_PAYMENT);
    public static final TransactionName ADVCASH_CARD_UNLOAD = new TransactionName(_ADVCASH_CARD_UNLOAD);
    public static final TransactionName BANK_TRANSFER_REFUND = new TransactionName(_BANK_TRANSFER_REFUND);
    public static final TransactionName SYSTEM_PAYMENT_DEPOSIT = new TransactionName(_SYSTEM_PAYMENT_DEPOSIT);
    public static final TransactionName ADVCASH_SCI_CRYPTO_EXCHANGE_DEPOSIT = new TransactionName(_ADVCASH_SCI_CRYPTO_EXCHANGE_DEPOSIT);
    public static final TransactionName ADVCASH_SCI_CRYPTO_EXCHANGE_WITHDRAWAL = new TransactionName(_ADVCASH_SCI_CRYPTO_EXCHANGE_WITHDRAWAL);
    public String getValue() { return _value_;}
    public static TransactionName fromValue(String value)
          throws IllegalArgumentException {
        TransactionName enumeration = (TransactionName)
            _table_.get(value);
        if (enumeration==null) throw new IllegalArgumentException();
        return enumeration;
    }
    public static TransactionName fromString(String value)
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
        new org.apache.axis.description.TypeDesc(TransactionName.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "transactionName"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
