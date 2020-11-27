import java.util.Scanner;
public class Main {
	
	public static void arrayiBastir(int[] array) {
		
		for(int i = 0; i <array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
	
	public static double ortalamaBul(int[] array) {
		double val = 0.0;
		
		for (int i = 0; i<array.length; i++) {
			
			val += array[i]; 
			
		}
		return val/array.length;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 5;
		
		/*int[] a = new int[10]; // bu sekilde bellekte 10 tane depolanacak yer aciliyor
		
		int[] b = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(b[0]);
		System.out.println(b[2]);*/
		
		
		
		
		//a[5] = 55; // arrayin 5. indeksine bu degerini vermis olduk
		//a[9] = 50;
		
		//double[] b;
		
		
		int[] a= new int[5];
		
		int[] b = {10,20,30,40,50};		
		
		/*System.out.println("Arrayin uzunlugu "+ b.length);
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0;i<5;i++) {
			
			a[i] = scanner.nextInt();
			
		}
		
		
		/*for (int i = 0; i < 5; i++) {
			a[i] = i * 4 + 2;
		}*/
		
		
		
		
		/*for (int i = 0; i < 5; i++) {
			System.out.println(a[i]);
		}*/
		
		arrayiBastir(b);
		
		System.out.println(ortalamaBul(b));
		
		
		
		
		
		
		
		
		
	}

}
