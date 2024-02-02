package java010_abstract_interface.part06;

public class UserTest extends User implements Score, Print{
	
	private int s;
	
	public UserTest() {
	
	}
	
	// User에 name을 정의 해놨기 때문에 정의하고,
	// 새로 받아야 하는 int 값은 private int s 로 지정
	public UserTest(String name, int s) {		
		super(name);
		this.s = s;
	}
	
	
	
	@Override
	public int getScore() {
		return sol * s;
	}
	
	@Override
	public String toPaint() {
		return String.format("이름 : %s\n점수 : %d",toString(),getScore());
	}

	

}
