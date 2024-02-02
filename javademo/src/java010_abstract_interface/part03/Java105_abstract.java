package java010_abstract_interface.part03;

public class Java105_abstract {

	public static void main(String[] args) {
		
		Piano piano = new Piano("Piano");
		System.out.println(piano.name);
		piano.play();
		
		Fiute fiute = new Fiute("Fiute");
		System.out.println(fiute.name);
		fiute.play();
		

	}

}
