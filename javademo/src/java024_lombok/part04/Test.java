package java024_lombok.part04;

import lombok.NonNull;

/*@NonNull
 * 1. null값을 허용하지 않는다.
 *    @NonNull메소드 또는 생성자의 매개 변수를 사용 하여 lombok이 널 검사 명령문을 생성하도록 할 수 있다.
      null check는 if (param == null) throw new NullPointerException("param is marked @NonNull but is null")와 같은 방법으로 맨 위에 삽입 된다.
      생성자의 경우 명시적으로 this() 또는 super() 호출 직후에 null 검사가 시작된다.
      null 검사가 상위에 있는 경우, 추가 null 검사를 실행하지 않는다.
     */
public class Test {

	public static void main(String[] args) {
		display("서울");
		display(null);

		nullCall("대전");
//		nullCall(null);

		// 매개변수를 받지 않고 객체를 생성하는 생성자인 기본생성자는 @NonNull이 적용되지 않는다. 컴파일러가 직접 기본생성자를 추가 해주기
		// 때문이다.
		UserDTO dto = new UserDTO();
		System.out.println(dto);

		// 매개변수를 선언하는 생성자에는 @NonNull이 적용되어 NullPointerException이 발생한다.
//		UserDTO dto2 = new UserDTO("null",null);
//		System.out.println(dto2);

		nonNullCall("부산");
		nonNullCall(null); // NullPointerException 발생

	}

	public static void display(String data) {
		System.out.println(data);

	}

	public static void nullCall(String data) {
//		if(data == null) {
//			throw new NullPointerException("data is marked non-null but is null");
//		}
		System.out.println(data);

	}

	public static void nonNullCall(@NonNull String data) {
		System.out.println(data);

	}

}
