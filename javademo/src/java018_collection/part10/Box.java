package java018_collection.part10;

public class Box<T> {
	private T data;
	
	public Box() {
		
	}
	
	
	public Box(T data) {
		this.data = data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	

}
// Box<String> b = new Box<String>("jsp"); t 쓰면 알아서 바꿔줌
// Box<Integer> b = new Box<Integer>(10); t 쓰면 알아서 바꿔줌