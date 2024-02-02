package java005_method;

public class Java059_method {

	public static void main(String[] args) {
		// 조건 : data 변수에 소문자만 입력.
		char data = 'd';
		char code = process(data);
		System.out.printf("%c의 대문자는 %c입니다.\n",data, code);
	}
	
	public static char process(char data) {
		// data - 32 연산을 할 때, data는 char 타입이지만, - 연산자를 사용하면 int 타입으로 확장시키고 연산을 수행 
		// 그 결과도 int 타입이 됩니다. 따라서, 연산 결과를 다시 char 타입으로 변환하기 위해 캐스팅이 필요합니다.
		
		
		return (char)(data - 32);		
	}

}
