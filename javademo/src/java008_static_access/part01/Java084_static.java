package java008_static_access.part01;

public class Java084_static {

	public static void main(String[] args) {
		
		System.out.println("StaticEx.y="+StaticEx.y); // 스테틱으로 선언된 변수는 바로 선언 가능하다
//		System.out.println("StaticEx.x="+StaticEx.x);
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d, se.y=%d\n", se.x,se.y);
		System.out.println(se.toString());
		
		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x,ss.y);		
		se.x = 20;
		se.y = 30;
		
		System.out.printf("se.x=%d, se.y=%d\n", se.x,se.y);  // x=20, y=30 
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x,ss.y);  // x=5,  y=30     static으로 선언한 y는 같이 변한다.
		
		System.out.println("StaticEx.y="+StaticEx.y); // 스테틱으로 선언된 변수는 바로 선언 가능하다

	}

}
