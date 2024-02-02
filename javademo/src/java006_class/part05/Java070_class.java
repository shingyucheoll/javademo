package java006_class.part05;

public class Java070_class {

	public static void main(String[] args) {
		MemberVar mv = new MemberVar();
		System.out.printf("var_byte=%d\n", mv.var_byte);
		System.out.printf("var_short=%d\n", mv.var_short);
		System.out.printf("var_int=%d\n", mv.var_int);
		System.out.printf("var_long=%d\n", mv.var_long);
		
		System.out.printf("var_float=%f\n", mv.var_float);
		System.out.printf("var_doyble=%f\n", mv.var_double);
		
		System.out.printf("var_boolean=%b\n", mv.var_boolean);
		System.out.printf("var_char=%c\n", mv.var_char);
		
		System.out.printf("var_str=%s\n", mv.var_str);
		System.out.printf("var_arr=%s\n", mv.var_arr);
		
		// 지역변수는 초기화 하지 않은 상태에서 사용하면 오류 발생
		int num;
//		System.out.print("num = %d\n", num);  
		

	}

}
