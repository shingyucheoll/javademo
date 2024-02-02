package java004_array;

/*
* [데이터]
* 홍길동   90  85 40
* 이영희  100  35 75
* 
* [출력결과]
* 홍길동   90  85 40 215 71.7
* 이영희  100  35 75 210 70.0
*/
public class Java047_array {

	public static void main(String[] args) {
		String[] name = { "홍길동", "이영희" };
		int[][] jumsu = { { 90, 85, 40 }, { 100, 35, 75 } };

		int sum;
		double avg;

//		System.out.printf("%s\t", name[0]);
//		sum = 0;
//		sum =sum+jumsu[0][0];
//		System.out.printf("%d\t", jumsu[0][0]);
//		sum =sum+jumsu[0][0];
//		System.out.printf("%d\t", jumsu[0][1]);
//		sum =sum+jumsu[0][0];
//		System.out.printf("%d\t", jumsu[0][2]);
//		System.out.printf("%d\t", sum);
//		avg = (double)sum/jumsu[0].length;
//		System.out.printf("%.1f\n", avg);

		for (int row = 0; row < jumsu.length; row++) {
			System.out.printf("%s\t", name[row]);
			sum = 0;

			for (int col = 0; col < jumsu[row].length; col++) {
				sum = sum + jumsu[row][col];
				System.out.printf("%d\t", jumsu[row][col]);
			}

			System.out.printf("%d\t", sum);
			avg = (double) sum / jumsu[row].length;
			System.out.printf("%.1f\n", avg);
		}
	}// end main

}// end class
