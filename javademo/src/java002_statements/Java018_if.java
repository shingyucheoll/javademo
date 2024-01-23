package java002_statements;
/*
 * if(조건식){
 *   if(조건식){
 *       수행문장;
 *    }else{
 *       수행문장;
 *    }
 * }else{
 *     if(조건식){
 *        수행문장;
 *     }else{
 *         수행문장;
 *     }
 * }
 */
public class Java018_if {

	public static void main(String[] args) {
		boolean member = true;
		String grade = "일반";
		// 회원
		if(member) {
			// VIP
			if(grade=="VIP") {
				System.out.printf("고객님은 %s 등급이며, %d%%적립 했습니다.\n",grade, 30);
			}else {
				System.out.printf("고객님은 %s 등급이며, %d%%적립 했습니다.\n",grade, 10);
			}
		}else {
			// 비회원
			System.out.printf("고객님은 %s 등급이며, %d%%적립 했습니다.\n","비회원", 0);
			
		}
		System.out.println("방문 감사합니다.");
	}

}
