package java024_lombok.part03;

import lombok.val;

/*
 * 롬복은 프로젝트 폴더에 lombok.config 파일을 만들어 세부적인 설정을 적용할 수 있다. 
 * 기본적으로 disable로 설정되어있는 어노테이션은 flagUsage를 ALLOW로 설정해야 사용이 가능해진다.
 * lombok.---.flagUsage = ALLOW
 * ___ 는 어너테이션명이다.
 */

public class Test {

	public static void main(String[] args) {
		val num = 10;
		System.out.printf("num : %d\n", num);

//		num = 20;  	// The final local variable num cannot be assigned. It must be blank and not using a compound assignment
		// val = final 지역변수로 lombok.config에서 lombok.val.flagUsage = ALLOW 설정 필요

		var str = "Hello";
		System.out.println("str : " + str);

		// var = 가변 지역변수로 수정이 가능하다. val , var = 지역변수로 선언하며, 데이터 타입을 지정하지 않아도 된다.
		// val = 불변 , var = 가변으로 사용된다.
		str = "java";
		System.out.println("str : " + str);

	}

}
