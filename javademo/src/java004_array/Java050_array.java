package java004_array;
/*
 * 출력결과
 * 1 2 3 4 5
 * 10 9 8 7 6 
 * 11 12 13 14 15
 * 20 
 * 
 */
public class Java050_array {

	public static void main(String[] args) {
		 int[][] num = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};

	        for (int i = 0; i < num.length; i++) {
	            if (i % 2 == 0) {
	                for (int j = 0; j < num[i].length; j++) {
	                    System.out.printf("%4d", num[i][j]);
	                }
	            } else {
	                for (int j = num[i].length - 1; j >= 0; j--) {
	                    System.out.printf("%4d", num[i][j]);
	                }
	            }
	            System.out.println();
	        }

	}

}
