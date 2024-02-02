package java013_api;

import java.util.StringTokenizer;

public class Java136_StringBuffer {

	public static void main(String[] args) {
		
		// StringTokenizer("문자열", "구분자");
		// 문자열의 구분자가 공백일때는 2번째 파라미터값은 생략 할 수 있다.
		// StringTokenizer("java jsp");
		StringTokenizer st = new StringTokenizer("java_jsp",  "_");
		System.out.println(st.countTokens());	// 2
		System.out.println(st.nextToken());		// java
		System.out.println(st.countTokens());	// 1
		System.out.println(st.nextToken());		// jsp
		System.out.println(st.countTokens());	// 0
		// Exception in thread "main" java.util.NoSuchElementException
		// System.out.println(st.nextToken());	
		
		System.out.println("======countTokens()========");
		st = new StringTokenizer("java_jsp",  "_");
		int count = st.countTokens();
		for(int i = 0; i < count; i++) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("======hashTokens()========");
		st = new StringTokenizer("java_jsp",  "_");
		while(st.hasMoreTokens()) {	
			System.out.println(st.nextToken());
		}
		
	}

}
