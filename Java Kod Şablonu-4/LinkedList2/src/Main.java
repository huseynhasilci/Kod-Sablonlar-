import java.util.LinkedList;
import java.util.ListIterator;
public class Main {
	
	public static void listeyiBastir(LinkedList<String> gidilecekYerler) {
		
		/*for(String i: gidilecekYerler) {
			
			System.out.println(i);
			
		}*/
		ListIterator<String> iterator = gidilecekYerler.listIterator();
		while(iterator.hasNext()) { //  nexti var mi diye baktik bunun sayesinde
			
			
			System.out.println(iterator.next()); // next indeksine gittik bununla berabewr
		}
		
	}
	
	public static void siraliEkle(LinkedList<String> gidilecekYerler,String yeni) {
		
		
		ListIterator<String> iterator = gidilecekYerler.listIterator();
		
		while(iterator.hasNext()) {
			
			int karsilastir = iterator.next().compareTo(yeni);// bunun sayesinde deger icinde var mi karsilastiyoruz
			if(karsilastir == 0) {
				//iki deger esit
				System.out.println("Listenizde bu eleman zaten var");
				
				return;
				
			}
			else if(karsilastir <0 ) {
				
				
				// yeni deger iterator.nextten daha buyuk
			}
			else if (karsilastir > 0) {
				iterator.previous();
				iterator.add(yeni);
				return;
			}
			
		}
		iterator.add(yeni);
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<String> gidilecekYerler = new LinkedList<String>();
		
		siraliEkle(gidilecekYerler,"Postane");
		siraliEkle(gidilecekYerler,"Market");
		siraliEkle(gidilecekYerler,"Ev");
		
		/*gidilecekYerler.add("Postane");
		
		gidilecekYerler.add("Market");
		
		gidilecekYerler.add("Okul");
		
		gidilecekYerler.add("Kutuphane");
		gidilecekYerler.add("Spor Salonu");
		gidilecekYerler.add("Ev");
		
		listeyiBastir(gidilecekYerler);
		
		System.out.println("-----------------------------------");
		
		gidilecekYerler.add(4,"Alisveris Merkezi");
		
		listeyiBastir(gidilecekYerler);*/
		
		listeyiBastir(gidilecekYerler);
		
		
	}
	
	
}
