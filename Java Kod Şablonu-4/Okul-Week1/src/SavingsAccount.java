
public class SavingsAccount extends Account{

	public SavingsAccount(int id, double balance) {
		
		super(id,balance);
		
		
	}
	public void withdraw(double amount) {
		if (amount > balance) {
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
		return "Saving";
	}
	
}
