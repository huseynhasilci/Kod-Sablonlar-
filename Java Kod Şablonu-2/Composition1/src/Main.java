
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resolution resolution = new Resolution(1920,1080);
		Monitor monitor = new Monitor("VS197DE","Asus","18.5",resolution);
		Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli cam");
		Anakart anakart = new Anakart("B250-Pro","Asus",10,"Windows-10");
		
		Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);
		
		pc.getKasa().bilgisayariAc(); // ulasmadan once kasaya gidip kasanin icindeki metodlari aldik
		pc.getAnakart().isletimSistemiYukle("Winodws-7");;
		pc.getMonitor().monitoruKapat();
	}

}
