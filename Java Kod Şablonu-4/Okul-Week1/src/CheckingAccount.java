
public class CheckingAccount extends Account {
	
	
	public CheckingAccount(int id, double balance ) {
		
		super(id,balance);
		
	}
	public void withdraw(double amount) {
		 double overdraw = 5000;
		if (amount  - overdraw + balance> 0) {
			System.out.println("Insufficent balance: "+ balance);
		}
		else if (amount > 5000) {
			System.out.println("You cannot draw more then 5000");
		}
		else {
			balance -= amount;
		}
	}
	
	public String toString() {
		return "Checkings";
	}
	
}
