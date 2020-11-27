
public class Account {

	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telefonNo;
	// bunlar constructorlar
	public Account() {
		/*this.hesapNo = "Bilgi yok";
		this.bakiye = 0.0;
		this.isim = "Bilgi yok";
		this.email = "Bilgi yok";
		this.telefonNo = "Bilgi yok";*/
		// bu sekilde tanimlamak yerine asagidaki gibi bir tanim yapabiliyoruz
		this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok");
		
	}
	public Account(String isim, String email,String telefonNo) {
		
		/*this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		this.bakiye = 0.0;
		this.hesapNo = "Bilgi yok";*/
		this("Bilgi yok",0.0,isim,email,telefonNo); //asagida girilen degerler otomatik olarak buraya da girilmis oluyor bu sekilde yazdigimiz zaman
		
	}
	
	
	public Account(String hesapNo,double bakiye,String isim,String email,String telefonNo) {
		
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telefonNo = telefonNo;
		
		
	}
	
	
	
	
	public void bilgileriGoster() {
		
		System.out.println("Hesap No: "+ this.hesapNo);
		System.out.println("Bakiye: "+ this.bakiye);
		System.out.println("Isim "+ this.isim);
		System.out.println("E-mail: "+ this.email);
		System.out.println("Telefon No: "+ this.telefonNo);
	}
	
	
	public void paraYatir(double miktar) {
		
		bakiye += miktar;
		
		System.out.println("Yeni Bakiye:" + bakiye );
	}
	 public void paraCekme(double miktar) {
		 
		 if (miktar > this.bakiye) {
			 System.out.println("Bu kadar paraniz bulunmamaktadir: " + bakiye);
		 }
		 if(miktar>1500) {
			 System.out.println("1500 den fazla cekemezsiniz");
		 }
		 else {
			 bakiye -= miktar;
			 System.out.println("Islem basarili: "+ bakiye );
		 }
		 
	 }
	
	
	
	public void setHesapNo(String hesapNo) {
		
		this.hesapNo = hesapNo;
		
	}
	public String getHesapNo() {
		return hesapNo;
	}
	
	public void setIsim(String isim) {
		
		this.isim = isim;
		
	}
	public String getIsim() {
		return isim;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
		
	}
	public String getEmail() {
		return email;
	}
	
	public void setTelefonNo(String telefonNo) {
		
		this.telefonNo = telefonNo;
		
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
		
	}
	public double getBakiye() {
		
		return this.bakiye;
		
	}
	
	
}
