
public class Kopek extends Hayvan{
	private  int dis_sayisi;
	
	public Kopek(String isim,int kilo, int boy, int bacakSayisi,int dis_sayisi) {
		
		super(isim,kilo,boy,bacakSayisi);
		this.dis_sayisi = dis_sayisi;
	}

	public int getDis_sayisi() {
		return dis_sayisi;
	}

	public void setDis_sayisi(int dis_sayisi) {
		this.dis_sayisi = dis_sayisi;
	}
	public void hareket_et(int hiz) {
		System.out.println("Kopek "+ hiz + " ile hareket ediyor");
	}
	
	
	public void kos(int hiz) {
		System.out.println("Kopek su anda kosuyor");
		hareket_et(hiz);
		
	}
	
	
}
