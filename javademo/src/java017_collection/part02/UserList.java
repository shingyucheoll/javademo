package java017_collection.part02;
/*
 * 선형리스트( Linear List )
 * 1 순서 리스트(Ordered List)
 * 2 자료들 간에 순서를 갖는 리스트
 * 3 선형 리스트에서 원소를 추가한 순서는 원소들의 순서가 된다.
 */
public class UserList {
	private Object[] sale = null;
	private int pointer = 0;
	
	public UserList() {
		this(3); // 밑에 배열 3크기짜리
	}
	
	public UserList(int cnt) {
		sale = new Object[cnt];
	}
	
	public void add(Object element) {
		if(sale.length == pointer) {
			Object[] arr = new Object[sale.length*2]; // 기존 크기 2배 배열 생성
			System.arraycopy(sale, 0, arr, 0, sale.length); // 기존의 sale에있는 0번째부터 arr에 0번째부터어 sale크기만큼 복사
			sale=arr; //arr배열을 sale에 복사 크기2배 인덱스값 보유
			
		}
		sale[pointer++]=element;
		
	}
	
	
	public void add(int index, Object element) {     // 1번째를부터 뒤로 미루고 1번째 인덱스에 값 넣는다
		if(sale.length == pointer) {
			Object[] arr = new Object[sale.length*2]; // 기존 크기 2배 배열 생성
			System.arraycopy(sale, 0, arr, 0, sale.length); // 기존의 sale에있는 0번째부터 arr에 0번째부터어 sale크기만큼 복사
			sale=arr; //arr배열을 sale에 복사 크기2배 인덱스값 보유
		}
		
		for(int i = pointer; i>index ;i-- ) {
			sale[i]=sale[i-1];                       // 3번째 값을 4번째로 옮겨줌 인덱스 전까지
		}
		sale[index] =element;
		pointer++;//하나더했으면 포인터 하나 더해줘야함 그래야 다음값도 재대로 추가됨
		
	}
	
	public Object get(int index) { // object 라서 모든 값형태 리턴
		if(index < pointer)
		return sale[index];
		else {
			return new ArrayIndexOutOfBoundsException(index);
		}
		
	}
	
	public Object remove(int index) {
		Object obj = sale[index];
		
		for(int i = index; i<pointer-1;i++) {
			sale[i] = sale[i+1];
		}
		pointer--; //하나뺐으면 포인터 하나 빼줘야함 그래야 다음값도 재대로 추가됨
		return obj;
	}

	
	public int size() {
		return pointer; //현재 배열이 저장되어있는 요소의 크기
	}
	
	public int capacity() {
		return sale.length; // 전체빈배열까지의 메모리 배열 크기
	}
}
