package java001_basic;
/* 논리 연산자
 * true && true => true
 * true && false => false
 * false && true => false
 * false && false => false
 * 
 *  true || true => true
 *  true || false => true
 *  false || true => true
 *  false || false => false
 *  
 *  !true => false
 *  !false => true
 */
public class Java012_operators {

	public static void main(String[] args) {
		// 논리 연산자
		// &&   ||   !  : java
		// and  or  not : python
		
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res ;
		
		res = (x < y) && (x == z);    // true && true -> true
		System.out.println(res);  	  //true
		
	    res = (x > y) || (x == z);    //true || false -> true
	    System.out.println(res);  	  //true
	    
	    // res = 1  && x == z;  -> 사용하지 못함
	    // java에서는 논리연산자 양변에 논리값이 와야 한다.

	}

}
