package ncs.test09;

//+Airplane()
//+Airplane(planeName:String, fuelSize:int)
//+flight(distance:int):void //

public class Airplane extends Plane {

	String planeName;
	int fuelSize;

	public Airplane() {
		super();

	}

	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		int x = distance * 3;
		setFuelSize(getFuelSize() - x);

	}


}
