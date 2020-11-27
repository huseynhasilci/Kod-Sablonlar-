
public class Hesap {
	
	private String kullaniciAdi;
	private String parola;
	private int bakiye;
	
	public Hesap(String kullaniciAdi, String parola, int bakiye) {
		
		this.kullaniciAdi = kullaniciAdi;
		this.parola = parola;
		this.bakiye = bakiye;
	}
	
	public void setKullaniciAdi(String kullaniciAdi) {
		
		this.kullaniciAdi = kullaniciAdi;
	}
	
	public String getKullaniciAdi() {
		return this.kullaniciAdi;
		
	}
	
	public void setParola(String parola) {
		
		this.parola = parola;
	}
	
	public String getParola() {
		return this.parola;
		
	}
	
	public void setBakiye(int bakiye) {
		
		this.bakiye = bakiye;
	}
	
	public int getBakiye() {
		return this.bakiye;
		
	}
	
	
	public void paraYatir(int tutar) {
		
		this.bakiye += tutar;
		System.out.println("Yeni bakiyeniz: "+ bakiye);
	}
	
	public void paraCek(int tutar) {
		
		if (tutar > bakiye) {
			System.out.println("Yeterli Paraniz bulunmamaktadir: "+ bakiye);
		}
		
		else {
			this.bakiye -= tutar;
			System.out.println("Yeni Paraniz: "+ bakiye);
		}
		
	}
	
	
	
	
	
	
}
