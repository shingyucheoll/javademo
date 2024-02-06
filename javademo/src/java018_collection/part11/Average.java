package java018_collection.part11;

public class Average<T extends Number> { // 제한의 의미의 상속
	private T[] list;
	
	public Average() {
		// TODO Auto-generated constructor stub
	}
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list)
			sum += data.doubleValue();
		return sum/list.length;
	}
	
	
}
