package java004_array;

public class Java052_array {

	public static void main(String[] args) {
		// 가변배열을 생성할 때는 제일 마지막의 배열크기는 지정하지 않는다.
		//가변 배열을 제공하는 이유는 메모리 ㅅ손실을 최소화 하기 위한 목적이다.
//		int [][] num = new int[3][];
//		num[0] = new int[2]; // 0행에 2개의 열을 생성
//		num[1] = new int[3]; // 1행에 3개의 열을 생성
//		num[2] = new int[5]; // 2행에 5개의 열을 생성함
//		
//		int[][] num = new int[3][];
//		num[0] = new int[] {1,2};
//		num[1] = new int[] {3,4,5};
//		num[2] = new int[] {6,7,8,9,10};
		
		int[][] num = new int[][] {{1,2},{3,4,5},{6,7,8,9,10}};
		
		for (int row =0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.println();
		}
		
	}

}
