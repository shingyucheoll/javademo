package java012_api.part07;

public class Java123_String {
	
	public static void main(String[] args) {
		
		String sn = "korea";
		char[] data = display(sn);
		System.out.println(data);
		System.out.println(sn);
				
	}
	
	public static char[] display(String alpa) {		
		char[] arr = new char[alpa.length()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = alpa.charAt(alpa.length()-i -1);
		}
		
		return arr;
		
	}

}
