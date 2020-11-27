import java.util.Scanner;
public class Main {
	private static Sarkicilar sarkicilar = new Sarkicilar(); 
	private static Scanner scanner  = new Scanner(System.in);
	
	public static void islemleriBastir() {
		System.out.println("1 2 3 4 5 6 ya bas");
		
	}
	
	public static void goruntule() {
		
		sarkicilar.sarkicilariBastir();
		
	}
	
	public static void sarkiciEkle() {
		
		System.out.println("Eklemek istediginiz sarkicinin ismi: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkiciEkle(isim);
		
	}
	
	public static void sarkiciGuncelle() {
		
		System.out.println("Pozisyon ");
		int guncellenecek_isim = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Eklemek istediginiz sarkicinin ismi: ");
		String isim = scanner.nextLine();
		
		sarkicilar.sarkiciGuncelle(isim, guncellenecek_isim-1);
		
		
	}
	
	public static void sil() {
		
		System.out.println("Pozisyon ");
		int guncellenecek_isim = scanner.nextInt();
		sarkicilar.sarkiciSil(guncellenecek_isim);
		
	}
	
	public static void ara() {
		
		System.out.println("Eklemek istediginiz sarkicinin ismi: ");
		String isim = scanner.nextLine();
		sarkicilar.sarkiciAra(isim);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\t Sarkici uygulamasina hosgeldiniz");
		
		islemleriBastir();
		
		boolean cikis = false;
		
		int islem;
		
		while(!cikis) {
			
			islem = scanner.nextInt();
			scanner.nextLine();
			if (islem == 0) {
				islemleriBastir();
			}
			else if (islem == 1) {
				goruntule();
			}
			else if (islem == 2) {
				sarkiciEkle();
			}
			else if (islem == 3) {
				sarkiciGuncelle();
			}
			else if (islem == 4) {
				sil();
			}
			else if (islem == 5) {
				ara();
			}
			else if (islem == 6) {
				cikis = true;
			}
			else {
				
			}
			
			
		}
		
	}

}
