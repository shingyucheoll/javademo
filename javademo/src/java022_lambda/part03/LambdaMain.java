package java022_lambda.part03;

public class LambdaMain {

	public static void main(String[] args) {
		
		Person person = new Person();
		//매개변수가 두개일 경우
		person.action1((name, job) ->{
			System.out.printf(name + "이");
			System.out.println(job + "을 합니다.");
		});
		
		person.action1((name, job)->System.out.println(name + "이 " +job + "을 합니다."));
		
		person.action2((word) -> System.out.printf("%s라고 외칩니다\n",word) );
		
	}// main
}// end class
