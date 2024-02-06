package java017_collection.part02;


// 순차적 접근은(검색) = 배열구조가 유리하고
// 잦은 수정은 node로 생성해서 하는게 속도가 빠르다
public class Java181_List {

	public static void main(String[] args) {
		UserList us = new UserList();
		//append
		us.add(10);
		us.add(20);
		us.add(30);
		us.add(40);

		//insert
		us.add(1,50);
		us.add(5,50);
		us.add(5,70);//방크기 6개에서 추가했을때 배열 키우는부분은 구현안했었음 포인터 이슈 -> pointer랑 sales크기랑 같으면 방크기 먼저 넓히고 계속처리
		//us.add(40); 방크기 3개
		us.add(10);
		
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		System.out.println(us.get(4));
		System.out.println(us.get(5));
		System.out.println(us.get(6));
		System.out.println(us.get(7));
		System.out.println(us.get(8));
		
		
		System.out.println("remonve");
		//us.remove(0);
		System.out.println(us.remove(0));
		//us.remove(0);
		System.out.println("====");
		System.out.println(us.get(0));
		System.out.println(us.get(1));
		System.out.println(us.get(2));
		System.out.println(us.get(3));
		System.out.println("size");
		System.out.println(us.size());
		System.out.println("capacity");
		System.out.println(us.capacity());
	


	}

}
