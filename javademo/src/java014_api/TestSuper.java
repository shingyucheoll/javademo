package java014_api;

public abstract class TestSuper {
	
	public static TestSuper getInstance() {
		return new TestSub();
	}
	
	public abstract void display();
}
