import java.util.Scanner;
public class Main2 {

	
	public static int cikarma(int a, int b) {
		return (a-b);
	}
	
	public static double bolme(int a, int b) {
		return ((double)a/b);
	}
	public static int toplama(int a, int b) {
		return (a+b);
	}
	
	public static int toplama(int a, int b,int c) {
		return (a+b+c);
	}
	
	public static int carpma(int a, int b) {
		return (a*b);
	}
	public static int carpma(int a, int b,int c) {
		return (a*b*c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			System.out.print("Ýslemi seciniz..");
			
			
			String islem = scanner.nextLine();
			
			if (islem.equals("1")) {
				System.out.print("Programdan cikiliyor");
				break;
			}
			else if (islem.equals("2")) {
				System.out.print("Kac deger toplayacaksiniz 2 veya 3");
				int kacsayi = scanner.nextInt();
				if (kacsayi == 2) {
					int sayi1 = scanner.nextInt();
					int sayi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.print(toplama(sayi1,sayi2));
				}
				else if (kacsayi == 3) {
					int sayi1 = scanner.nextInt();
					int sayi2 = scanner.nextInt();
					int sayi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.print(toplama(sayi1,sayi2,sayi3));
				}
				else {
					System.out.print("Bunun icin uygun kosul bulunmuyor");
				}
				
				
			}
			else if (islem.equals("3")) {
				int sayi1 = scanner.nextInt();
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				System.out.print(cikarma(sayi1,sayi2));
			}
			else if (islem.equals("4")) {
				System.out.print("Kac deger toplayacaksiniz 2 veya 3");
				int kacsayi = scanner.nextInt();
				if (kacsayi == 2) {
					int sayi1 = scanner.nextInt();
					int sayi2 = scanner.nextInt();
					scanner.nextLine();
					System.out.print(carpma(sayi1,sayi2));
				}
				else if (kacsayi == 3) {
					int sayi1 = scanner.nextInt();
					int sayi2 = scanner.nextInt();
					int sayi3 = scanner.nextInt();
					scanner.nextLine();
					System.out.print(carpma(sayi1,sayi2,sayi3));
				}
				else {
					System.out.print("Bunun icin uygun kosul bulunmuyor");
				}
			}
			else if (islem.equals("5")) {
				int sayi1 = scanner.nextInt();
				int sayi2 = scanner.nextInt();
				scanner.nextLine();
				System.out.print(bolme(sayi1,sayi2));
			}
			else {
				System.out.print("Gecersiz Islem");
			}
			
		}
		
		
		
		
		
		
	}

}
