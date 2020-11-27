import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int para = 300;
		
		while(true) {
			System.out.print("Yapmak istediginiz islemi giriniz");
			int islem = scanner.nextInt();
			
			if(islem == 1) {
				System.out.println("Bakiyeniz: " + para);
			}
			else if (islem == 2) {
				System.out.print("Yatirmak istediginiz parayi giriniz: " );
				int girenPara = scanner.nextInt();
				para += girenPara;
			}
			else if (islem == 3) {
				System.out.print("Yatirmak istediginiz parayi giriniz: " );
				int cikanPara = scanner.nextInt();
				if (cikanPara > para) {
					System.out.print("Amik fakiri bu kadar paran yok" );
				}
				else {
					para -= cikanPara;
				}
				
			}
			else if (islem == 0) {
				break;
			}
			else {
				System.out.print("Gecersiz islem" );
				
			// carpim taplosu	
			for (int i =1; i<= 10; i++) {
				for (int j = 1; j <= 10; j++) {
					System.out.print(i*j );
				}
			}
			
			}
 			// islemi string olarak tanimlasyadik islem.equals("2") seklinde bir sorgulama yapabilirdikk
		}
		
	}

}
