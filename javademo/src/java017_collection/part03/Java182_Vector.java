package java017_collection.part03;
/*
 * 배열: length 키워드
 * 문자열 : length( )메소드
 * 컬렉션 : size() 메소드
 * 
 * 컬렉션 클래스를 선언하고 생성할 때 제너릭 타입을 선언한다.
 * 제너릭 타입을 선언하면 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.
 */
import java.util.Vector;

public class Java182_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		System.out.println("요소크기:" + v.size());
		
		//일반 반복문//
		for(int i = 0;i<v.size() ; i++) {
			String data =v.get(i);
			System.out.println(data);
		}
		
		//개선된 반복문//
		//for(데이터타입 변수 : 배얄 or 컬렉션){}
		for(String data : v)
			System.out.println(data);

	}//

}
