package advcash.wsm;

public class MerchantWebServiceProxy implements advcash.wsm.MerchantWebService_PortType {
  private String _endpoint = null;
  private advcash.wsm.MerchantWebService_PortType merchantWebService_PortType = null;
  
  public MerchantWebServiceProxy() {
    _initMerchantWebServiceProxy();
  }
  
  public MerchantWebServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initMerchantWebServiceProxy();
  }
  
  private void _initMerchantWebServiceProxy() {
    try {
      merchantWebService_PortType = (new advcash.wsm.MerchantWebService_ServiceLocator()).getMerchantWebServicePort();
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
  
  public advcash.wsm.MerchantWebService_PortType getMerchantWebService_PortType() {
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType;
  }
  
  public void validationSendMoneyToAdvcashCard(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException, advcash.wsm.MerchantDisabledException, advcash.wsm.CountLimitException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.CardIsNotActiveException, advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.LifetimeLimitException, advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToAdvcashCard(arg0, arg1);
  }
  
  public advcash.wsm.SendMoneyToEcoinEUResultHolder sendMoneyToEcoinEU(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToEcoinEU(arg0, arg1);
  }
  
  public void validationCurrencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationCurrencyExchange(arg0, arg1);
  }
  
  public advcash.wsm.OutcomingTransactionDTO[] history(advcash.wsm.AuthDTO arg0, advcash.wsm.MerchantAPITransactionFilter arg1) throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.history(arg0, arg1);
  }
  
  public advcash.wsm.ValidateAccountResultDTO validateAccount(advcash.wsm.AuthDTO arg0, advcash.wsm.ValidateAccountRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserDoesNotExistException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.validateAccount(arg0, arg1);
  }
  
  public advcash.wsm.AccountPresentDTO[] validateAccounts(advcash.wsm.AuthDTO arg0, java.lang.String[] arg1) throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.validateAccounts(arg0, arg1);
  }
  
  public void validateCurrencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateCurrencyExchange(arg0, arg1, arg2);
  }
  
  public advcash.wsm.SendMoneyToExmoResultHolder sendMoneyToExmo(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToExmo(arg0, arg1);
  }
  
  public void register(advcash.wsm.AuthDTO arg0, advcash.wsm.RegistrationRequest arg1) throws java.rmi.RemoteException, advcash.wsm.RegistrationException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException, advcash.wsm.InternalException, advcash.wsm.BadParametersException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.register(arg0, arg1);
  }
  
  public void validationSendMoneyToWex(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToWex(arg0, arg1);
  }
  
  public advcash.wsm.OutcomingTransactionDTO findTransaction(advcash.wsm.AuthDTO arg0, java.lang.String arg1) throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findTransaction(arg0, arg1);
  }
  
  public java.lang.String confirmCryptoCurrencyWithdrawalInvoice(advcash.wsm.AuthDTO arg0, advcash.wsm.ConfirmCryptoCurrencyWithdrawalInvoiceRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.JAXBException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.confirmCryptoCurrencyWithdrawalInvoice(arg0, arg1);
  }
  
  public advcash.wsm.CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceByOrderId(advcash.wsm.AuthDTO arg0, java.lang.String arg1) throws java.rmi.RemoteException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException, advcash.wsm.BadParametersException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findCryptoCurrencyWithdrawalInvoiceByOrderId(arg0, arg1);
  }
  
  public java.lang.String makeCurrencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.TransferRequestDTO arg1, boolean arg2) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.makeCurrencyExchange(arg0, arg1, arg2);
  }
  
  public java.lang.String sendMoneyToEmail(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToEmail(arg0, arg1);
  }
  
  public void validationSendMoneyToBankCard(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.NotSupportedBankBinException, advcash.wsm.AccessDeniedException, advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.NotSupportedCountryException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToBankCard(arg0, arg1);
  }
  
  public java.lang.String sendMoneyToAdvcashCard(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException, advcash.wsm.MerchantDisabledException, advcash.wsm.CountLimitException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.CardIsNotActiveException, advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.LifetimeLimitException, advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToAdvcashCard(arg0, arg1);
  }
  
  public java.lang.String transferBankCard(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.transferBankCard(arg0, arg1);
  }
  
  public java.lang.String currencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.CurrencyExchangeRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.currencyExchange(arg0, arg1);
  }
  
  public java.lang.String sendMoney(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoney(arg0, arg1);
  }
  
  public void validationSendMoneyToEcurrency(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToEcurrency(arg0, arg1);
  }
  
  public java.lang.String sendMoneyToEcurrency(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToEcurrency(arg0, arg1);
  }
  
  public java.lang.String transferAdvcashCard(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException, advcash.wsm.MerchantDisabledException, advcash.wsm.CountLimitException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.UserDoesNotExistException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.CardIsNotActiveException, advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.LifetimeLimitException, advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.transferAdvcashCard(arg0, arg1);
  }
  
  public advcash.wsm.CryptoCurrencyWithdrawalInvoiceDTO createCryptoCurrencyWithdrawalInvoice(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.JAXBException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.createCryptoCurrencyWithdrawalInvoice(arg0, arg1);
  }
  
  public void validateBankCardTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateBankCardTransfer(arg0, arg1);
  }
  
  public java.lang.String emailTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerMonthException, advcash.wsm.LimitPerTransactionException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.emailTransfer(arg0, arg1);
  }
  
  public java.lang.String makeTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.TypeOfTransaction arg1, advcash.wsm.TransferRequestDTO arg2) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.CodeIsNotValidException, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.makeTransfer(arg0, arg1, arg2);
  }
  
  public void validationSendMoneyToEmail(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToEmail(arg0, arg1);
  }
  
  public java.lang.String withdrawalThroughExternalPaymentSystem(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.withdrawalThroughExternalPaymentSystem(arg0, arg1);
  }
  
  public java.lang.String sendMoneyToBankCard(advcash.wsm.AuthDTO arg0, advcash.wsm.BankCardTransferRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.NotSupportedBankBinException, advcash.wsm.AccessDeniedException, advcash.wsm.CardNumberIsNotValidException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.AdditionalDataRequiredException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.NotSupportedCountryException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToBankCard(arg0, arg1);
  }
  
  public void validationSendMoneyToEcoinEU(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToEcoinEU(arg0, arg1);
  }
  
  public void validationSendMoneyToExmo(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoneyToExmo(arg0, arg1);
  }
  
  public void validateAdvcashCardTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.AdvcashCardTransferRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.AdvcashCardMaxAllowedBalanceExceededException, advcash.wsm.MerchantDisabledException, advcash.wsm.CountLimitException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.UserDoesNotExistException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.CardIsNotActiveException, advcash.wsm.LimitPerCardPerDayException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.LifetimeLimitException, advcash.wsm.CardDoesNotExistException, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateAdvcashCardTransfer(arg0, arg1);
  }
  
  public advcash.wsm.PaymentOrderResult findPaymentByOrderId(advcash.wsm.AuthDTO arg0, advcash.wsm.PaymentOrderRequest arg1) throws java.rmi.RemoteException, advcash.wsm.NotAvailableDepositSystemException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.JAXBException, advcash.wsm.WrongIpException, advcash.wsm.DuplicateOrderIdException, advcash.wsm.WrongParamsException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findPaymentByOrderId(arg0, arg1);
  }
  
  public advcash.wsm.CryptoCurrencyWithdrawalInvoiceDTO findCryptoCurrencyWithdrawalInvoiceById(advcash.wsm.AuthDTO arg0, java.lang.String arg1) throws java.rmi.RemoteException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.findCryptoCurrencyWithdrawalInvoiceById(arg0, arg1);
  }
  
  public void validateWithdrawalThroughExternalPaymentSystem(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawalThroughExternalPaymentSystemRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateWithdrawalThroughExternalPaymentSystem(arg0, arg1);
  }
  
  public advcash.wsm.CancelProtectedTransferResultHolder cancelProtectedTransfer(advcash.wsm.AuthDTO arg0, java.lang.String arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionFailureException, advcash.wsm.AccessDeniedException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.cancelProtectedTransfer(arg0, arg1);
  }
  
  public void createApi(advcash.wsm.AuthDTO arg0, advcash.wsm.CreateApiRequest arg1) throws java.rmi.RemoteException, advcash.wsm.RegistrationException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException, advcash.wsm.InternalException, advcash.wsm.BadParametersException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.createApi(arg0, arg1);
  }
  
  public advcash.wsm.CreateCryptoCurrencyInvoiceResult createCryptoCurrencyInvoice(advcash.wsm.AuthDTO arg0, advcash.wsm.CreateCryptoCurrencyInvoiceRequest arg1) throws java.rmi.RemoteException, advcash.wsm.NotAvailableDepositSystemException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.JAXBException, advcash.wsm.WrongIpException, advcash.wsm.DuplicateOrderIdException, advcash.wsm.WrongParamsException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.createCryptoCurrencyInvoice(arg0, arg1);
  }
  
  public void validateEmailTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.EmailTransferRequestDTO arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.WrongEmailException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerMonthException, advcash.wsm.LimitPerTransactionException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.EmailAlreadyExistException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateEmailTransfer(arg0, arg1);
  }
  
  public void validateTransfer(advcash.wsm.AuthDTO arg0, advcash.wsm.TypeOfTransaction arg1, advcash.wsm.TransferRequestDTO arg2) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.CallRestrictionException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validateTransfer(arg0, arg1, arg2);
  }
  
  public void validationSendMoney(advcash.wsm.AuthDTO arg0, advcash.wsm.SendMoneyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WalletCurrencyIncorrectException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.LimitPerDayException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    merchantWebService_PortType.validationSendMoney(arg0, arg1);
  }
  
  public advcash.wsm.CreateBitcoinInvoiceResult createBitcoinInvoice(advcash.wsm.AuthDTO arg0, advcash.wsm.CreateBitcoinInvoiceRequest arg1) throws java.rmi.RemoteException, advcash.wsm.NotAvailableDepositSystemException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.JAXBException, advcash.wsm.WrongIpException, advcash.wsm.DuplicateOrderIdException, advcash.wsm.WrongParamsException, advcash.wsm.BadParametersException, advcash.wsm.InternalException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.createBitcoinInvoice(arg0, arg1);
  }
  
  public advcash.wsm.CheckCurrencyExchangeResultHolder checkCurrencyExchange(advcash.wsm.AuthDTO arg0, advcash.wsm.CheckCurrencyExchangeRequest arg1) throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.UserBlockedException, advcash.wsm.WrongIpException, advcash.wsm.DatabaseException, advcash.wsm.WrongParamsException, advcash.wsm.BadParametersException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.checkCurrencyExchange(arg0, arg1);
  }
  
  public advcash.wsm.WalletBalanceDTO[] getBalances(advcash.wsm.AuthDTO arg0) throws java.rmi.RemoteException, advcash.wsm.AccessDeniedException, advcash.wsm.LimitsException, advcash.wsm.CallRestrictionException, advcash.wsm.NotAuthException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.WrongParamsException, advcash.wsm.DatabaseException, advcash.wsm.InternalException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.getBalances(arg0);
  }
  
  public advcash.wsm.SendMoneyToWexResultHolder sendMoneyToWex(advcash.wsm.AuthDTO arg0, advcash.wsm.WithdrawToEcurrencyRequest arg1) throws java.rmi.RemoteException, advcash.wsm.TransactionTemporaryNotAvailableException, advcash.wsm.TransactionIsNotAvailableException, advcash.wsm.AccessDeniedException, advcash.wsm.MerchantDisabledException, advcash.wsm.WrongIpException, advcash.wsm.UserBlockedException, advcash.wsm.WrongParamsException, advcash.wsm.LimitPerTransactionException, advcash.wsm.LimitPerMonthException, advcash.wsm.InternalException, advcash.wsm.BadParametersException, advcash.wsm.TransactionFailureException, advcash.wsm.NotEnoughMoneyException, advcash.wsm.NotAuthException, advcash.wsm.NotEnoughMoneyApiException, advcash.wsm.WalletDoesNotExist, advcash.wsm.DatabaseException, advcash.wsm.ExchangeCurrencyException, advcash.wsm.LimitPerDayException, advcash.wsm.ApiException{
    if (merchantWebService_PortType == null)
      _initMerchantWebServiceProxy();
    return merchantWebService_PortType.sendMoneyToWex(arg0, arg1);
  }
  
  
}