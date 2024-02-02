package java009_inheritance.part8;

public class FireEngine extends Car{

	private long water;

	public void setWater(long water) {
		this.water = water;
	}

	private void waterSpread() {
		System.out.println("water" + "량의 물을 뿌린다.");
	}

	@Override
	public String toString() {
	return String.format("차량의 색상:%s, 속도:%d 물:%d", color, getSpeed(), water);
	}

}
