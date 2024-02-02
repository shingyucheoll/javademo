package java012_api.part08;

public class Java128_RegEx {
	/*
	 * 정규화 표현식(Regular Expression)
	 * 1 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을
	 *    찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서
	 *    작성한 문자열을 말한다.    
	 */
	public static void main(String[] args) {
		
		String sn = "java korea";
		String sg = "";
		
		// 'a' 또는 'r'이면 '_'로 변경
		for(int i =0; i < sn.length(); i++) {
			char data = sn.charAt(i);
			if(data == 'a' || data == 'r') {
				sg += "_";
			}else {
				sg += data;
			}
		}
		System.out.println(sg);
		
		System.out.println("=====Regular Expression을 이용한 문자 변경=====");
		// [] : or 의미
		// . : 임의 문자 하나
		// * : 0개 이상
		// + : 1개 이상
		// ? : 0 or 1
		
		// sn변수에 저장된 문자열을 a이거나 r이면 "_"로 변경
		System.out.println(sn.replaceAll("[ar]", "_"));
		System.out.println(sn);
		
		sn = "ear";
		System.out.println(sn.matches(".*[ar]")); 		//true
		System.out.println(sn.matches(".+[ar]")); 		//true
		System.out.println(sn.matches(".{1}[ar]")); 	// false
		System.out.println(sn.matches(".{1,3}[ar]"));	//true
		
		
		sn = "java korea";
		//sn변수에 저장된 문자열이 a 또는 r로 끝나면 true을 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar]"));
		
		//sn변수에 저장된 문자열이 a 또는 r로 시작하면 true을 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches("[ar].*"));
		
		//sn변수에 저장된 문자열이 a 또는 r를 포함하면 true을 리턴하고 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[ar].*"));
		
		
		String st = "java@@@korea";
		String sa = st.replaceAll("@{2,3}", "_");
		System.out.println(sa); //java_korea
		System.out.println(st); //java@@@@korea
		
		st = "java@@@@korea";
		sa = st.replaceAll("@{2,3}", "_");
		System.out.println(sa); //java_@korea
		System.out.println(st); //java@@@@korea
		
		st = "java@@@@korea";
		sa = st.replaceAll("@{2}", "_"); // 딱 2개
		System.out.println(sa);  //java__korea
		System.out.println(st);  //java@@@@korea
		
		st = "java@@@@korea";
		sa = st.replaceAll("@{2,}", "_"); //2개이상
		System.out.println(sa); //java_korea
		System.out.println(st); //java@@@@korea
		
		st = "java@korea";
		sa = st.replaceAll("@{2,}", "_");//2개이상
		System.out.println(sa); //java@korea
		System.out.println(st); //java@korea
		
		st = "java@@@korea";
		// '@'갯수가 1개 단위로 문자열을 구분해 준다.
		String[] line = st.split("@");
		for(int i = 0; i<line.length; i++) {
			System.out.printf("line[%d] : %s\n", i, line[i]);
		}
		
		st = "java@@@korea@@google@bard";
		// '@'갯수가 1개이상이면 문자열을 구분해 준다.
		 line = st.split("@{1,}");
		for(int i = 0; i<line.length; i++) {
			System.out.printf("line[%d] : %s\n", i, line[i]);
		}
		
	}

}
