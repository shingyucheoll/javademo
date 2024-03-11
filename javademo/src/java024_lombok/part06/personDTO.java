package java024_lombok.part06;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*

 * 1. 특정 멤버변수에 @Getter, @Setter을 추가하면 해당멤버변수의 getter(), setter()메소드가 만들어진다.
 *     static 멤버변수에 @Getter, @Setter을 추가해도 문법적으로는 이상없다.
 * 
 * 2. AccessLevel : Public, Protected, Package, Private,  
 *    None : Getter, Setter 생성을 차단할 때 사용한다.
 */

//@NoArgsConstructor
public class personDTO {

	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private static int age;
	@Setter(AccessLevel.PROTECTED)	// loc멤버변수의 setter메소드의 접근제어자는 protected로 생성한다.    // 기본값은 public
	private String loc;	// protected void setLoc(String loc){}
	
	private int salary;
	
	public void display() {
		System.out.println("salary : " + salary);
//		System.out.println("getSalary() : "+getSalary());
		
	}
	

}
