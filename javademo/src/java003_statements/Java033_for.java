package java003_statements;

public class Java033_for {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 4; x++) {
			
			for (int y = 1; y <= 5; y++) {
				System.out.print(" "+y);				
			}
			System.out.println();
			
		}
		
		for (int x = 0; x < 4; x++) {
			
			for (int y = 0; y < 5; y++) {
				System.out.printf("%3d",(x * 5 + y + 1));				
			}
			System.out.println();
			
		}


	}

}
