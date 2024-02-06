package java017_collection.part08;

import java.util.ArrayList;

public class Java187_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");

		String[] arr = display(aList);
		for (String data : arr)
			System.out.println(data);
	}// end main()
	
	public static String[] display(ArrayList<String> aList) {		
		// ArrsyList => String
//		String[] stn = new String[aList.size()];
//		for(int i =0 ; i<aList.size() ; i++)
//			stn[i] = aList.get(i);
//		return stn;
		
///////////////////////////////////		
//		String[] stn = new String[aList.size()]; // 배열은 배열로 스트링은 스트링으로 알아서 반환
//		return aList.toArray(stn);
		
		
		return aList.toArray(new String[aList.size()]);
	}

}
