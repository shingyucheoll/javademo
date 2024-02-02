package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint {
	
	String color;


	public MyColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;

		
	}@Override
	protected void reverse() {
		int z = 0;
		z = x;
		x = y;
		y = z;		
	}
	@Override
	protected void show() {
	
		System.out.println(x + "," + y + "," + color);
	}
		

}
