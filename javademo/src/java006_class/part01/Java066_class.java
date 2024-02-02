package java006_class.part01;
/*
클래스의 두가지 용도
1) 라이브러리(library)클래스 : 실행할 수 없으며 다른 클래스에서 이용하는 클래스
2) 실행 클래스 : main( )메소드를 가지고 있는 실행 가능한 클래스
*/
public class Java066_class {

	public static void main(String[] args) {
		int a = 5;
		a = 5;
		
		Person ps;  // 객체참조변수 선언
		
		ps = new Person();
		ps.name="홍길동";
		ps.age=30;
		ps.gender='남';
		System.out.printf("%s %d %c\n", ps.name,ps.age,ps.gender);
		ps.develop();
		ps.run();
		
		Person pn = new Person();
		pn.name="김영희";
		pn.age=28;
		pn.gender='여';
		System.out.printf("%s %d %c\n", pn.name,pn.age,pn.gender);
		
	}

}
