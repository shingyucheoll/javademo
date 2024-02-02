package java009_inheritance.part1;

public class Father {
	
	int a = 3;
	// Child에서 상속받아도 사용하지 못함.
	private int c = 10;
	
	public Father() {
		
	}
	
	public void display() {
		System.out.println("a = " +a);
	}

}
