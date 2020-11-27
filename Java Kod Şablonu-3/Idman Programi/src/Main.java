
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Idman idman  = new Idman(12,12,15,20);
		
		while (idman.idmanBittiMi() == false) {
			
			idman.hareketYap("Burpee", 5);
		}
		
	}

}
