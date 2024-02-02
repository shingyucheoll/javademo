package java008_static_access.part06;

import java008_static_access.part05.Java088_access;

public class Java090_access extends Java088_access{ 

	public static void main(String[] args) {
		
		Java088_access p = new Java088_access();
		Java090_access j = new Java090_access();
		
		
//		System.out.printf("var_private=%d\n", p.var_private);		
//		System.out.printf("var_default=%d\n", p.var_default);		
//		System.out.printf("var_protected=%d\n", p.var_protected);
		
		// public만 접근이 가능하다
		System.out.printf("var_public=%d\n", p.var_public);
		
//		System.out.printf("var_private=%d\n", j.var_private);		
//		System.out.printf("var_default=%d\n", j.var_default);		
		
		// extends Java088_access 상속하면 protected 사용가능
		System.out.printf("var_protected=%d\n", j.var_protected);
		System.out.printf("var_public=%d\n", j.var_public);
		
		
		

	}

}
