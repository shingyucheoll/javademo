package java003_statements;

public class Java029_for {

	public static void main(String[] args) {
		// 1 ~ 10까지 합계를 구하는 프로그램 구현
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;  // sum += i
		}
		
		System.out.printf("sum=%d\n", sum);
	}// end main()

}// end class
