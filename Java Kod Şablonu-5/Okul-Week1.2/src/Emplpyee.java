
public class Emplpyee extends Person {
	
	private String office;
	private double salary;
	private java.util.Calendar dateHired;
	
	
	public Emplpyee(String name,String address,String email,String phoneNumber,String office,double salary) {
		
		super(name,address,email,phoneNumber);
		this.office = office;
		this.salary = salary;
		
	}
	
	public String toString() {
		
		return "Employee" + getName();
	}
	
}
