import java.util.*;

public class Exercise12_03 {
  public static void main(String[] args) {
    int[] data = new int[100];
    
    // Initialize array
    for (int i = 0; i < data.length; i++)
      data[i] = (int)(Math.random() * 10000);

    // FILL THE REMAINING PARTS..
    
    
    Scanner scanner = new Scanner(System.in);
    
    
    //int myIndex = scanner.nextInt();
    
    try {
    	int myIndex = scanner.nextInt();
    	System.out.println(data[myIndex]);
    	
    	
    }
    catch(ArrayIndexOutOfBoundsException e) {
    	
    	System.out.println("Out of Index"); 
        
    	
    }
    
    
  }
}
