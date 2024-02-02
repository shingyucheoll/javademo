package java005_method;

public class Java057_method {

	public static void main(String[] args) {
		
		int a =4 ,b= 2,c= 5;
		System.out.println(process(a,b,c));
		
		int [] num = {2,3};
		System.out.println(plus(num));

	}//end main
	
	public static int process(int x, int y, int z) {
		return x+y+z;
	}//end process()
	
	public static int plus(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++)
			sum = sum + arr[i];
		return sum;
	}//end plus

}//end class
