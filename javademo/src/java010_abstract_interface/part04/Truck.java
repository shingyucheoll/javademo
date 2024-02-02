package java010_abstract_interface.part04;

public class Truck implements CarRun { // interface를 상속할 땐 implements 를 사용한다.
	
	public Truck() {
	}

	@Override
	public void prn() {
		System.out.println("truck prn");
	}
	
	

	
	

	@Override
	public void call() {
		System.out.println("truck call");
	}


}
