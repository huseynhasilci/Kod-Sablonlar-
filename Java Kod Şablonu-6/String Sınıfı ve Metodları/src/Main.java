
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Mustafa";
		
		String b = new String("Mustafa");
		
		System.out.println(b);
		
		System.out.println("Harf sayisi: "+ b.length());
		
		System.out.println("0. Indeks " + b.charAt(0));
		System.out.println("2. Indeks " + b.charAt(2));
		System.out.println("Son Indeks " + b.charAt(b.length()-1));
		
		for (int i = 0; i<b.length(); i++) {
			System.out.println(b.charAt(i));
			
		}
		
		System.out.println(b.startsWith("Mu"));
		System.out.println(b.endsWith("CO"));
		
		
		System.out.println(b.indexOf("a"));//  eger icerisinde olmayan bir deger olursa -1 doner
		
		System.out.println(b.lastIndexOf("a"));
		
		System.out.println(b.toLowerCase()); // hepsini kucuk hale getirdi
		
		System.out.println(b.toUpperCase()); // hepsini buyuk hale getirdi
		
		
		String c = "1923";
		
		int d = Integer.parseInt(c);// bunun sayesinde String olan deger int bir degere donusmus oldu
		
		System.out.println(d);
		
		
		int b1 = 1923;
		
		String a1 = String.valueOf(b1);// bunun sayesinde int degeri string bir degere donusturmus olduk
		
		System.out.println(a1);
		
		
		String newA = "Mustafa";
		String newA1 = "Mustafa";
		
		if (newA == newA1) {
			
			System.out.println("Esitler");
			
		}
		
		String newB = new String("Mustafa");
		String newB1 = new String("Mustafa"); // bu sekilde tanimladigimiz zaman farkli yerleri gosterir
		
		if (newB == newB1) {
			System.out.println("Esitler");
		}
		else {
			System.out.println("Esit Degiller");
		}
		
		if (newB.equals(newB1)) { // icerikleri ayni mi diye kontrol ettik burada
			System.out.println("Esitler");
		}
		
		
		
	}

}
