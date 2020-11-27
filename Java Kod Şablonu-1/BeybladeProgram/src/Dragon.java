
public class Dragon extends Beyblade{
	
	private String kutsalCanavar;
	private String gizliYetenek;
	public Dragon(String baybladeci,int donusHizi,int saldiriGucu,String kutsalCanavar,String gizliYetenek) {
		super(baybladeci, donusHizi, saldiriGucu);
		this.kutsalCanavar = kutsalCanavar;
		this.gizliYetenek = gizliYetenek;
		
		
	}
	@Override
	public void bilgileriGoster() {
		super.bilgileriGoster();
		System.out.println("Kutsal Canavar Adi: " + kutsalCanavar);
		System.out.println("Gizli yetenek: " + gizliYetenek);
		
	}
	
	@Override
	public void kutsalCanavarOrtayaCikar() {
		
		System.out.println(super.getBaybladeci() + "Kutsal Canavar ortaya cikiyor... " + kutsalCanavar+ " roaar.");
		System.out.println(super.getBaybladeci() + " in Saldirisi : Hayalet kasirgasi");
	}
	
}
