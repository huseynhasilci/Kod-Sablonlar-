import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	public static void islemleriBastir() {
		
		System.out.println("1\n2\n3\n");
		
		
	}
	
	
	public static void sehirleriTurla(LinkedList<String> sehirler) {
		
		ListIterator<String> iterator = sehirler.listIterator();
		int islem;
		
		
		islemleriBastir();
		
		Scanner scanner = new Scanner(System.in);
		
		if(!iterator.hasNext()) {
			
			System.out.println("Herhangi bir sehir bulunmuyor");
			
		}
		boolean cikis = false;
		boolean ileri = true;
		
		while(!cikis) {
			
			islem = scanner.nextInt();
			if(islem == 0) {
				
				islemleriBastir();
			}
			else if(islem == 1) {
				
				if (!ileri) {
					
					if (iterator.hasNext()) {
						
						iterator.next();
					}
					ileri = true;
				}
				
				
				if (iterator.hasNext()) {
					
					System.out.println("Sehre gidiliyor: "+ iterator.next());
					
				}
				else {
					System.out.println("Sehir turu basladi");
					
				}
			}
			else if(islem == 2) {
				if (ileri) {
					
					if (iterator.hasPrevious()) {
						
						iterator.previous();// onceden var mi diye kontrol edip daha sonra var ise bir oncekine gidip dahja sonra yazdiilmasi gerekeni yazdirdik aksi taktirde bunu yazdirdigimiz zaman olgudmuz yerde kalacaktik cunku bizim referansimiz ileri gidildiginde afyon ya da eskisehiri gosteriyor olacakti
					}
					ileri = false;
				}
				if (iterator.hasPrevious()) {
					
					System.out.println("Sehre gidiliyor: "+ iterator.previous());
					
				}
				else {
					System.out.println("Gidilecek sehir kalmadi");
					ileri = true;
					
				}
			}
			else if(islem == 3) {
				System.out.println("Sistemden cikiliyor");
				cikis = false;
				
			}
			
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> sehiler = new LinkedList<String>();
		
		sehiler.add("Ankara");
		sehiler.add("Eskisehir");
		sehiler.add("Afyon");
		
		sehirleriTurla(sehiler);
		
	}

}
