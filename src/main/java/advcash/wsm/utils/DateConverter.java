package advcash.wsm.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateConverter {

	/**
	 * Converts Date object into XMLGregorianCalendar
	 * 
	 * @param date
	 *            Object to be converted
	 * @return XMLGregorianCalendar
	 */
	private static XMLGregorianCalendar dateToXMLGregorianCalendar(Date date) {

		try {
			GregorianCalendar gc = (GregorianCalendar) GregorianCalendar
					.getInstance();
			gc.setTime(date);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Converts a formatted string into XMLGregorianCalendar
	 * 
	 * @param datetime
	 *            Formatted string
	 * @return XMLGregorianCalendar
	 */
	public static XMLGregorianCalendar stringToXMLGregorianCalendar(
			String datetime) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

			Date date = sdf.parse(datetime);
			return dateToXMLGregorianCalendar(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Converts Date object into Calendar
	 * 
	 * @param date
	 *            Object to be converted
	 * @return Calendar
	 */
	private static Calendar dateToCalendar(Date date) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}

	/**
	 * Converts a formatted string into Calendar
	 * 
	 * @param datetime
	 *            Formatted string
	 * @return Calendar
	 */
	public static Calendar stringToCalendar(String datetime) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			Date date = sdf.parse(datetime);
			return dateToCalendar(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

}