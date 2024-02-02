package java010_abstract_interface.part01;

public class TruckAbs extends CarAbs{

	
	
	public TruckAbs() {
		// TODO Auto-generated constructor stub
	}
	
	@Override     
	public void work() { // 추상 메소드 오버라이드 해야 오류가 안남
		System.out.println("트럭에 짐을 싣고 있다");
	}
	
	
}
