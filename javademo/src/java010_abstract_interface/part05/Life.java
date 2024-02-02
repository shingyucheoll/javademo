package java010_abstract_interface.part05;

//public class Life extends Animal implements SampleA, SampleB

public class Life extends Animal implements SampleA, SampleB {
	
	public Life() {
		
	}
	
	@Override
	public void call() {
		System.out.println("call");		
	}
	
	public void prn() {
		System.out.println("prn");		
	}
	

}
