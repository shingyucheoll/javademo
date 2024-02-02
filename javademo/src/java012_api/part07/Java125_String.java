package java012_api.part07;

public class Java125_String {

	public static void main(String[] args) {
		
		String stn = new String("java_jsp_spring");
		char[] data = stn.toCharArray();
		char[] result = process(data);
		System.out.println(result);

	}
	
	public static char[] process(char[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] == '_') {
				arr[i] = ' ';
			}
		}
		
		
		return arr;
		
	}

}
