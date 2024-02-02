package java014_api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Java156_calender {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
//      // 2024년 2월로 설정 (월은 0부터 시작하므로 2월은 1로 설정)
//      cal.set(2024, Calendar.MARCH, 2);
//      
//      // 2월의 마지막 날짜로 설정
//      cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
//
//      // 날짜와 요일을 포맷팅하기 위한 SimpleDateFormat
//      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd EEEE");
//      
//      // 결과 출력
//      System.out.println(sdf.format(cal.getTime()));
		
		
		cal.set(2024, 2,1);
		//cal.set(Calendar.MONTH,2);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date  = cal.get(Calendar.DATE);
		
		System.out.printf("%d - %d - %d \n",year,month,date);
		
		//2024 3월의 마지막을 리턴
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		System.out.println(lastDate);
		
		
		cal.set(Calendar.DATE, lastDate);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		date  = cal.get(Calendar.DATE);
		System.out.printf("%d - %d - %d \n",year,month,date);
		
		//2024년 3월 31일의 요일을 리턴
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		char week = ' ' ;
		switch(day) {
	    
	    case 1: week = '일'; break;
	    case 2: week = '월'; break;
	    case 3: week = '화'; break;
	    case 4: week = '수'; break;
	    case 5: week = '목'; break;
	    case 6: week = '금'; break;
	    case 7: week = '토'; break;
	    }
		
		System.out.printf("%d-%d-%d %c요일\n",year,month,lastDate,week);
		String pattern = "yyyy-MM-dd a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		//System.out.println(sdf.format(new Date(year,month,lastDate)));
		
		
		
	}

}
