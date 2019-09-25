package advcash.wsm.example;

import java.math.BigDecimal;

import advcash.wsm.AuthDTO;
import advcash.wsm.CheckCurrencyExchangeRequest;
import advcash.wsm.Currency;
import advcash.wsm.CurrencyExchangeAction;
import advcash.wsm.CurrencyExchangeRequest;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.utils.AuthHelper;

public class CurrencyExchangeExample {

	public static void main(String[] args) throws Exception {
		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("api_password"));

		CurrencyExchangeRequest arg1 = new CurrencyExchangeRequest();
		arg1.setFrom(Currency.USD);
		arg1.setTo(Currency.EUR);
		arg1.setAction(CurrencyExchangeAction.SELL);
		arg1.setAmount(BigDecimal.ONE);
		arg1.setNote("note");

		CheckCurrencyExchangeRequest arg4 = new CheckCurrencyExchangeRequest();
		arg4.setFrom("USD");
		arg4.setTo("BTC");
		arg4.setAction(CurrencyExchangeAction.SELL);
		arg4.setAmount(BigDecimal.ONE.movePointRight(3));

		try {
			System.out.println(mws.checkCurrencyExchange(arg0, arg4));
			mws.validationCurrencyExchange(arg0, arg1);
			String tansactionID = mws.currencyExchange(arg0, arg1);
			System.out.println("New transaction with id " + tansactionID + " has been created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}