package java007_class.part02;

public class Doctor {
	
	String name;
	String medical;
	int patient;
	
	
	public Doctor() {
		
	}
	
	public Doctor(String name, String medical, int patient) {
	
		this.name = name;
		this.medical = medical;
		this.patient = patient;
	}
	
	public String toString() {
		return String.format("%s %s %d", name, medical, patient);
	}
	
	

}
