package advcash.wsm.example;

import java.math.BigDecimal;

import advcash.wsm.AuthDTO;
import advcash.wsm.Currency;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.SendMoneyRequest;
import advcash.wsm.utils.AuthHelper;

public class SendMoneyExample {

	public static void main(String[] args) throws Exception {
		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper.getAuthenticationToken("api_password"));

		SendMoneyRequest arg1 = new SendMoneyRequest();
		arg1.setAmount(BigDecimal.ONE);
		arg1.setCurrency(Currency.USD);
		arg1.setEmail("receiver_email");
		// arg1.setWalletId("U000000000000");
		arg1.setNote("note");
		arg1.setSavePaymentTemplate(false);

		try {
			mws.validationSendMoney(arg0, arg1);
			String tansactionID = mws.sendMoney(arg0, arg1);
			System.out.println("New transaction with id " + tansactionID + " has been created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}