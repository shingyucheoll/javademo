package java005_method;

public class Java065_method {

	public static void main(String[] args) {
		char[] data = {'a','b','c'};
		
		for(int i = 0; i<data.length; i++) {
			System.out.println(data[i]);
		}
		
		System.out.println();
		
		System.out.println(data);  // 해당값만 제대로 나오게 된다. char만?
 		
		System.out.print(data+"\n");		
		System.out.printf("%s\n", data);
		
		int[] num = {1,2,3};		
		System.out.println(num);

	}

}
