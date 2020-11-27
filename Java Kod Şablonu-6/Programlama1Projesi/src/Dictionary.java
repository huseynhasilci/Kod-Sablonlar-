// Huseyin Hasilci 150119698
public class Dictionary extends Book{
	// attributes
	private int defination;
	//Constructers
	public Dictionary(int id, String title,Author author,int defination) {
		
		super(id,title,author);
		this.defination = defination;
		
	}
	
	public Dictionary(int id, String title,int defination) {
		
		super(id,title);
		this.defination = defination;
		
	}
	// gettr settr methods
	public int getDefination() {
		return defination;
	}

	public void setDefination(int defination) {
		this.defination = defination;
	}
	// overriding the toString Method
	@Override
	public String toString() {
		
		return "Dictionary name is " + super.getTitle() + ", definitions: " + getDefination();
		
	}
	
	
}
