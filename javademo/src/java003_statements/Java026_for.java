package java003_statements;

public class Java026_for {

	public static void main(String[] args) {
		// 누적된 값이 최초로 15이상 일 때 까지만 반복문을 수행한다.
		int sum = 0;
		
		for (int i = 1 ; (sum += i ) <= 15 ; i++ ) {		
			
			System.out.printf("i=%d sum=%d\n",i,sum);
			
		}

	}

}
