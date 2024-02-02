package java013_api;

//import static java.lang.Math.E;
//import static java.lang.Math.min;

//
// 클래스에서 static 키워드가 선언된 멤버변수, 메소드 호출할 때
// import static을 선언하면 클래스명 없이 멤버변수, 메소드를 호출할 수 있음
//
import static java.lang.Math.*;

public class Java140_Math {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.max(10, 20));
		System.out.println(E);
		System.out.println(min(10,20));
		System.out.println(sqrt(25));	 // 제곱근
		System.out.println(PI);
		System.out.println(pow(2,3));	// 거듭제곱 (2의 3승)

	}

}
