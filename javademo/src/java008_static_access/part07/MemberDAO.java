package java008_static_access.part07;

public class MemberDAO {
	
	// singleton을 사용하려면 private 선언이 규칙이다.
	
	private MemberDAO() {
		
	}
	
	private static MemberDAO dao = new MemberDAO();
	
	
	
	public static MemberDAO getInstance() {
		return dao;
	}



	public void display() {
		System.out.println("display");
		
	}

}
