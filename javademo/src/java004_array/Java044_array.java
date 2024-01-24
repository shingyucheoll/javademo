package java004_array;
/*
 * data배열에서 대문자의 갯수를 출력하는 프로그램 구현
 * 
 * [출력결과]
 * 대문자 갯수: 2
 */
public class Java044_array {

	public static void main(String[] args) {
		
		char[] data = new char[] {'a','b','F','R','a'};
		int cnt = 0;
		for(int i = 0; i < data.length; i++) {
			if ( data[i] <= (char)89 ) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		
		

	}

}
