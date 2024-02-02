package java012_api.part07;

public class Java121_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println(str);
		System.out.println("문자열 : "+str.toString());
		System.out.println("문자열 길이 : "+str.length());		
		System.out.println("대문자 : " + str.toUpperCase());
		System.out.println("소문자 : " + str.toLowerCase());
		System.out.println("문자 : " + str.charAt(1));     // o  ( index 번호로 조회)
		System.out.println("문자 : " + str.indexOf("K"));  // " " 문자열이나 ' ' char 둘 다 사용 가능
		System.out.println("문자 : " + str.indexOf(97));   // 아스키 코드로도 조회 가능		
		System.out.println("문자 : " + str.indexOf('a', 5));   // index 5번째 이후의 a찾기 
		
		System.out.println("범위 : " + str.substring(5));   // 5번째 이후 String
		System.out.println("범위 : " + str.substring(0,5));   // 0~4번째
		
		String[] arr = str.split(",");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %s\n", i, arr[i]);
		}
		
		int x = 10;
		int y = 20;
		System.out.println(x + y);
		
		String s1 = String.valueOf(x);
		String s2 = String.valueOf(y);
		System.out.println(s1+s2);
		
		char[] data = {'1','2','3','4','5'};
		String s3 = String.valueOf(data);
		System.out.println(s3);
		
		String s4 = String.valueOf(data, 1, 3);
		System.out.println(s4);
		
		
		
		
	
		
		

	}

}
