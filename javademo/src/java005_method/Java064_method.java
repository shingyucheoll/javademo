package java005_method;
/*
 * java test
 * tset avaj
 * java test
 */

public class Java064_method {

	public static void main(String[] args) {
		char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);

	}

	public static char[] reverse(char[] data) {
		char[] alpa = new char[data.length];
		System.out.println(data.length);
		for (int i = 0; i < alpa.length; i++) {
			
			alpa[i] = data[data.length -1 -i];
			
			// arr에 index 0~8 까지 있으므로 length는 9로 찍힘
			// 0=8 1=7 2=6 ... 하려면 0 = 9 상태에서 9 - 1 default로 주고 i값을 빼주면 된다. 
		}

		return alpa;
	}

}
