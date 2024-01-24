package java000_debug;

public class Test06 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 5 ; i++) {
			System.out.printf("i=%d\n", i);
			sum += i;
		}
		
		display(sum);
	}
	public static void display(int sum) {
		System.out.printf("sum=%d\n", sum);
		
	}

}
