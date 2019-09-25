package advcash.wsm.example;

import advcash.wsm.AuthDTO;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.WalletBalanceDTO;
import advcash.wsm.utils.AuthHelper;

public class GetBalancesExample {

	public static void main(String[] args) throws Exception {

		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service
				.getMerchantWebServicePort();

		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("TrendaDigitalApi");
		arg0.setAccountEmail("natalia.zubenko8@gmail.com");
		arg0.setAuthenticationToken(AuthHelper
				.getAuthenticationToken("Lectera2019"));

		try {
			WalletBalanceDTO[] wallets = mws.getBalances(arg0);
			for (WalletBalanceDTO wallet : wallets) {
				System.out.println(wallet.getId() + " : " + wallet.getAmount());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
