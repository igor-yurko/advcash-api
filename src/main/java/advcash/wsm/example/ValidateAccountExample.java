package advcash.wsm.example;

import advcash.wsm.AuthDTO;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.ValidateAccountRequestDTO;
import advcash.wsm.ValidateAccountResultDTO;
import advcash.wsm.utils.AuthHelper;

public class ValidateAccountExample {

	public static void main(String[] args) throws Exception {

		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("ums-payment");
		arg0.setAccountEmail("igor.yurko.mail@gmail.com");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("80472639743"));

		ValidateAccountRequestDTO arg1 = new ValidateAccountRequestDTO();
		arg1.setWalletId("wallet_id");
		// arg1.setEmail("email");
		arg1.setFirstName("first");
		arg1.setLastName("last");

		try {
			ValidateAccountResultDTO result = mws.validateAccount(arg0, arg1);
			System.out.println(result.getEmail());
			System.out.println(result.getWalletId());
			System.out.println(result.getFirstName());
			System.out.println(result.getLastName());
			System.out.println(result.getFirstNameMatchingPercentage());
			System.out.println(result.getLastNameMatchingPercentage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
