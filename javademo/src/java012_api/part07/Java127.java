package java012_api.part07;

import java.util.StringJoiner;

// java.lang.String join() 과 java.util.StringJoiner 차이

public class Java127 {

	public static void main(String[] args) {
		String color = "red,green,blue";
		String[] arr = color.split(",");
		String str = String.join("-", arr);
		System.out.println(str);

		StringJoiner sj = new StringJoiner(",,,", "☆", "★"); 
		for(String data : arr) {
			sj.add(data);
		}
		System.out.println(sj);
		System.out.println(sj.length());

	}

}
