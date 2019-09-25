package advcash.wsm.example;

import advcash.wsm.AccountPresentDTO;
import advcash.wsm.AuthDTO;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.utils.AuthHelper;

public class ValidateAccountsExample {

	public static void main(String[] args) throws Exception {

		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("api_password"));

		String[] arg1 = new String[] { "user_email" };

		try {
			AccountPresentDTO[] accounts = mws.validateAccounts(arg0, arg1);
			for (AccountPresentDTO account : accounts) {
				System.out.println(account.getSystemAccountName() + " : "
						+ account.getPresent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}