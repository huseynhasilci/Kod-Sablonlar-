// Huseyin Hasilci 150119698
public class Customer extends Person{
	// attributes
	private String address = "-";
	private Book barrowedBook;
	private boolean barrowABook = false;
	
	//Constructers
	public Customer(String name,  int birthDate, String birthPlace, String address) {
		super(name,birthDate,birthPlace);
		this.address = address;
	}
	
	public Customer(String name, int birthDate, String address) {
		super(name,birthDate);
		this.address = address;
	}
	
	public Customer(String name, String address) {
		super(name);
		this.address = address;
	}
	
	public Customer(String name, int birthDate) {
		super(name,birthDate);
		
	}
	// gettr settr methods
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBarrowedBook() {
		return barrowedBook;
	}

	public void setBarrowedBook(Book barrowedBook) {
		this.barrowedBook = barrowedBook;
	}

	public boolean isBarrowABook() {
		return barrowABook;
	}

	public void setBarrowABook(boolean barrowABook) {
		this.barrowABook = barrowABook;
	}
	// overriding the toString Method
	@Override
	public String toString() {
		if(super.getBirthDate() ==0) { //checking the birtdate if is not given 
			return "Name: " + super.getName() + ", Birth Date: " + "-"+ ", Birth Place: " + super.getBirthPlace() + ", Adress: " + address ;
		}
		else {
		return "Name: " + super.getName() + ", Birth Date: " + super.getBirthDate()+ ", Birth Place: " + super.getBirthPlace() + ", Adress: " + address ;
		}
	}
	
	
	
	
}
