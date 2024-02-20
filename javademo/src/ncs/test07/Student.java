package ncs.test07;

//
//- number:String
//- major:String
//+Student()
//+Student(name:String,age:int,
//height:int, weight:int, number:String,
//major:String)
//+toString():String

public class Student extends Human {

	String number, major;

	public Student() {

	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%s  %s", number,major);
	}

}
