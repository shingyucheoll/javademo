package java001_basic;
// 산술연산자와 문자열 연결 
public class Java008_operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		
		System.out.println(a+b); // 산술연산자
		System.out.println(a+"는 3입니다."); // 문자열 연결
		System.out.println("결과 : "+ (a + b)); // 문자열 연결 (산술연산자)
		System.out.println("결과 : "+ a + b); // -> 34 문자열+3 문자열+4가 되어 전부 문자열로 변경됨 "34"	
		

	}

}
