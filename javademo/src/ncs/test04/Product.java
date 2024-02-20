package ncs.test04;

//+Product()
//+Product(name:String,price:int,
//quantity:int)
//+information():String
//+setXXX()
//+getXXX()


public class Product {
	
	String name;
	int price;
	int quantity;
	
	public Product() {
	
	}

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	
	public String information() {
		
		return String.format("상품명 : %s\n가격 : %d 원\n수량 : %d 개\n총 구매 가격 : %d 원",name,price,quantity,getPrice()*getQuantity());
	}
	
}