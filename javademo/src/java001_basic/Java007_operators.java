package java001_basic;
// double의 계산식 순서 일반 나눗셈과 double 강제형변환 후 나눗셈 계산 후 형변환
public class Java007_operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		System.out.println(a/b);
		System.out.println((double)a / b);
		System.out.println((double)(a / b));
	
		

	}

}
