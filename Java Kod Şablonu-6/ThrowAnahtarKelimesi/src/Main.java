import java.util.Scanner;
public class Main {
	
	public static void mekanKontrol(int yas) {
		
		if (yas < 18) {
			throw new ArithmeticException();
			
			
			
		}
		else {
			System.out.println("Mekana hosgeldiniz");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen yaşınızı giriniz: ");
		int yas = scanner.nextInt();
		
		try {
			mekanKontrol(yas);
		}
		catch(ArithmeticException e){
			System.out.println("Yasiniz 18 den kucuktur");
		}
		
	}

}
