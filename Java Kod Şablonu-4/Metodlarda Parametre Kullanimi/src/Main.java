
public class Main {
	
	
	public static void selamlama(String isim) {
		System.out.println("Selamlar... "+ isim);
	}
	
	public static void toplama(int a,int b, int c) {
		int toplam = a + b + c;
		System.out.println(toplam);
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		selamlama("Harun abi");
		selamlama("Ayse");
		toplama(1,2,3);
	}
	
	
}
