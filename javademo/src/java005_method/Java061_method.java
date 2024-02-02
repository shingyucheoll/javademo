package java005_method;
/*
 * [출력결과]
 * 문자열의 길이 : 4
 * 2인덱스 요소값 가져오기 : v
 */
public class Java061_method {

	public static void main(String[] args) {
		
		char[] data = new char[] {'j','A','v','a'};
		int searchIndex = 2;
		System.out.printf("문자열의 길이 : %d\n", length(data));
		System.out.printf("%d인덱스 요소값 가져오기 : %c\n", searchIndex, charAt(data, searchIndex));		

	}
	
	public static int length(char[] data) {
		
		
		return data.length;
	}
	
	public static char charAt(char[] data, int index) {
		
		return data[index];
		
	}

}
