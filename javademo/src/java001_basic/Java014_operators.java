package java001_basic;
/*
 * 조건연산자 : 식의 결과에 리턴해주는 값이 여러개 일때 사용한다.
 * 삼항연산자
 * 조건식 ? 참 : 거짓
 * 
 * int res = 조건식 ? 1 : 0;
 * char res =  조건식 ? 'a' : 'A';
 */
public class Java014_operators {

	public static void main(String[] args) {
		int total = 23;
		int record = 5;
		
		//        total % record == true 라면  ? ( x ) : ( y ) x를 실행
		//        total % record == false 라면 ? ( x ) : ( y ) y를 실행  
		int res = total % record == 0 ? total/record : total/record +1;
		//           23 % 5 == 3 ( false )             23 / 5 = 4 + 1;                      
		System.out.println(res);
		
		int score = 70;
//      			  
		char check = score >= 80 ? '상' : score >= 60 ? '중' : '하';
		System.out.println(check);	
		//       x = true    ?   y = true   ? '상' : x : x
		//       x = true    ?   y = false  ?  x  : '중' : x
		//       x = false   ?   y = false  ?  x  :  x   : '하'
		check = score >= 60 ? score >= 80 ? '상' : '중' : '하';
		System.out.println(check);
		
		
		
		

	}

}
