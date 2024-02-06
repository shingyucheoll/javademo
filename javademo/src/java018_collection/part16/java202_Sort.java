package java018_collection.part16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class java202_Sort {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {1,3,5,2,4,1};
//		Arrays.sort(arr);
//		for (Integer it : arr)
//			System.out.println(it);
		
	
		List<Integer> ast = Arrays.asList(arr); // 배열의 값이 리스트타입
		ArrayList<Integer> aList = new ArrayList<Integer>(ast);	
		System.out.println(aList.toString());
		
		System.out.println("======오름차순=========");
		aList.sort(new Ascending());
		System.out.println(aList.toString());
		
		
		System.out.println("======내림차순=========");
		aList.sort(new Descending());
		System.out.println(aList.toString());
		
		
		

	}//

}//
