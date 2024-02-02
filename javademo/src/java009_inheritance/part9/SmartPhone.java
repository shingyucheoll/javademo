package java009_inheritance.part9;

public class SmartPhone extends HandPhone {
	private String number;
	private String type;

	public SmartPhone() {

	}

	public SmartPhone(String maker, String model, int price, String number, String type) {
		super(maker, model, price);
		this.number = number;
		this.type = type;
	}
	
	public SmartPhone(String maker, String model, int price) {
		super(maker, model, price);

	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return String.format("%-4s\t %-10s\t %6d\t %s\t %s", getMaker(), getModel(), getPrice(), getNumber(),
				getType());
	}

	public String hptoString() {
		return String.format("%-4s\t %-10s\t %6d", getMaker(), getModel(), getPrice());
	}
}
