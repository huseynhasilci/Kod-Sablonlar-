// Huseyin Hasilci 150119698
public class Book {
	// attributes
	private int id = 0;
	private String title;
	private Author author;
	private boolean borrowed = false;
	//Constructers
	public Book(int id, String title, Author author) {
		this.id = id;
		this.title = title;
		this.author = author;
		
	}
	
	public Book(int id, String title) {
		this.id = id;
		this.title = title;
		
	}
	// gettr settr methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public boolean isBorrowed() {
		if (this.borrowed) { // in here i chechk a book is borrowed or not if it is boroowed if  statement will return true and isBorrowed method will give me the true value. if its not true its going to return false.
			return true;
		}
		else {
			return false;
		}
		//return this.borrowed;
		
		
	}
	// book checkers
	public boolean Borrowed() {
		if (this.isBorrowed() == false) { //in here i checking is boroewed method is false then it will set the borrowed value as true and return true
			this.borrowed = true;
			return this.borrowed;
		}
		else {
			this.borrowed = false; //in here i checking is boroewed method is true then it will set the borrowed value as true and return false
			return this.borrowed; 
		}
		
	}
	
	public boolean returned() {
		if (this.isBorrowed() == true ) { // if a book is borrowed it can be returned 
			this.borrowed = false;
			return this.borrowed;
		}
		else {
			this.borrowed = true; // if it's not it cannot be returned because of that broowed attribute will be true.
			return this.borrowed;
		}
		
		
	}
	/*public boolean hasID() {
		if (this.getId() != 0) {
			return true;
		}
			
		else {
			return false;
		}
			
	}*/
	// overriding the toString Method
	public String toString() {
		
		return "Book name is " + getTitle() + ", " + author.toString()  ;
		
	}
	
	
}
