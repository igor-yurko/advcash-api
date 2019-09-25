/**
 * MerchantWebServiceSoapBindingStub.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package advcash.wsm;

public class MerchantWebServiceSoapBindingStub extends org.apache.axis.client.Stub implements advcash.wsm.MerchantWebService_PortType {
	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();
	
	static org.apache.axis.description.OperationDesc[] _operations;
	
	static {
		_operations = new org.apache.axis.description.OperationDesc[36];
		_initOperationDesc1();
		_initOperationDesc2();
		_initOperationDesc3();
		_initOperationDesc4();
	}
	
	private static void _initOperationDesc1() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationSendMoneyToAdvcashCard");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequest"),
															  advcash.wsm.AdvcashCardTransferRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																"advcash.wsm.CardIsNotActiveException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																"advcash.wsm.LimitPerCardPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																"advcash.wsm.LifetimeLimitException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																"advcash.wsm.CardDoesNotExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[0] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationCurrencyExchange");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeRequest"),
															  advcash.wsm.CurrencyExchangeRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[1] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("history");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantAPITransactionFilter"),
															  advcash.wsm.MerchantAPITransactionFilter.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "outcomingTransactionDTO"));
		oper.setReturnClass(advcash.wsm.OutcomingTransactionDTO[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		_operations[2] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateAccount");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountRequestDTO"),
															  advcash.wsm.ValidateAccountRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountResultDTO"));
		oper.setReturnClass(advcash.wsm.ValidateAccountResultDTO.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
																"advcash.wsm.UserDoesNotExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		_operations[3] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateCurrencyExchange");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"),
															  advcash.wsm.TransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"),
															  boolean.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[4] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateAccounts");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
															  java.lang.String[].class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "accountPresentDTO"));
		oper.setReturnClass(advcash.wsm.AccountPresentDTO[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		_operations[5] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("sendMoneyToExmo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"),
															  advcash.wsm.WithdrawToEcurrencyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToExmoResultHolder"));
		oper.setReturnClass(advcash.wsm.SendMoneyToExmoResultHolder.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[6] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("register");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "registrationRequest"),
															  advcash.wsm.RegistrationRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException"),
																"advcash.wsm.RegistrationException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																"advcash.wsm.EmailAlreadyExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		_operations[7] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationSendMoneyToWex");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"),
															  advcash.wsm.WithdrawToEcurrencyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[8] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("findTransaction");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"),
															  java.lang.String.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "outcomingTransactionDTO"));
		oper.setReturnClass(advcash.wsm.OutcomingTransactionDTO.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		_operations[9] = oper;
		
	}
	
	private static void _initOperationDesc2() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("makeCurrencyExchange");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"),
															  advcash.wsm.TransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"),
															  boolean.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[10] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("sendMoneyToEmail");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"),
															  advcash.wsm.SendMoneyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
																"advcash.wsm.WrongEmailException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																"advcash.wsm.EmailAlreadyExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[11] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationSendMoneyToBankCard");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequest"),
															  advcash.wsm.BankCardTransferRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
																"advcash.wsm.NotSupportedBankBinException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																"advcash.wsm.CardNumberIsNotValidException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  "advcash.wsm.AdditionalDataRequiredException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
																"advcash.wsm.NotSupportedCountryException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[12] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("sendMoneyToAdvcashCard");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequest"),
															  advcash.wsm.AdvcashCardTransferRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																"advcash.wsm.CardIsNotActiveException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																"advcash.wsm.LimitPerCardPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																"advcash.wsm.LifetimeLimitException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																"advcash.wsm.CardDoesNotExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[13] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("transferBankCard");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequestDTO"),
															  advcash.wsm.BankCardTransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																"advcash.wsm.CardNumberIsNotValidException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  "advcash.wsm.AdditionalDataRequiredException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[14] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("currencyExchange");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeRequest"),
															  advcash.wsm.CurrencyExchangeRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[15] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("sendMoney");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"),
															  advcash.wsm.SendMoneyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  "advcash.wsm.WalletCurrencyIncorrectException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[16] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationSendMoneyToEcurrency");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"),
															  advcash.wsm.WithdrawToEcurrencyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[17] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("sendMoneyToEcurrency");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"),
															  advcash.wsm.WithdrawToEcurrencyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[18] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("transferAdvcashCard");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequestDTO"),
															  advcash.wsm.AdvcashCardTransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
																"advcash.wsm.UserDoesNotExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																"advcash.wsm.CardIsNotActiveException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																"advcash.wsm.LimitPerCardPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																"advcash.wsm.LifetimeLimitException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																"advcash.wsm.CardDoesNotExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[19] = oper;
		
	}
	
	private static void _initOperationDesc3() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateBankCardTransfer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequestDTO"),
															  advcash.wsm.BankCardTransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																"advcash.wsm.CardNumberIsNotValidException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  "advcash.wsm.AdditionalDataRequiredException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[20] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("makeTransfer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "typeOfTransaction"),
															  advcash.wsm.TypeOfTransaction.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"),
															  advcash.wsm.TransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  "advcash.wsm.WalletCurrencyIncorrectException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CodeIsNotValidException"),
																"advcash.wsm.CodeIsNotValidException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CodeIsNotValidException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[21] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("emailTransfer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransferRequestDTO"),
															  advcash.wsm.EmailTransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
																"advcash.wsm.WrongEmailException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																"advcash.wsm.EmailAlreadyExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[22] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationSendMoneyToEmail");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"),
															  advcash.wsm.SendMoneyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
																"advcash.wsm.WrongEmailException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																"advcash.wsm.EmailAlreadyExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[23] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("withdrawalThroughExternalPaymentSystem");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/",
																							"withdrawalThroughExternalPaymentSystemRequestDTO"),
															  advcash.wsm.WithdrawalThroughExternalPaymentSystemRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[24] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("sendMoneyToBankCard");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequest"),
															  advcash.wsm.BankCardTransferRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		oper.setReturnClass(java.lang.String.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
																"advcash.wsm.NotSupportedBankBinException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																"advcash.wsm.CardNumberIsNotValidException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  "advcash.wsm.AdditionalDataRequiredException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
																"advcash.wsm.NotSupportedCountryException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[25] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationSendMoneyToExmo");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"),
															  advcash.wsm.WithdrawToEcurrencyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[26] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateAdvcashCardTransfer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequestDTO"),
															  advcash.wsm.AdvcashCardTransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
																"advcash.wsm.UserDoesNotExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																"advcash.wsm.CardIsNotActiveException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																"advcash.wsm.LimitPerCardPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																"advcash.wsm.LifetimeLimitException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																"advcash.wsm.CardDoesNotExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[27] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateWithdrawalThroughExternalPaymentSystem");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/",
																							"withdrawalThroughExternalPaymentSystemRequestDTO"),
															  advcash.wsm.WithdrawalThroughExternalPaymentSystemRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[28] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateEmailTransfer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransferRequestDTO"),
															  advcash.wsm.EmailTransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"),
																"advcash.wsm.WrongEmailException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																"advcash.wsm.EmailAlreadyExistException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[29] = oper;
		
	}
	
	private static void _initOperationDesc4() {
		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validateTransfer");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "typeOfTransaction"),
															  advcash.wsm.TypeOfTransaction.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO"),
															  advcash.wsm.TransferRequestDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  "advcash.wsm.WalletCurrencyIncorrectException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[30] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("validationSendMoney");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest"),
															  advcash.wsm.SendMoneyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  "advcash.wsm.WalletCurrencyIncorrectException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		_operations[31] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("createBitcoinInvoice");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceRequest"),
															  advcash.wsm.CreateBitcoinInvoiceRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceResult"));
		oper.setReturnClass(advcash.wsm.CreateBitcoinInvoiceResult.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
														  "advcash.wsm.NotAvailableDepositSystemException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"),
																"advcash.wsm.JAXBException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
																"advcash.wsm.DuplicateOrderIdException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[32] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("checkCurrencyExchange");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeRequest"),
															  advcash.wsm.CheckCurrencyExchangeRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeResultHolder"));
		oper.setReturnClass(advcash.wsm.CheckCurrencyExchangeResultHolder.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		_operations[33] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getBalances");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "walletBalanceDTO"));
		oper.setReturnClass(advcash.wsm.WalletBalanceDTO[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"),
																"advcash.wsm.LimitsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																"advcash.wsm.CallRestrictionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		_operations[34] = oper;
		
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("sendMoneyToWex");
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO"),
															  advcash.wsm.AuthDTO.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN,
															  new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest"),
															  advcash.wsm.WithdrawToEcurrencyRequest.class, false, false);
		param.setOmittable(true);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToWexResultHolder"));
		oper.setReturnClass(advcash.wsm.SendMoneyToWexResultHolder.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
		oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
		oper.setUse(org.apache.axis.constants.Use.LITERAL);
		oper.addFault(new org.apache.axis.description.FaultDesc(
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"),
				"advcash.wsm.TransactionTemporaryNotAvailableException",
				new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException"), true));
		oper.addFault(
				new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  "advcash.wsm.TransactionIsNotAvailableException",
														  new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException"),
														  true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"),
																"advcash.wsm.AccessDeniedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																"advcash.wsm.MerchantDisabledException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"),
																"advcash.wsm.WrongIpException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"),
																"advcash.wsm.UserBlockedException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"),
																"advcash.wsm.WrongParamsException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																"advcash.wsm.LimitPerTransactionException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																"advcash.wsm.LimitPerMonthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"),
																"advcash.wsm.InternalException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																"advcash.wsm.BadParametersException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																"advcash.wsm.TransactionFailureException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																"advcash.wsm.NotEnoughMoneyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"),
																"advcash.wsm.NotAuthException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																"advcash.wsm.NotEnoughMoneyApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"),
																"advcash.wsm.WalletDoesNotExist",
																new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"),
																"advcash.wsm.DatabaseException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																"advcash.wsm.ExchangeCurrencyException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException"),
																true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"),
																"advcash.wsm.LimitPerDayException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException"), true));
		oper.addFault(new org.apache.axis.description.FaultDesc(new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"),
																"advcash.wsm.ApiException",
																new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException"), true));
		_operations[35] = oper;
		
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
		((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "abstractBaseDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.AbstractBaseDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "AccessDeniedException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.AccessDeniedException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "accountPresentDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.AccountPresentDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "AdditionalDataRequiredException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.AdditionalDataRequiredException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.AdvcashCardTransferRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "advcashCardTransferRequestDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.AdvcashCardTransferRequestDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "ApiException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.ApiException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "authDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.AuthDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "BadParametersException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.BadParametersException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.BankCardTransferRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "bankCardTransferRequestDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.BankCardTransferRequestDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CallRestrictionException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CallRestrictionException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CardDoesNotExistException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CardDoesNotExistException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CardIsNotActiveException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CardIsNotActiveException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CardNumberIsNotValidException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CardNumberIsNotValidException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "cardType");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CardType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CheckCurrencyExchangeRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchangeResultHolder");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CheckCurrencyExchangeResultHolder.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "CodeIsNotValidException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CodeIsNotValidException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CreateBitcoinInvoiceRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoiceResult");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CreateBitcoinInvoiceResult.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "currency");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.Currency.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeAction");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CurrencyExchangeAction.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchangeRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.CurrencyExchangeRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "DatabaseException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.DatabaseException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "DuplicateOrderIdException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.DuplicateOrderIdException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "ecurrency");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.Ecurrency.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "EmailAlreadyExistException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.EmailAlreadyExistException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransferRequestDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.EmailTransferRequestDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "exceptionType");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.ExceptionType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "ExchangeCurrencyException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.ExchangeCurrencyException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "externalSystemWithdrawalType");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.ExternalSystemWithdrawalType.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "InternalException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.InternalException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "JAXBException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.JAXBException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LifetimeLimitException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.LifetimeLimitException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerCardPerDayException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.LimitPerCardPerDayException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerDayException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.LimitPerDayException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerMonthException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.LimitPerMonthException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitPerTransactionException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.LimitPerTransactionException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "LimitsException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.LimitsException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantAPITransactionFilter");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.MerchantAPITransactionFilter.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "MerchantDisabledException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.MerchantDisabledException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "moneyRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.MoneyRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotAuthException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.NotAuthException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotAvailableDepositSystemException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.NotAvailableDepositSystemException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyApiException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.NotEnoughMoneyApiException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotEnoughMoneyException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.NotEnoughMoneyException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedBankBinException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.NotSupportedBankBinException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "NotSupportedCountryException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.NotSupportedCountryException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "outcomingTransactionDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.OutcomingTransactionDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "RegistrationException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.RegistrationException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "registrationRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.RegistrationRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.SendMoneyRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToExmoResultHolder");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.SendMoneyToExmoResultHolder.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToMarketResultHolder");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.SendMoneyToMarketResultHolder.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToWexResultHolder");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.SendMoneyToWexResultHolder.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "sortOrder");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.SortOrder.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "supportedLanguage");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.SupportedLanguage.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transactionDirection");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TransactionDirection.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionFailureException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TransactionFailureException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionIsNotAvailableException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TransactionIsNotAvailableException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transactionName");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TransactionName.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transactionStatus");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TransactionStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "TransactionTemporaryNotAvailableException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TransactionTemporaryNotAvailableException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "transferRequestDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TransferRequestDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "typeOfTransaction");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.TypeOfTransaction.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "UserBlockedException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.UserBlockedException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "UserDoesNotExistException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.UserDoesNotExistException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountRequestDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.ValidateAccountRequestDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccountResultDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.ValidateAccountResultDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "verificationStatus");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.VerificationStatus.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(enumsf);
		cachedDeserFactories.add(enumdf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "walletBalanceDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WalletBalanceDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WalletCurrencyIncorrectException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WalletCurrencyIncorrectException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WalletDoesNotExist");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WalletDoesNotExist.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawalThroughExternalPaymentSystemRequestDTO");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WithdrawalThroughExternalPaymentSystemRequestDTO.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawToEcurrencyRequest");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WithdrawToEcurrencyRequest.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WrongEmailException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WrongEmailException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WrongIpException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WrongIpException.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);
		
		qName = new javax.xml.namespace.QName("http://wsm.advcash/", "WrongParamsException");
		cachedSerQNames.add(qName);
		cls = advcash.wsm.WrongParamsException.class;
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
				java.lang.String key = (java.lang.String) keys.nextElement();
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
						java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf = (java.lang.Class) cachedSerFactories.get(i);
							java.lang.Class df = (java.lang.Class) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						} else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories.get(i);
							org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories
									.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		} catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
		}
	}
	
	public void validationSendMoneyToAdvcashCard(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException,
				   advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.CardIsNotActiveException,
				   advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.LifetimeLimitException,
				   advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException {
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
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardIsNotActiveException) {
					throw (advcash.wsm.CardIsNotActiveException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerCardPerDayException) {
					throw (advcash.wsm.LimitPerCardPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LifetimeLimitException) {
					throw (advcash.wsm.LifetimeLimitException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardDoesNotExistException) {
					throw (advcash.wsm.CardDoesNotExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validationCurrencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.CurrencyExchangeRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationCurrencyExchange"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.OutcomingTransactionDTO[] history(advcash.wsm.AuthDTO arg0, advcash.wsm.MerchantAPITransactionFilter arg1)
			throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException,
				   advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "history"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.OutcomingTransactionDTO[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.OutcomingTransactionDTO[]) org.apache.axis.utils.JavaUtils
							.convert(_resp, advcash.wsm.OutcomingTransactionDTO[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.ValidateAccountResultDTO validateAccount(advcash.wsm.AuthDTO arg0, advcash.wsm.ValidateAccountRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException,
				   advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserDoesNotExistException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException,
				   advcash.wsm.InternalException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAccount"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.ValidateAccountResultDTO) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.ValidateAccountResultDTO) org.apache.axis.utils.JavaUtils
							.convert(_resp, advcash.wsm.ValidateAccountResultDTO.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserDoesNotExistException) {
					throw (advcash.wsm.UserDoesNotExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validateCurrencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.TransferRequestDTO arg1, boolean arg2)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateCurrencyExchange"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1, new java.lang.Boolean(arg2)});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.AccountPresentDTO[] validateAccounts(advcash.wsm.AuthDTO arg0, java.lang.String[] arg1)
			throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException,
				   advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException {
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
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.AccountPresentDTO[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.AccountPresentDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, advcash.wsm.AccountPresentDTO[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.SendMoneyToExmoResultHolder sendMoneyToExmo(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToExmo"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.SendMoneyToExmoResultHolder) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.SendMoneyToExmoResultHolder) org.apache.axis.utils.JavaUtils
							.convert(_resp, advcash.wsm.SendMoneyToExmoResultHolder.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void register(advcash.wsm.AuthDTO arg0, advcash.wsm.RegistrationRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.RegistrationException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException,
				   advcash.wsm.EmailAlreadyExistException, advcash.wsm.InternalException, advcash.wsm.BadParametersException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "register"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.RegistrationException) {
					throw (advcash.wsm.RegistrationException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.EmailAlreadyExistException) {
					throw (advcash.wsm.EmailAlreadyExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validationSendMoneyToWex(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToWex"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.OutcomingTransactionDTO findTransaction(advcash.wsm.AuthDTO arg0, java.lang.String arg1)
			throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException,
				   advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "findTransaction"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.OutcomingTransactionDTO) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.OutcomingTransactionDTO) org.apache.axis.utils.JavaUtils
							.convert(_resp, advcash.wsm.OutcomingTransactionDTO.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String makeCurrencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.TransferRequestDTO arg1, boolean arg2)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "makeCurrencyExchange"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1, new java.lang.Boolean(arg2)});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String sendMoneyToEmail(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToEmail"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongEmailException) {
					throw (advcash.wsm.WrongEmailException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.EmailAlreadyExistException) {
					throw (advcash.wsm.EmailAlreadyExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validationSendMoneyToBankCard(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.NotSupportedBankBinException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException,
				   advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException,
				   advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException,
				   advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException,
				   advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist,
				   advcash.wsm.NotSupportedCountryException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToBankCard"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotSupportedBankBinException) {
					throw (advcash.wsm.NotSupportedBankBinException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardNumberIsNotValidException) {
					throw (advcash.wsm.CardNumberIsNotValidException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AdditionalDataRequiredException) {
					throw (advcash.wsm.AdditionalDataRequiredException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotSupportedCountryException) {
					throw (advcash.wsm.NotSupportedCountryException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String sendMoneyToAdvcashCard(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException,
				   advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.CardIsNotActiveException,
				   advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.LifetimeLimitException,
				   advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToAdvcashCard"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardIsNotActiveException) {
					throw (advcash.wsm.CardIsNotActiveException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerCardPerDayException) {
					throw (advcash.wsm.LimitPerCardPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LifetimeLimitException) {
					throw (advcash.wsm.LifetimeLimitException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardDoesNotExistException) {
					throw (advcash.wsm.CardDoesNotExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String transferBankCard(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException, advcash.wsm.BadParametersException,
				   advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException,
				   advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "transferBankCard"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardNumberIsNotValidException) {
					throw (advcash.wsm.CardNumberIsNotValidException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AdditionalDataRequiredException) {
					throw (advcash.wsm.AdditionalDataRequiredException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String currencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.CurrencyExchangeRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException,
				   advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException,
				   advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "currencyExchange"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String sendMoney(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoney"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletCurrencyIncorrectException) {
					throw (advcash.wsm.WalletCurrencyIncorrectException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validationSendMoneyToEcurrency(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToEcurrency"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String sendMoneyToEcurrency(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToEcurrency"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String transferAdvcashCard(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserDoesNotExistException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.CardIsNotActiveException,
				   advcash.wsm.InternalException, advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException,
				   advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist,
				   advcash.wsm.LifetimeLimitException, advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "transferAdvcashCard"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserDoesNotExistException) {
					throw (advcash.wsm.UserDoesNotExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardIsNotActiveException) {
					throw (advcash.wsm.CardIsNotActiveException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerCardPerDayException) {
					throw (advcash.wsm.LimitPerCardPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LifetimeLimitException) {
					throw (advcash.wsm.LifetimeLimitException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardDoesNotExistException) {
					throw (advcash.wsm.CardDoesNotExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validateBankCardTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException, advcash.wsm.BadParametersException,
				   advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException,
				   advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateBankCardTransfer"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardNumberIsNotValidException) {
					throw (advcash.wsm.CardNumberIsNotValidException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AdditionalDataRequiredException) {
					throw (advcash.wsm.AdditionalDataRequiredException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String makeTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.TypeOfTransaction arg1, advcash.wsm.TransferRequestDTO arg2)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException,
				   advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException,
				   advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException,
				   advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.CodeIsNotValidException,
				   advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "makeTransfer"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1, arg2});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletCurrencyIncorrectException) {
					throw (advcash.wsm.WalletCurrencyIncorrectException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CodeIsNotValidException) {
					throw (advcash.wsm.CodeIsNotValidException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String emailTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.EmailTransferRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerMonthException,
				   advcash.wsm.LimitPerTransactionException, advcash.wsm.BadParametersException, advcash.wsm.InternalException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.EmailAlreadyExistException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "emailTransfer"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongEmailException) {
					throw (advcash.wsm.WrongEmailException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.EmailAlreadyExistException) {
					throw (advcash.wsm.EmailAlreadyExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validationSendMoneyToEmail(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToEmail"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongEmailException) {
					throw (advcash.wsm.WrongEmailException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.EmailAlreadyExistException) {
					throw (advcash.wsm.EmailAlreadyExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String withdrawalThroughExternalPaymentSystem(advcash.wsm.AuthDTO arg0,
																   advcash.wsm.WithdrawalThroughExternalPaymentSystemRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.InternalException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException,
				   advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist,
				   advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "withdrawalThroughExternalPaymentSystem"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public java.lang.String sendMoneyToBankCard(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.NotSupportedBankBinException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException,
				   advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException,
				   advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException,
				   advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException,
				   advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist,
				   advcash.wsm.NotSupportedCountryException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToBankCard"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (java.lang.String) _resp;
				} catch (java.lang.Exception _exception) {
					return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotSupportedBankBinException) {
					throw (advcash.wsm.NotSupportedBankBinException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardNumberIsNotValidException) {
					throw (advcash.wsm.CardNumberIsNotValidException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AdditionalDataRequiredException) {
					throw (advcash.wsm.AdditionalDataRequiredException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotSupportedCountryException) {
					throw (advcash.wsm.NotSupportedCountryException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validationSendMoneyToExmo(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoneyToExmo"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validateAdvcashCardTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserDoesNotExistException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.CardIsNotActiveException,
				   advcash.wsm.InternalException, advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException,
				   advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist,
				   advcash.wsm.LifetimeLimitException, advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException,
				   advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateAdvcashCardTransfer"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserDoesNotExistException) {
					throw (advcash.wsm.UserDoesNotExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardIsNotActiveException) {
					throw (advcash.wsm.CardIsNotActiveException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerCardPerDayException) {
					throw (advcash.wsm.LimitPerCardPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LifetimeLimitException) {
					throw (advcash.wsm.LifetimeLimitException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CardDoesNotExistException) {
					throw (advcash.wsm.CardDoesNotExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validateWithdrawalThroughExternalPaymentSystem(advcash.wsm.AuthDTO arg0,
															   advcash.wsm.WithdrawalThroughExternalPaymentSystemRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.InternalException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException,
				   advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist,
				   advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateWithdrawalThroughExternalPaymentSystem"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validateEmailTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.EmailTransferRequestDTO arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerMonthException,
				   advcash.wsm.LimitPerTransactionException, advcash.wsm.BadParametersException, advcash.wsm.InternalException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.EmailAlreadyExistException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateEmailTransfer"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongEmailException) {
					throw (advcash.wsm.WrongEmailException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.EmailAlreadyExistException) {
					throw (advcash.wsm.EmailAlreadyExistException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validateTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.TypeOfTransaction arg1, advcash.wsm.TransferRequestDTO arg2)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WrongIpException, advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException,
				   advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException,
				   advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException,
				   advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validateTransfer"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1, arg2});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletCurrencyIncorrectException) {
					throw (advcash.wsm.WalletCurrencyIncorrectException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public void validationSendMoney(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException,
				   advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "validationSendMoney"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletCurrencyIncorrectException) {
					throw (advcash.wsm.WalletCurrencyIncorrectException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.CreateBitcoinInvoiceResult createBitcoinInvoice(advcash.wsm.AuthDTO arg0, advcash.wsm.CreateBitcoinInvoiceRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.NotAvailableDepositSystemException, advcash.wsm.AccessDeniedException,
				   advcash.wsm.MerchantDisabledException, advcash.wsm.JAXBException, advcash.wsm.WrongIpException,
				   advcash.wsm.DuplicateOrderIdException, advcash.wsm.WrongParamsException, advcash.wsm.BadParametersException,
				   advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException,
				   advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "createBitcoinInvoice"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.CreateBitcoinInvoiceResult) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.CreateBitcoinInvoiceResult) org.apache.axis.utils.JavaUtils
							.convert(_resp, advcash.wsm.CreateBitcoinInvoiceResult.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAvailableDepositSystemException) {
					throw (advcash.wsm.NotAvailableDepositSystemException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.JAXBException) {
					throw (advcash.wsm.JAXBException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DuplicateOrderIdException) {
					throw (advcash.wsm.DuplicateOrderIdException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.CheckCurrencyExchangeResultHolder checkCurrencyExchange(advcash.wsm.AuthDTO arg0,
																			   advcash.wsm.CheckCurrencyExchangeRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.UserBlockedException, advcash.wsm.DatabaseException,
				   advcash.wsm.BadParametersException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "checkCurrencyExchange"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.CheckCurrencyExchangeResultHolder) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.CheckCurrencyExchangeResultHolder) org.apache.axis.utils.JavaUtils
							.convert(_resp, advcash.wsm.CheckCurrencyExchangeResultHolder.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.WalletBalanceDTO[] getBalances(advcash.wsm.AuthDTO arg0)
			throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException,
				   advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "getBalances"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.WalletBalanceDTO[]) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.WalletBalanceDTO[]) org.apache.axis.utils.JavaUtils.convert(_resp, advcash.wsm.WalletBalanceDTO[].class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitsException) {
					throw (advcash.wsm.LimitsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.CallRestrictionException) {
					throw (advcash.wsm.CallRestrictionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
	public advcash.wsm.SendMoneyToWexResultHolder sendMoneyToWex(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1)
			throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException,
				   advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException,
				   advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException,
				   advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException,
				   advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException,
				   advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException,
				   advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException {
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
		_call.setOperationName(new javax.xml.namespace.QName("http://wsm.advcash/", "sendMoneyToWex"));
		
		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[]{arg0, arg1});
			
			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			} else {
				extractAttachments(_call);
				try {
					return (advcash.wsm.SendMoneyToWexResultHolder) _resp;
				} catch (java.lang.Exception _exception) {
					return (advcash.wsm.SendMoneyToWexResultHolder) org.apache.axis.utils.JavaUtils
							.convert(_resp, advcash.wsm.SendMoneyToWexResultHolder.class);
				}
			}
		} catch (org.apache.axis.AxisFault axisFaultException) {
			if (axisFaultException.detail != null) {
				if (axisFaultException.detail instanceof java.rmi.RemoteException) {
					throw (java.rmi.RemoteException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionTemporaryNotAvailableException) {
					throw (advcash.wsm.TransactionTemporaryNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionIsNotAvailableException) {
					throw (advcash.wsm.TransactionIsNotAvailableException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.AccessDeniedException) {
					throw (advcash.wsm.AccessDeniedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.MerchantDisabledException) {
					throw (advcash.wsm.MerchantDisabledException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongIpException) {
					throw (advcash.wsm.WrongIpException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.UserBlockedException) {
					throw (advcash.wsm.UserBlockedException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WrongParamsException) {
					throw (advcash.wsm.WrongParamsException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerTransactionException) {
					throw (advcash.wsm.LimitPerTransactionException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerMonthException) {
					throw (advcash.wsm.LimitPerMonthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.InternalException) {
					throw (advcash.wsm.InternalException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.BadParametersException) {
					throw (advcash.wsm.BadParametersException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.TransactionFailureException) {
					throw (advcash.wsm.TransactionFailureException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyException) {
					throw (advcash.wsm.NotEnoughMoneyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotAuthException) {
					throw (advcash.wsm.NotAuthException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.NotEnoughMoneyApiException) {
					throw (advcash.wsm.NotEnoughMoneyApiException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.WalletDoesNotExist) {
					throw (advcash.wsm.WalletDoesNotExist) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.DatabaseException) {
					throw (advcash.wsm.DatabaseException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ExchangeCurrencyException) {
					throw (advcash.wsm.ExchangeCurrencyException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.LimitPerDayException) {
					throw (advcash.wsm.LimitPerDayException) axisFaultException.detail;
				}
				if (axisFaultException.detail instanceof advcash.wsm.ApiException) {
					throw (advcash.wsm.ApiException) axisFaultException.detail;
				}
			}
			throw axisFaultException;
		}
	}
	
}
