
public class Main {
	
	public static int toplama(int a,int b, int c) {
		int toplam = a+b+c; 
		return toplam;
	}
	public static int ikiylecarp(int a) {
		return a * 2;
	}
	
	public static int ikiyletopla(int  a) {
		return a + 2;
	}
	
	public static int dortilecarp(int  a) {
		return a * 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toplama(1,2,3);
		//System.out.println("Cikti degere "+ toplama(1,2,3));
		
		dortilecarp(ikiyletopla(ikiylecarp(8)));
		System.out.println(dortilecarp(ikiyletopla(ikiylecarp(8))));
	}

}
