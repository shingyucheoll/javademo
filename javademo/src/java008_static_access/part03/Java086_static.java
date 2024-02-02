package java008_static_access.part03;

public class Java086_static {
	
	int x = 5;
	static int y = 10;

	public static void main(String[] args) {  
		System.out.println("main");
//		process();   static method가 아니면 메서드에서 호출할 수 없다. 
		display();
		
		// non-static 메서드는 호출해서 사용해야한다.
		Java086_static js = new Java086_static();
		js.process();
		

	}
	
	public void process() {  // non-static 자원
		System.out.println("process");
		System.out.println("x = " +x);
		System.out.println("y = " +y);  
	}
	
	public static void display() {
		System.out.println("display");
//		non-static 자원은 static 메소드에서 호출 할 수 없다.
//		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
