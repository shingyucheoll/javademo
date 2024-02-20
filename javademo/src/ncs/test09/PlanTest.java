package ncs.test09;

public class PlanTest {

	public static void main(String[] args) {
		
		int fly;
		int refuel;
		
		// Airplane 과 Cargoplane 객체 생성
		Airplane ap = new Airplane("L747",1000);
		Cargoplane cp = new Cargoplane("C40",1000);
		
		// 생성된 객체의 정보 출력
		
		System.out.printf("Plane\t\tfuelSize\n");
		System.out.println(String.format("%24s", "").replace(' ', '-'));
		System.out.printf("%s\t\t%s\n",ap.getPlaneName(),ap.getFuelSize());
		System.out.printf("%s\t\t%s\n",cp.getPlaneName(),cp.getFuelSize());
		
		
		// Airplane 과 Cargoplane 객체에 100 씩 운항
		fly = 100;
		ap.flight(fly);
		cp.flight(fly);		
		// 100 운항 후 객체 정보 출력		
		System.out.println(fly +" 운항");
		
		System.out.printf("Plane\t\tfuelSize\n");
		System.out.println(String.format("%24s", "").replace(' ', '-'));
		System.out.printf("%s\t\t%s\n",ap.getPlaneName(),ap.getFuelSize());
		System.out.printf("%s\t\t%s\n",cp.getPlaneName(),cp.getFuelSize());
		
		// Airplane 과 Cargoplane 객체에 200 씩 주유		
		refuel = 200;
		ap.refuel(refuel);
		cp.refuel(refuel);	
		// 200 주유 후 객체 정보 출력
		System.out.println(refuel +" 주유");
		
		System.out.printf("Plane\t\tfuelSize\n");
		System.out.println(String.format("%24s", "").replace(' ', '-'));
		System.out.printf("%s\t\t%s\n",ap.getPlaneName(),ap.getFuelSize());
		System.out.printf("%s\t\t%s\n",cp.getPlaneName(),cp.getFuelSize());

	}

}
