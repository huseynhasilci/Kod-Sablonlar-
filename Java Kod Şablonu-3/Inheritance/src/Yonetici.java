
public class Yonetici extends Calisan{ // SubClass calisan clasinin butun ozelliklerini miras almis demek oluyor
	
	
	private int sorumluKisi;
	
	
	public Yonetici(String isim, int maas, String departman,int sorumluKisi) {
		/*this.isim = isim;
		this.maas = maas;
		this.departman = departman;*/
		super(isim,maas,departman);
		this.sorumluKisi = sorumluKisi;
		
		
		
	}
	
	public void zamYap(int zam) {
		System.out.print("Calisanlara " + zam + " zam yapildi");
		
		
	}
	
	public void bilgileriGoster() { // burasi sayesinde calisan kisminda bulunan bilgileri gosteri override edip buradaki bilgileri goster metordu olsuturmus olduk
		
		/*System.out.println("Isim: "+getIsim());
		System.out.println("Maas: "+getMaas());
		System.out.println("Departman: "+getDepartman());*/
		
		super.bilgileriGoster(); // calisan kismindan bir metodu bu sekilde cagirabildik super classtan bir sey cagirdik yani
		
		System.out.println("Sorumlu Kisi: "+sorumluKisi);
	}
	
}	
