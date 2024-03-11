package java024_lombok.part10;

public class BuilderMain {

	public static void main(String[] args) {
		
		Book bk = new Book("j001", "java의 정석");
		System.out.println(bk);
		
		Book bn = new Book("mysql", "m001");
		System.out.println(bk);
		
		User us = User.builder().name("김민재").salary(3000).chk(false).build();
		System.out.println(us);
		
		User us2 = User.builder().name("김잼민").salary(2000).chk(false).build();
		System.out.println(us2);
		
		User us3 = User.builder().name("길동이").build();
		System.out.println(us3);
		
//		statiac 선언된 멤버변수는 생성자로 초기화가 되지 않는다.
//	    The method code(String) is undefined for the type User.UserBuilder
//		User us4 = User.builder().code("a001").name("길동이").build();
//		System.out.println(us4);

		

		
		

	}

}
