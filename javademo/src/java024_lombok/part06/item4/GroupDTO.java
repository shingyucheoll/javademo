package java024_lombok.part06.item4;

import lombok.Getter;
import lombok.Setter;


// @Getter
// boolean 타입은 isXXX() 메소드가 생성이 되고,
// Boolean 타입은 getXXX() 메소드를 생성한다.


// @Setter
// boolean과 Boolean 타입 모두 setXXX() 메소드로 생성한다.  Getter에선 차이가 있다.

@Getter
@Setter
public class GroupDTO {

	private String name;
	private boolean gen;
	private Boolean chk;

}
