package java018_collection.part19;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import java018_collection.part18.Person;
//얕은 복사(Shallow copy)는 참조 타입 데이터가 저장한 '메모리 주소 값'을 복사한 것을 의미한다. 
//반대로 깊은 복사(Deep copy)는 새로운 메모리 공간을 확보해 완전히 복사하는 것을 의미한다.
public class Java206_clone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Integer[] arr = new Integer[] {1,3,5,2,4,1};
		Integer[] arrCopy = arr.clone();
		
		System.out.println(arr==arrCopy);

		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println(aList);
		
		System.out.println("=====shallow copy=====");
		ArrayList<Integer> copyList = aList;		
		System.out.println(copyList);
		System.out.println(aList==copyList);
//		aList.set(0,100);
//		System.out.println("aList :" + aList);
//		System.out.println("copyList :" + copyList);
		
		System.out.println("====deep copy=====");
		ArrayList<Integer> destCopy = (ArrayList<Integer>)aList.clone();
		System.out.println("aList :" + aList);
		System.out.println("destCopy :" + destCopy);
		aList.set(0,100);
		System.out.println("aList :" + aList);
		System.out.println("destCopy :" + destCopy);
		
		System.out.println("==============person=shallow copy========");
		ArrayList<Person> pList = new ArrayList<Person>();
		pList.add(new Person("홍길동",30));
		
		ArrayList<Person> kList = (ArrayList<Person>)pList.clone();
		System.out.println(pList);
		System.out.println(kList);
		System.out.println(pList == kList);
		
		kList.get(0).setName("김민재");
		System.out.println(pList);
		System.out.println(kList);
		System.out.println(pList == kList);
		
		System.out.println("====== Customer deep copy ==========");
		ArrayList<Customer> cList = new ArrayList<Customer>();
		cList.add(new Customer("홍길동",30));
		ArrayList<Customer> sList = (ArrayList<Customer>)cList.clone();
		System.out.println(cList);
		System.out.println(sList);
		System.out.println(cList == sList);
		
//		cList.get(0).setName("김민재");
//		System.out.println(cList);
//		System.out.println(sList);
//		System.out.println(cList.get(0) == sList.get(0));  //클로 메소드에 가서 다운캐스팅 해야함
		
		ArrayList<Customer> deepList = new ArrayList<Customer>();
		deepList.removeAll(deepList);
		try {
			for(Customer ca : cList)
				deepList.add(ca.clone());   // throws가 된거는 예외처리 해주는게 좋다
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	
		System.out.println(cList);
		System.out.println(deepList);
		System.out.println(cList == deepList);
		
		
		
		cList.get(0).setName("김민재");
		System.out.println(cList);
		System.out.println(deepList);
		System.out.println(cList == deepList);
		
	}//

}//
