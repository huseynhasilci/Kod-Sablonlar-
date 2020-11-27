class Hayvan{
	private String isim;
	
	public Hayvan(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String konus() {
		return "Hayvan Konusuyor";
		
	}
	
}
class Kedi extends Hayvan{
	
	public Kedi(String isim) {
		super(isim);
	}
	
	@Override
	public String konus() {
		return this.getIsim() + " Miyavliyor";
	}
	
	
}

class Kopek extends Hayvan{
	
	public Kopek(String isim) {
		super(isim);
	}
	
	@Override
	public String konus() {
		return this.getIsim() + " Havliyor";
		
	}
	
	
	
}

class Kuzu extends Hayvan{
	
	public Kuzu(String isim) {
		super(isim);
		
	}
	@Override
	public String konus() {
		return this.getIsim() + " meliyor";
	}
}



public class Main {
	
	public static void konustur(Object object) {
		//System.out.println(hayvan.konus()); // burada icine verdigimniz referans kendi gibi davranip kendi metodula cagiriliyor
		
		// polimorifizm olmasaydi bunu yapacaktik her sey icin
		if (object instanceof Kopek) {// burada hangi siniftan oldugunu kontrol etmis olduk
			Kopek kopek = (Kopek)object;
			System.out.println(kopek.konus());
		}
		else if(object instanceof Kedi) {
			Kedi kedi = (Kedi)object;
			System.out.println(kedi.konus());
		}
		else if(object instanceof Kuzu) {
			Kuzu kuzu = (Kuzu)object;
			System.out.println(kuzu.konus());
		}
		else if(object instanceof Hayvan) {
			Hayvan hayvan = (Hayvan)object;
			System.out.println(hayvan.konus());
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Hayvan hayvan = new Hayvan("Limon");
		Hayvan hayvan1 = new Kedi("Durukus");
		Hayvan hayvan2 = new Kopek("Garabas");
		Hayvan hayvan3 = new Kuzu("Eyluk");
		System.out.println(hayvan1.konus());
		System.out.println(hayvan2.konus());
		System.out.println(hayvan3.konus());*/
		
		
		/*konustur(new Kedi("Tekir"));
		konustur(new Kopek("Garabas"));
		konustur(new Kuzu("Kinali kuzu"));*/
		// polimorfizimin anlatildigi kisim
		/*Kopek kopek = new Kopek("Karabas");
		
		if (kopek instanceof Kopek) { // burasi kopekin bir baglantisi mi diye bakiyoruz oyleyse true deger donuyor
			System.out.println("Bu nesne kopek sinifindan... ");
		}*/
		Kopek kopek = new Kopek("Karabas");
		Kedi kedi = new Kedi("Tekir");
		Kuzu kuzu = new Kuzu("Kinali Kuzu");
		Hayvan hayvan = new Hayvan("Limon");
		
		konustur(kopek);
		konustur(kedi);
		konustur(kuzu);
		konustur(hayvan);
		
	}

}

