package java009_inheritance.part5;

//import java.lang.System;
//import java.lang.String;
//import java.lang.Override;
// 기본제공

public class First {
	
	int a = 10;
	
	public First() {
	
	}
	
	protected void display() {
		System.out.println("First display \t a = " + a);		
	}
	
	@Override   // Object Override
	public String toString() {
		return String.format("a = %d", a);
	}

}
