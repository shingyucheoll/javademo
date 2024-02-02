package java013_api;

public class Java138_Math {

	public static void main(String[] args) {
		int[] num = new int[5];	//1부터 10까지
		
		double de = Math.random();
		System.out.println(de);	// 0.0부터 1.0미만
		
		de = de * 10;
		System.out.println(de); // 0.0부터 ~ 9.999...
		
		System.out.println(Math.floor(de)); // 0.0 ~ 9.0
		
		System.out.println((int)Math.floor(de)); // 0.0 ~ 9.0
		System.out.println((int)Math.floor(de) + 1);	// 1~ 10
		
		System.out.println((int)Math.floor(Math.random() * 10) + 1);	
	}

}

