package java001_basic;
/* 리터널(literal) : 그 자체의 값(1, 2, 3, ..., 'a','b','c'..., true, false)
 * 변수 (variable) : 하나의 값을 저장하기 위한 메모리 공간
   예약어(keyword) :  https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html
   식별자(identifier) : 프로그램에서 사용자가 정의한 이름을 '식별자(identifier)'라고 한다.
   변수의 명명규칙
     1) 대소문자가 구분되며 길이에 제한이 없다.
	 2) 예약어를 사용할 수 없다.
	 3) 숫자로 시작할 수 없다.
	 4) 특수문자는 '_', '$'만을 허용한다.
	 5) 클래스는 파스칼(pascal) 표기법, 변수와 메소드는 카멜(camel) 표기법을 사용한다.
	     ex) 파스칼(pascal) 표기법 : HelloWorld,   카멜(camel) 표기법 : helloWorld
 * 자바에서 제공하는 데이터 타입
 * 1. Primitive DataType (기본 데이터 타입)
 *    문자 - char(2byte)
 *    숫자 - 정수 - byte(1byte), short(2byte), int(4byte), long(8byte)
 *       - 실수 - float(4byte), double(8byte)
           [float] 부호(1bit)+지수(8bit) +가수(23bit) = 32bit = 4byte
		   [double]부호(1bit)+지수(11bit)+가수(52bit) = 64bit = 8byte
 *    논리 - boolean(1byte)
 *    
 * 2. Reference DataType (참조 데이터 타입)
 *    Array, Class , Interface
 *  
 * 3. 시스템에서 데이터 타입 크기
 * 	  byte < char = short < int < long < float < double
 * 
 */
public class Java003_datatype { 
 
	public static void main(String[] args) {
		
		int data;  // 데이터타입 변수명;   
		           // 지역변수 , main method에서만 사용 가능하다.		
		data = 3;
		
		System.out.println(data);
		
		int x = 0101;   // 앞에 0이 들어가면 8진수
		
		int y = 0B101;  // 앞에 0B가 붙으면 2진수
		
		int z = 0x101;  // 앞에 0x가 붙으면 16진수
		// a=10, b=11, c=12, d=13, e=14, f=15,
		
		System.out.println("x : "+x);		
		System.out.println("y : "+y);		
		System.out.println("z : "+z);
		
		double m = 5e2;  // 5.0 * 10^2  = 5 * 100 = 500.0
		System.out.println("m : "+m);
		
		double n = 0.12E-2;  // 0.12 * 10^-2  =  0.12 * 1/100 =  0.0012   E가 대문자던 소문자던 상관없다.
		System.out.println("n : "+n);
		
		boolean chk = false;
		System.out.println("chk : " + !chk);  // boolean  ,  !chk = true
		
		char grade = 'A';
		System.out.println("grade : "+grade);
		
		String name = "홍길동";
		System.out.println("name : "+name);
		
		

	}

}
