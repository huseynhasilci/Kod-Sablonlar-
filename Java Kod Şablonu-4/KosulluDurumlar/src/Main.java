import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Yasinizi giriniz");
		int yas;
		
		yas = scanner.nextInt();
				
		if (yas < 18) {
			System.out.print("Mekana giremezsiniz");
		}
		else {
			System.out.print("Mekana hosgeldin baskan");
		}
				
		int islem;
		
		islem = scanner.nextInt();
		
		if(islem == 1) {
			System.out.print("1. Islem");
		}
		else if (islem == 2) {
			System.out.print("2. Islem");
		}
		else if (islem == 3) {
			System.out.print("3. Islem");
		}
		else if (islem == 4) {
			System.out.print("4. Islem");
		}
		else {
			System.out.print("Baska Islem");
		}
		
	}

}
