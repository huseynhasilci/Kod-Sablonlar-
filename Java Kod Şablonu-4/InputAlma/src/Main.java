import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.println("Yasinizi giriniz: ");
		
		int yas = scanner.nextInt();
		System.out.println("Yasiniz: "+ yas);
		
		System.out.println("Sayi giriniz: ");
		
		double sayi = scanner.nextDouble();
		System.out.println("Sayi: "+ sayi);
		
		scanner.nextLine(); bunun sayesinde buradan sonra string bir deger yaazmamiza yardimci oldu dummy variable olusturdu 
		
		*/
		
		System.out.println("Yazi giriniz: ");
		
		String yazi = scanner.nextLine();
		
		System.out.println("Yazi: "+ yazi);
		
		if (scanner.hasNextInt()) { // burada girilen deger int mi diye kontrol ettik
			int yas = scanner.nextInt();
			System.out.println("Yasiniz: "+ yas);
		}
		
		else {
			System.out.println("Int gir lan bij");
		}
		
		
		
	}

}
