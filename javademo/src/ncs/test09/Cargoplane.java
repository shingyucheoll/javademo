package ncs.test09;

//+Cargoplane()
//+Cargoplane(planeName:String, fuelSize:int)
//+flight(distance:int):void // 운항

public class Cargoplane extends Plane {

	String planeName;
	int fuelSize;

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	public void flight(int distance) {
		int x = distance * 5;
		setFuelSize(getFuelSize() - x);
	}


}
