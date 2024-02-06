package java015_exception;

public class Java166_exception {

	public static void main(String[] args) {
		
		int data = 8;
		
		try {
			
		
			if(data < 10) {
				// throw : 개발자가 강제적으로 예외 발생
				throw new UserException("10이상만 입력하세요.");
			}
			System.out.println(data);
		} catch(UserException ex){
			System.out.println(ex.getMessage());
		}
		
		

	}

}
