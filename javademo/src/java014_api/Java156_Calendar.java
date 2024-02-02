package java014_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 2024년 2월의 마지막 일과 요일을 구하는 프로그램 구현
// [출력결과]
// 2024-3-31 일요일
public class Java156_Calendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		cal.set(2024, 2, 1);
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;  // 1월을 0이라 표기 되어있기 때문
		int date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d\n", year, month, date);
		
		
		// 2024년 3월의 마지막 리턴 
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
		cal.set(Calendar.DATE, lastDate);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;  // 1월을 0이라 표기 되어있기 때문
		date = cal.get(Calendar.DATE);
		System.out.printf("%d-%d-%d\n", year, month, date);
		
		// 2024년 3월의 31일 요일 리턴 
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		char week = ' ';
		switch(day) {
		case 1:
			week = '일';
			break;
		case 2:
			week = '월';
			break;
		case 3:
			week = '화';
			break;
		case 4:
			week = '수';
			break;
		case 5:
			week = '목';
			break;
		case 6:
			week = '금';
		case 7:
			week = '토';
			break;
		}
		
		System.out.printf("%d-%d-%d %c요일\n", year, month, lastDate, week);
		
		
	}

}
