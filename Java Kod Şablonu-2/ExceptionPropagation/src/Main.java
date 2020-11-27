
public class Main {
	
	public static void ucuncuFonksiyon() {
		/*try {
			int a = 12/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Bir sayi 0 a bolunemez");
			
		}*/
		int a = 12/0;
	}
	
	public static void ikinciFonksiyon() {
		
		try {
			ucuncuFonksiyon();
		}
		catch (ArithmeticException e) {
			System.out.println("Bir sayi sifira bolunemez ikinci fonskiyonda calisti");
		}
		
	}
	public static void birinciFonksiyon() {
		
		ikinciFonksiyon();
	}
	public static void main(String[] args) {
		birinciFonksiyon();
	}
}
