package java003_statements;
/*
 * while(조건식){
 *    반복 수행 문장;
 * }
 * 
 * while문은 조건식을 생략할 수 없다.
 */
public class Java036_while {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			System.out.println(i++);
		}

	}

}
