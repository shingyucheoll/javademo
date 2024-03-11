package java024_lombok.part09;

public class ValueMain {
	
	public static void main(String[] args) {
		ValueDTO ex = new ValueDTO("김민재", 5000, true);
		System.out.printf("%s %d %b \n",ex.getPname(),ex.getPrice(),ex.isChk());
		
		/*
		 * @Value로 설정하게 되면 멤버변수를 immutable(불변)으로 설정한다.
		 * 그래서 setXXX() 메소드를 사용할 수 없다.
		 */		
//		ex.setPname("남진구");
//		ex.setChk(false);

		System.out.printf("%s %d %b \n",ex.getPname(),ex.getPrice(),ex.isChk());
		
	}

}
