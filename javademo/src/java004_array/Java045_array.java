package java004_array;

public class Java045_array {

	public static void main(String[] args) {
		// 2차원 배열
		//			    3행 2열 2차원 배열         0    1   (index)
//		int[][] num = new int[3][2];     // 0 (0,0)(0,1)
//										 // 1 (1,0)(1,1)
//										 // 2 (2,0)(2,1)
//		num[0][0] = 1;
//		num[0][1] = 2;
//		num[1][0] = 3;
//		num[1][1] = 4;
//		num[2][0] = 5;
//		num[2][1] = 6;		
		
		int[][] num = new int[][] {
			{1,2},
			{3,4},
			{5,6}
			};
			
		System.out.println("num.length = "+num.length);       // 행의 length
		System.out.println("num[0].length = "+num[0].length); // 열의 length
		
		for (int i = 0; i < num.length; i++) {
			
			for(int j = 0; j < num[i].length; j++) {	
				System.out.printf("num[%d][%d]=%d",i,j,num[i][j]);
				System.out.print(j != num[i].length-1 ? '\t' : '\n');
							   //0    !=    1     true   \t
							   //1    !=    1    false          \n
				
				               // 열의 길이가 3일 경우
							   //0    !=    2     true   \t
				               //1    !=    2     true   \t
							   //2    !=    2    false          \n				

				
				               
			}			
//			System.out.println();
		}

	}

}
