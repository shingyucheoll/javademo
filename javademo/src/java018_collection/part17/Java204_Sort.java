package java018_collection.part17;
//이전껀 숫자 이건 문자
public class Java204_Sort {

	public static void main(String[] args) {
		String a = "ABCawser24";
		String b = "ABC";
		String d = "ABC";
		String e = "ab";

		System.out.println(a.compareTo(b));   // 다른부분의 길이 출력
		System.out.println(b.compareTo(a));
		System.out.println(b.compareTo(d));
		System.out.println(d.compareTo(e));
		
	}

}

class Test implements Comparable<String>{

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}