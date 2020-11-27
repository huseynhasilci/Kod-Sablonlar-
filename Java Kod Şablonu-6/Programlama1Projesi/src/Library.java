import java.util.ArrayList; // importing the array list
// Huseyin Hasilci 150119698

public class Library {
	// attributes
	private String address;
	private ArrayList<Book> books = new ArrayList<Book>();
	private ArrayList<Customer> customers = new ArrayList<Customer>();
	//Constructers
	public Library(String address) {
		
		this.address = address;
		
	}
	
	public static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9 am to 5 pm."); // printing the opening hours
	}
	
	public void printAddress() {
		System.out.println(getAddress()); // printing the library address
	}
	
	public void addBook(Book book) { // adding books into books arraylist
		this.books.add(book);
	}
	
	public void addCustomer(Customer customer) {  // adding customer into customers arraylist
			this.customers.add(customer);
	}
	
	
	public void borrowBook(String bookName, String personName) {
		
		
		
		int bookChecker = 0; // with this im controlling all of the values in the array list is visited
		int customerChechker = 0; // with this im controlling all of the values in the array list is visited
		for (Book book: this.books) {
			bookChecker += 1; // to control that im adding 1 
			if (bookName.equals(book.getTitle()) && book.isBorrowed() == false) { //im checking given input is equal to the int books arrayl list book title
				for (Customer cust: this.customers) {
					customerChechker += 1;// to control that im adding 1 
					if (personName.equals(cust.getName()) && cust.isBarrowABook() == false) { // in here im checking given input is equal to the in the array list and this customer is borrow a book  then   it will borrow the book
						cust.setBarrowABook(true); // set the customer borrowed book as true to control 
						cust.setBarrowedBook(book); // adding book int to the borrowed book
						
						//book.isBorrowed();
						book.Borrowed(); // setting the borrowed attribute as true 
						System.out.println(personName + " successfully borrowed "+ bookName); // printing the borrowed succesfully
						
						
						return;
						
					}
					else if(cust.isBarrowABook() == true && personName.equals(cust.getName())) { // if a customer is alreeady borrowed then it will not borrow abook 
						customerChechker = 1;
						System.out.println("Sorry, "+personName + " already borrowed a book.");
						return;
						
					}
					
					
					else if (!personName.equals(cust.getName()) && customerChechker == this.customers.size()) { // if the given input is not registered into the customer class then it will print .. is not customer
						System.out.println("Sorry "+personName +" is not a customer");
						
						return;
					}
				}
			
			
			}
			else if(book.getTitle() == bookName && book.isBorrowed() == true){ //  checking is a book is borrowed 
				
				for (Book book1: this.books) {
					
					if (book.getTitle() == book1.getTitle() && book.getId() == book1.getId() && book1.isBorrowed() == false) { // in here if there is two book as the same title if one of them is borrowed or are their id's unique
						for(Customer cust1:this.customers) {
							if (personName.equals(cust1.getName()) && cust1.isBarrowABook() == false) { // if customer is not borrow a book then they can borrow
								cust1.setBarrowABook(true);// set the customer borrowed book as true to control 
								cust1.setBarrowedBook(book1); // adding book int to the borrowed book
								
								//book.isBorrowed();
								book.Borrowed();// setting the borrowed attribute as true 
								System.out.println(personName + " successfully borrowed "+ bookName); // printing the borrowed succesfully
								
								
								return;
								
							}
						}
					}
					else if (book.getTitle() == book1.getTitle() && book.getId() != book1.getId() && book1.isBorrowed() == true) { //  in here if there is two book as the same title if one of them is borrowed or are their id's unique if that book is borrowed then this book is cannot borrowed
						System.out.println("Sorry, this book is already borrowed");
						return;
					}
					
				}
				
			}
			else if (!bookName.equals(book.getTitle()) && bookChecker == this.books.size()) { // if the given input is not equal to the book title then it will print the Sorry, this book is not in our catalog
					bookChecker = 0;
					System.out.println("Sorry, this book is not in our catalog");
					return;
							
			}
			
			
		}

		bookHandler(bookChecker,personName,bookName); //  in here im sending the bookchekher then it will printed.
		
		
	
	
		
	}
	
	
	public void bookHandler(int handler,String personName, String bookName) {
		if(handler == 0) {
			System.out.println("Sorry, this book is not in our catalog."); // I created a method to print if a book is not in the catalog then it will printed the massage
		}
		if(handler == 5) {
			System.out.println("Sorry, this book is already borrowed.");
		}
		
		
		
	}
	public void customerHandler(int handler,String personName) {
		
		if(handler == 0) {
			
			System.out.println("Sorry, " + personName + " is not a customer.");	
		}
		
		
	}
	
	public void returnBook(String personName) {
		
		int listCounter = 0; // with this im controlling all of the values in the array list is visited
		for (Customer cust : this.customers) {
			listCounter +=1;
			if(personName.equals(cust.getName())) { // if the given input is equal to the customer name 
				if (cust.isBarrowABook() == true) { // if this customer borrow a book then it will return the book
					cust.setBarrowABook(false);
					System.out.println(personName + " successfully returned " + cust.getBarrowedBook().getTitle());
					cust.getBarrowedBook().returned(); // set the customer is retunred the book
					return;
				}
				else if(cust.isBarrowABook() == false) { // if this customer is not borrow a book than it will warn the customer  
					
					System.out.println("Sorry, " +personName + " did not borrow a book.");
					return;
					
				}
				
				
			}
			else if (listCounter != this.customers.size()) { // if the given input is not equal to the customer name it will warn you
				System.out.println("Sorry "+ personName + " is not a customer");
				return;
			}
			
			
			
		}
		
		
		//System.out.println("Deneme");
	
		
		
	}
	public void printAvailableBooks(){
		for (Book book : this.books) { // in here i printed the avaliable book
			if (book.isBorrowed() == false) { // checking the book is borrowed then it will be printed.
				System.out.println(book.toString());
			}
		}
		
		
	}
	// gettr settr methods
	public ArrayList<Book> getBooks(){
		return books;
	}

	public ArrayList< Customer> getCustomers(){
		return customers;
		
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	// overriding the toString Method
	@Override
	public String toString() {
		
		return "The lbirary address is: " + this.address;
		
	}
	
	
	
	
	
}
