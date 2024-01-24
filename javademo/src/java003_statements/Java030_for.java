package java003_statements;

public class Java030_for {

	public static void main(String[] args) {
		
		int odd = 0;
		int even = 0;
		
		for (int i = 1; i <= 10; i++) {
			if ( i % 2 != 0) {
				odd += i;
			}else {
				even += i;
			}
			
		}
		System.out.printf("홀수누적:%d\n짝수누적:%d",odd, even);		

	}

}
