public class Account {
	private int id;
	protected double balance;
	private static double annualInterestRate;
	private java.util.Date dateCreated;

	public Account() {
		dateCreated = new java.util.Date();
	}

	public Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new java.util.Date();
	}

	public int getId() {
		return this.id;
	}

	public double getBalance() {
		return balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public static void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public double getMonthlyInterest() {
		return balance * (annualInterestRate / 1200);
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
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

	public void deposit(double amount) {
		System.out.println("Depositing money "+ balance);
		
		balance += amount;
		
		System.out.println("New balance: "+ balance);
	}
}
