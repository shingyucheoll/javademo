package java024_lombok.part08.item1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Product {

	private static String code;   // static으로 설정되어 있으면 생성자에 포함되지 않는다.  toString 출력시 code = null 이 되지 않음.
	private String pname;
	private final int price;
	private boolean chk;

//	public Product(String code, String pname, int price, boolean chk) {
//		super();
//		Product.code = code;
//		this.pname = pname;
//		this.price = price;
//		this.chk = chk;
//	}

}
