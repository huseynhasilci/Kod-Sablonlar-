
public class Dryga extends Beyblade{
	
	private String kutsalCanavar;
	
	public Dryga(String baybladeci,int donusHizi,int saldiriGucu,String kutsalCanavar) {
		
		super(baybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		
		
	}
	
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adi: " + kutsalCanavar);
		
		
	}
	
	@Override
	public void kutsalCanavarOrtayaCikar() {
		
		System.out.println(super.getBaybladeci() + "Kutsal Canavar ortaya cikiyor... " + kutsalCanavar+ " roaar.");
		System.out.println(super.getBaybladeci() + " in saldirisi: Kaplan pençesi ");
	}
	
}
