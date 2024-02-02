package java012_api.part03;

import java.util.Objects;  // Objects < s 가 붙어있음.

public class Member {
	
	String name;
	int age;

	public Member(String name, int age) {	
		this.name = name;
		this.age = age;	
	}
	
	// name 변수값이 같은 Member 객체는 항상 같은 hash code를 반환한다.
	@Override
	public int hashCode() {
		return Objects.hash(age, name);  // Objects < s 가 붙어있음.			
		
	}
	
	

}
