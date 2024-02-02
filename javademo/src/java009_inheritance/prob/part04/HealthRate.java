package java009_inheritance.prob.part04;

public class HealthRate extends Health {
	
	double x = 0;

	public HealthRate(String name, double height, double weight) {
		super(name, height, weight);
	}

	private double standardHealth() {
		// 표준체중 로직구현을 구현하세요.
		
		return (getHeight()-100) * 0.9;
	}

	private String rateCheck() {
		// 비만도를 로직구현을 구현하세요
		x = (getWeight() - standardHealth()) / standardHealth() * 100;	
		
		return (x >= 20 ? "비만" : (x >= 10) ? "과체중" : "정상");  
	}

	// prn()메소드 오버라이딩
	@Override
	public void prn() {
		System.out.printf("%s님의 신장 %.0f , 몸무게 %.0f  %s입니다.\n", getName(), getHeight(), getWeight(), rateCheck());
	}

}// end HealthRate