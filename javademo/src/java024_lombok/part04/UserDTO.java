package java024_lombok.part04;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

@AllArgsConstructor          // @NonNull 사용
@ToString
@NoArgsConstructor
public class UserDTO {

	@NonNull
	private String id;
	@NonNull
	private String pwd;

}
