package java018_collection.part04;

import java.util.LinkedList;

import javax.xml.namespace.QName;

/*
 * Queue(큐)
 * 1. FIFO (First In First Out) : 제일 먼저 저장한 요소를 먼저 꺼내온다.
 * 2. 최근 사용문서, 인쇄작업대기목록, 버퍼
 */
public class Java191_LinkedList {

	public static void main(String[] args) {
		
		LinkedList<String> nQueue = new LinkedList<String>();
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		System.out.println(nQueue.size());
		
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.poll());
//		System.out.println(nQueue.size());
//		System.out.println(nQueue.poll()); // pop은 오류인데 poll은 null값
		
		while(!nQueue.isEmpty()) {
			System.out.println(nQueue.poll());
		}

	}

}
