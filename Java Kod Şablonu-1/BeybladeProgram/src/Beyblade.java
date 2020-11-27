
public class Beyblade {
	
	private String baybladeci;
	private int donusHizi;
	private int saldiriGucu;
	
	public Beyblade(String baybladeci,int donusHizi,int saldiriGucu) {
		
		this.baybladeci = baybladeci;
		this.donusHizi = donusHizi; 
		this.saldiriGucu = saldiriGucu;
		
		
	}

	public String getBaybladeci() {
		return baybladeci;
	}

	public void setBaybladeci(String baybladeci) {
		this.baybladeci = baybladeci;
	}

	public int getDonusHizi() {
		return donusHizi;
	}

	public void setDonusHizi(int donusHizi) {
		this.donusHizi = donusHizi;
	}

	public int getSaldiriGucu() {
		return saldiriGucu;
	}

	public void setSaldiriGucu(int saldiriGucu) {
		this.saldiriGucu = saldiriGucu;
	}
	
	public void Saldir() {
		System.out.println(getBaybladeci() + " "+ getSaldiriGucu()+ " "+ getSaldiriGucu() + " ile saldiriyor");
	}
	
	public void kutsalCanavarOrtayaCikar() {
		
		System.out.println("Bu beybladenin kutsal canavari bulunmuyor");
		
	}
	
	public void bilgileriGoster() {
		
		System.out.println("Beybladeci ismi: "+ baybladeci);
		System.out.println("Beyblade saldiri gucu: "+ saldiriGucu);
		System.out.println("Beyblade donus hizi: "+ donusHizi);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
