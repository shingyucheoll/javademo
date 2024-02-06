package java018_collection.part19;

public class Customer implements Cloneable {
	private String name;
	private int age;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String name, int age) {
		this.name= name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		
		return String.format("%s %d", name,age);
	}
	
	@Override
	protected Customer clone() throws CloneNotSupportedException {  // 아에 여기서 다운캐스팅
		// TODO Auto-generated method stub
		return (Customer)super.clone();
	}
	
	
}
