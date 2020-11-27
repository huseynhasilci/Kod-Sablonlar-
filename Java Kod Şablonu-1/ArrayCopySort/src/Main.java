import java.util.Arrays;
import java.util.Scanner;
public class Main {
	
	public static int[] arrayiDoldur(int sayi) {
		
		Scanner scanner = new Scanner(System.in);
		int[] cikti = new int[sayi];
		
		for (int i = 0; i<sayi; i++) {
			cikti[i]  = scanner.nextInt();
		}
		
		return cikti;
	}
	public static void arrayiBastir(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void arraySort(int[] array) {
		
		// Arrays
		Arrays.sort(array);
		arrayiBastir(array);
		
	}
	
	public static void main(String[] args) {
		//int[] a = arrayiDoldur(5);
		//arraySort(a);
		//arrayiBastir(a);
		
		int[] a1 = {1,2,3,4,5,6};
		int[] a2 = {1,2,3,4,5,6};
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("Esitler");
		}
		else {
			System.out.println("Esit Degiller");
		}
		
		
	}

}
