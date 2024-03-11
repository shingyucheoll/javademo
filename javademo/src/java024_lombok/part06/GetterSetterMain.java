package java024_lombok.part06;

import java024_lombok.part06.item03.MemDTO;
import java024_lombok.part06.item2.HumanDTO;
import java024_lombok.part06.item4.GroupDTO;

public class GetterSetterMain {

	public static void main(String[] args) {
		personDTO pt = new personDTO();
		pt.setName("여진구");
		System.out.println(pt.getName());
		
		
		// static이 설정되어 있기 때문에  
//		pt.setAge(0);
		// 이렇게 생성자를 호출해서 set 해줘야 한다.
		personDTO.setAge(30);	
		System.out.println(personDTO.getAge());		
		System.out.println(pt.getAge());       // ???... 어떻게 30 호출 하는지
		
		pt.display();
		
		HumanDTO ht = new HumanDTO();
		ht.setName("김민재");
		System.out.println(ht.getName());
		
//		ht.setAge(40);    // setAge() 메소드가 생성되지 않아 오류발생
		
		MemDTO mt = new MemDTO();
		mt.setName("김길동");
		mt.setAge(22);
		mt.setLoc("지구");
		System.out.println(mt);
		System.out.println("name : "+mt.getName());
		System.out.println("age : "+mt.getAge());
//		System.out.println("loc : "+mt.getLoc());
		
		GroupDTO gt = new GroupDTO();
		System.out.printf("%s %s %s",gt.getChk(),gt.isGen(),gt.getChk());
		
		

		

	}

}
