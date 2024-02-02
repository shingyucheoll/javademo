package java010_abstract_interface.part03;

public class Fiute extends Instrument{
	
	public Fiute() {
		// TODO Auto-generated constructor stub
	}

	public Fiute(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void play() {		
		System.out.println("입으로 분다");		
	}

}
