import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int a;
		int b;
		
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("a: "+ a + " b: "+b);
		
		int temp = a; 
		a = b;
		b = temp;
		System.out.println("a: "+ a + " b: "+b);
	}
	

}
