package java012_api.part02;

import java.util.Objects;

public class Member {
	
	int id;


	public Member(int id) {

		this.id = id;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return id == other.id;
	}
	
	
//	public boolean equals(Member obj) {
//		if(obj instanceof Member) {
//			return id == obj.id;
//		}else {
//			return false;
//		}		
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			return id == ((Member)obj).id;
//		}else {
//			return false;
//		}		
//	}
	
	
	
	
	
	
	

}
