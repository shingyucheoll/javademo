package java021_jdbc.part03;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Java218_Jdbc {

	public static void main(String[] args) {
		MemController memController = new MemController();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=========================================");
			System.out.println("1 List, 2 Insert, 3 update, 4 Delete, 5 Exit");
			int input = Integer.parseInt(sc.nextLine());
			if(input ==1 ) {
				ListCall(memController);
			}else if(input == 2) { // 삽입
				insertCall(memController, sc);				
			}else if(input == 3) {
				updateCall(memController, sc);			
			}else if(input == 4) {
				deleteCall(memController, sc);						
			}else if(input ==5) {
				System.out.println("시스템 종료");
				sc.close();
				System.exit(0);
			}	
		}
	}//end main
	
	public static void deleteCall(MemController memController, Scanner sc) {
		System.out.printf("번호: ");
		int num = Integer.parseInt(sc.nextLine());
		
		int chk = memController.deleteProcess(num);
		System.out.printf("%d개 삭제\n", chk);
	}
	

	public static void updateCall(MemController memController, Scanner sc) {
		System.out.printf("번호: ");
		int num = Integer.parseInt(sc.nextLine());
		//map.put("num", Integer.parseInt(sc.nextLine())); 이렇게도 가능
		
		System.out.printf("이름: ");
		String name = sc.nextLine();
		
		System.out.printf("나이: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.printf("지역: ");
		String loc = sc.nextLine();
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("num", num);
		map.put("name", name);		
		map.put("age", age);
		map.put("loc", loc);
		
		int chk = memController.updateProcess(map);
		System.out.printf("%d개 수정\n", chk);
		
	}
	
	public static void insertCall(MemController memController, Scanner sc) {
		System.out.printf("이름: ");
		String name = sc.nextLine();
		
		System.out.printf("나이: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.printf("지역: ");
		String loc = sc.nextLine();
		
		int chk = memController.insertProcess(new MemDTO(name, age, loc));
		System.out.printf("%d개 삽입\n", chk);
	}//end insertCall
	
	public static void ListCall(MemController memController) {
		List<MemDTO> aList = memController.listProcess();
		if(aList.size()==0) {
			System.out.println("데이터가 없습니다.");
			return;
		}
		
		for(MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
		
	}//end listCall()
	
}//end class
