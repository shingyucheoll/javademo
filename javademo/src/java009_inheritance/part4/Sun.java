package java009_inheritance.part4;

public class Sun extends Parent{
	String dept;
	
	public Sun() {

	}
	
	public Sun(String name, int age, String dept) {	//3
		super(name, age);							//4
		this.dept = dept;							//9
	}
	

	public String toString() {								//11
		return String.format("%s %d %s", name, age, dept);	//12
	}
	

}
