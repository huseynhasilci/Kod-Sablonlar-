// Dogalgaz abonesi



public class Abone {
	
	public String isim;
	public int bakiye;
	public String sehir;
	
	public void dogalgazKullan(int miktar) {
		
		if(this.bakiye - miktar <0) {
			
			System.out.println("Yeterli bakiye yok");
			
		}
		else {
			
			this.bakiye -= miktar;
			if (this.bakiye <= 0) {
				System.out.println("Bakiyeniz bitmi�tir kredi yukle bij");
			}
			else {
				System.out.println("Yeni bakiye: "+ this.bakiye);
				
			}
		}
		
	}
	
	public void bakiyeOgren() {
		
		System.out.println("Bakiye: "+ this.bakiye);
	}
	
}
