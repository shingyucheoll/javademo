package java003_statements;
/*
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 */
public class Java032_for {

	public static void main(String[] args) {
		
		int data = 0;
		
//		for (; data < 12;) {
//			System.out.printf("%4d",++data);
//			if(data % 4 == 0) {
//				System.out.println();
//			}
//		}
		
		for (int row = 1; row <= 3; row++) { // 행
			for (int col = 1; col <= 4; col++) {
				System.out.printf("%4d", ++data);
			}
			System.out.println();
		}


	}

}
