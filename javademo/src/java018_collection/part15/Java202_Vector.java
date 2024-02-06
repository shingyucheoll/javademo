package java018_collection.part15;

import java.util.Vector;

public class Java202_Vector {

	public static void main(String[] args) {

		Vector<String> vt = new Vector<String>();
		vt.add("java");
		vt.add("jsp");
		vt.add("spring");
		vt.add("oracle");
		vt.add("mysql");
		System.out.println(vt.toString());
		
		
		vt.remove(0);
		System.out.println(vt.toString());
		
		Vector<String> vm = new Vector<String>();
		vm.add("oracle");
		vm.add("mysql");
		vm.add("mssql");
		
		vt.removeAll(vm);  // vt vm 은 vt에 있는 vm값만 지우기
		System.out.println(vt.toString());
		
		vt.removeAll(vt);   // vt vt는 모두지우기
		System.out.println(vt.toString());
		
		Vector<Integer> vn = new Vector<Integer>();
		vn.add(10);
		vn.add(20);
		vt.removeAll(vn);  // 일치하는게 없으면 안지워진다 오류는 안뜸
		System.out.println(vn);
		
		vt.removeAll(vt);
		System.out.println(vt.toString());
		
		

	}//

}
