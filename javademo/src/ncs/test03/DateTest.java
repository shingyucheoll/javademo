package ncs.test03;

import java.util.Calendar;

public class DateTest {

   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      
   
      
      int year = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH);
      int date  = cal.get(Calendar.DATE);
      int day = cal.get(Calendar.DAY_OF_WEEK);

      
      
      System.out.printf("생일 :1987년 5월 27일 수요일\n");
      System.out.printf("현재 :%d년 %d월 %d일 \n",year,month+1,date);
      System.out.printf("나이 :%d세",year-1987);

   }

}