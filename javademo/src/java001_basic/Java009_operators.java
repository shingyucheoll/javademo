package java001_basic;
	
/*
 * 증감연산자 : 증가연산자(++), 감소연산자(--)
 * 전위연산자 : 증감연산자가 변수 앞에 있을 때
 * 후위연산자 : 증감연산자가 변수 뒤에 있을 때
 */

public class Java009_operators {

	public static void main(String[] args) {
		
		int x = 3;
		
		// 전위연산자 : 증감연산자가 변수 앞에 있을 때
		++x;  //  x = x + 1
		System.out.println(x);
		// 전위연산자 : 증감연산자가 변수 앞에 있을 때		
		--x;  //  x = x - 1
		System.out.println(x);
		
		int y = 5;
	    // 후위연산자 : 증감연산자가 변수 뒤에 있을 때
		y++;  //  y = y + 1
		System.out.println(y);
		y--;  //  y = y - 1
		System.out.println(y);
		
		// 리터널은 증감연산자를 사용할 수 없다. 10++;  ->  사용불가능
		
		
		// 상수 한번만 기억 할 수 있는 메모리 공간
		final int NUM = 4;
//		NUM = 10;
//		새로운 값 할당 불가능 the Final local variable NUM connot be assigned
		
		

	}

}
