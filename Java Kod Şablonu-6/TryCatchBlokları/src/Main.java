
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int a = 30/0; // unchecked exception aritcmethic 
		
		//int[] a = {1,2,3,4,5};
		
		//System.out.println(a[6]);//ArrayIndexOutOfBoundsException
		
		try {
			
			//int a = 30/0;// ArithmeticException
			int[] a = {1,2,3,4,5};
			System.out.println(a[6]);// ArrayIndexOutOfBoundsException
			
			int b = 30/0;
		}
		catch(ArithmeticException e) {
			
			System.out.println("Bir sayi 0 a bolunemez");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Arrayin boyunu astiniz");
			
		}
		
		catch(Exception e) {
			
			System.out.println("Bir hata olustu");
			e.printStackTrace();
		}
		
		/*catch(ArrayIndexOutOfBoundsException e) {
			
			//System.out.println("Bir sayi sifira bolunemez");
			System.out.println("Arrayin boyunu astiniz");
			e.printStackTrace();
		}*/
		System.out.println("Burasi calisiyor ");
	}

}
