package java022_lambda.part04;

//리턴값이 있는경우
public class LambdaMain {

	public static void main(String[] args) {

		// 함수선언
		Person person = new Person();

		// 실행문이 두개이상
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});

		person.action((x, y) -> {
			return x + y;
		});

		// 실행문이 한개일때는 중괄호와 함께 리턴도 생략된다
		person.action((x, y) -> x + y);

		person.action((x, y) -> sum(x, y));

	}

	public static double sum(double x, double y) {
		return x + y;
	}
}
