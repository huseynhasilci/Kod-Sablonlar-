
public class Main1 {
	
	public static boolean asalsayi (int asal) {
		
		for (int i = 2; i< asal; i++) {
			if (asal % i == 0) {
				return false;
				
			}
			
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i <1000; i++ ) {
			if (asalsayi(i)) {
				System.out.println(i);
			}
			
			
			//System.out.println(asalsayi(i));
		}
		
		
	}

}
