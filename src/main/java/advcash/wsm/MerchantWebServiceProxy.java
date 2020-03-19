package advcash.wsm;

public class MerchantWebServiceProxy implements MerchantWebService_PortType {
  private String _endpoint = null;
  private MerchantWebService_PortType merchantWebService_PortType = null;
  
  public MerchantWebServiceProxy() {
    _initMerchantWebServiceProxy();
  }
  
  public MerchantWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMerchantWebServiceProxy();
  }
  
  private void _initMerchantWebServiceProxy() {
    try {
      merchantWebService_PortType = (new MerchantWebService_ServiceLocator()).getMerchantWebServicePort();
      if (merchantWebService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)merchantWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)merchantWebService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (merchantWebService_PortType != null)
      ((javax.xml.rpc.Stub)merchantWebService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public MerchantWebService_PortType getMerchantWebService_PortType() {
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType;
  }
  
  public void validationSendMoneyToAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToAdvcashCard(arg0, arg1);
  }
  
  public advcash.wsm.SendMoneyToEcoinEUResultHolder sendMoneyToEcoinEU(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToEcoinEU(arg0, arg1);
  }
  
  public void validationCurrencyExchange(AuthDTO arg0, CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationCurrencyExchange(arg0, arg1);
  }
  
  public OutcomingTransactionDTO[] history(AuthDTO arg0, MerchantAPITransactionFilter arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.history(arg0, arg1);
  }
  
  public ValidateAccountResultDTO validateAccount(AuthDTO arg0, ValidateAccountRequestDTO arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, UserDoesNotExistException, WrongParamsException, DatabaseException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.validateAccount(arg0, arg1);
  }
  
  public AccountPresentDTO[] validateAccounts(AuthDTO arg0, String[] arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.validateAccounts(arg0, arg1);
  }
  
  public void validateCurrencyExchange(AuthDTO arg0, TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateCurrencyExchange(arg0, arg1, arg2);
  }
  
  public SendMoneyToExmoResultHolder sendMoneyToExmo(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToExmo(arg0, arg1);
  }
  
  public void register(AuthDTO arg0, RegistrationRequest arg1) throws java.rmi.RemoteException, RegistrationException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, EmailAlreadyExistException, InternalException, BadParametersException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.register(arg0, arg1);
  }
  
  public void validationSendMoneyToWex(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToWex(arg0, arg1);
  }
  
  public OutcomingTransactionDTO findTransaction(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findTransaction(arg0, arg1);
  }
  
  public String confirmCryptoCurrencyWithdrawalInvoice(AuthDTO arg0, ConfirmCryptoCurrencyWithdrawalInvoiceRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.confirmCryptoCurrencyWithdrawalInvoice(arg0, arg1);
  }
  
  public CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceByOrderId(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, LimitsException, NotAuthException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, DatabaseException, InternalException, BadParametersException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findCryptoCurrencyWithdrawalInvoiceByOrderId(arg0, arg1);
  }
  
  public String makeCurrencyExchange(AuthDTO arg0, TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.makeCurrencyExchange(arg0, arg1, arg2);
  }
  
  public String sendMoneyToEmail(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToEmail(arg0, arg1);
  }
  
  public void validationSendMoneyToBankCard(AuthDTO arg0, BankCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, NotSupportedBankBinException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, NotSupportedCountryException, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToBankCard(arg0, arg1);
  }
  
  public String sendMoneyToAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToAdvcashCard(arg0, arg1);
  }
  
  public String transferBankCard(AuthDTO arg0, BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.transferBankCard(arg0, arg1);
  }
  
  public String currencyExchange(AuthDTO arg0, CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.currencyExchange(arg0, arg1);
  }
  
  public String sendMoney(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoney(arg0, arg1);
  }
  
  public void validationSendMoneyToEcurrency(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToEcurrency(arg0, arg1);
  }
  
  public String sendMoneyToEcurrency(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToEcurrency(arg0, arg1);
  }
  
  public String transferAdvcashCard(AuthDTO arg0, AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, UserBlockedException, WrongIpException, UserDoesNotExistException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.transferAdvcashCard(arg0, arg1);
  }
  
  public CryptoCurrencyWithdrawalInvoiceDTO createCryptoCurrencyWithdrawalInvoice(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.createCryptoCurrencyWithdrawalInvoice(arg0, arg1);
  }
  
  public void validateBankCardTransfer(AuthDTO arg0, BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateBankCardTransfer(arg0, arg1);
  }
  
  public String emailTransfer(AuthDTO arg0, EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerMonthException, LimitPerTransactionException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.emailTransfer(arg0, arg1);
  }
  
  public String makeTransfer(AuthDTO arg0, TypeOfTransaction arg1, TransferRequestDTO arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, CodeIsNotValidException, DatabaseException, ExchangeCurrencyException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.makeTransfer(arg0, arg1, arg2);
  }
  
  public void validationSendMoneyToEmail(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToEmail(arg0, arg1);
  }
  
  public String withdrawalThroughExternalPaymentSystem(AuthDTO arg0, WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.withdrawalThroughExternalPaymentSystem(arg0, arg1);
  }
  
  public String sendMoneyToBankCard(AuthDTO arg0, BankCardTransferRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, NotSupportedBankBinException, AccessDeniedException, CardNumberIsNotValidException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, AdditionalDataRequiredException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, NotSupportedCountryException, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToBankCard(arg0, arg1);
  }
  
  public void validationSendMoneyToEcoinEU(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToEcoinEU(arg0, arg1);
  }
  
  public void validationSendMoneyToExmo(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToExmo(arg0, arg1);
  }
  
  public void validateAdvcashCardTransfer(AuthDTO arg0, AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, AdvcashCardMaxAllowedBalanceExceededException, MerchantDisabledException, CountLimitException, UserBlockedException, WrongIpException, UserDoesNotExistException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, CardIsNotActiveException, LimitPerCardPerDayException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, LifetimeLimitException, CardDoesNotExistException, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateAdvcashCardTransfer(arg0, arg1);
  }
  
  public advcash.wsm.PaymentOrderResult findPaymentByOrderId(AuthDTO arg0, advcash.wsm.PaymentOrderRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findPaymentByOrderId(arg0, arg1);
  }
  
  public CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceById(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, LimitsException, NotAuthException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, DatabaseException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findCryptoCurrencyWithdrawalInvoiceById(arg0, arg1);
  }
  
  public void validateWithdrawalThroughExternalPaymentSystem(AuthDTO arg0, WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateWithdrawalThroughExternalPaymentSystem(arg0, arg1);
  }
  
  public CancelProtectedTransferResultHolder cancelProtectedTransfer(AuthDTO arg0, String arg1) throws java.rmi.RemoteException, TransactionFailureException, AccessDeniedException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.cancelProtectedTransfer(arg0, arg1);
  }
  
  public void createApi(AuthDTO arg0, CreateApiRequest arg1) throws java.rmi.RemoteException, RegistrationException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, EmailAlreadyExistException, InternalException, BadParametersException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.createApi(arg0, arg1);
  }
  
  public CreateCryptoCurrencyInvoiceResult createCryptoCurrencyInvoice(AuthDTO arg0, CreateCryptoCurrencyInvoiceRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.createCryptoCurrencyInvoice(arg0, arg1);
  }
  
  public void validateEmailTransfer(AuthDTO arg0, EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, WrongEmailException, MerchantDisabledException, UserBlockedException, WrongIpException, WrongParamsException, LimitPerMonthException, LimitPerTransactionException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, EmailAlreadyExistException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateEmailTransfer(arg0, arg1);
  }
  
  public void validateTransfer(AuthDTO arg0, TypeOfTransaction arg1, TransferRequestDTO arg2) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, CallRestrictionException, MerchantDisabledException, UserBlockedException, WrongIpException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, LimitsException, NotAuthException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateTransfer(arg0, arg1, arg2);
  }
  
  public void validationSendMoney(AuthDTO arg0, SendMoneyRequest arg1) throws java.rmi.RemoteException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WalletCurrencyIncorrectException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoney(arg0, arg1);
  }
  
  public CreateBitcoinInvoiceResult createBitcoinInvoice(AuthDTO arg0, CreateBitcoinInvoiceRequest arg1) throws java.rmi.RemoteException, NotAvailableDepositSystemException, AccessDeniedException, MerchantDisabledException, JAXBException, WrongIpException, DuplicateOrderIdException, WrongParamsException, BadParametersException, InternalException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, WalletDoesNotExist, DatabaseException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.createBitcoinInvoice(arg0, arg1);
  }
  
  public CheckCurrencyExchangeResultHolder checkCurrencyExchange(AuthDTO arg0, CheckCurrencyExchangeRequest arg1) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, NotAuthException, MerchantDisabledException, UserBlockedException, WrongIpException, DatabaseException, WrongParamsException, BadParametersException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.checkCurrencyExchange(arg0, arg1);
  }
  
  public WalletBalanceDTO[] getBalances(AuthDTO arg0) throws java.rmi.RemoteException, AccessDeniedException, LimitsException, CallRestrictionException, NotAuthException, MerchantDisabledException, WrongIpException, WrongParamsException, DatabaseException, InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.getBalances(arg0);
  }
  
  public SendMoneyToWexResultHolder sendMoneyToWex(AuthDTO arg0, WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, TransactionTemporaryNotAvailableException, TransactionIsNotAvailableException, AccessDeniedException, MerchantDisabledException, WrongIpException, UserBlockedException, WrongParamsException, LimitPerTransactionException, LimitPerMonthException, InternalException, BadParametersException, TransactionFailureException, NotEnoughMoneyException, NotAuthException, NotEnoughMoneyApiException, WalletDoesNotExist, DatabaseException, ExchangeCurrencyException, LimitPerDayException, ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToWex(arg0, arg1);
  }
  
  
}
