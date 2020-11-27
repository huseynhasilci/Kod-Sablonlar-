
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"Elma","Armut","Kiraz"};
		
		int[] array2 = {1,2,3,4,5,6};
		
		Deneme[] array3 = {new Deneme("Mustafa"),new Deneme("Murat"),new Deneme("Coskun")};
		
		for(Deneme i : array3) {
			i.yaz();
			
		}
		
		
		
		for(int i : array2) {
			System.out.println(i);
		}
		
		
		for(String a : array) {
			
			System.out.println(a);
			
		}
		
	}

}
