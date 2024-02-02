package java004_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 * [출력결과]
 *  1   2   3   6   [0][0~2]값을 [3]에
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 * [0~2][0] 값을
 * [3][0] 에
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
//		System.out.println(data.length);
		int cnt = 1;
		for (int i = 0; i < data.length - 1; i++) {
			int rowSum = 0;
			for (int j = 0; j < data[i].length - 1; j++) {
				data[i][j] = cnt++;
				rowSum += data[i][j];
				System.out.printf("%4d", data[i][j]);
			}
			System.out.printf("%4d", data[i][data[i].length - 1] = rowSum);
			System.out.println();
		}

		for (int i = 0; i < data.length; i++) {
			int colSum = 0;
			
			for (int j = 0; j < data.length-1; j++) {
				colSum += data[j][i];
				
			}
			data[data.length-1][i] = colSum;
			System.out.printf("%4d", data[data.length-1][i]);
			
		}
		
		

	}// end main()

}// end class
