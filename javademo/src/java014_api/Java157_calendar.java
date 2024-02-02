package java014_api;


// 수능일: 2025-11-14
// 오늘 : 2024 -2 -2
// 남은일
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Java157_calendar {

	public static void main(String[] args) {
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2024;
		int examDay_month = 11;
		int examDay_date = 14;
		
		
		examDay.set(examDay_year,examDay_month-1,examDay_date);
		System.out.println(examDay);
		
		Calendar toDay = Calendar.getInstance();
		toDay.set(Calendar.HOUR,0);
		toDay.set(Calendar.MINUTE,0);
		toDay.set(Calendar.SECOND,0);
		System.out.println(toDay);
		
		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();		
		System.out.println(eventDay);		
		System.out.println(nowDay);
		
		System.out.println(60*60*24*1000);
		
		long endDay = (eventDay - nowDay)/(60*60*24*1000);
		System.out.println(endDay);
		
		

	}

}
