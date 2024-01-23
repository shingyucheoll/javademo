package java001_basic;
/*
 * 연산자 (operator) : 어떠한 기능을 수행하는 기호(+, -, *, /, %, >, <, >=, <=, ==, != ...)
 * 피연산자(operand) : 연산자의 작업 대상 ( 변수, 상수, 리터널, 수식...)
 * 
 * 연산자의 종류
 * 1. 산술연산자(이항연산자) : +, -, *, /,%
 * 2. 비교연산자(이항연산자) : >, <, >=, <=, ==, !=
 * 3. 논리연산자(이항연산자) : &&(and), ||(or), !(not)
 * 4. 조건연산자(삼항연산자) : 조건식 ? 참 : 거짓
 * 5. 대입연산자(이항연산자) : =, +=, -=, *=, /=,...
 * 6. 증감연산자(단항연산자) : ++(1씩 증가), --(1씩 감소)  
 */

public class Java006_operators {
	
	public static void main(String[] args) {
		
		int numX = 10;
		int numY = 5;		
		int res = numX + numY;
		System.out.println(res);
		
		
		double avg = 4.5;
		double data = 3.9;
		double val = avg + data;
		System.out.println(val);
		
		short a = 3;
		short b = 4;
		
		// int 이하끼리 연산하면 int로 리턴하기 때문에
		// short c = a + b   -> 에러발생
		int c = a + b;
		System.out.println(c);
		
		/*
		 * short + short = int 
		 * byte + byte = byte
		 * char + char = int
		 * short + byte = int
		 * int + byte = int
		 */
		
		char eng = 'A';  // 65
		char num = '0';  // 48
		int sum = eng + num;
		System.out.println("sum : "+sum);
		
		
		
		
	}
	
	

}
