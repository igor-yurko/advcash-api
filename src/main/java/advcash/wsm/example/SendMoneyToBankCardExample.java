package advcash.wsm.example;

import java.math.BigDecimal;

import advcash.wsm.AuthDTO;
import advcash.wsm.BankCardTransferRequest;
import advcash.wsm.Currency;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.utils.AuthHelper;

public class SendMoneyToBankCardExample {

	public static void main(String[] args) throws Exception {
		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("api_password"));

		BankCardTransferRequest arg1 = new BankCardTransferRequest();
		arg1.setAmount(BigDecimal.ONE);
		arg1.setCurrency(Currency.USD);
		arg1.setCardNumber("visa_or_mastercard_card_number");
		arg1.setExpiryMonth("01");
		arg1.setExpiryYear("19");
		arg1.setNote("note");
		arg1.setSavePaymentTemplate(false);

		// arg1.setCardHolder("John Smith");
		// arg1.setCardHolderCountryCode("US");
		// arg1.setCardHolderAddress("Address");
		// arg1.setCardHolderIp("192.168.0.1");

		try {
			mws.validationSendMoneyToBankCard(arg0, arg1);
			String tansactionID = mws.sendMoneyToBankCard(arg0, arg1);
			System.out.println("New transaction with id " + tansactionID
					+ " has been created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}