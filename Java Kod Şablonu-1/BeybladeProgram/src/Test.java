import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bayblade programina hosgeldiniz");
		System.out.println("Cikis icin q ya basiiniz");
		
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			
			String islem = scanner.nextLine();
			if (islem.equals("q")) {
				
				System.out.println("Programdan cikiliyor");
				break;
			}
			else {
				BeybladeFabrikasi beybladeFabrikasi = new BeybladeFabrikasi();
				Beyblade beyblade = beybladeFabrikasi.beybladeUret(islem);
				if (islem == null) {
					System.out.println("Lutfen gecerli bir beyblade ismi girin...");
					
				}
				else {
					beyblade.bilgileriGoster();
					beyblade.Saldir();
					beyblade.kutsalCanavarOrtayaCikar();
				}
			}
		}
		
		
	}

}
