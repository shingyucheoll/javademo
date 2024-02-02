package java013_api;

import java.util.StringTokenizer;

public class Java137_StringTokenizer {

	public static void main(String[] args) {

		// 구분자가 연속적으로 입력되어 있으면 두번째 구분자부터는 무시를 함
		StringTokenizer st = new StringTokenizer("java./jsp/spring",",/");
		System.out.println(st.countTokens()); //3
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		System.out.println("==============");
		String[] data = new String("java,/jsp/spring").split(",/");
		System.out.println(data.length);
		for(int i = 0 ; i < data.length; i++) {
			System.out.println("data[]");
		}
		
	}

}
