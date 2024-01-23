package java001_basic;

// 실행 class 에는 main method가 있어야 한다.
public class Java002_comment {

	/**
	 *  process 메소드는 3을 출력하는 메소드
	 *  
	 *  
	 *  java doc 주석 : 프로그램 문서를 만들때 사용하는 주석
	 *  File > Export > Java > Javadoc > Next > Next > Next > VM options:-charset UTF-8 -encoding UTF-8
	 *  Finish		
	 */			
	public static void main(String[] args) {   //  main ctrl + space

// 한라인 주석
// ctrl + /            취소 ctrl + /
// 여러줄 주석
/* ctrl + shift + /    취소 ctrl + shift + \ (역슬래쉬) */
		
		System.out.println(3);   // syso ctrl + space
		System.out.println(3);
		System.out.println(3);		
		
		
	} // end main	
	

} // end class
