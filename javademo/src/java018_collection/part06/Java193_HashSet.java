package java018_collection.part06;

import java.net.Socket;
import java.util.HashSet;
// 단순한 중복제거
public class Java193_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(300);
		set.add(200);
		set.add(100);
		
		for(Integer it : set)
			System.out.println(it);

	}

}
