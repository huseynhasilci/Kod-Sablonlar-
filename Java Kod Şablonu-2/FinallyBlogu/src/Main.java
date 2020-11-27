
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			//String s = null;
			int a = 30/0;
			
			String s = "Mustafa";
			
			System.out.println(s.hashCode());
			
		}
		catch(NullPointerException e) {
			
			System.out.println("Null reference Hatasi...");
			
		}
		finally {
			
			System.out.println("Finally blogu calisiyor...");
			
		}
	}

}
