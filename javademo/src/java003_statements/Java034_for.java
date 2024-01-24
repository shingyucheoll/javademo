package java003_statements;

public class Java034_for {

	public static void main(String[] args) {
		int result = 0;
		for(int x = 1; x <= 6; x++) {			
			for (int y = 1; y <= 6; y++) {
				if ( x + y == 5) {
					System.out.printf("(%d,%d)\n",x,y);
				}
			}				
		}
		
	}

}
