package java015_exception;

public class Java161_exception {

	public static void main(String[] args) {
		StringBuffer sBuffer = null;
		try {
			sBuffer.reverse();
			
		}catch (NullPointerException e) {
			sBuffer = new StringBuffer("java");
			sBuffer.reverse();
			System.out.println(sBuffer);
		}

	}

}
