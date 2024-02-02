package java010_abstract_interface.part02;

public class Triangle extends Shape {

	public Triangle() {

	}

	public Triangle(int width, int height) {
		super(width, height);

	}

	@Override
	public double getArea() {
		return getWidth() * getHeight() / (double) 2;
	}

}
