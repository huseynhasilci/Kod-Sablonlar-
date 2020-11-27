
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// kosula bakmadan en az bir kere calismasi icin var
		int i = 0;
		do {  
			System.out.println("i: "+i);
			i++;
		}while(i<5);
		int sayi = 1234;
		
		
		int toplam = 0;
		do {
			toplam += sayi % 10;
			sayi = sayi / 10;
		} while(sayi >0);
		System.out.println("Rakamlari toplami"+toplam);
	}

}
