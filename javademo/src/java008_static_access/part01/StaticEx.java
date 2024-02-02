package java008_static_access.part01;
/*
 * static
 * 1. class loader일때 method area에 저장이 된다.
 * 2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
 * ★ 3. static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다. 
 */
public class StaticEx {
	int x = 5;
	static int y = 10;
	// static이 선언된 변수는 같은 클래스를 호출한 객체끼리 공유된다.
	// StaticEx class에 있는 static int y의 값이 변할경우
	// y의 값은 다른곳에서 호출해도 변경되어있는 그 상태로 유지된다.
	// 즉 10으로 초기화가 되지 않고 항상 변한다는 말인거 같다.
	
	public String toString() {
		return String.format("x=%2d, y=%2d", x, y);
	}

}
