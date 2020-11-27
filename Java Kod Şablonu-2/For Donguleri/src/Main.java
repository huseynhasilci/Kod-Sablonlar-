import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*int i;
		
		for (i = 0; i<5; i++) {
			System.out.println("i: "+i);
			
		}*/
		
		/*for (int i = 0; i<5; i++) {
			System.out.println("i: "+i);
		}*/
		
		/*for (int i = 10; i >=0; i--) {
			System.out.println("i: "+i);
		}*/
		
		/*int i = 0;
		
		for(;i<5;i++) {
			System.out.println("i: "+i);
		}*/
		
		/*int i = 0;
		int j = 10;
		
		for(;i<10 && j>0; i++,j--) {
			System.out.println("i: "+i);
			System.out.println("j: "+j);
		}*/
		
		/*for (int i = 2; i<100; i *= 2) {
			System.out.println("i: "+i);
		}*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz" );
		int sayi = scanner.nextInt();
		
		int counter = 1;
		
		for (;sayi>1; sayi--) {
			
			counter *= sayi;
			System.out.println("Deger: " + counter+"sayi: "+sayi );
		}
		
		System.out.println(counter );
		
		
		
	}

}
