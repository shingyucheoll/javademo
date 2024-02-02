package java009_inheritance.part3;
	
			 // 인자값이 없는경우 호출하면
public class SubConst extends SuperConst {
	
	

//  정의를 하지 않았을 경우 아래는 default로 깔려있다.	
//	public SubConst() {
//		super();
//	}
	
	public SubConst(int x, int y) {  //3
		super(x, y); 				//4
	}

}
