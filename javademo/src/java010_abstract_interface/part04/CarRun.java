package java010_abstract_interface.part04;

public interface CarRun {
	
	int carCount = 5; // 초기화가 되지 않기 때문에 값 무조건 입력해줘야한다.       //  public abstract final이 생략된 상태
	
//	public CarRun() {}   interface는 생성자를 가질 수 없다.	
//	static {}
	
	void prn();      // public abstract 생략되어 있다.
	
	// interface 안에 class ( 내부 클래스 ) 를 가질 수 있다.
	class Sun{
		public Sun() {        // 내부 클래스에선 사용 가능.
			System.out.println("Sun Constructor");
		}
	}
	public static void main(String[] args) {
		CarRun.Sun sunInstance = new CarRun.Sun();
		
	}
	
	
	// 원래 있던 interface에 기능이 추가로 필요할때 default나 static을 사용하면 다른곳에서 사용이 가능하다.
	
	// Java8부터 default 가능
	default void call() {
		System.out.println("CarRun call");
	}
	// Java8부터 static 가능
	static void dispaly() {
		System.out.println("CarRun display");
	}

}
