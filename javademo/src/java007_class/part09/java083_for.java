package java007_class.part09;

import java006_class.part08.Employees;

public class java083_for {

	public static void main(String[] args) {
		Employees[] emp = new Employees[2];
		emp[0] = new Employees("John", 5000);
		emp[1] = new Employees("Steven", 8000);
		
		for(Employees data : emp) {
			System.out.println(data.toString());
		}
		
	
		
	}

}
