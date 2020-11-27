
public class Araba {

	private String renk;
	private int kapilar;
	private int tekelerlekler;
	private String motor;
	private String model;
	
	
	public void setModel(String model) {
		
		this.model = model;
		
	}
	
	public String getModel() {
		
		return this.model;
		
	}
	
	public void setKapilar(int kapilar) {
		
		if (kapilar < 0) {
			System.out.println("Kapi sayisi 0 dan kucuk olamaz.");
		}
		else {
			this.kapilar = kapilar;
		}
		
	}
	
	public int getKapilar() {
		
		return this.kapilar;
		
	}
	public void setTekerlekler(int tekerlekler) {
		if (kapilar < 0) {
			System.out.println("Tekerlek sayisi 0 dan kucuk olamaz.");
		}
		else {
			this.tekelerlekler = tekerlekler;
		}
		
	}
	public int getTekerlek() {
		return this.tekelerlekler;
	}
	
	public void setRenk(String renk) {
		
		this.renk = renk;
		
	}
	
	public String getRenk() {
		
		return this.renk;
		
	}
	
public void setMotor(String motor) {
		
		this.motor = motor;
		
	}
	
	public String getMotor() {
		
		return this.motor;
		
	}
	
	
	
}
