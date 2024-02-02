package java009_inheritance.part2;

public class MyChild extends MyFather{
	
	public MyChild() {   // 1
		super();  // 2  -> MyFather로 이동
		System.out.println("MyChild");  // 9 MyChild 호출했던곳으로 
	}

}
