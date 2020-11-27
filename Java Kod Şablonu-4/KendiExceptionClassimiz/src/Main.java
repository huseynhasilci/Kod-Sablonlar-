import java.util.Scanner;
public class Main {
	
	public static void mekanKontrol(int yas) {
		if (yas < 18) {
			throw new InvalidHException("Invalid age");
			
		}
		else {
			System.out.println("Mekana hosgeldiniz");
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz");
		int yas = scanner.nextInt();
		try {
			mekanKontrol(yas);
		}
		catch(InvalidHException e) {
			e.printStackTrace();
		}
		
		
	}

}
