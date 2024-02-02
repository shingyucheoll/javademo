package java012_api.part03;

public class Java117_Object_hashCode {

	public static void main(String[] args) {

		Person p1 = new Person("홍길동");
		Person p2 = new Person("홍길동");
		System.out.println(p1); // java012_api.part03.Person@7a81197d //16진수
		System.out.println(p2); // java012_api.part03.Person@5ca881b5 //16진수

		// hashCode는 16진수를 10진수로 바꿔서 처리해줌
		System.out.println(p1.hashCode()); // 2055281021
		System.out.println(p2.hashCode()); // 2055281021

		System.out.println("/////////Member///////////");

		Member m1 = new Member("홍길동", 20);
		Member m2 = new Member("홍길동", 21);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());

		// System.identityHashCode(); 원래 해시코드 반환
		System.out.println(System.identityHashCode(m1));
		// 원래 해시코드 1159190947
		System.out.println(System.identityHashCode(m2));
		// 원래 해시코드 925858445

		System.out.println("==========String==========");
		String s1 = "java"; // 그냥 선언하면 같은 값일 경우 주소값 공유
		String s2 = "java";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		String s3 = new String("java"); // new를 통해서 생성하면 새로운 메모리 무조건 생성 후 할당
		String s4 = new String("java");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		System.out.println("=======identityHashCode========");
		System.out.println(System.identityHashCode(s1)); // 798154996
		System.out.println(System.identityHashCode(s2)); // 798154996
		System.out.println(System.identityHashCode(s3)); // 681842940
		System.out.println(System.identityHashCode(s4)); // 1392838282

		// == 주소확인 , .equals 값 확인
		System.out.println(s1 == s2);// true
		System.out.println(s1.equals(s2));// true
		System.out.println(s3 == s4);// false
		System.out.println(s3.equals(s4));// true
		System.out.println(s1 == s3); // false
		System.out.println(s1.equals(s3)); // true

	}// end main

}// end class