package java014_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

//2024 2월의 마지막 일과 요일을 구하는 프로그램을 구현하세요
// 출력결과
// 2024-2-29 목요일
public class Java156_Calendar_gpt {

    public static void main(String[] args) {
        int year = 2024;
        Month month = Month.FEBRUARY;

        LocalDate lastDayOfMonth = LocalDate.of(year, month, month.length(LocalDate.of(year, month, 1).isLeapYear()));
        DayOfWeek dayOfWeek = lastDayOfMonth.getDayOfWeek();

        String dayOfWeekKorean = convertToKoreanDayOfWeek(dayOfWeek);
        
        System.out.println(lastDayOfMonth + " " + dayOfWeekKorean);

	}

    private static String convertToKoreanDayOfWeek(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return "월요일";
            case TUESDAY:
                return "화요일";
            case WEDNESDAY:
                return "수요일";
            case THURSDAY:
                return "목요일";
            case FRIDAY:
                return "금요일";
            case SATURDAY:
                return "토요일";
            case SUNDAY:
                return "일요일";
            default:
                return "";
        }
    }
    
}
