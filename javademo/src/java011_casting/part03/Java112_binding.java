package java011_casting.part03;

public class Java112_binding {
	
	public static void main(String[] args) {
		LgTv lgTv = new LgTv("LG");
		process(lgTv);
		
		SamsungTv samsungTv = new SamsungTv("SAMSUNG");
		process(samsungTv);
		
		
	}
	
	public static void process(LgTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.call();
	}
	
	public static void process(SamsungTv tv) {
		tv.turnOff();
		tv.turnOn();
		tv.soundDown();
		tv.soundUp();
		tv.move();
		
	}

}
