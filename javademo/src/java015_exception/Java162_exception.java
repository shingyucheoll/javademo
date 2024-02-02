package java015_exception;

public class Java162_exception {

	public static void main(String[] args) {
		String data1 = "8";
		String data2 = "0";

		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
			int res = x / y;
	
			System.out.println(res);
//		} catch (Exception e) {                              중복 상속관계 맨밑에 놔두면 괜찮다
//			System.out.println(e.toString());
						
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (NumberFormatException e) {
			System.out.println(e.toString()); // 상속관계 조심
		}

	}

}
