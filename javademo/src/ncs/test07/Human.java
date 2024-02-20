package ncs.test07;

//- name:String
//- age:int
//- height:int
//- weight:int
//+Human()
//+Human(name:String,age:int,
//height:int, weight:int)
//+toString():String

public class Human {
	
	String name;
	int age, height, weight;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(String name, int age, int height, int weight) {	
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	public String toString() {	
		return String.format("%s  %d  %d  %d  ",name,age,height,weight);
	}
	

}
