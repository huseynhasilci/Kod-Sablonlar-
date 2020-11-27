
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Account account1 = new Account();
		
		/*account1.setHesapNo("123456");
		account1.setBakiye(1000.0);
		account1.setIsim("Huso");
		account1.setEmail("asfdasd");
		account1.setTelefonNo("6565231");
		
		System.out.println("Bakiye: " + account1.getBakiye());*/
		//Account account2 = new Account("12312412",1000.0,"Huso","asdas","2123341"); // constructýrdan cektgimiz zaman boyle erisebiliyoruz
		
		//account2.paraCekme(2000);
		//account2.paraYatir(500);
		//account2.paraCekme(500);
		
		/*
		Account account1 = new Account();
		System.out.println(account1.getEmail());	
		
		Account account2 = new Account("Ahmet can","husomail.com","6546546");
		System.out.println(account2.getEmail());
		System.out.println(account2.getBakiye());
		
		account2.bilgileriGoster();*/
		
		Account account1 = new Account("Huso","huso.com","1234213");
		
		Account account2 = account1;
		
		Account account3 = new Account();
		
		if (account1 == account3) {
			
			System.out.println("Ayni objeyi gosteriyorlar" );
			
			
			
		}
		else{
			System.out.println("Ayni objeyi gostermiyorlar" );
		}
		
		new Account("Ahmet can","gmailke","124123").bilgileriGoster();
		
		
		
	}

}
