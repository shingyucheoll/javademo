package java003_statements;

/*
 * do {
	반복 수행문장;
   } while(조건식);
*/


public class Java038_while {

	public static void main(String[] args) {
		char chk = 'n';
		
		do {
			System.out.println("주문하시겠습니까? (y/n)");
		} while(chk=='y');

	}

}
