package java001_basic;
// 전위연산자, 후위연산자
public class Java010_operators {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		// 전위연산자
		j = ++i;  // 값이 참조되기 전에 증가시킨다. i값이 먼저 증가 후 j = i(6) 대입
		System.out.printf("i = %d\nj = %d\n", i,j);  //66
 		
		i = 5;
		j = 0;
		// 후위연산자 
		j = i++;  // 값이 참조된 후에 증가시킨다. i값을 먼저 대입 후 j = i(5) i값 증가 (6) 
		System.out.printf("i = %d\nj = %d", i,j);	//65		
		
		

	}

}
