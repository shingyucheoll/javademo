package java001_basic;
/*
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 * 산술 > 비교 > 논리 > 조건 > 대입
 */
public class Java013_operators {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		
		boolean res;
		
		// &&(and) 연산자의 좌변이 false면 우변은 수행하지 않는다. 
		// a값은 ++a 됐지만 b값은 ++b 실행되지 않음
		res = (++a > b) && (++b < c);
		System.out.printf("a=%d, b=%d, c=%d, res=%b\n", a, b, c, res);
		
		int x = 4; 
        int y = 8;
		int z = 10;
		
		// ||(or) 연산자의 좌변이 ture면 우변은 수행하지 않는다.
		// 이미 true로 결과값을 return 해버린다?
		res = (z > ++y) || (++x < y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b\n", x, y, z, res);
		
		int k= 1;
		int m= 2;
		int n= 3;
		//    k==2(false) && ++m==2  && 앞의 논리값이 false이므로 ++m 실행되지 않음
		//    false || ++n==4 (true) || 앞의 논리값이 false이므로 ++n 실행됨 -> n값 증가 ( 그리고 true )
		//    false || true = true 즉 res = true
		res = k == 2 && ++m == 2 || ++n == 4;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res);
		
		k = 1;
		m = 2;
		n = 3;
		res = k==2 || ++m==2 && ++n==4;
		System.out.printf("k=%d, m=%d, n=%d, res=%b\n", k, m, n, res);
	}

}
