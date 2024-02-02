package java010_abstract_interface.part01;

public class SendaAbs extends CarAbs{

	
	public SendaAbs() {
		
	}
	
	@Override     
	public void work() { // 추상 메소드 오버라이드 해야 오류가 안남
		System.out.println("승용차가 사람을 태우고 있습니다");
	}
	
	
}
