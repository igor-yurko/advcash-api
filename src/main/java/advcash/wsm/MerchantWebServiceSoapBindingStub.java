/**
 * MerchantWebServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class MerchantWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements MerchantWebService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[46];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoneyToAdvcashCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequest"), AdvcashCardTransferRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      "advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      "advcash.wsm.CountLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      "advcash.wsm.CardIsNotActiveException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      "advcash.wsm.LimitPerCardPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      "advcash.wsm.LifetimeLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      "advcash.wsm.CardDoesNotExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoneyToEcoinEU");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToEcoinEUResultHolder"));
        oper.setReturnClass(advcash.wsm.SendMoneyToEcoinEUResultHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationCurrencyExchange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeRequest"), CurrencyExchangeRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("history");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantAPITransactionFilter"), MerchantAPITransactionFilter.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "outcomingTransactionDTO"));
        oper.setReturnClass(OutcomingTransactionDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountRequestDTO"), ValidateAccountRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountResultDTO"));
        oper.setReturnClass(ValidateAccountResultDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
                      "advcash.wsm.UserDoesNotExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateAccounts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String[].class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "accountPresentDTO"));
        oper.setReturnClass(AccountPresentDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateCurrencyExchange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"), TransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoneyToExmo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToExmoResultHolder"));
        oper.setReturnClass(SendMoneyToExmoResultHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("register");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "registrationRequest"), RegistrationRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException"),
                      "advcash.wsm.RegistrationException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      "advcash.wsm.EmailAlreadyExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoneyToWex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findTransaction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "outcomingTransactionDTO"));
        oper.setReturnClass(OutcomingTransactionDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("confirmCryptoCurrencyWithdrawalInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "confirmCryptoCurrencyWithdrawalInvoiceRequest"), ConfirmCryptoCurrencyWithdrawalInvoiceRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      "advcash.wsm.JAXBException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findCryptoCurrencyWithdrawalInvoiceByOrderId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceDTO"));
        oper.setReturnClass(CryptoCurrencyWithdrawalInvoiceDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makeCurrencyExchange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"), TransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoneyToEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"), SendMoneyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      "advcash.wsm.WrongEmailException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      "advcash.wsm.EmailAlreadyExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoneyToBankCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequest"), BankCardTransferRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
                      "advcash.wsm.NotSupportedBankBinException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      "advcash.wsm.CardNumberIsNotValidException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      "advcash.wsm.AdditionalDataRequiredException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
                      "advcash.wsm.NotSupportedCountryException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoneyToAdvcashCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequest"), AdvcashCardTransferRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      "advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      "advcash.wsm.CountLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      "advcash.wsm.CardIsNotActiveException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      "advcash.wsm.LimitPerCardPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      "advcash.wsm.LifetimeLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      "advcash.wsm.CardDoesNotExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferBankCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequestDTO"), BankCardTransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      "advcash.wsm.CardNumberIsNotValidException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      "advcash.wsm.AdditionalDataRequiredException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("currencyExchange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeRequest"), CurrencyExchangeRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoney");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"), SendMoneyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      "advcash.wsm.WalletCurrencyIncorrectException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoneyToEcurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoneyToEcurrency");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferAdvcashCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequestDTO"), AdvcashCardTransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      "advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      "advcash.wsm.CountLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
                      "advcash.wsm.UserDoesNotExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      "advcash.wsm.CardIsNotActiveException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      "advcash.wsm.LimitPerCardPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      "advcash.wsm.LifetimeLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      "advcash.wsm.CardDoesNotExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCryptoCurrencyWithdrawalInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceDTO"));
        oper.setReturnClass(CryptoCurrencyWithdrawalInvoiceDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      "advcash.wsm.JAXBException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateBankCardTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequestDTO"), BankCardTransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      "advcash.wsm.CardNumberIsNotValidException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      "advcash.wsm.AdditionalDataRequiredException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emailTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransferRequestDTO"), EmailTransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      "advcash.wsm.WrongEmailException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      "advcash.wsm.EmailAlreadyExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makeTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "typeOfTransaction"), TypeOfTransaction.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"), TransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      "advcash.wsm.WalletCurrencyIncorrectException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CodeIsNotValidException"),
                      "advcash.wsm.CodeIsNotValidException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CodeIsNotValidException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoneyToEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"), SendMoneyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      "advcash.wsm.WrongEmailException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      "advcash.wsm.EmailAlreadyExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("withdrawalThroughExternalPaymentSystem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawalThroughExternalPaymentSystemRequestDTO"), WithdrawalThroughExternalPaymentSystemRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoneyToBankCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequest"), BankCardTransferRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
                      "advcash.wsm.NotSupportedBankBinException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      "advcash.wsm.CardNumberIsNotValidException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      "advcash.wsm.AdditionalDataRequiredException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
                      "advcash.wsm.NotSupportedCountryException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoneyToEcoinEU");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoneyToExmo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateAdvcashCardTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequestDTO"), AdvcashCardTransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      "advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      "advcash.wsm.CountLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
                      "advcash.wsm.UserDoesNotExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      "advcash.wsm.CardIsNotActiveException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      "advcash.wsm.LimitPerCardPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      "advcash.wsm.LifetimeLimitException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      "advcash.wsm.CardDoesNotExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findPaymentByOrderId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "paymentOrderRequest"), advcash.wsm.PaymentOrderRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "paymentOrderResult"));
        oper.setReturnClass(advcash.wsm.PaymentOrderResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
                      "advcash.wsm.NotAvailableDepositSystemException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      "advcash.wsm.JAXBException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
                      "advcash.wsm.DuplicateOrderIdException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findCryptoCurrencyWithdrawalInvoiceById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceDTO"));
        oper.setReturnClass(CryptoCurrencyWithdrawalInvoiceDTO.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateWithdrawalThroughExternalPaymentSystem");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawalThroughExternalPaymentSystemRequestDTO"), WithdrawalThroughExternalPaymentSystemRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cancelProtectedTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "cancelProtectedTransferResultHolder"));
        oper.setReturnClass(CancelProtectedTransferResultHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createApi");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "createApiRequest"), CreateApiRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException"),
                      "advcash.wsm.RegistrationException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      "advcash.wsm.EmailAlreadyExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCryptoCurrencyInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "createCryptoCurrencyInvoiceRequest"), CreateCryptoCurrencyInvoiceRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "createCryptoCurrencyInvoiceResult"));
        oper.setReturnClass(CreateCryptoCurrencyInvoiceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
                      "advcash.wsm.NotAvailableDepositSystemException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      "advcash.wsm.JAXBException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
                      "advcash.wsm.DuplicateOrderIdException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateEmailTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransferRequestDTO"), EmailTransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      "advcash.wsm.WrongEmailException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      "advcash.wsm.EmailAlreadyExistException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validateTransfer");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "typeOfTransaction"), TypeOfTransaction.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"), TransferRequestDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      "advcash.wsm.WalletCurrencyIncorrectException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("validationSendMoney");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"), SendMoneyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      "advcash.wsm.WalletCurrencyIncorrectException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBitcoinInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceRequest"), CreateBitcoinInvoiceRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceResult"));
        oper.setReturnClass(CreateBitcoinInvoiceResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
                      "advcash.wsm.NotAvailableDepositSystemException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      "advcash.wsm.JAXBException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
                      "advcash.wsm.DuplicateOrderIdException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("checkCurrencyExchange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeRequest"), CheckCurrencyExchangeRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeResultHolder"));
        oper.setReturnClass(CheckCurrencyExchangeResultHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBalances");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "walletBalanceDTO"));
        oper.setReturnClass(WalletBalanceDTO[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      "advcash.wsm.LimitsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      "advcash.wsm.CallRestrictionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendMoneyToWex");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"), AuthDTO.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"), WithdrawToEcurrencyRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToWexResultHolder"));
        oper.setReturnClass(SendMoneyToWexResultHolder.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      "advcash.wsm.TransactionTemporaryNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      "advcash.wsm.TransactionIsNotAvailableException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      "advcash.wsm.AccessDeniedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      "advcash.wsm.MerchantDisabledException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      "advcash.wsm.WrongIpException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      "advcash.wsm.UserBlockedException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      "advcash.wsm.WrongParamsException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      "advcash.wsm.LimitPerTransactionException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      "advcash.wsm.LimitPerMonthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      "advcash.wsm.InternalException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      "advcash.wsm.BadParametersException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      "advcash.wsm.TransactionFailureException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      "advcash.wsm.NotEnoughMoneyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      "advcash.wsm.NotAuthException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      "advcash.wsm.NotEnoughMoneyApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      "advcash.wsm.WalletDoesNotExist",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      "advcash.wsm.DatabaseException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      "advcash.wsm.ExchangeCurrencyException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      "advcash.wsm.LimitPerDayException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      "advcash.wsm.ApiException",
                      new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
                      true
                     ));
        _operations[45] = oper;

    }

    public MerchantWebServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public MerchantWebServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public MerchantWebServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "abstractBaseDTO");
            cachedSerQNames.add(qName);
            cls = AbstractBaseDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException");
            cachedSerQNames.add(qName);
            cls = AccessDeniedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "accountPresentDTO");
            cachedSerQNames.add(qName);
            cls = AccountPresentDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException");
            cachedSerQNames.add(qName);
            cls = AdditionalDataRequiredException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "AdvcashCardMaxAllowedBalanceExceededException");
            cachedSerQNames.add(qName);
            cls = AdvcashCardMaxAllowedBalanceExceededException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequest");
            cachedSerQNames.add(qName);
            cls = AdvcashCardTransferRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequestDTO");
            cachedSerQNames.add(qName);
            cls = AdvcashCardTransferRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException");
            cachedSerQNames.add(qName);
            cls = ApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO");
            cachedSerQNames.add(qName);
            cls = AuthDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException");
            cachedSerQNames.add(qName);
            cls = BadParametersException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequest");
            cachedSerQNames.add(qName);
            cls = BankCardTransferRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequestDTO");
            cachedSerQNames.add(qName);
            cls = BankCardTransferRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException");
            cachedSerQNames.add(qName);
            cls = CallRestrictionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "cancelProtectedTransferResultHolder");
            cachedSerQNames.add(qName);
            cls = CancelProtectedTransferResultHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException");
            cachedSerQNames.add(qName);
            cls = CardDoesNotExistException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException");
            cachedSerQNames.add(qName);
            cls = CardIsNotActiveException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException");
            cachedSerQNames.add(qName);
            cls = CardNumberIsNotValidException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "cardType");
            cachedSerQNames.add(qName);
            cls = CardType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeRequest");
            cachedSerQNames.add(qName);
            cls = CheckCurrencyExchangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeResultHolder");
            cachedSerQNames.add(qName);
            cls = CheckCurrencyExchangeResultHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CodeIsNotValidException");
            cachedSerQNames.add(qName);
            cls = CodeIsNotValidException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "coinName");
            cachedSerQNames.add(qName);
            cls = CoinName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "confirmCryptoCurrencyWithdrawalInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = ConfirmCryptoCurrencyWithdrawalInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CountLimitException");
            cachedSerQNames.add(qName);
            cls = CountLimitException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "createApiRequest");
            cachedSerQNames.add(qName);
            cls = CreateApiRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = CreateBitcoinInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceResult");
            cachedSerQNames.add(qName);
            cls = CreateBitcoinInvoiceResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "createCryptoCurrencyInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = CreateCryptoCurrencyInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "createCryptoCurrencyInvoiceResult");
            cachedSerQNames.add(qName);
            cls = CreateCryptoCurrencyInvoiceResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyDepositPaymentStatus");
            cachedSerQNames.add(qName);
            cls = CryptoCurrencyDepositPaymentStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceDTO");
            cachedSerQNames.add(qName);
            cls = CryptoCurrencyWithdrawalInvoiceDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "cryptoCurrencyWithdrawalInvoiceStatus");
            cachedSerQNames.add(qName);
            cls = CryptoCurrencyWithdrawalInvoiceStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "currency");
            cachedSerQNames.add(qName);
            cls = Currency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeAction");
            cachedSerQNames.add(qName);
            cls = CurrencyExchangeAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeRequest");
            cachedSerQNames.add(qName);
            cls = CurrencyExchangeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException");
            cachedSerQNames.add(qName);
            cls = DatabaseException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "dateIntervals");
            cachedSerQNames.add(qName);
            cls = DateIntervals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "depositPaymentMethodType");
            cachedSerQNames.add(qName);
            cls = DepositPaymentMethodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException");
            cachedSerQNames.add(qName);
            cls = DuplicateOrderIdException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "ecurrency");
            cachedSerQNames.add(qName);
            cls = Ecurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException");
            cachedSerQNames.add(qName);
            cls = EmailAlreadyExistException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransferRequestDTO");
            cachedSerQNames.add(qName);
            cls = EmailTransferRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "exceptionType");
            cachedSerQNames.add(qName);
            cls = ExceptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException");
            cachedSerQNames.add(qName);
            cls = ExchangeCurrencyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "externalSystemWithdrawalType");
            cachedSerQNames.add(qName);
            cls = ExternalSystemWithdrawalType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException");
            cachedSerQNames.add(qName);
            cls = InternalException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException");
            cachedSerQNames.add(qName);
            cls = JAXBException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException");
            cachedSerQNames.add(qName);
            cls = LifetimeLimitException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException");
            cachedSerQNames.add(qName);
            cls = LimitPerCardPerDayException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException");
            cachedSerQNames.add(qName);
            cls = LimitPerDayException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException");
            cachedSerQNames.add(qName);
            cls = LimitPerMonthException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException");
            cachedSerQNames.add(qName);
            cls = LimitPerTransactionException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException");
            cachedSerQNames.add(qName);
            cls = LimitsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantAPITransactionFilter");
            cachedSerQNames.add(qName);
            cls = MerchantAPITransactionFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException");
            cachedSerQNames.add(qName);
            cls = MerchantDisabledException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "moneyRequest");
            cachedSerQNames.add(qName);
            cls = MoneyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException");
            cachedSerQNames.add(qName);
            cls = NotAuthException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException");
            cachedSerQNames.add(qName);
            cls = NotAvailableDepositSystemException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException");
            cachedSerQNames.add(qName);
            cls = NotEnoughMoneyApiException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException");
            cachedSerQNames.add(qName);
            cls = NotEnoughMoneyException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException");
            cachedSerQNames.add(qName);
            cls = NotSupportedBankBinException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException");
            cachedSerQNames.add(qName);
            cls = NotSupportedCountryException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "operationResult");
            cachedSerQNames.add(qName);
            cls = advcash.wsm.OperationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "outcomingTransactionDTO");
            cachedSerQNames.add(qName);
            cls = OutcomingTransactionDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "paymentOrderRequest");
            cachedSerQNames.add(qName);
            cls = advcash.wsm.PaymentOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "paymentOrderResult");
            cachedSerQNames.add(qName);
            cls = advcash.wsm.PaymentOrderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "paymentRequestStatus");
            cachedSerQNames.add(qName);
            cls = advcash.wsm.PaymentRequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException");
            cachedSerQNames.add(qName);
            cls = RegistrationException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "registrationRequest");
            cachedSerQNames.add(qName);
            cls = RegistrationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sciAllowedPaymentSystems");
            cachedSerQNames.add(qName);
            cls = advcash.wsm.SciAllowedPaymentSystems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest");
            cachedSerQNames.add(qName);
            cls = SendMoneyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToEcoinEUResultHolder");
            cachedSerQNames.add(qName);
            cls = advcash.wsm.SendMoneyToEcoinEUResultHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToExmoResultHolder");
            cachedSerQNames.add(qName);
            cls = SendMoneyToExmoResultHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToMarketResultHolder");
            cachedSerQNames.add(qName);
            cls = SendMoneyToMarketResultHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToWexResultHolder");
            cachedSerQNames.add(qName);
            cls = SendMoneyToWexResultHolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sortOrder");
            cachedSerQNames.add(qName);
            cls = SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "supportedLanguage");
            cachedSerQNames.add(qName);
            cls = SupportedLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transactionDirection");
            cachedSerQNames.add(qName);
            cls = TransactionDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException");
            cachedSerQNames.add(qName);
            cls = TransactionFailureException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException");
            cachedSerQNames.add(qName);
            cls = TransactionIsNotAvailableException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transactionName");
            cachedSerQNames.add(qName);
            cls = TransactionName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transactionStatus");
            cachedSerQNames.add(qName);
            cls = TransactionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException");
            cachedSerQNames.add(qName);
            cls = TransactionTemporaryNotAvailableException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO");
            cachedSerQNames.add(qName);
            cls = TransferRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "typeOfTransaction");
            cachedSerQNames.add(qName);
            cls = TypeOfTransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException");
            cachedSerQNames.add(qName);
            cls = UserBlockedException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException");
            cachedSerQNames.add(qName);
            cls = UserDoesNotExistException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountRequestDTO");
            cachedSerQNames.add(qName);
            cls = ValidateAccountRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountResultDTO");
            cachedSerQNames.add(qName);
            cls = ValidateAccountResultDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "verificationStatus");
            cachedSerQNames.add(qName);
            cls = VerificationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "walletBalanceDTO");
            cachedSerQNames.add(qName);
            cls = WalletBalanceDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException");
            cachedSerQNames.add(qName);
            cls = WalletCurrencyIncorrectException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist");
            cachedSerQNames.add(qName);
            cls = WalletDoesNotExist.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawalThroughExternalPaymentSystemRequestDTO");
            cachedSerQNames.add(qName);
            cls = WithdrawalThroughExternalPaymentSystemRequestDTO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest");
            cachedSerQNames.add(qName);
            cls = WithdrawToEcurrencyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException");
            cachedSerQNames.add(qName);
            cls = WrongEmailException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException");
            cachedSerQNames.add(qName);
            cls = WrongIpException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException");
            cachedSerQNames.add(qName);
            cls = WrongParamsException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                 cachedSerFactories.get(i);
                            Class df = (Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void validationSendMoneyToAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToAdvcashCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdvcashCardMaxAllowedBalanceExceededException) {
              throw (AdvcashCardMaxAllowedBalanceExceededException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CountLimitException) {
              throw (CountLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardIsNotActiveException) {
              throw (CardIsNotActiveException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerCardPerDayException) {
              throw (LimitPerCardPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LifetimeLimitException) {
              throw (LifetimeLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardDoesNotExistException) {
              throw (CardDoesNotExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public advcash.wsm.SendMoneyToEcoinEUResultHolder sendMoneyToEcoinEU(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToEcoinEU"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (advcash.wsm.SendMoneyToEcoinEUResultHolder) _resp;
            } catch (Exception _exception) {
                return (advcash.wsm.SendMoneyToEcoinEUResultHolder) org.apache.axis.utils.JavaUtils.convert(_resp, advcash.wsm.SendMoneyToEcoinEUResultHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationCurrencyExchange(AuthDTO arg0, CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationCurrencyExchange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OutcomingTransactionDTO[] history(AuthDTO arg0, MerchantAPITransactionFilter arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "history"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OutcomingTransactionDTO[]) _resp;
            } catch (Exception _exception) {
                return (OutcomingTransactionDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, OutcomingTransactionDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public ValidateAccountResultDTO validateAccount(AuthDTO arg0, ValidateAccountRequestDTO arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, UserDoesNotExistException, WrongParamsException, DatabaseException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (ValidateAccountResultDTO) _resp;
            } catch (Exception _exception) {
                return (ValidateAccountResultDTO) org.apache.axis.utils.JavaUtils.convert(_resp, ValidateAccountResultDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserDoesNotExistException) {
              throw (UserDoesNotExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public AccountPresentDTO[] validateAccounts(AuthDTO arg0, String[] arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccounts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (AccountPresentDTO[]) _resp;
            } catch (Exception _exception) {
                return (AccountPresentDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, AccountPresentDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validateCurrencyExchange(AuthDTO arg0, TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateCurrencyExchange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1, new Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SendMoneyToExmoResultHolder sendMoneyToExmo(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToExmo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SendMoneyToExmoResultHolder) _resp;
            } catch (Exception _exception) {
                return (SendMoneyToExmoResultHolder) org.apache.axis.utils.JavaUtils.convert(_resp, SendMoneyToExmoResultHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void register(AuthDTO arg0, RegistrationRequest arg1) throws java.rmi.RemoteException, RegistrationException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, EmailAlreadyExistException, InternalException, BadParametersException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "register"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof RegistrationException) {
              throw (RegistrationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof EmailAlreadyExistException) {
              throw (EmailAlreadyExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationSendMoneyToWex(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToWex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public OutcomingTransactionDTO findTransaction(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "findTransaction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (OutcomingTransactionDTO) _resp;
            } catch (Exception _exception) {
                return (OutcomingTransactionDTO) org.apache.axis.utils.JavaUtils.convert(_resp, OutcomingTransactionDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String confirmCryptoCurrencyWithdrawalInvoice(AuthDTO arg0, ConfirmCryptoCurrencyWithdrawalInvoiceRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "confirmCryptoCurrencyWithdrawalInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JAXBException) {
              throw (JAXBException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceByOrderId(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, LimitsException, NotAuthException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, DatabaseException, InternalException, BadParametersException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "findCryptoCurrencyWithdrawalInvoiceByOrderId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CryptoCurrencyWithdrawalInvoiceDTO) _resp;
            } catch (Exception _exception) {
                return (CryptoCurrencyWithdrawalInvoiceDTO) org.apache.axis.utils.JavaUtils.convert(_resp, CryptoCurrencyWithdrawalInvoiceDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String makeCurrencyExchange(AuthDTO arg0, TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "makeCurrencyExchange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1, new Boolean(arg2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String sendMoneyToEmail(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongEmailException) {
              throw (WrongEmailException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof EmailAlreadyExistException) {
              throw (EmailAlreadyExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationSendMoneyToBankCard(AuthDTO arg0, BankCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, NotSupportedBankBinException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, NotSupportedCountryException, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToBankCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotSupportedBankBinException) {
              throw (NotSupportedBankBinException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardNumberIsNotValidException) {
              throw (CardNumberIsNotValidException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdditionalDataRequiredException) {
              throw (AdditionalDataRequiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotSupportedCountryException) {
              throw (NotSupportedCountryException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String sendMoneyToAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToAdvcashCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdvcashCardMaxAllowedBalanceExceededException) {
              throw (AdvcashCardMaxAllowedBalanceExceededException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CountLimitException) {
              throw (CountLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardIsNotActiveException) {
              throw (CardIsNotActiveException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerCardPerDayException) {
              throw (LimitPerCardPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LifetimeLimitException) {
              throw (LifetimeLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardDoesNotExistException) {
              throw (CardDoesNotExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String transferBankCard(AuthDTO arg0, BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "transferBankCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardNumberIsNotValidException) {
              throw (CardNumberIsNotValidException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdditionalDataRequiredException) {
              throw (AdditionalDataRequiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String currencyExchange(AuthDTO arg0, CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String sendMoney(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoney"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletCurrencyIncorrectException) {
              throw (WalletCurrencyIncorrectException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationSendMoneyToEcurrency(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToEcurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String sendMoneyToEcurrency(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToEcurrency"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String transferAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, UserBlockedException, WrongIpException, UserDoesNotExistException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "transferAdvcashCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdvcashCardMaxAllowedBalanceExceededException) {
              throw (AdvcashCardMaxAllowedBalanceExceededException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CountLimitException) {
              throw (CountLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserDoesNotExistException) {
              throw (UserDoesNotExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardIsNotActiveException) {
              throw (CardIsNotActiveException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerCardPerDayException) {
              throw (LimitPerCardPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LifetimeLimitException) {
              throw (LifetimeLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardDoesNotExistException) {
              throw (CardDoesNotExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CryptoCurrencyWithdrawalInvoiceDTO createCryptoCurrencyWithdrawalInvoice(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "createCryptoCurrencyWithdrawalInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CryptoCurrencyWithdrawalInvoiceDTO) _resp;
            } catch (Exception _exception) {
                return (CryptoCurrencyWithdrawalInvoiceDTO) org.apache.axis.utils.JavaUtils.convert(_resp, CryptoCurrencyWithdrawalInvoiceDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JAXBException) {
              throw (JAXBException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validateBankCardTransfer(AuthDTO arg0, BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateBankCardTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardNumberIsNotValidException) {
              throw (CardNumberIsNotValidException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdditionalDataRequiredException) {
              throw (AdditionalDataRequiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String emailTransfer(AuthDTO arg0, EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerMonthException, LimitPerTransactionException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongEmailException) {
              throw (WrongEmailException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof EmailAlreadyExistException) {
              throw (EmailAlreadyExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String makeTransfer(AuthDTO arg0, TypeOfTransaction arg1, TransferRequestDTO arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, CodeIsNotValidException, DatabaseException, ExchangeCurrencyException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "makeTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletCurrencyIncorrectException) {
              throw (WalletCurrencyIncorrectException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CodeIsNotValidException) {
              throw (CodeIsNotValidException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationSendMoneyToEmail(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongEmailException) {
              throw (WrongEmailException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof EmailAlreadyExistException) {
              throw (EmailAlreadyExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String withdrawalThroughExternalPaymentSystem(AuthDTO arg0, WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawalThroughExternalPaymentSystem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public String sendMoneyToBankCard(AuthDTO arg0, BankCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, NotSupportedBankBinException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, NotSupportedCountryException, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToBankCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (String) _resp;
            } catch (Exception _exception) {
                return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotSupportedBankBinException) {
              throw (NotSupportedBankBinException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardNumberIsNotValidException) {
              throw (CardNumberIsNotValidException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdditionalDataRequiredException) {
              throw (AdditionalDataRequiredException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotSupportedCountryException) {
              throw (NotSupportedCountryException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationSendMoneyToEcoinEU(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToEcoinEU"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationSendMoneyToExmo(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToExmo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validateAdvcashCardTransfer(AuthDTO arg0, AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, UserBlockedException, WrongIpException, UserDoesNotExistException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAdvcashCardTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AdvcashCardMaxAllowedBalanceExceededException) {
              throw (AdvcashCardMaxAllowedBalanceExceededException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CountLimitException) {
              throw (CountLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserDoesNotExistException) {
              throw (UserDoesNotExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardIsNotActiveException) {
              throw (CardIsNotActiveException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerCardPerDayException) {
              throw (LimitPerCardPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LifetimeLimitException) {
              throw (LifetimeLimitException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CardDoesNotExistException) {
              throw (CardDoesNotExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public advcash.wsm.PaymentOrderResult findPaymentByOrderId(AuthDTO arg0, advcash.wsm.PaymentOrderRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "findPaymentByOrderId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (advcash.wsm.PaymentOrderResult) _resp;
            } catch (Exception _exception) {
                return (advcash.wsm.PaymentOrderResult) org.apache.axis.utils.JavaUtils.convert(_resp, advcash.wsm.PaymentOrderResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAvailableDepositSystemException) {
              throw (NotAvailableDepositSystemException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JAXBException) {
              throw (JAXBException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DuplicateOrderIdException) {
              throw (DuplicateOrderIdException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceById(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, LimitsException, NotAuthException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, DatabaseException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "findCryptoCurrencyWithdrawalInvoiceById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CryptoCurrencyWithdrawalInvoiceDTO) _resp;
            } catch (Exception _exception) {
                return (CryptoCurrencyWithdrawalInvoiceDTO) org.apache.axis.utils.JavaUtils.convert(_resp, CryptoCurrencyWithdrawalInvoiceDTO.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validateWithdrawalThroughExternalPaymentSystem(AuthDTO arg0, WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateWithdrawalThroughExternalPaymentSystem"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CancelProtectedTransferResultHolder cancelProtectedTransfer(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, TransactionFailureException, AccessDeniedException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "cancelProtectedTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CancelProtectedTransferResultHolder) _resp;
            } catch (Exception _exception) {
                return (CancelProtectedTransferResultHolder) org.apache.axis.utils.JavaUtils.convert(_resp, CancelProtectedTransferResultHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void createApi(AuthDTO arg0, CreateApiRequest arg1) throws java.rmi.RemoteException, RegistrationException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, EmailAlreadyExistException, InternalException, BadParametersException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "createApi"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof RegistrationException) {
              throw (RegistrationException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof EmailAlreadyExistException) {
              throw (EmailAlreadyExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CreateCryptoCurrencyInvoiceResult createCryptoCurrencyInvoice(AuthDTO arg0, CreateCryptoCurrencyInvoiceRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "createCryptoCurrencyInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateCryptoCurrencyInvoiceResult) _resp;
            } catch (Exception _exception) {
                return (CreateCryptoCurrencyInvoiceResult) org.apache.axis.utils.JavaUtils.convert(_resp, CreateCryptoCurrencyInvoiceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAvailableDepositSystemException) {
              throw (NotAvailableDepositSystemException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JAXBException) {
              throw (JAXBException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DuplicateOrderIdException) {
              throw (DuplicateOrderIdException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validateEmailTransfer(AuthDTO arg0, EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerMonthException, LimitPerTransactionException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateEmailTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongEmailException) {
              throw (WrongEmailException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof EmailAlreadyExistException) {
              throw (EmailAlreadyExistException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validateTransfer(AuthDTO arg0, TypeOfTransaction arg1, TransferRequestDTO arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateTransfer"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1, arg2});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletCurrencyIncorrectException) {
              throw (WalletCurrencyIncorrectException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void validationSendMoney(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoney"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletCurrencyIncorrectException) {
              throw (WalletCurrencyIncorrectException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CreateBitcoinInvoiceResult createBitcoinInvoice(AuthDTO arg0, CreateBitcoinInvoiceRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CreateBitcoinInvoiceResult) _resp;
            } catch (Exception _exception) {
                return (CreateBitcoinInvoiceResult) org.apache.axis.utils.JavaUtils.convert(_resp, CreateBitcoinInvoiceResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAvailableDepositSystemException) {
              throw (NotAvailableDepositSystemException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof JAXBException) {
              throw (JAXBException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DuplicateOrderIdException) {
              throw (DuplicateOrderIdException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public CheckCurrencyExchangeResultHolder checkCurrencyExchange(AuthDTO arg0, CheckCurrencyExchangeRequest arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, NotAuthException, MerchantDisabledException, UserBlockedException, WrongIpException, DatabaseException, WrongParamsException, BadParametersException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (CheckCurrencyExchangeResultHolder) _resp;
            } catch (Exception _exception) {
                return (CheckCurrencyExchangeResultHolder) org.apache.axis.utils.JavaUtils.convert(_resp, CheckCurrencyExchangeResultHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public WalletBalanceDTO[] getBalances(AuthDTO arg0) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "getBalances"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (WalletBalanceDTO[]) _resp;
            } catch (Exception _exception) {
                return (WalletBalanceDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, WalletBalanceDTO[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitsException) {
              throw (LimitsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof CallRestrictionException) {
              throw (CallRestrictionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public SendMoneyToWexResultHolder sendMoneyToWex(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToWex"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {arg0, arg1});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SendMoneyToWexResultHolder) _resp;
            } catch (Exception _exception) {
                return (SendMoneyToWexResultHolder) org.apache.axis.utils.JavaUtils.convert(_resp, SendMoneyToWexResultHolder.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionTemporaryNotAvailableException) {
              throw (TransactionTemporaryNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionIsNotAvailableException) {
              throw (TransactionIsNotAvailableException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof AccessDeniedException) {
              throw (AccessDeniedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof MerchantDisabledException) {
              throw (MerchantDisabledException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongIpException) {
              throw (WrongIpException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof UserBlockedException) {
              throw (UserBlockedException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WrongParamsException) {
              throw (WrongParamsException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerTransactionException) {
              throw (LimitPerTransactionException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerMonthException) {
              throw (LimitPerMonthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof InternalException) {
              throw (InternalException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof BadParametersException) {
              throw (BadParametersException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof TransactionFailureException) {
              throw (TransactionFailureException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyException) {
              throw (NotEnoughMoneyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotAuthException) {
              throw (NotAuthException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof NotEnoughMoneyApiException) {
              throw (NotEnoughMoneyApiException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof WalletDoesNotExist) {
              throw (WalletDoesNotExist) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof DatabaseException) {
              throw (DatabaseException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ExchangeCurrencyException) {
              throw (ExchangeCurrencyException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof LimitPerDayException) {
              throw (LimitPerDayException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof ApiException) {
              throw (ApiException) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
