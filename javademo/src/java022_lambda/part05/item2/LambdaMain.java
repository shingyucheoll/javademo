package java022_lambda.part05.item2;

//리턴값이 있는 람다 함수2
public class LambdaMain {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.ordering(new Comparable() {
			
			@Override
			public int compare(String a, String b) {
				return a.compareToIgnoreCase(b);
			}
		});
		//람다식
		person.ordering((a,b)-> a.compareToIgnoreCase(b));
		//메소드 참조
		person.ordering(String :: compareToIgnoreCase);

	}

}
