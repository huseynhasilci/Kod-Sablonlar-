
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Araba araba1 = new Araba();
		
		/*araba1.setModel("Renault");
		
		System.out.println("Arabanin modeli: " +araba1.getModel());
		
		araba1.setKapilar(4);
		
		System.out.println("Kapi Sayisi:" + araba1.getKapilar());*/
		
		/*Araba araba2;
		
		araba2.setKapilar(5); // tanimlamadan metodalara erisim saglayamam new Araba() demem lazim
		*/
		
		Araba araba3 = null; // bu referans herhangi bir objeyi gostermemektedir
		
		araba3.setModel("Renault");// bunu calistirirsak nullpointerexception hatasi verilir
		
	}

}
