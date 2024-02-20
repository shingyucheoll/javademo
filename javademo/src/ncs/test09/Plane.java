package ncs.test09;

//
//- planeName:String
//- fuelSize:int
//+Plane()
//+Plane(planeName:String, fuelSize:int)
//+refuel(fuel:int):void //주유
//+flight(distance:int):void //운항(Abstract method)

public abstract class Plane {

	String planeName;
	int fuelSize;

	public Plane() {

	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public void refuel(int fuel) {
		fuelSize += fuel;
	}

	public abstract void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

}
