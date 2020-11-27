import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_09_practice {
  public static void main(String[] args) {
    System.out.print("Enter the array size n: ");
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    System.out.println("The random array is:");
    int[][] matrix = new int[n][n];

	//Randomly fill the array with 0s and 1s.
    for (int i = 0; i<matrix.length;i++) {
    	for (int j = 0; j<matrix.length;j++) {
    		
    		matrix[i][j] = (int)(Math.random() * 2);
    		System.out.println(matrix[i][j]);
    	}
    	
    }
    // Check rows
    int rowSum = sumRow(matrix[0]);
    ArrayList<Integer> list = new ArrayList<Integer>();
    //Fill this part
    list.add(0);
    
    for (int i = 0;i<n; i++ ) {
    	
    	if(rowSum >sumRow(matrix[i])) {
    		rowSum = sumRow(matrix[i]);
    		list.clear();
    		list.add(i);
    	}
    	else if(rowSum == sumRow(matrix[i])) {
    		
    		list.add(i);
    	}
    	
    }
    
    
    System.out.print("The most 0s row index: ");
    //Fill this part
    for (int i = 0; i<list.size()-1;i++) {
    	
    	
    	System.out.println(list.get(i)+ ", ");
    	
    }

    // Check columns
    int columnSum = sumColumn(matrix, 0);
    //Fill this part

    System.out.print("\nThe most 0s column index: ");
    //Fill this part
for (int i = 0;i<n; i++ ) {
    	
    	if(rowSum >sumColumn(matrix,i)) {
    		rowSum = sumColumn(matrix,i);
    		list.clear();
    		list.add(i);
    	}
    	else if(rowSum == sumColumn(matrix,i)) {
    		
    		list.add(i);
    	}
    	
    }
  }

  //sumRow method returns the sum of given array
  public static int sumRow(int row[]) {
	  int sum = 0;
	  for(int  i = 0; i< row.length; i++) {
		  sum += row[i]; 
		
	  }
	  
	  return sum;
  }


  //sumColumn method returns the sum of the given column
  public static int sumColumn(int matrix[][], int column) {
	  int sum = 0;
	  for (int i = 0; i<matrix.length;i++) {
		  
		  sum += matrix[i][column];
	  }
	  
	  return sum;
  }
}
