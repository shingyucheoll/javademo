package java022_lambda.part05.item1;

public class Person {

	//데이터 구현부
	public void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("result " + result);
	}
}
