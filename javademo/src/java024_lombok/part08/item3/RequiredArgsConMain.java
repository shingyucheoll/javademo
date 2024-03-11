package java024_lombok.part08.item3;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class RequiredArgsConMain {

	public static void main(String[] args) {  
		Product pt = new Product("김민재", 4444);	// 매개변수에 int값만 넣을 수 있다 final 변수	// NonNull을 추가하면 생김 즉  
												// @RequiredArgsConstructor은 final과 NonNull을 가진 변수만 생성하게 해줌
																		 		
		System.out.println(pt.toString());
		
//		@AllArgsConstructor
		Product pn = new Product(null, 0, false);
		System.out.println(pn.toString());

	}

}
 