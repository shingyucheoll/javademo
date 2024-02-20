package ncs.test12;
//- name:String
//- price:int
//- quantity:int
//+Fruit()
//+Fruit(name:String,price:int,
//quantity:int)
//+toString():String
//+setXXX()
//+getXXX()
public class Fruit {
	
	String name;
	int price, quantity;
	
	public Fruit() {
	
	}

	public Fruit(String name, int price, int quantity) {	
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d원, %d개",name,price,quantity);
//				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	

}
