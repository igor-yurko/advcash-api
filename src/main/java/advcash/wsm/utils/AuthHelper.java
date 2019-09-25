package advcash.wsm.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class AuthHelper {

	private final static String SHA256_ALGORITHM_NAME = "SHA-256";
	private final static String DATEFORMAT = "yyyyMMdd:HH";
	private final static String TIMEZONE = "GMT";
	private final static int TIMEZONE_OFFSET = 0;

	private static String getSHA256String(String stringToConfert)
			throws NoSuchAlgorithmException {

		MessageDigest md = MessageDigest.getInstance(SHA256_ALGORITHM_NAME);
		md.update(stringToConfert.getBytes());

		byte byteData[] = md.digest();

		StringBuffer result = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			result.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16)
					.substring(1));
		}

		return result.toString();
	}

	public static String getAuthenticationToken(String securityWord)
			throws NoSuchAlgorithmException {

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(new SimpleTimeZone(0, "GMT"));

		StringBuffer token = new StringBuffer(securityWord);
		token.append(":");

		SimpleDateFormat sdf = new SimpleDateFormat(DATEFORMAT);
		sdf.setTimeZone(new SimpleTimeZone(TIMEZONE_OFFSET, TIMEZONE));
		token.append(sdf.format(calendar.getTime()));

		System.out.println(token.toString());
		System.out.println(getSHA256String(token.toString()));
		
		return getSHA256String(token.toString());
	}
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		getAuthenticationToken("pwd");
		System.out.println(System.getProperty("java.library.path"));
	}

}