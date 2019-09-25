package advcash.wsm.example;

import advcash.wsm.AuthDTO;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.RegistrationRequest;
import advcash.wsm.SupportedLanguage;
import advcash.wsm.utils.AuthHelper;

public class RegisterExample {

	public static void main(String[] args) throws Exception {
		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("api_password"));

		RegistrationRequest arg1 = new RegistrationRequest();
		arg1.setEmail("email");
		arg1.setFirstName("firstName");
		arg1.setLastName("lastName");
		arg1.setLanguage(SupportedLanguage.en);
		arg1.setIp("*.*.*.*");

		try {
			mws.register(arg0, arg1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}