package advcash.wsm.example;

import java.math.BigDecimal;

import advcash.wsm.AdvcashCardTransferRequest;
import advcash.wsm.AuthDTO;
import advcash.wsm.CardType;
import advcash.wsm.Currency;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.utils.AuthHelper;

public class SendMoneyToAdvcashCardExample {

	public static void main(String[] args) throws Exception {
		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("api_password"));

		AdvcashCardTransferRequest arg1 = new AdvcashCardTransferRequest();
		arg1.setAmount(BigDecimal.ONE);
		arg1.setCurrency(Currency.USD);
		arg1.setEmail("receiver_email");
		arg1.setCardType(CardType.VIRTUAL);
		arg1.setNote("note");
		arg1.setSavePaymentTemplate(false);

		try {
			mws.validationSendMoneyToAdvcashCard(arg0, arg1);
			String tansactionID = mws.sendMoneyToAdvcashCard(arg0, arg1);
			System.out.println("New transaction with id " + tansactionID
					+ " has been created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}