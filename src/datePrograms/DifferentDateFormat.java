package datePrograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DifferentDateFormat {

	public static void main(String[] args) {

		getDateInAmPm();
		getCountryDateFormat();
		getDifferentCountryTime();		
	}

	public static void getDateInAmPm() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Today DateTime: " + dateTime);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		String todayDate = formatter.format(dateTime);
		System.out.println("Today Date: " + todayDate);

		formatter = DateTimeFormatter.ofPattern("hh:mm a");
		String todayTime = formatter.format(dateTime);
		System.out.println("Today Date in AM/PM Format: " + todayTime);
	}

	public static String getDateFormat(String countryCode, Date date) {
		Locale locale = new Locale(countryCode, "ch");
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String todayDate = dateFormat.format(date);
		return todayDate;
	}

	public static void getCountryDateFormat() {

		Date today = new Date();
		System.out.println("Today Date in BELGIUM Format: " + today);
		System.out.println("Today Date in INDIA Format: " + getDateFormat("en_IN", today));
		System.out.println("Today Date in GERMANY Format: " + getDateFormat("de", today));
		System.out.println("Today Date in FRANCE Format: " + getDateFormat("fr", today));
		System.out.println("Today Date in ENGLAND Format: " + getDateFormat("en", today));
		System.out.println("Today Date in RUSSIA Format: " + getDateFormat("ru", today));
		System.out.println("Today Date in CHINA Format: " + getDateFormat("cn", today));
		System.out.println("Today Date in SPANISH Format: " + getDateFormat("es", today));
		System.out.println("Today Date in ITALY Format: " + getDateFormat("it", today));
	}
	
	public static String getTimeFromTimeZone(String countryZone, Date date) {
		//displaying this date on different time zone
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm a");
        dateFormat.setTimeZone(TimeZone.getTimeZone(countryZone));
        String dateTime = dateFormat.format(date);
        return dateTime;
	}
	
	public static void getDifferentCountryTime() {
		//capturing today's date
        Date today = new Date();
        //Central European Summer Time(CET)
        System.out.println("Today Date Time in Europe CET: " + getTimeFromTimeZone("Europe/Paris" , today));
        // Indian Standard Time(IST)
        System.out.println("Today Date Time in India IST: " + getTimeFromTimeZone("Asia/Kolkata" , today));
        //Pacific Standard Time / Pacific Time(PST)
		System.out.println("Today Date Time in America PST: " + getTimeFromTimeZone("America/Los_Angeles" , today));		
	}
	

}
