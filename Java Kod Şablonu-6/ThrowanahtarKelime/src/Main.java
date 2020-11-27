import java.util.Scanner;
import java.io.IOException;
public class Main {
	
	public static void mekanKontrol(int yas) throws IOException{
		
		if (yas < 18) {
			throw new IOException();
			
			
			
		}
		else {
			System.out.println("Mekana hosgeldiniz");
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen yaþýnýzý giriniz: ");
		int yas = scanner.nextInt();
		
		try {
			mekanKontrol(yas);
		}
		catch(IOException e){
			System.out.println("IO Exception olustu");
		}
		
	}

}