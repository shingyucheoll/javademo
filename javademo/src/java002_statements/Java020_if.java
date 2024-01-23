package java002_statements;
/*
 * [문제]
 * data변수에 저장된 값이 대문자이면 "대문자입니다.", 소문자이면 "소문자입니다."
 * 그외는 "기타입니다."로 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * data='D'  =>  D는 대문자입니다.
 * data='d'  =>  d는 소문자입니다.
 * data='1'  =>  1는 기타입니다.
 */
// A = 65 , a = 97
public class Java020_if {

	public static void main(String[] args) {
		char data ='d';
		String result;
		result = data >= (char)65 ? data >= (char)97 ? "소문자" : "대문자" : "기타";
		System.out.printf("%c는 %s 입니다.",data,result);
		
//		if (data >= 'A' && data <= 'Z') {
//			System.out.printf("%c는 대문자입니다.\n", data);
//		} else if (data >= 'a' && data <= 'z') {
//			System.out.printf("%c는 소문자입니다.\n", data);
//		} else {
//			System.out.printf("%c는 기타입니다.\n", data);
//		}
		
//		for (int i=0; i<120; i++) {
//			System.out.print((char)i);
//			if ((char)i == 'a') {
//				System.out.println(i);
//			}
//		}
//		System.out.println("4 : "+(char)101);

	}

}
