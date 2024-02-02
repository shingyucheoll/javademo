package java010_abstract_interface.part06;

public class User {
	
	private String name;
	
	public User() {
	
	}

	public User(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {	
		return name;
	}
	
	

}
