package java005_method;
/*
 * 자바에서 제공하는 데이터 타입(data type)
 * 1. primitive data type : byte, short, int, long, float, double, boolean, char
 * 2. reference data type : arr, class, interface, enum
 * 
 * [argument 전달방식]
 * 1. call by value : 값에 의한 복사
 *    argument을 전달할 때 primitive data type을 넘겨주는 형식
 *    장점 : 복사하여 처리하기 때문에 원래값이 보존이 되여 안전한다.
 *    단점 : 복사를 하기 때문에 메모리 사용량이 늘어난다.
 *2. call by reference : 주소에 의한 복사
 *   argument을 전달할 때 reference data type을 넘겨주는 형식
 *   장점: 참조를 하기 때문에 메모리를 절약한다.
 *   단점: 참조를 하기 때문에 원래 값에 영향을 받는다.
 */
public class Java058_method {

	public static void main(String[] args) {
		int a = 10, b = 20;												
//		int c = a, d = b;
		
		callByValue(a, b);
		System.out.printf("a=%d, b=%d\n",a, b);
		
		int[] num = {10, 20};                                            // call by reference : 주소에 의한 복사
		System.out.printf("num[0]=%d, num[1]=%d\n", num[0], num[1]);     // num[0]=10, num[1]=20
		callByReference(num);											 // num 주소값을 넘겨주기 때문에 안에서 바뀐 arr값으로 변경됨. arr[0]=20, arr[1]=10
		System.out.printf("num[0]=%d, num[1]=%d\n", num[0], num[1]);     // num[0]=20, num[1]=10

	}
	
	public static void callByValue(int c, int d) {
		int temp;
		temp = c;
		c = d;
		d = temp;		
		System.out.printf("c=%d, d=%d\n", c, d);

		
	}
	
	public static void callByReference(int[] arr) {
		int temp;
		temp = arr[0];		
		arr[0] = arr[1];		
		arr[1] = temp;
		System.out.printf("arr[0]=%d, arr[1]=%d\n", arr[0], arr[1]);
		// callByReference 메소드가 실행 됐을 때 int[] num 배열의 값도 같이 변경이 된다.
		
		
	}

}