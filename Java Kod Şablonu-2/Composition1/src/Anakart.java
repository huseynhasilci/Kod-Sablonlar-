
public class Anakart {
	
	private String model;
	
	private String uretici;
	
	private int yuvasayisi;
	
	private String isletimSistemi;
	
	public Anakart(String model,String uretici,int yuvasayisi,String isletimSistemi) {
		
		this.model = model;
		this.uretici = uretici;
		this.yuvasayisi = yuvasayisi;
		this.isletimSistemi = isletimSistemi;
		
	}

	public void isletimSistemiYukle(String isletimSistemi) {
		
		this.isletimSistemi =isletimSistemi;
		System.out.println("Isletim sistemi yuklendi: " + isletimSistemi);
		
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUretici() {
		return uretici;
	}

	public void setUretici(String uretici) {
		this.uretici = uretici;
	}

	public int getYuvasayisi() {
		return yuvasayisi;
	}

	public void setYuvasayisi(int yuvasayisi) {
		this.yuvasayisi = yuvasayisi;
	}

	public String getIsletimSistemi() {
		return isletimSistemi;
	}

	public void setIsletimSistemi(String isletimSistemi) {
		this.isletimSistemi = isletimSistemi;
	}
	
	
}
