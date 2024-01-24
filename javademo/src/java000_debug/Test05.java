package java000_debug;

public class Test05 {

	public static void main(String[] args) {
		System.out.println("main start");
		process(3);
		System.out.println("main end");
	}

	public static void process(int num) {

		for (int i = 1; i <= num; i++) {
			System.out.printf("i=%d\n", i);
		}

	}

}
