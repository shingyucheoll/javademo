package java003_statements;

public class Java035_for {

	public static void main(String[] args) {
		go:  // label 선언
		for(int i = 1; i <= 3; i++) {
			System.out.printf("i = %d\n", i);
			for(int j = 1; j <= 5; j++) {
				System.out.printf("j = %d\n",j);
				if (j == 3) {
//					break go;  // 현재 for문만 빠져나오는게 아니라 go: label의 for문 까지 빠져나감
//					continue go;  // 상단 for문의 증감식으로 이동됨 i++				
				}

			}
			
		}
		
		System.out.println("for end");

	}

}
