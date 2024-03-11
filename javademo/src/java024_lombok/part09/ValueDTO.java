package java024_lombok.part09;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.Value;

@Setter
@Getter

//@NoArgsConstructor(force=true)
//@AllArgsConstructor
//@RequiredArgsConstructor
@Value
public class ValueDTO {
	
	private static String code;
	@NonNull
	private String pname;
	
	private final int price;
	
	private boolean chk;
	

}
