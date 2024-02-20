package java019_inner;

public class OuterLocal {
	private int x;
	static private int y;
	final private int z = 10;
	final int p = 10;
	

	public void call(int a) {   // 외부에서 받아온 매개변수값을 final로 선언하면, 수정할 수 없고 내부에서 바로 사용이 가능하지만,
							    // final을 붙이지 않고 사용하면 해당 메서드에서는 수정할 수 있지만 수정하게 되면 내부클래스에서 사용 할 수 없게된다. 
		final int b = 20;
		int c = 30;
//		a = a + 10;   // 매개변수를 받아온 안에서는 사용 가능하지만
		System.out.println("call a : " + a);

		class InnerLocal {
			void prn() {
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("z=" + z);
				System.out.println("a=" + a);  // 내부클레스에서는 사용 할 수 없다.
				System.out.println("b=" + b);
				System.out.println("c=" + c);
			}
		}

		InnerLocal inner = new InnerLocal();
		inner.prn();
	}
}
