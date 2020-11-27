
public class Staff extends Emplpyee{
	
	protected String title;
	
	public Staff(String name,String address,String email,String phoneNumber,String office,double salary) {
		
		super(name,address,email,phoneNumber,office,salary);
		
		
	}
	public String toString() {
		super.toString();
		return "Staff" + getName();
	}
	
}
