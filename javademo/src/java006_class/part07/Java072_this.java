package java006_class.part07;

public class Java072_this {

	public static void main(String[] args) {
		Product pn = new Product("s001", "공산품",4000);
		pn.display();
		
		Product ps = new Product();  
		ps.display();
//		매개변수를 넣지 않았을 경우 
//		public Product() {
//			this("b001", "식품", 2000);
//			System.out.println("인자값이 없는 생성자");
//		}
	}

}
