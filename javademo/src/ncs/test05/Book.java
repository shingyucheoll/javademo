package ncs.test05;
//
//- title:String
//- author:String
//- price:int
//- publisher:String
//- discountRate:double
//+Book()
//+Book(title:String,author:String,price:int,
//publisher:String,discountRate:double)
//+getXXX()

public class Book {
	
	String title;
	String author;
	int price;
	String publisher;
	double discountRate;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, String publisher, double discountRate) {	
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}
	
	
	

}
