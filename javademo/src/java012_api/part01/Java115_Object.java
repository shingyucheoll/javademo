package java012_api.part01;

/*
 * JAVA API(Application Programming Interface)
 * 
 * Object
 * 1. 클래스 중에서 최상위 클래스이다.
 * 2. Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
 * 3. java.lang패키지에서 제공하는 클래스이다.
 * 4. equals() : 객체의 번지를 비교하고 결과를 리턴
 *    hashCode( ) : 객체의 해시코드를 리턴
 *    toString( ) : 객체 문자 정보를 리턴
 */
public class Java115_Object {

	public static void main(String[] args) {
		Object obj = new Object();

		// java.lang.Object@36baf30c
		System.out.println(obj);
		System.out.println(obj.toString());

		// Class객체을 얻는 방법(3가지)
		// 1. 생성된 객체로부터 얻는 방법
		Class cobj = new Object().getClass();
		System.out.println(cobj);

		// 2. 클래스 리터널(*.class)
		cobj = Object.class;
		System.out.println(cobj);

		// 3. 클래스 이름으로 얻는 방법
		try {
			cobj = Class.forName("java.lang.Object");
			System.out.println(cobj);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cobj.getName());
		System.out.println(cobj.toGenericString());
		System.out.println(cobj.toString());

	}

}