// Huseyin Hasilci 150119698
public class Author extends Person{
	// attributes
	private String publisher;
	//Constructers
	public Author(String name, String publisher,int birthDate) {
		super(name,birthDate,publisher);
		
		this.publisher = publisher;
	}
	// gettr settr methods
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// overriding the toString Method
	@Override
	public String toString() {
		
		return "Author is: " + super.getName();
		
	}
	
}
