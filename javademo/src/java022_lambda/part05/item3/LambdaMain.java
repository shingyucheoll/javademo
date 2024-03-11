package java022_lambda.part05.item3;

// 값을받어서 객체값으로 리턴
public class LambdaMain {

	public static void main(String[] args) {

		Person person = new Person();

		// 익명구현 객체
		person.getMember1(new Creatable1() {

			@Override
			public Member create(String id) {
				return new Member(id); // 생성자를 이용하여 객체를 넘김
			}
		});

		// 람다식
		person.getMember1((id) -> new Member(id));

		// 생성자 참조
		person.getMember1(Member::new);

		//////////////////////////////////////////2개 받기//////////////////////////////
		// 익명구현 객체
		person.getMember2(new Creatable2() {

			@Override
			public Member create(String id, String name) {
				return new Member(id, name); // 생성자를 이용하여 객체를 넘김
			}
		});

		// 람다식
		person.getMember2((id, name) -> new Member(id, name));

		// 생성자 참조
		person.getMember2(Member::new);


	}// end main

}
