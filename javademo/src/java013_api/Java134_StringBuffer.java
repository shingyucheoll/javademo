package java013_api;

import java.nio.CharBuffer;

public class Java134_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		sb.insert(4, "jsp");
		System.out.println(sb);	 // javajsp test
		
		sb.insert(4, 7);
		System.out.println(sb);	 // java7jsp test
		
		sb.reverse();
		System.out.println(sb);
		
		// String -> StringBuffer -> String
		String data = "mybastis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf);
		String ss = sf.toString();
		System.out.println(ss);
		
		// char[] -> StringBuffer
		char[] arr = {'k', 'o', 'r', 'e', 'a'};
		StringBuffer sk = new StringBuffer(new String(arr));
		System.out.println(sk.reverse());
		
		StringBuffer se = new StringBuffer(String.valueOf(arr));
		System.out.println(se.reverse());
		
		// StringBuffer -> String -> char[]
		String sp = se.toString();
		char[] val = sp.toCharArray();
		System.out.println(val);
		
		System.out.println(se.toString().toCharArray());
	}

}
