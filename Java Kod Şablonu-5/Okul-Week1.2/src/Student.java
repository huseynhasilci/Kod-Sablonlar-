
public class Student extends Person {

	private int status;
	
	public Student(String name,String address,String email,String phoneNumber,int status) {
		
		super(name,address,email,phoneNumber);
		this.status = status;
		
	}
	public String toString() {
		super.toString();
		return "Studend" + getName();
	}
}
