package advcash.wsm.example;

import java.math.BigDecimal;

import advcash.wsm.AuthDTO;
import advcash.wsm.CreateBitcoinInvoiceRequest;
import advcash.wsm.CreateBitcoinInvoiceResult;
import advcash.wsm.Currency;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.utils.AuthHelper;

public class CreateBitcoinInvoiceExample {

	public static void main(String[] args) throws Exception {

		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("api_name");
		arg0.setAccountEmail("account_email");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("api_password"));

		try {
			CreateBitcoinInvoiceRequest arg1 = new CreateBitcoinInvoiceRequest();
			arg1.setAmount(BigDecimal.ONE);
			arg1.setCurrency(Currency.USD);
			arg1.setSciName("sci_name");
			arg1.setOrderId("12345");
			arg1.setNote("note");
			CreateBitcoinInvoiceResult result = mws.createBitcoinInvoice(arg0, arg1);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}