package java017_collection.part04;

import java.util.Vector;

/*
 * 홍길동 30
 * 이영희 25
 */
public class Java183_Vector {

	public static void main(String[] args) {
		// 타입 관계을 정의하기 힘듬
		String nameA ="홍길동";
		int ageA = 30;
		
		String nameB ="이영희";
		int ageB = 25;
		
		// 너무 많은 나열
		Person p1 = new Person("홍길동",30);
		Person p2 = new Person("이영희",25);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		//사이즈 지정하면 에러사항
		Person[] ps = new Person[2]; 
		
		ps[0] = new Person("홍길동",30);
		ps[1] = new Person("이영희",25);
		for(Person pn :ps)
			System.out.println(pn.toString());
		
		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동",30));
		vt.add(new Person("이영희",25));
		for(Person pn :vt)
			System.out.println(pn.toString());
		
		
		

	}

}
