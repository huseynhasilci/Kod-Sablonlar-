import java.util.Scanner;
public class ATM {
	public void calis(Hesap hesap) {
		Login login = new Login();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bankamiza Hosgeldiniz... ");
		System.out.println("******************** ");
		System.out.println("Kullanici girisi: ");
		System.out.println("******************** ");
		
		int giris_hakki = 3;
		while (true) {
			if(login.login(hesap)) {
				System.out.println("Giris basarili" );
				break;
			}
			else {
				System.out.println("Giris basarisiz" );
				giris_hakki -= 1;
				System.out.println("Kalan giris hakki: " + giris_hakki  );
				
			}
			if (giris_hakki == 0){
				return;
			}
		}
		
		while (true) {
			System.out.println("Yapmak istediginiz islem: " );
			String islem = scanner.nextLine();
			
			if(islem.equals("1")) {
				System.out.println("Bakiyeniz: "+hesap.getBakiye());
			}
			else if(islem.equals("2")) {
				System.out.println("Yatirmak istediginiz tutar: " );
				int tutar = scanner.nextInt();
				scanner.nextLine();
				
				hesap.paraYatir(tutar);
			}
			else if(islem.equals("3")) {
				System.out.println("Cekmek istediginiz tutar: " );
				int tutar = scanner.nextInt();
				scanner.nextLine();
				hesap.paraCek(tutar);
			}
			else if(islem.equals("q")) {
				break;
			}
			else {
				System.out.println("Gecersiz islem");
			}
			
		}
		
		
		
	}
	
	
	
}
