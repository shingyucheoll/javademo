package java000_debug;

public class Test04 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; (sum += i) <= 15; i++) {

			System.out.printf("i=%d sum=%d\n", i, sum);

		}

	}

}
