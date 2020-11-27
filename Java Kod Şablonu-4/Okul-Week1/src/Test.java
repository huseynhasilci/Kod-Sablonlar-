
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount checking =new CheckingAccount(1,35);
		SavingsAccount savings = new SavingsAccount(2,25);
		checking.withdraw(3000.0);
		savings.withdraw(50.0);
		
		System.out.println(checking.getBalance());
		System.out.println(savings.getBalance());
	}

}
