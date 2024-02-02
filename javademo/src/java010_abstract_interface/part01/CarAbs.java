package java010_abstract_interface.part01;

public abstract class CarAbs {
	int speed;
	String color;
	
	public abstract void work();
	
	public void display() {
		System.out.printf("%d %s\n",speed, color);
	}

}
