
public class Main {
	
	public static void toplama(String a, String b){
		System.out.println(a + " " + b);
		
	}
	
	public static void toplama(int a, int b){
		System.out.println(a+b);
		
	}
	public static void toplama(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void skorhesapla(String isim,int puan) {
		System.out.println(isim + " adli oyuncunun "+ puan+"puani var");
	}
	public static void skorhesapla(int puan) {
		System.out.println(" Isimsiz oyuncunun "+ puan+"puani var");
	}
	
	public static void skorhesapla(String isim) {
		System.out.println(isim + " adli oyuncunun hic puani yok");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//toplama(3,4,5);
		//toplama(2,5);
		//toplama("Mustafa","Murat");
		
		skorhesapla("Huso",1000);
		skorhesapla(1000);
		skorhesapla("Huso");
		
		
	}

}
