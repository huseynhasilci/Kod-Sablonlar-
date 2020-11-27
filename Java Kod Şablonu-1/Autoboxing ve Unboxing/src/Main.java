import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		
		
		Integer a = 5;
		
		for(int i = 0;i<10;i++) {
			
			arrayList2.add(Integer.valueOf(i*4)); // AutoBoxing
			
		}
		
		for (int i = 0; i<arrayList2.size();i++) {
			System.out.println(arrayList2.get(i).intValue());// Unboxing
			// ancak bunlari yapmamiza gerek yok java arkada bunlari kendisi yapiyor
		}
		
	}

}
