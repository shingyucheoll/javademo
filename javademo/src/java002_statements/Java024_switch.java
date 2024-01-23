package java002_statements;

public class Java024_switch {

	public static void main(String[] args) {
		enum Day {
			MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
		}
		
		Day day = Day.MONDAY;
		
		switch(day) {
		case MONDAY:
			System.out.println("월");
			break;
		case TUESDAY:
			System.out.println("화");
			break;
		case WEDNESDAY:
			System.out.println("수");
			break;
		case THURSDAY:
			System.out.println("목");
			break;
		case FRIDAY:
			System.out.println("금");
			break;
		case SATURDAY:
			System.out.println("토");
			break;
		case SUNDAY:
			System.out.println("일");
			break;
		}

	}

}
