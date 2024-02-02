package java005_method;

public class Java063_method {

	public static void main(String[] args) {
		
		int toeic = 75;
		int it = 60;
		int sum = total(toeic, it);
		
		System.out.printf("입시총점:%d점\n", sum);
		System.out.printf("입시결과:%s\n", rs(sum));
		

	}
	
	public static int total(int toeic, int it) {
		
		return toeic + it;
		
	}
	
	public static String rs(int tot) {
		
		return tot >= 150 ? "합격" : "불합격";
		
	}

}
