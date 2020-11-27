
public class Faculty extends Emplpyee{
	
	public Faculty(String name,String address,String email,String phoneNumber,String office,double salary) {
		
		super(name,address,email,phoneNumber,office,salary);
		
		
	}
	public String toString() {
		super.toString();
		return "Faculty" + getName();
	}
}
