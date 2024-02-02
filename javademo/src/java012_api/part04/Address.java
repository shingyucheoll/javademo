package java012_api.part04;

public class Address implements Cloneable {
	
	String city;
	String dong;
	public Address(String city, String dong) {	
		this.city = city;
		this.dong = dong;
	}
	
	
	// House 에서 깊은 복사를 하기 위해 implements Cloneable을 사용한 메서드를
	// 재정의 해서 House에서 사용할 수 있게 해준다.
	
	public Address clone() {
		
		Address obj = null;
		try {		
			obj = (Address)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return obj;
		
	}
	
	

}
