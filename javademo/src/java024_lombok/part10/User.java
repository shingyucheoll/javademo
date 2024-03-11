package java024_lombok.part10;

import lombok.Builder;
import lombok.ToString;

//@ToString(of = {"code","name","chk"})  //  포함할 변수를 설정
@ToString(exclude = {"name"})      		 // 특정 변수를 제외
//@ToString
@Builder
public class User {

	private static String code;
	private String name;
	private final int salary;
	private boolean chk;
}
