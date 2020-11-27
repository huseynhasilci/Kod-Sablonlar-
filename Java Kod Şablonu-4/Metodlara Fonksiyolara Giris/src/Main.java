import java.util.Scanner;
public class Main {
	public static void selamlama() {
		System.out.println("Merhaba nasilsiniz");
		System.out.println("Selamlar");
	}
	public static void faktoriyel() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz");
		int sayi = scanner.nextInt();
		
		int faktoriyel = 1;
		
		for (; sayi> 1;sayi--) {
			faktoriyel *= sayi;
		}
		System.out.println("Faktoriyel: "+ faktoriyel);
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		selamlama(); //  fonksiyon burada cagidirilir.
		
		faktoriyel();
		
		
		
		
		
		
	}

}
