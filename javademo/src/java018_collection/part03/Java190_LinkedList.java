package java018_collection.part03;

import java.util.LinkedList;

/*
 * stack(스택)
 * 1. LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2. 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 */
public class Java190_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		System.out.println(nStack.size());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
//		System.out.println(nStack.pop());
		//System.out.println(nStack.pop()); 인덱스 오버
		
		while(!nStack.isEmpty()) {                  // 비어있지 않으면 요소를 가져와라
			System.out.println(nStack.pop());
		}
			
		System.out.println(nStack.size());          // 복사가 아니라 꺼내오는거 Linked의 특성?
		
		
		

	}//

}
