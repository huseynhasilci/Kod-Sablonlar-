import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4,5,6};
		
		int[] [] array2 = new int[2][2];
		int[] [] array3= {{10,20},{30,40}};
		
		
		array2[0][0] = 10;
		array2[0][1] = 20;
		array2[1][0] = 30;
		array2[1][1] = 40;
		
		System.out.println(array3[0][1]);
		
		
		int [] [] array4 = new int[2][2];
		
		Scanner scanner = new Scanner(System.in);
		
		
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				
				array4[i][j] = scanner.nextInt();
				
			}
			
		}
		
		
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				
				System.out.print(array4[i][j] + " ");
				
			}
			System.out.println("");
		}
		
		
	}

}
