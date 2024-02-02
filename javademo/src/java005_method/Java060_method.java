package java005_method;

public class Java060_method {
	
	public static void main(String[] args) {
		int data = 9;
		
//		if(process(data)) {
//			System.out.printf("%d는 짝수입니다",data);
//		}else {
//			System.out.printf("%d는 홀수입니다",data);
//		}
		  System.out.printf("%d는 %s입니다.\n", data, process(data) ? "짝수" : "홀수");
		
	}
	
	public static boolean process(int data) {
//		if(data % 2 == 0) {
//			return true;
//		}else {
//			return false;
//		}
		return data % 2 == 0 ? true : false;
	}
}
