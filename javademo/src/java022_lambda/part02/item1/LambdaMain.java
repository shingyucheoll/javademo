package java022_lambda.part02.item1;

public class LambdaMain {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.action(new Workable() {
			
			@Override
			public void work() {
				System.out.println("work");
				
			}
		});
		///////////////////////////////////////////////////
		
		//실행문 두개 이상인경우 중괄호{} 필요
		person.action(() -> {
			System.out.println("출근을 합니다");
			System.out.println("프로그래밍을 합니다");
		});
		
		
		// 실행문이 한개일때
		person.action(() -> System.out.println("퇴근을 합니다"));
	}//end main

}//end class
