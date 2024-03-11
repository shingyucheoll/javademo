package java022_lambda.part05.item1;

public class Computer {
	
	//new 생성없이 바로 사용가능
	public static double staticMethid(double x, double y) {
		return x+y;
	}
	
	
	// new 객체 생성 후 사용가능
	public double instanceMethod(double x, double y) {
		return x*y;
	}
}
