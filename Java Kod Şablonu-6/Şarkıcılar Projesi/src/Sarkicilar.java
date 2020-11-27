import java.util.ArrayList;
public class Sarkicilar {
	
	
	private ArrayList<String> sarkiciListesi = new ArrayList<String>();
	
	public void sarkicilariBastir() {
		
		System.out.println("Sarkici listesinde "+sarkiciListesi.size() + " kadar sarkirici var" );
		
		for(int i = 0; i < sarkiciListesi.size(); i++) {
			
			System.out.println(sarkiciListesi.get(i));
			
		}
		
	}
	
	public void sarkiciEkle(String isim){
		
		
		sarkiciListesi.add(isim);
		System.out.println("Sarkici listesi guncellendi");
	}
	
	public void sarkiciGuncelle(String yeni_isim,int pozizyon) {
		
		sarkiciListesi.set(pozizyon, yeni_isim);
		System.out.println("Sarkici listesi guncellendi");
	}
	
	
	public void sarkiciSil(int pozisyon) {
		
		String isim = sarkiciListesi.get(pozisyon);
		
		
		sarkiciListesi.remove(pozisyon);
		System.out.println(isim + " isimli sarkici listeden silindi");
		
	}
	
	public void sarkiciAra(String sarkiciIsmi) {
		
		int pozisyon = sarkiciListesi.indexOf(sarkiciIsmi);
		
		if (pozisyon == -1) {
			
			System.out.println("Boyle bir kullanici adi bulunmamaktradir");
			
		}
		
		else {
			
			System.out.println("Aradiginiz sarkici: " + sarkiciListesi.get(pozisyon));
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
