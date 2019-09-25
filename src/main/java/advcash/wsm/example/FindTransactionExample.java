package advcash.wsm.example;

import advcash.wsm.AuthDTO;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.OutcomingTransactionDTO;
import advcash.wsm.utils.AuthHelper;

public class FindTransactionExample {

	public static void main(String[] args) throws Exception {

		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();
		
		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("TrendaDigitalApi");
		arg0.setAccountEmail("natalia.zubenko8@gmail.com");
		arg0.setAuthenticationToken(AuthHelper.getAuthenticationToken("Lectera2019"));

		String arg1 = "c80d5f62-cc17-427f-8f6c-4c417ee2f083";

		try {
			OutcomingTransactionDTO transaction = mws.findTransaction(arg0,
					arg1);
			if (transaction != null) {
				System.out.println(transaction.getId() + " : "
						+ transaction.getComment() + " : "
						+ transaction.getStartTime().getTime() + " : "
						+ transaction.getStatus() + " : "
						+ transaction.getTransactionName() + " : "
						+ transaction.isSci() + " : "
						+ transaction.getWalletSrcId() + " : "
						+ transaction.getWalletDestId() + " : "
						+ transaction.getSenderEmail() + " : "
						+ transaction.getReceiverEmail() + " : "
						+ transaction.getAmount() + " : "
						+ transaction.getCurrency() + " : "
						+ transaction.getFullCommission() + " : "
						+ transaction.getDirection() + " : "
						+ transaction.getOrderId());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
