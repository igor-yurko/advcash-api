package advcash.wsm.example;

import advcash.wsm.AuthDTO;
import advcash.wsm.MerchantAPITransactionFilter;
import advcash.wsm.MerchantWebService_PortType;
import advcash.wsm.MerchantWebService_Service;
import advcash.wsm.MerchantWebService_ServiceLocator;
import advcash.wsm.OutcomingTransactionDTO;
import advcash.wsm.SortOrder;
import advcash.wsm.TransactionName;
import advcash.wsm.TransactionStatus;
import advcash.wsm.utils.AuthHelper;
import advcash.wsm.utils.DateConverter;

public class HistoryExample {

	public static void main(String[] args) throws Exception {
		MerchantWebService_Service mws_service = new MerchantWebService_ServiceLocator();
		MerchantWebService_PortType mws = mws_service.getMerchantWebServicePort();
		
		AuthDTO arg0 = new AuthDTO();
		arg0.setApiName("TrendaDigitalApi");
		arg0.setAccountEmail("natalia.zubenko8@gmail.com");
		arg0.setAuthenticationToken(AuthHelper
											.getAuthenticationToken("Lectera2019"));

		MerchantAPITransactionFilter arg1 = new MerchantAPITransactionFilter();
		arg1.setFrom(10);
		arg1.setCount(5);
		arg1.setSortOrder(SortOrder.ASC);
		arg1.setStartTimeFrom(DateConverter.stringToCalendar("2011-09-05T20:32:11"));
		arg1.setStartTimeTo(DateConverter.stringToCalendar("2013-12-05T20:59:00"));
		arg1.setTransactionName(TransactionName.INNER_SYSTEM);
		arg1.setTransactionStatus(TransactionStatus.PENDING);
		arg1.setWalletId("U112983230977");

		try {
			OutcomingTransactionDTO[] transactions = mws.history(arg0, arg1);
			if (transactions != null) {
				for (OutcomingTransactionDTO transaction : transactions) {
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
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
