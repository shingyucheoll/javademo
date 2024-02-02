package java009_inheritance.prob.part02;

public class StudentExam extends Human{

	String studentID ;
	
	public StudentExam() {

	}

	public StudentExam(String name, int age, int height, int weight, String studentId) {
		super(name, age, height, weight);
		this.studentID = studentId; 
	
	}
	
	@Override
	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight + "\t" + studentID;
		return data;
		
	}
	
	



}

