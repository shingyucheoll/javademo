package java022_lambda.part01;

//함수형 프로그래밍: 함수를 정의하고 이 함수를 데이터 처리부로 보내 데이터를 처리하는 기법
//데이터 처리부는 제공된 함수의 입력값으로 데이터를 넣고 함수에 정의된 처리 내용을 실행
//람다식: 데이터 처리부에 제공되는 함수 역할을 하는 매개변수를 가진 중괄호 블록이다. 
//자바는 람다식을 익명 구현 객체로 변환
//인터페이스가 함수형 인터페이스임을 보장하기 위해서는 @FunctionalInterface 어노테이션을 붙임
//@FunctionalInterface: 컴파일 과정에서 추상 메소드가 하나인지 검사해 정확한 함수형 인터페이스를 작성할 수 있게 도와주는 역할


//람다는 인터페이스를 기본으로하고 매소드객체는 하나만 가진다
public class LambdaMain {

	public static void main(String[] args) {
		
		// 내부에서는 이렇게 람다식을 처리
		// action(익명구현객체)
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				int result = x * y;
				System.out.printf("result:%d\n", result);

			}
		});
		
		// 람다식 (x, y) -> {int result = x + y;}
		// 람다식을 이용하면 객체를 새로 만들필요없이 자동 오버라이드 된다
		//2 익명구현 객체(@Override한것)를 람다식으로 구현가능하다
		action((x, y) -> {
			int result = x + y;
			System.out.printf("result:%d\n", result);
		});

		action((x, y) -> {
			int result = x - y;
			System.out.printf("result:%d\n", result);
		});

	}

	// 인터페이스 를 받는곳 (데이터가 제공되어야 한다)
	//1 받는객체는 함수형(FunctionalInterface) 인터페이스이여야만 한다(익명구현개체로 받아야한다) 
	public static void action(Calculable calculable) {

		// 데이터
		int x = 10;
		int y = 4;

		// 데이터 처리
		// 데이털르 제공하고 추상메소드를 호출
		calculable.calculate(x, y);
	}

}
