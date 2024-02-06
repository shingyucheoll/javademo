package java017_collection.part09;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Enumeration은 Vector와 Hashtable에서만 제공이 되는 인터페이스이다. (잘안쓰임)
public class Java187_ArrayList {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		
		System.out.println("========일반for문=============");
		for(int i =0 ; i< v.size() ; i++)
			System.out.println(v.get(i));
		
		
		System.out.println("========enumeration==========");
		//열거형 1.0
		Enumeration<Integer> enu = v.elements();  // 벡터를쭉 나열해서 가져오는것
		while(enu.hasMoreElements())              // 요소가 있으면 계속 가져옴
			System.out.println(enu.nextElement());
		//System.out.println(enu.nextElement()); 꺼내만 오는거라 두번 실행은 x
		
		System.out.println("==========interator==========");
		//반복자 1.2
		Iterator<Integer> ite = v.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
		System.out.println("========개선된 루프==========");
		for(Integer ig : v)
			System.out.println(ig);
	}//

}
