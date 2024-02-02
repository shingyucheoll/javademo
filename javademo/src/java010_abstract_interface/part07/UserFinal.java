package java010_abstract_interface.part07;

public class UserFinal extends FinalTest {

	public UserFinal() {

	}

	@Override
	void display() {
		System.out.println("UserFinal display");
	}

//	void process() {   // Cannot override the final method from FinalTest
					   // FinalTest의 process() 메서드는 final 메서드이기 때문에 불러올 수 없다.
//		
//	}

}
