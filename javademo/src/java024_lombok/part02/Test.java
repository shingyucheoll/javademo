package java024_lombok.part02;

import org.slf4j.Logger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {

	public static void main(String[] args) {
		MemDTO dto = new MemDTO();		
		dto.setNum(1);
		dto.setName("홍길동");
		dto.setAge(30);
		dto.setLoc("경기");
		
		System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		System.out.println(dto.toString());
		
		MemDTO mem2 = new MemDTO(2,"징구야",500,"별나라");
		System.out.println(mem2.toString());
		log.info("mem2",dto);
		
	}

}


