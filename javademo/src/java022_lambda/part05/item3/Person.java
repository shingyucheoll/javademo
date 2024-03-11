package java022_lambda.part05.item3;

public class Person {
	
	//데이터 처리부
	public Member getMember1(Creatable1 creatable1) {
		String id = "winter";
		
		Member member = creatable1.create(id);
		return member;
	}// end getMember1
	
	//데이터 처리부
	public Member getMember2(Creatable2 creatable2) {
		String id = "spring";
		String name = "여진구";
		
		Member member = creatable2.create(id,name);
		return member;
	}// end getMember2
	
	
	
}
