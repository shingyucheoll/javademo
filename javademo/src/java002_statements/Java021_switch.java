package java002_statements;

/*
 * switch(식){
 *  case 값1 : 수행할 문장; break;
 *  case 값2 : 수행할 문장; break;
 *  case 값3 : 수행할 문장; break;
 *  default : 수행할 문장; 
 * }
 * 
 * 식의 결과 타입 : byte, short, char, int, enum(jdk7), String(jdk7)
 * switch~case에서 break을 만나면 현재 수행중인 제어문을 완전히 빠져나옴
 */
public class Java021_switch {

	public static void main(String[] args) {

		int score = 98;

		switch (score / 10) { // switch문을 사용해서 점수대 별로 등급 매기기
								// 90점대는 몫이 9로 떨어짐

		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		System.out.println("end main");

	}

}
