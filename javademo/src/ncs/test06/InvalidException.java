package ncs.test06;


public class InvalidException extends Exception{

	String message;

	public InvalidException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}	
	

}
