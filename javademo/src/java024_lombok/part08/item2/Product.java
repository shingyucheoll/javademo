package java024_lombok.part08.item2;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

//@NoArgsConstructor(force = true) 옵션을 이용해서 final 필드를 0, false, null 등으로 초기화를 강제로 시켜서 
//생성자를 만들 수 있습니다. (@NonNull같은 제약조건은 무시됩니다.)
@ToString
@NoArgsConstructor(force = true) // 강제적으로 final 할당한다? 인자값이 없이 설정해줘야 한다면

public class Product {

	private static String code; // static으로 설정되어 있으면 생성자에 포함되지 않는다. toString 출력시 code = null 이 되지 않음.
	@NonNull
	private String pname;
	private final int price;
	private boolean chk;

}
