package java012_api.part04;

// protected Object clone() throws CloneNotSupportedException

// 
public class House implements Cloneable { // clone 사용하려면 반드시 상속 받아야함. 
	
	String name;
	int age;
	Address address;
	
	public House(String name, int age, Address address) {	
		this.name = name;
		this.age = age;
		this.address = address;
	}	


	public House shallowCopy() {
		House house = null;
		try {
			house = (House)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return house;
		
	}
	
	
	public House deepCopy() {
		House house = null;
		try {
			Address CloneAddress = (Address)address.clone();
			house = (House)super.clone();
			house.address = CloneAddress ;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return house;	
	}		

}
