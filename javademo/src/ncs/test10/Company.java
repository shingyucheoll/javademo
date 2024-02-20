package ncs.test10;

public class Company {

//	아래와 같이 Book Object를 초기화 생성하여 프로그램을 동작시킨다.
//	name number department salary
//	Hilery 1 secretary 800
//	Clinten 2 sales 120

	public static void main(String[] args) {

		Employee[] employees = new Employee[2];
		// 1번의 사용 데이터를 기반으로 객체를 생성하여 배열에 넣는다 .
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);

		// 모든 객체의 기본 정보를 출력한다 (for 문을 이용하여 출력한다.)
		System.out.printf("%-10s%-10s%10s\n", "name", "department", "salary");
		System.out.println(String.format("%30s", "").replace(' ', '-'));
		for (Employee ep : employees) {
			System.out.printf("%-10s%-10s%10s\n", ep.getName(), ep.getDepartment(), ep.getSalary());
		}

		// 모든 객체에 인센티브 100 씩 지급한 급여를 계산하고 다시 객체의 salary에 넣는다 .
		for (Employee ep : employees) {
			if (ep instanceof Secretary) {
				((Secretary) ep).incentive(100);
			} else if (ep instanceof Sales) {
				((Sales) ep).incentive(100);
			}
		}

		System.out.println("\n인센티브 100 지급");
		System.out.printf("%-10s%-10s%10s%10s\n", "name", "department", "salary", "tax");
		System.out.println(String.format("%40s", "").replace(' ', '-'));
		// 모든 객체의 정보와 세금을 출력한다 (for 문을 이용하여 출력한다.)
		for (Employee ep : employees) {
			System.out.printf("%-10s%-10s%10d%10.1f\n", ep.getName(), ep.getDepartment(), ep.getSalary(), ep.tax());
		}

	}

}
