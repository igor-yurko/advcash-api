package advcash.wsm.example;

import java.math.BigDecimal;

import advcash.wsm.AuthDTO;
import advcash.wsm.Currency;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.SendMoneyToExmoResultHolder;
import advcash.wsm.WithdrawToEcurrencyRequest;
import advcash.wsm.utils.AuthHelper;

public class SendMoneyToExmoExample {

	public static void main(String[] args) throws Exception {
		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("api_password"));

		WithdrawToEcurrencyRequest arg1 = new WithdrawToEcurrencyRequest();
		arg1.setAmount(BigDecimal.ONE);
		arg1.setCurrency(Currency.RUR);
		arg1.setNote("note");
		arg1.setSavePaymentTemplate(false);

		try {
			mws.validationSendMoneyToExmo(arg0, arg1);
			SendMoneyToExmoResultHolder holder = mws
					.sendMoneyToExmo(arg0, arg1);
			System.out.println("New transaction with id " + holder.getId()
					+ " has been created");
			System.out.println("EX-CODE: " + holder.getCoupon());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}