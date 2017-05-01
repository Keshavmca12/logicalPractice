import java.util.Date;


public class DatePoc {
	public static void main(String[] args) {
		java.sql.Date currentDate = new java.sql.Date(new Date().getTime());
		java.sql.Timestamp sq = new java.sql.Timestamp(new Date().getTime());
		currentDate.getTime();
		System.out.println("time stamp"+currentDate.getTime());
		System.out.println("now"+System.currentTimeMillis());
	}
}
