/**
 * ExceptionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class ExceptionType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExceptionType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AlreadyExistException = "AlreadyExistException";
    public static final java.lang.String _AttemptsHaveEndedException = "AttemptsHaveEndedException";
    public static final java.lang.String _BadParametersException = "BadParametersException";
    public static final java.lang.String _BadFormatAmountException = "BadFormatAmountException";
    public static final java.lang.String _CodeHasExpired = "CodeHasExpired";
    public static final java.lang.String _CodeIsNotValidException = "CodeIsNotValidException";
    public static final java.lang.String _CryptoException = "CryptoException";
    public static final java.lang.String _DatabaseException = "DatabaseException";
    public static final java.lang.String _EmailAlreadyExistException = "EmailAlreadyExistException";
    public static final java.lang.String _ExchangeCurrencyException = "ExchangeCurrencyException";
    public static final java.lang.String _FileFormatException = "FileFormatException";
    public static final java.lang.String _FileSystemException = "FileSystemException";
    public static final java.lang.String _GroupDoesNotEmptyException = "GroupDoesNotEmptyException";
    public static final java.lang.String _IpAddressIsWrongException = "IpAddressIsWrongException";
    public static final java.lang.String _LimitPerMonthException = "LimitPerMonthException";
    public static final java.lang.String _LimitPerDayException = "LimitPerDayException";
    public static final java.lang.String _LimitPerTransactionException = "LimitPerTransactionException";
    public static final java.lang.String _LoginAlreadyExistException = "LoginAlreadyExistException";
    public static final java.lang.String _NotEnoughMoneyException = "NotEnoughMoneyException";
    public static final java.lang.String _PasswordExpiredException = "PasswordExpiredException";
    public static final java.lang.String _PasswordIncorrectException = "PasswordIncorrectException";
    public static final java.lang.String _PasswordIsNotNewException = "PasswordIsNotNewException";
    public static final java.lang.String _PINCodeIncorrectException = "PINCodeIncorrectException";
    public static final java.lang.String _PasswordRecoveryException = "PasswordRecoveryException";
    public static final java.lang.String _PhoneNumberAlreadyExistException = "PhoneNumberAlreadyExistException";
    public static final java.lang.String _PhoneNumberNotValidException = "PhoneNumberNotValidException";
    public static final java.lang.String _RecipientDoesNotExistException = "RecipientDoesNotExistException";
    public static final java.lang.String _RegistrationException = "RegistrationException";
    public static final java.lang.String _SecretAnswerIsNotValidException = "SecretAnswerIsNotValidException";
    public static final java.lang.String _SenderDoesNotExistException = "SenderDoesNotExistException";
    public static final java.lang.String _SignatureException = "SignatureException";
    public static final java.lang.String _TooManyAttemptsException = "TooManyAttemptsException";
    public static final java.lang.String _TooManyWalletsException = "TooManyWalletsException";
    public static final java.lang.String _TransactionFailureException = "TransactionFailureException";
    public static final java.lang.String _TransactionIsNotAvailableException = "TransactionIsNotAvailableException";
    public static final java.lang.String _TypeWrongExceptionDB = "TypeWrongExceptionDB";
    public static final java.lang.String _UnsupportedTransaction = "UnsupportedTransaction";
    public static final java.lang.String _UserBlockedException = "UserBlockedException";
    public static final java.lang.String _UserDoesNotExistException = "UserDoesNotExistException";
    public static final java.lang.String _UserAlreadyExistException = "UserAlreadyExistException";
    public static final java.lang.String _VeryBigAmountException = "VeryBigAmountException";
    public static final java.lang.String _WalletCurrencyIncorrectException = "WalletCurrencyIncorrectException";
    public static final java.lang.String _WalletDoesNotExist = "WalletDoesNotExist";
    public static final java.lang.String _WrongParametersException = "WrongParametersException";
    public static final java.lang.String _TooManyAttemptsPasswordRecoveryException = "TooManyAttemptsPasswordRecoveryException";
    public static final java.lang.String _SAMException = "SAMException";
    public static final java.lang.String _WrongEmailException = "WrongEmailException";
    public static final java.lang.String _MultipleWalletsException = "MultipleWalletsException";
    public static final java.lang.String _IpInBlackListException = "IpInBlackListException";
    public static final java.lang.String _CardDoesNotExistException = "CardDoesNotExistException";
    public static final java.lang.String _CardIsNotActiveException = "CardIsNotActiveException";
    public static final java.lang.String _CardNumberIsNotValidException = "CardNumberIsNotValidException";
    public static final java.lang.String _ProtectimusAuthenticationException = "ProtectimusAuthenticationException";
    public static final java.lang.String _AccountIsNotVerifiedException = "AccountIsNotVerifiedException";
    public static final java.lang.String _UserSuspiciousException = "UserSuspiciousException";
    public static final java.lang.String _OkPayApiException = "OkPayApiException";
    public static final java.lang.String _PerfectMoneyApiException = "PerfectMoneyApiException";
    public static final java.lang.String _EgoPayApiException = "EgoPayApiException";
    public static final java.lang.String _PaxumApiException = "PaxumApiException";
    public static final java.lang.String _CoinbaseApiException = "CoinbaseApiException";
    public static final java.lang.String _YandexMoneyApiException = "YandexMoneyApiException";
    public static final java.lang.String _PayeerApiException = "PayeerApiException";
    public static final java.lang.String _NotSupportedCountryException = "NotSupportedCountryException";
    public static final java.lang.String _BitpayApiException = "BitpayApiException";
    public static final java.lang.String _ExmoApiException = "ExmoApiException";
    public static final java.lang.String _FetchDataException = "FetchDataException";
    public static final java.lang.String _KitPSApiException = "KitPSApiException";
    public static final java.lang.String _NotEnoughMoneyApiException = "NotEnoughMoneyApiException";
    public static final java.lang.String _TestPaymentApiException = "TestPaymentApiException";
    public static final java.lang.String _NotSupportedBankBinException = "NotSupportedBankBinException";
    public static final java.lang.String _WebMoneyApiException = "WebMoneyApiException";
    public static final java.lang.String _QiwiApiException = "QiwiApiException";
    public static final java.lang.String _DuplicateOrderIdException = "DuplicateOrderIdException";
    public static final java.lang.String _MixPlatApiException = "MixPlatApiException";
    public static final java.lang.String _BtcEApiException = "BtcEApiException";
    public static final java.lang.String _NetexApiException = "NetexApiException";
    public static final java.lang.String _CardNotEnoughMoneyException = "CardNotEnoughMoneyException";
    public static final java.lang.String _TransactionTemporaryNotAvailableException = "TransactionTemporaryNotAvailableException";
    public static final java.lang.String _InterkassaApiException = "InterkassaApiException";
    public static final java.lang.String _EcoinApiException = "EcoinApiException";
    public static final java.lang.String _DuplicateTransactionException = "DuplicateTransactionException";
    public static final java.lang.String _MonetaruApiException = "MonetaruApiException";
    public static final java.lang.String _CardBlockException = "CardBlockException";
    public static final java.lang.String _CapitalistApiException = "CapitalistApiException";
    public static final java.lang.String _CardsApiDisabledException = "CardsApiDisabledException";
    public static final java.lang.String _InternalException = "InternalException";
    public static final java.lang.String _LimitsException = "LimitsException";
    public static final java.lang.String _NotAuthException = "NotAuthException";
    public static final java.lang.String _WrongParamsException = "WrongParamsException";
    public static final java.lang.String _AccountIdDoesNotBelongToRequesterException = "AccountIdDoesNotBelongToRequesterException";
    public static final java.lang.String _UserIsAlreadyVerifiedException = "UserIsAlreadyVerifiedException";
    public static final java.lang.String _CardsAPISmsSendRestrictionException = "CardsAPISmsSendRestrictionException";
    public static final java.lang.String _ChangeCardStatusException = "ChangeCardStatusException";
    public static final java.lang.String _CardActivationException = "CardActivationException";
    public static final java.lang.String _AdditionalDataRequiredException = "AdditionalDataRequiredException";
    public static final java.lang.String _SystemAccountDeleteException = "SystemAccountDeleteException";
    public static final java.lang.String _VerificationRequestIsAlreadySubmitted = "VerificationRequestIsAlreadySubmitted";
    public static final java.lang.String _BitPayException = "BitPayException";
    public static final java.lang.String _ChangeSystemAccountTypeRequestException = "ChangeSystemAccountTypeRequestException";
    public static final java.lang.String _BitokApiException = "BitokApiException";
    public static final java.lang.String _PayzaApiException = "PayzaApiException";
    public static final java.lang.String _EpeseApiException = "EpeseApiException";
    public static final java.lang.String _PayboxKzApiException = "PayboxKzApiException";
    public static final java.lang.String _PayKeeperApiException = "PayKeeperApiException";
    public static final java.lang.String _BitOneApiException = "BitOneApiException";
    public static final java.lang.String _DuplicateDocumentNumberDigitsException = "DuplicateDocumentNumberDigitsException";
    public static final java.lang.String _GpaysafeApiException = "GpaysafeApiException";
    public static final java.lang.String _CreditPilotAPIException = "CreditPilotAPIException";
    public static final java.lang.String _RsbApiException = "RsbApiException";
    public static final java.lang.String _AlliedWalletApiException = "AlliedWalletApiException";
    public static final java.lang.String _UnauthorizedIpAddressException = "UnauthorizedIpAddressException";
    public static final java.lang.String _WinPayApiException = "WinPayApiException";
    public static final java.lang.String _YandexCassaApiException = "YandexCassaApiException";
    public static final java.lang.String _EpayApiException = "EpayApiException";
    public static final java.lang.String _TicketSystemApiException = "TicketSystemApiException";
    public static final java.lang.String _ParseErrorException = "ParseErrorException";
    public static final java.lang.String _LimitPerCardPerDayException = "LimitPerCardPerDayException";
    public static final java.lang.String _LifetimeLimitException = "LifetimeLimitException";
    public static final java.lang.String _EcoinVoucherApiException = "EcoinVoucherApiException";
    public static final java.lang.String _ClientProfileDoesNotMatchException = "ClientProfileDoesNotMatchException";
    public static final ExceptionType AlreadyExistException = new ExceptionType(_AlreadyExistException);
    public static final ExceptionType AttemptsHaveEndedException = new ExceptionType(_AttemptsHaveEndedException);
    public static final ExceptionType BadParametersException = new ExceptionType(_BadParametersException);
    public static final ExceptionType BadFormatAmountException = new ExceptionType(_BadFormatAmountException);
    public static final ExceptionType CodeHasExpired = new ExceptionType(_CodeHasExpired);
    public static final ExceptionType CodeIsNotValidException = new ExceptionType(_CodeIsNotValidException);
    public static final ExceptionType CryptoException = new ExceptionType(_CryptoException);
    public static final ExceptionType DatabaseException = new ExceptionType(_DatabaseException);
    public static final ExceptionType EmailAlreadyExistException = new ExceptionType(_EmailAlreadyExistException);
    public static final ExceptionType ExchangeCurrencyException = new ExceptionType(_ExchangeCurrencyException);
    public static final ExceptionType FileFormatException = new ExceptionType(_FileFormatException);
    public static final ExceptionType FileSystemException = new ExceptionType(_FileSystemException);
    public static final ExceptionType GroupDoesNotEmptyException = new ExceptionType(_GroupDoesNotEmptyException);
    public static final ExceptionType IpAddressIsWrongException = new ExceptionType(_IpAddressIsWrongException);
    public static final ExceptionType LimitPerMonthException = new ExceptionType(_LimitPerMonthException);
    public static final ExceptionType LimitPerDayException = new ExceptionType(_LimitPerDayException);
    public static final ExceptionType LimitPerTransactionException = new ExceptionType(_LimitPerTransactionException);
    public static final ExceptionType LoginAlreadyExistException = new ExceptionType(_LoginAlreadyExistException);
    public static final ExceptionType NotEnoughMoneyException = new ExceptionType(_NotEnoughMoneyException);
    public static final ExceptionType PasswordExpiredException = new ExceptionType(_PasswordExpiredException);
    public static final ExceptionType PasswordIncorrectException = new ExceptionType(_PasswordIncorrectException);
    public static final ExceptionType PasswordIsNotNewException = new ExceptionType(_PasswordIsNotNewException);
    public static final ExceptionType PINCodeIncorrectException = new ExceptionType(_PINCodeIncorrectException);
    public static final ExceptionType PasswordRecoveryException = new ExceptionType(_PasswordRecoveryException);
    public static final ExceptionType PhoneNumberAlreadyExistException = new ExceptionType(_PhoneNumberAlreadyExistException);
    public static final ExceptionType PhoneNumberNotValidException = new ExceptionType(_PhoneNumberNotValidException);
    public static final ExceptionType RecipientDoesNotExistException = new ExceptionType(_RecipientDoesNotExistException);
    public static final ExceptionType RegistrationException = new ExceptionType(_RegistrationException);
    public static final ExceptionType SecretAnswerIsNotValidException = new ExceptionType(_SecretAnswerIsNotValidException);
    public static final ExceptionType SenderDoesNotExistException = new ExceptionType(_SenderDoesNotExistException);
    public static final ExceptionType SignatureException = new ExceptionType(_SignatureException);
    public static final ExceptionType TooManyAttemptsException = new ExceptionType(_TooManyAttemptsException);
    public static final ExceptionType TooManyWalletsException = new ExceptionType(_TooManyWalletsException);
    public static final ExceptionType TransactionFailureException = new ExceptionType(_TransactionFailureException);
    public static final ExceptionType TransactionIsNotAvailableException = new ExceptionType(_TransactionIsNotAvailableException);
    public static final ExceptionType TypeWrongExceptionDB = new ExceptionType(_TypeWrongExceptionDB);
    public static final ExceptionType UnsupportedTransaction = new ExceptionType(_UnsupportedTransaction);
    public static final ExceptionType UserBlockedException = new ExceptionType(_UserBlockedException);
    public static final ExceptionType UserDoesNotExistException = new ExceptionType(_UserDoesNotExistException);
    public static final ExceptionType UserAlreadyExistException = new ExceptionType(_UserAlreadyExistException);
    public static final ExceptionType VeryBigAmountException = new ExceptionType(_VeryBigAmountException);
    public static final ExceptionType WalletCurrencyIncorrectException = new ExceptionType(_WalletCurrencyIncorrectException);
    public static final ExceptionType WalletDoesNotExist = new ExceptionType(_WalletDoesNotExist);
    public static final ExceptionType WrongParametersException = new ExceptionType(_WrongParametersException);
    public static final ExceptionType TooManyAttemptsPasswordRecoveryException = new ExceptionType(_TooManyAttemptsPasswordRecoveryException);
    public static final ExceptionType SAMException = new ExceptionType(_SAMException);
    public static final ExceptionType WrongEmailException = new ExceptionType(_WrongEmailException);
    public static final ExceptionType MultipleWalletsException = new ExceptionType(_MultipleWalletsException);
    public static final ExceptionType IpInBlackListException = new ExceptionType(_IpInBlackListException);
    public static final ExceptionType CardDoesNotExistException = new ExceptionType(_CardDoesNotExistException);
    public static final ExceptionType CardIsNotActiveException = new ExceptionType(_CardIsNotActiveException);
    public static final ExceptionType CardNumberIsNotValidException = new ExceptionType(_CardNumberIsNotValidException);
    public static final ExceptionType ProtectimusAuthenticationException = new ExceptionType(_ProtectimusAuthenticationException);
    public static final ExceptionType AccountIsNotVerifiedException = new ExceptionType(_AccountIsNotVerifiedException);
    public static final ExceptionType UserSuspiciousException = new ExceptionType(_UserSuspiciousException);
    public static final ExceptionType OkPayApiException = new ExceptionType(_OkPayApiException);
    public static final ExceptionType PerfectMoneyApiException = new ExceptionType(_PerfectMoneyApiException);
    public static final ExceptionType EgoPayApiException = new ExceptionType(_EgoPayApiException);
    public static final ExceptionType PaxumApiException = new ExceptionType(_PaxumApiException);
    public static final ExceptionType CoinbaseApiException = new ExceptionType(_CoinbaseApiException);
    public static final ExceptionType YandexMoneyApiException = new ExceptionType(_YandexMoneyApiException);
    public static final ExceptionType PayeerApiException = new ExceptionType(_PayeerApiException);
    public static final ExceptionType NotSupportedCountryException = new ExceptionType(_NotSupportedCountryException);
    public static final ExceptionType BitpayApiException = new ExceptionType(_BitpayApiException);
    public static final ExceptionType ExmoApiException = new ExceptionType(_ExmoApiException);
    public static final ExceptionType FetchDataException = new ExceptionType(_FetchDataException);
    public static final ExceptionType KitPSApiException = new ExceptionType(_KitPSApiException);
    public static final ExceptionType NotEnoughMoneyApiException = new ExceptionType(_NotEnoughMoneyApiException);
    public static final ExceptionType TestPaymentApiException = new ExceptionType(_TestPaymentApiException);
    public static final ExceptionType NotSupportedBankBinException = new ExceptionType(_NotSupportedBankBinException);
    public static final ExceptionType WebMoneyApiException = new ExceptionType(_WebMoneyApiException);
    public static final ExceptionType QiwiApiException = new ExceptionType(_QiwiApiException);
    public static final ExceptionType DuplicateOrderIdException = new ExceptionType(_DuplicateOrderIdException);
    public static final ExceptionType MixPlatApiException = new ExceptionType(_MixPlatApiException);
    public static final ExceptionType BtcEApiException = new ExceptionType(_BtcEApiException);
    public static final ExceptionType NetexApiException = new ExceptionType(_NetexApiException);
    public static final ExceptionType CardNotEnoughMoneyException = new ExceptionType(_CardNotEnoughMoneyException);
    public static final ExceptionType TransactionTemporaryNotAvailableException = new ExceptionType(_TransactionTemporaryNotAvailableException);
    public static final ExceptionType InterkassaApiException = new ExceptionType(_InterkassaApiException);
    public static final ExceptionType EcoinApiException = new ExceptionType(_EcoinApiException);
    public static final ExceptionType DuplicateTransactionException = new ExceptionType(_DuplicateTransactionException);
    public static final ExceptionType MonetaruApiException = new ExceptionType(_MonetaruApiException);
    public static final ExceptionType CardBlockException = new ExceptionType(_CardBlockException);
    public static final ExceptionType CapitalistApiException = new ExceptionType(_CapitalistApiException);
    public static final ExceptionType CardsApiDisabledException = new ExceptionType(_CardsApiDisabledException);
    public static final ExceptionType InternalException = new ExceptionType(_InternalException);
    public static final ExceptionType LimitsException = new ExceptionType(_LimitsException);
    public static final ExceptionType NotAuthException = new ExceptionType(_NotAuthException);
    public static final ExceptionType WrongParamsException = new ExceptionType(_WrongParamsException);
    public static final ExceptionType AccountIdDoesNotBelongToRequesterException = new ExceptionType(_AccountIdDoesNotBelongToRequesterException);
    public static final ExceptionType UserIsAlreadyVerifiedException = new ExceptionType(_UserIsAlreadyVerifiedException);
    public static final ExceptionType CardsAPISmsSendRestrictionException = new ExceptionType(_CardsAPISmsSendRestrictionException);
    public static final ExceptionType ChangeCardStatusException = new ExceptionType(_ChangeCardStatusException);
    public static final ExceptionType CardActivationException = new ExceptionType(_CardActivationException);
    public static final ExceptionType AdditionalDataRequiredException = new ExceptionType(_AdditionalDataRequiredException);
    public static final ExceptionType SystemAccountDeleteException = new ExceptionType(_SystemAccountDeleteException);
    public static final ExceptionType VerificationRequestIsAlreadySubmitted = new ExceptionType(_VerificationRequestIsAlreadySubmitted);
    public static final ExceptionType BitPayException = new ExceptionType(_BitPayException);
    public static final ExceptionType ChangeSystemAccountTypeRequestException = new ExceptionType(_ChangeSystemAccountTypeRequestException);
    public static final ExceptionType BitokApiException = new ExceptionType(_BitokApiException);
    public static final ExceptionType PayzaApiException = new ExceptionType(_PayzaApiException);
    public static final ExceptionType EpeseApiException = new ExceptionType(_EpeseApiException);
    public static final ExceptionType PayboxKzApiException = new ExceptionType(_PayboxKzApiException);
    public static final ExceptionType PayKeeperApiException = new ExceptionType(_PayKeeperApiException);
    public static final ExceptionType BitOneApiException = new ExceptionType(_BitOneApiException);
    public static final ExceptionType DuplicateDocumentNumberDigitsException = new ExceptionType(_DuplicateDocumentNumberDigitsException);
    public static final ExceptionType GpaysafeApiException = new ExceptionType(_GpaysafeApiException);
    public static final ExceptionType CreditPilotAPIException = new ExceptionType(_CreditPilotAPIException);
    public static final ExceptionType RsbApiException = new ExceptionType(_RsbApiException);
    public static final ExceptionType AlliedWalletApiException = new ExceptionType(_AlliedWalletApiException);
    public static final ExceptionType UnauthorizedIpAddressException = new ExceptionType(_UnauthorizedIpAddressException);
    public static final ExceptionType WinPayApiException = new ExceptionType(_WinPayApiException);
    public static final ExceptionType YandexCassaApiException = new ExceptionType(_YandexCassaApiException);
    public static final ExceptionType EpayApiException = new ExceptionType(_EpayApiException);
    public static final ExceptionType TicketSystemApiException = new ExceptionType(_TicketSystemApiException);
    public static final ExceptionType ParseErrorException = new ExceptionType(_ParseErrorException);
    public static final ExceptionType LimitPerCardPerDayException = new ExceptionType(_LimitPerCardPerDayException);
    public static final ExceptionType LifetimeLimitException = new ExceptionType(_LifetimeLimitException);
    public static final ExceptionType EcoinVoucherApiException = new ExceptionType(_EcoinVoucherApiException);
    public static final ExceptionType ClientProfileDoesNotMatchException = new ExceptionType(_ClientProfileDoesNotMatchException);
    public java.lang.String getValue() { return _value_;}
    public static ExceptionType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExceptionType enumeration = (ExceptionType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExceptionType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExceptionType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://wsm.advcash/", "exceptionType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
