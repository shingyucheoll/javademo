package java011_casting.part05;

class ExamA {                  // 제일 상위 업스케일
	void prn() {
	}
}

class ExamB extends ExamA {    //  두번째 
	void prn() {
	}
}

class ExamC extends ExamB {
	void prn() {
	}
}

public class Java114_instanceof {

	public static void main(String[] args) {
		
		// instanceof는 데이터 타입과 같거나 조상 데이터 타입에는 true , 다운스케일일 경우 false
		// 얘가             얘와 같거나, 뒤에가 더 높을경우 true 반환
		// ()  instanceof  ()          <-  
		// 얘를      ->     얘로  변환하는것  - 조상엔 없고 자식에겐 있는 메서드를 사용하기 위해서.
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA);  // true
		
		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB);  // false
		
		ExamA ea = new ExamB();   // 다운스케일을 해서 현재 ea는 B인 상태        
		System.out.println(ea instanceof ExamA);  // true   
		System.out.println(ea instanceof ExamB);  // true
		System.out.println(ea instanceof ExamC);  // false
		System.out.println(ea instanceof Object);  // true
		

	}

}
