package java012_api.part04;

public class Java118_Object_clone {
	
	public static void main(String[] args) {
		House house = new House("홍길동", 30, new Address("서울","서초구"));
//		House copy = house.shallowCopy();
		House copy = house.deepCopy();
		
		System.out.println(house);
		System.out.println(copy);
		
		System.out.println(house.name + house.age + house.address);
		System.out.println(copy.name + copy.age + copy.address);
		
		System.out.println(house.address.city);		
		System.out.println(copy.address.city);
		System.out.println(house.address.city + house.address.dong);
		System.out.println(copy.address.city + copy.address.dong);
		
		house.name = "김민재";
		house.address.city = "제주";
		
		System.out.println(house.name + house.age + house.address);
		System.out.println(copy.name + copy.age + copy.address);
		
		System.out.println(house.address.city);
		System.out.println(copy.address.city);
		
		
	}

}
