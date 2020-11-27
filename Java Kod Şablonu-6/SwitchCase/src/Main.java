import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int islem;
		
		islem = scanner.nextInt();
		
		switch(islem) {
			case 1:
				System.out.println("1. Islem");
				break;
			case 2:
				System.out.println("2. Islem");
				break;
			case 3:
				System.out.println("3. Islem");
				break;
			case 4:
				System.out.println("4. Islem");
				break;
			default:
				System.out.println("Gecersiz Islem");
				break;
		
		}
		
		
		
		
	}

}
