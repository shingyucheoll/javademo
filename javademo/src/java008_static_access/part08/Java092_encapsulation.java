package java008_static_access.part08;

public class Java092_encapsulation {

	public static void main(String[] args) {
		Time time = new Time();
		time.setHour(13);
		time.setMinute(17);
		time.setSecond(30);
		
		System.out.printf("%d:%d:%d\n", time.getHour(),time.getMinute(),time.getSecond());

	}

}
