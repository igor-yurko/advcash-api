/**
 * DepositPaymentMethodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class DepositPaymentMethodType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DepositPaymentMethodType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WALLET_ONE = "WALLET_ONE";
    public static final java.lang.String _UKASH = "UKASH";
    public static final java.lang.String _RBK_MONEY = "RBK_MONEY";
    public static final java.lang.String _Z_PAYMENT = "Z_PAYMENT";
    public static final java.lang.String _BPAY = "BPAY";
    public static final java.lang.String _WEB_CREDS = "WEB_CREDS";
    public static final java.lang.String _CASH_TERMINAL = "CASH_TERMINAL";
    public static final java.lang.String _MONEY_TRANSFER = "MONEY_TRANSFER";
    public static final java.lang.String _SVYAZNOY_BANK = "SVYAZNOY_BANK";
    public static final java.lang.String _BANK_TRANSFER = "BANK_TRANSFER";
    public static final java.lang.String _MAESTRO = "MAESTRO";
    public static final java.lang.String _SOFORT_BANKING = "SOFORT_BANKING";
    public static final java.lang.String _TRUST_PAY = "TRUST_PAY";
    public static final java.lang.String _BANKS_OFFICES = "BANKS_OFFICES";
    public static final java.lang.String _POST_OFFICES = "POST_OFFICES";
    public static final java.lang.String _VISA = "VISA";
    public static final java.lang.String _MASTERCARD = "MASTERCARD";
    public static final java.lang.String _NSMEP_UKRAINE = "NSMEP_UKRAINE";
    public static final java.lang.String _PSB_RETAIL = "PSB_RETAIL";
    public static final java.lang.String _SBER_ONLINE = "SBER_ONLINE";
    public static final java.lang.String _ALFACLICK = "ALFACLICK";
    public static final java.lang.String _PRIVAT24 = "PRIVAT24";
    public static final java.lang.String _CASHU = "CASHU";
    public static final java.lang.String _QIWI = "QIWI";
    public static final java.lang.String _QIWI_TERMINAL = "QIWI_TERMINAL";
    public static final java.lang.String _EASYPAY = "EASYPAY";
    public static final java.lang.String _POLI = "POLI";
    public static final java.lang.String _TELEINGRESO = "TELEINGRESO";
    public static final java.lang.String _MONEY_MAIL = "MONEY_MAIL";
    public static final java.lang.String _YANDEX_MONEY = "YANDEX_MONEY";
    public static final java.lang.String _BASHKOMSNAB_BANK = "BASHKOMSNAB_BANK";
    public static final java.lang.String _NOVOOPLAT = "NOVOOPLAT";
    public static final java.lang.String _ELEXNET = "ELEXNET";
    public static final java.lang.String _WEB_MONEY = "WEB_MONEY";
    public static final java.lang.String _MOBILE_RETAILS = "MOBILE_RETAILS";
    public static final java.lang.String _MOBILE_PHONE_BEELINE = "MOBILE_PHONE_BEELINE";
    public static final java.lang.String _MOBILE_PHONE_MTS = "MOBILE_PHONE_MTS";
    public static final java.lang.String _MOBILE_PHONE_MEGAFON = "MOBILE_PHONE_MEGAFON";
    public static final java.lang.String _EGO_PAY = "EGO_PAY";
    public static final java.lang.String _OKPAY = "OKPAY";
    public static final java.lang.String _SWIFT = "SWIFT";
    public static final java.lang.String _ECOIN = "ECOIN";
    public static final java.lang.String _SWIFT_3RD_PARTY = "SWIFT_3RD_PARTY";
    public static final java.lang.String _PERFECT_MONEY = "PERFECT_MONEY";
    public static final java.lang.String _PAXUM = "PAXUM";
    public static final java.lang.String _BITCOIN = "BITCOIN";
    public static final java.lang.String _PAYEER = "PAYEER";
    public static final java.lang.String _SEPA = "SEPA";
    public static final java.lang.String _SEPA_3RD_PARTY = "SEPA_3RD_PARTY";
    public static final java.lang.String _TEST = "TEST";
    public static final java.lang.String _MIXPLAT = "MIXPLAT";
    public static final java.lang.String _BTC_E = "BTC_E";
    public static final java.lang.String _FAST_BANK_TRANSFER = "FAST_BANK_TRANSFER";
    public static final java.lang.String _REAL_TIME_TRANSFER = "REAL_TIME_TRANSFER";
    public static final java.lang.String _EXMO = "EXMO";
    public static final java.lang.String _RUSSIAN_STANDARD_BANK = "RUSSIAN_STANDARD_BANK";
    public static final java.lang.String _CAPITALIST = "CAPITALIST";
    public static final java.lang.String _LIQPAY = "LIQPAY";
    public static final java.lang.String _MOBILE_PHONE_TELE2 = "MOBILE_PHONE_TELE2";
    public static final java.lang.String _SIMPLYPAY = "SIMPLYPAY";
    public static final java.lang.String _BITOK = "BITOK";
    public static final java.lang.String _PAYZA = "PAYZA";
    public static final java.lang.String _EPESE = "EPESE";
    public static final java.lang.String _VISA_KZT = "VISA_KZT";
    public static final java.lang.String _MASTERCARD_KZT = "MASTERCARD_KZT";
    public static final java.lang.String _AMERICAN_EXPRESS_KZT = "AMERICAN_EXPRESS_KZT";
    public static final java.lang.String _VISA_RUB = "VISA_RUB";
    public static final java.lang.String _MASTERCARD_RUB = "MASTERCARD_RUB";
    public static final java.lang.String _AMERICAN_EXPRESS_RUB = "AMERICAN_EXPRESS_RUB";
    public static final java.lang.String _JCB_RUB = "JCB_RUB";
    public static final java.lang.String _DINERS_CLUB_RUB = "DINERS_CLUB_RUB";
    public static final java.lang.String _VISA_BRL = "VISA_BRL";
    public static final java.lang.String _MASTERCARD_BRL = "MASTERCARD_BRL";
    public static final java.lang.String _VISA_INTERNATIONAL = "VISA_INTERNATIONAL";
    public static final java.lang.String _MASTERCARD_INTERNATIONAL = "MASTERCARD_INTERNATIONAL";
    public static final java.lang.String _CHINA_UNION_PAY = "CHINA_UNION_PAY";
    public static final java.lang.String _CREDIT_PILOT = "CREDIT_PILOT";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_BRL = "LOCAL_BANK_TRANSFER_BRL";
    public static final java.lang.String _EPAY = "EPAY";
    public static final java.lang.String _YANDEX_CASSA = "YANDEX_CASSA";
    public static final java.lang.String _ECOIN_VOUCHER = "ECOIN_VOUCHER";
    public static final java.lang.String _HOME_BANK_KZ = "HOME_BANK_KZ";
    public static final java.lang.String _KASSA_24_KZ = "KASSA_24_KZ";
    public static final java.lang.String _KAZPOST_KZ = "KAZPOST_KZ";
    public static final java.lang.String _ATF24_KZ = "ATF24_KZ";
    public static final java.lang.String _VISA_UAH = "VISA_UAH";
    public static final java.lang.String _MASTERCARD_UAH = "MASTERCARD_UAH";
    public static final java.lang.String _WEX = "WEX";
    public static final java.lang.String _MIR = "MIR";
    public static final java.lang.String _VISA_RUB_ISSUED_IN_RSB = "VISA_RUB_ISSUED_IN_RSB";
    public static final java.lang.String _MASTERCARD_RUB_ISSUED_IN_RSB = "MASTERCARD_RUB_ISSUED_IN_RSB";
    public static final java.lang.String _FORTEBANK_KZ = "FORTEBANK_KZ";
    public static final java.lang.String _ALFACLICK_KZ = "ALFACLICK_KZ";
    public static final java.lang.String _BANKRBK24_KZ = "BANKRBK24_KZ";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_AUSTRALIA = "LOCAL_BANK_TRANSFER_AUSTRALIA";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_HONG_KONG = "LOCAL_BANK_TRANSFER_HONG_KONG";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_INDONESIA = "LOCAL_BANK_TRANSFER_INDONESIA";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_PHILIPPINES = "LOCAL_BANK_TRANSFER_PHILIPPINES";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_SINGAPORE = "LOCAL_BANK_TRANSFER_SINGAPORE";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_VIETNAM = "LOCAL_BANK_TRANSFER_VIETNAM";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_EU_SEPA = "LOCAL_BANK_TRANSFER_EU_SEPA";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_THAILAND = "LOCAL_BANK_TRANSFER_THAILAND";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_ARGENTINA = "LOCAL_BANK_TRANSFER_ARGENTINA";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_CHILE = "LOCAL_BANK_TRANSFER_CHILE";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_TURKEY = "LOCAL_BANK_TRANSFER_TURKEY";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_COLOMBIA = "LOCAL_BANK_TRANSFER_COLOMBIA";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_MEXICO = "LOCAL_BANK_TRANSFER_MEXICO";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_PERU = "LOCAL_BANK_TRANSFER_PERU";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_URUGUAY = "LOCAL_BANK_TRANSFER_URUGUAY";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_CHINA = "LOCAL_BANK_TRANSFER_CHINA";
    public static final java.lang.String _SEPA_ICT = "SEPA_ICT";
    public static final java.lang.String _LITECOIN = "LITECOIN";
    public static final java.lang.String _LOCAL_BANK_TRANSFER_BRAZIL = "LOCAL_BANK_TRANSFER_BRAZIL";
    public static final java.lang.String _BITCOIN_CASH = "BITCOIN_CASH";
    public static final java.lang.String _GOOGLE_PAY = "GOOGLE_PAY";
    public static final java.lang.String _APPLE_PAY = "APPLE_PAY";
    public static final java.lang.String _RIPPLE = "RIPPLE";
    public static final java.lang.String _ETHEREUM = "ETHEREUM";
    public static final java.lang.String _ZCASH = "ZCASH";
    public static final java.lang.String _USDTETHER = "USDTETHER";
    public static final java.lang.String _BANK_CARD_TO_CRYPTOCURRENCY = "BANK_CARD_TO_CRYPTOCURRENCY";
    public static final java.lang.String _BANK_CARD_RSB_TO_CRYPTOCURRENCY = "BANK_CARD_RSB_TO_CRYPTOCURRENCY";
    public static final java.lang.String _SVYAZNOY_EUROSET_CASH_OFFICE = "SVYAZNOY_EUROSET_CASH_OFFICE";
    public static final java.lang.String _MTS_CASH_OFFICE = "MTS_CASH_OFFICE";
    public static final DepositPaymentMethodType WALLET_ONE = new DepositPaymentMethodType(_WALLET_ONE);
    public static final DepositPaymentMethodType UKASH = new DepositPaymentMethodType(_UKASH);
    public static final DepositPaymentMethodType RBK_MONEY = new DepositPaymentMethodType(_RBK_MONEY);
    public static final DepositPaymentMethodType Z_PAYMENT = new DepositPaymentMethodType(_Z_PAYMENT);
    public static final DepositPaymentMethodType BPAY = new DepositPaymentMethodType(_BPAY);
    public static final DepositPaymentMethodType WEB_CREDS = new DepositPaymentMethodType(_WEB_CREDS);
    public static final DepositPaymentMethodType CASH_TERMINAL = new DepositPaymentMethodType(_CASH_TERMINAL);
    public static final DepositPaymentMethodType MONEY_TRANSFER = new DepositPaymentMethodType(_MONEY_TRANSFER);
    public static final DepositPaymentMethodType SVYAZNOY_BANK = new DepositPaymentMethodType(_SVYAZNOY_BANK);
    public static final DepositPaymentMethodType BANK_TRANSFER = new DepositPaymentMethodType(_BANK_TRANSFER);
    public static final DepositPaymentMethodType MAESTRO = new DepositPaymentMethodType(_MAESTRO);
    public static final DepositPaymentMethodType SOFORT_BANKING = new DepositPaymentMethodType(_SOFORT_BANKING);
    public static final DepositPaymentMethodType TRUST_PAY = new DepositPaymentMethodType(_TRUST_PAY);
    public static final DepositPaymentMethodType BANKS_OFFICES = new DepositPaymentMethodType(_BANKS_OFFICES);
    public static final DepositPaymentMethodType POST_OFFICES = new DepositPaymentMethodType(_POST_OFFICES);
    public static final DepositPaymentMethodType VISA = new DepositPaymentMethodType(_VISA);
    public static final DepositPaymentMethodType MASTERCARD = new DepositPaymentMethodType(_MASTERCARD);
    public static final DepositPaymentMethodType NSMEP_UKRAINE = new DepositPaymentMethodType(_NSMEP_UKRAINE);
    public static final DepositPaymentMethodType PSB_RETAIL = new DepositPaymentMethodType(_PSB_RETAIL);
    public static final DepositPaymentMethodType SBER_ONLINE = new DepositPaymentMethodType(_SBER_ONLINE);
    public static final DepositPaymentMethodType ALFACLICK = new DepositPaymentMethodType(_ALFACLICK);
    public static final DepositPaymentMethodType PRIVAT24 = new DepositPaymentMethodType(_PRIVAT24);
    public static final DepositPaymentMethodType CASHU = new DepositPaymentMethodType(_CASHU);
    public static final DepositPaymentMethodType QIWI = new DepositPaymentMethodType(_QIWI);
    public static final DepositPaymentMethodType QIWI_TERMINAL = new DepositPaymentMethodType(_QIWI_TERMINAL);
    public static final DepositPaymentMethodType EASYPAY = new DepositPaymentMethodType(_EASYPAY);
    public static final DepositPaymentMethodType POLI = new DepositPaymentMethodType(_POLI);
    public static final DepositPaymentMethodType TELEINGRESO = new DepositPaymentMethodType(_TELEINGRESO);
    public static final DepositPaymentMethodType MONEY_MAIL = new DepositPaymentMethodType(_MONEY_MAIL);
    public static final DepositPaymentMethodType YANDEX_MONEY = new DepositPaymentMethodType(_YANDEX_MONEY);
    public static final DepositPaymentMethodType BASHKOMSNAB_BANK = new DepositPaymentMethodType(_BASHKOMSNAB_BANK);
    public static final DepositPaymentMethodType NOVOOPLAT = new DepositPaymentMethodType(_NOVOOPLAT);
    public static final DepositPaymentMethodType ELEXNET = new DepositPaymentMethodType(_ELEXNET);
    public static final DepositPaymentMethodType WEB_MONEY = new DepositPaymentMethodType(_WEB_MONEY);
    public static final DepositPaymentMethodType MOBILE_RETAILS = new DepositPaymentMethodType(_MOBILE_RETAILS);
    public static final DepositPaymentMethodType MOBILE_PHONE_BEELINE = new DepositPaymentMethodType(_MOBILE_PHONE_BEELINE);
    public static final DepositPaymentMethodType MOBILE_PHONE_MTS = new DepositPaymentMethodType(_MOBILE_PHONE_MTS);
    public static final DepositPaymentMethodType MOBILE_PHONE_MEGAFON = new DepositPaymentMethodType(_MOBILE_PHONE_MEGAFON);
    public static final DepositPaymentMethodType EGO_PAY = new DepositPaymentMethodType(_EGO_PAY);
    public static final DepositPaymentMethodType OKPAY = new DepositPaymentMethodType(_OKPAY);
    public static final DepositPaymentMethodType SWIFT = new DepositPaymentMethodType(_SWIFT);
    public static final DepositPaymentMethodType ECOIN = new DepositPaymentMethodType(_ECOIN);
    public static final DepositPaymentMethodType SWIFT_3RD_PARTY = new DepositPaymentMethodType(_SWIFT_3RD_PARTY);
    public static final DepositPaymentMethodType PERFECT_MONEY = new DepositPaymentMethodType(_PERFECT_MONEY);
    public static final DepositPaymentMethodType PAXUM = new DepositPaymentMethodType(_PAXUM);
    public static final DepositPaymentMethodType BITCOIN = new DepositPaymentMethodType(_BITCOIN);
    public static final DepositPaymentMethodType PAYEER = new DepositPaymentMethodType(_PAYEER);
    public static final DepositPaymentMethodType SEPA = new DepositPaymentMethodType(_SEPA);
    public static final DepositPaymentMethodType SEPA_3RD_PARTY = new DepositPaymentMethodType(_SEPA_3RD_PARTY);
    public static final DepositPaymentMethodType TEST = new DepositPaymentMethodType(_TEST);
    public static final DepositPaymentMethodType MIXPLAT = new DepositPaymentMethodType(_MIXPLAT);
    public static final DepositPaymentMethodType BTC_E = new DepositPaymentMethodType(_BTC_E);
    public static final DepositPaymentMethodType FAST_BANK_TRANSFER = new DepositPaymentMethodType(_FAST_BANK_TRANSFER);
    public static final DepositPaymentMethodType REAL_TIME_TRANSFER = new DepositPaymentMethodType(_REAL_TIME_TRANSFER);
    public static final DepositPaymentMethodType EXMO = new DepositPaymentMethodType(_EXMO);
    public static final DepositPaymentMethodType RUSSIAN_STANDARD_BANK = new DepositPaymentMethodType(_RUSSIAN_STANDARD_BANK);
    public static final DepositPaymentMethodType CAPITALIST = new DepositPaymentMethodType(_CAPITALIST);
    public static final DepositPaymentMethodType LIQPAY = new DepositPaymentMethodType(_LIQPAY);
    public static final DepositPaymentMethodType MOBILE_PHONE_TELE2 = new DepositPaymentMethodType(_MOBILE_PHONE_TELE2);
    public static final DepositPaymentMethodType SIMPLYPAY = new DepositPaymentMethodType(_SIMPLYPAY);
    public static final DepositPaymentMethodType BITOK = new DepositPaymentMethodType(_BITOK);
    public static final DepositPaymentMethodType PAYZA = new DepositPaymentMethodType(_PAYZA);
    public static final DepositPaymentMethodType EPESE = new DepositPaymentMethodType(_EPESE);
    public static final DepositPaymentMethodType VISA_KZT = new DepositPaymentMethodType(_VISA_KZT);
    public static final DepositPaymentMethodType MASTERCARD_KZT = new DepositPaymentMethodType(_MASTERCARD_KZT);
    public static final DepositPaymentMethodType AMERICAN_EXPRESS_KZT = new DepositPaymentMethodType(_AMERICAN_EXPRESS_KZT);
    public static final DepositPaymentMethodType VISA_RUB = new DepositPaymentMethodType(_VISA_RUB);
    public static final DepositPaymentMethodType MASTERCARD_RUB = new DepositPaymentMethodType(_MASTERCARD_RUB);
    public static final DepositPaymentMethodType AMERICAN_EXPRESS_RUB = new DepositPaymentMethodType(_AMERICAN_EXPRESS_RUB);
    public static final DepositPaymentMethodType JCB_RUB = new DepositPaymentMethodType(_JCB_RUB);
    public static final DepositPaymentMethodType DINERS_CLUB_RUB = new DepositPaymentMethodType(_DINERS_CLUB_RUB);
    public static final DepositPaymentMethodType VISA_BRL = new DepositPaymentMethodType(_VISA_BRL);
    public static final DepositPaymentMethodType MASTERCARD_BRL = new DepositPaymentMethodType(_MASTERCARD_BRL);
    public static final DepositPaymentMethodType VISA_INTERNATIONAL = new DepositPaymentMethodType(_VISA_INTERNATIONAL);
    public static final DepositPaymentMethodType MASTERCARD_INTERNATIONAL = new DepositPaymentMethodType(_MASTERCARD_INTERNATIONAL);
    public static final DepositPaymentMethodType CHINA_UNION_PAY = new DepositPaymentMethodType(_CHINA_UNION_PAY);
    public static final DepositPaymentMethodType CREDIT_PILOT = new DepositPaymentMethodType(_CREDIT_PILOT);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_BRL = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_BRL);
    public static final DepositPaymentMethodType EPAY = new DepositPaymentMethodType(_EPAY);
    public static final DepositPaymentMethodType YANDEX_CASSA = new DepositPaymentMethodType(_YANDEX_CASSA);
    public static final DepositPaymentMethodType ECOIN_VOUCHER = new DepositPaymentMethodType(_ECOIN_VOUCHER);
    public static final DepositPaymentMethodType HOME_BANK_KZ = new DepositPaymentMethodType(_HOME_BANK_KZ);
    public static final DepositPaymentMethodType KASSA_24_KZ = new DepositPaymentMethodType(_KASSA_24_KZ);
    public static final DepositPaymentMethodType KAZPOST_KZ = new DepositPaymentMethodType(_KAZPOST_KZ);
    public static final DepositPaymentMethodType ATF24_KZ = new DepositPaymentMethodType(_ATF24_KZ);
    public static final DepositPaymentMethodType VISA_UAH = new DepositPaymentMethodType(_VISA_UAH);
    public static final DepositPaymentMethodType MASTERCARD_UAH = new DepositPaymentMethodType(_MASTERCARD_UAH);
    public static final DepositPaymentMethodType WEX = new DepositPaymentMethodType(_WEX);
    public static final DepositPaymentMethodType MIR = new DepositPaymentMethodType(_MIR);
    public static final DepositPaymentMethodType VISA_RUB_ISSUED_IN_RSB = new DepositPaymentMethodType(_VISA_RUB_ISSUED_IN_RSB);
    public static final DepositPaymentMethodType MASTERCARD_RUB_ISSUED_IN_RSB = new DepositPaymentMethodType(_MASTERCARD_RUB_ISSUED_IN_RSB);
    public static final DepositPaymentMethodType FORTEBANK_KZ = new DepositPaymentMethodType(_FORTEBANK_KZ);
    public static final DepositPaymentMethodType ALFACLICK_KZ = new DepositPaymentMethodType(_ALFACLICK_KZ);
    public static final DepositPaymentMethodType BANKRBK24_KZ = new DepositPaymentMethodType(_BANKRBK24_KZ);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_AUSTRALIA = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_AUSTRALIA);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_HONG_KONG = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_HONG_KONG);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_INDONESIA = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_INDONESIA);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_PHILIPPINES = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_PHILIPPINES);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_SINGAPORE = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_SINGAPORE);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_VIETNAM = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_VIETNAM);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_EU_SEPA = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_EU_SEPA);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_THAILAND = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_THAILAND);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_ARGENTINA = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_ARGENTINA);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_CHILE = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_CHILE);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_TURKEY = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_TURKEY);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_COLOMBIA = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_COLOMBIA);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_MEXICO = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_MEXICO);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_PERU = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_PERU);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_URUGUAY = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_URUGUAY);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_CHINA = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_CHINA);
    public static final DepositPaymentMethodType SEPA_ICT = new DepositPaymentMethodType(_SEPA_ICT);
    public static final DepositPaymentMethodType LITECOIN = new DepositPaymentMethodType(_LITECOIN);
    public static final DepositPaymentMethodType LOCAL_BANK_TRANSFER_BRAZIL = new DepositPaymentMethodType(_LOCAL_BANK_TRANSFER_BRAZIL);
    public static final DepositPaymentMethodType BITCOIN_CASH = new DepositPaymentMethodType(_BITCOIN_CASH);
    public static final DepositPaymentMethodType GOOGLE_PAY = new DepositPaymentMethodType(_GOOGLE_PAY);
    public static final DepositPaymentMethodType APPLE_PAY = new DepositPaymentMethodType(_APPLE_PAY);
    public static final DepositPaymentMethodType RIPPLE = new DepositPaymentMethodType(_RIPPLE);
    public static final DepositPaymentMethodType ETHEREUM = new DepositPaymentMethodType(_ETHEREUM);
    public static final DepositPaymentMethodType ZCASH = new DepositPaymentMethodType(_ZCASH);
    public static final DepositPaymentMethodType USDTETHER = new DepositPaymentMethodType(_USDTETHER);
    public static final DepositPaymentMethodType BANK_CARD_TO_CRYPTOCURRENCY = new DepositPaymentMethodType(_BANK_CARD_TO_CRYPTOCURRENCY);
    public static final DepositPaymentMethodType BANK_CARD_RSB_TO_CRYPTOCURRENCY = new DepositPaymentMethodType(_BANK_CARD_RSB_TO_CRYPTOCURRENCY);
    public static final DepositPaymentMethodType SVYAZNOY_EUROSET_CASH_OFFICE = new DepositPaymentMethodType(_SVYAZNOY_EUROSET_CASH_OFFICE);
    public static final DepositPaymentMethodType MTS_CASH_OFFICE = new DepositPaymentMethodType(_MTS_CASH_OFFICE);
    public java.lang.String getValue() { return _value_;}
    public static DepositPaymentMethodType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DepositPaymentMethodType enumeration = (DepositPaymentMethodType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DepositPaymentMethodType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DepositPaymentMethodType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "depositPaymentMethodType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
