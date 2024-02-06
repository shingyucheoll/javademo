package java018_collection.part05;

import java.util.Iterator;
import java.util.TreeSet;
//중복제거 + 정렬
public class Java192_TreeSet {

	public static void main(String[] args) {
		
		//TreeSet : Tree(오름차순 정렬), Set(중복안됨)
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(300);
		tree.add(100);
		
		System.out.println(tree.size());
//		while(!tree.isEmpty()) { //꺼내오는것이 아닌 복사여서 무한반복
//			System.out.println(tree);
//		}

		
		for(int it : tree)
			System.out.println(it);
		System.out.println("=============꺼내오는거==============");
//		System.out.println(tree.pollFirst()); //remove하면서 가져오고 //pop이랑 비슷하나 지정해서 꺼냉ㄹ수 있다(앞뒤)
//		System.out.println(tree.pollLast()); //remove하면서 가져오고
		System.out.println(tree.size());
		
		System.out.println("=============오츰차순==============");
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext()) {
			System.out.println(ita.next());
		}
		System.out.println("============내림차순==============");
		Iterator<Integer> ite = tree.descendingIterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}

}
