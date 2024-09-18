package coreJava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd = new SimpleDateFormat("M/d/YYYY");
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.getWeekYear());
		System.out.println(cal.getWeeksInWeekYear());
		System.out.println(cal.DAY_OF_MONTH);
		
		
		int cal1 = Calendar.FEBRUARY;
		System.out.println(" feb mnth " + cal1);

	}

}
