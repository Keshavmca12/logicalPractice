package practice.date;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SDFString {
	public static void main(String[] args) {
		String dateString="2016-01-29 11:58:08.504";
		String date = "15-09-2011:23:30:45";
		DateFormat formatter = null;
        Date convertedDate = null;

		formatter = new SimpleDateFormat("dd-MM-yyyy");
		try {
			convertedDate = (Date) formatter.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Date from dd-MM-yyyy:HH:mm:SS String in Java : " 
				+ convertedDate);
	}
}
