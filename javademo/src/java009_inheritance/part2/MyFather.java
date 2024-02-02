package java009_inheritance.part2;

// 자식클래스의 생성자에서는 부모클래스의 생성자를 호출해야한다.
public class MyFather extends MyGrand {
	
	public MyFather() {  //3
		super();  //4 MyGrand로 이동
		System.out.println("MyFather");  //  8 - Father 끝나고 Child
	}

}
