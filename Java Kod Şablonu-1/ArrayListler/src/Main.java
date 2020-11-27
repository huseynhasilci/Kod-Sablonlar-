import java.util.ArrayList;
public class Main {
	public static void yazdir(ArrayList<String> a) {
		
		for(int i = 0; i<a.size(); i++) {
			
			System.out.println("Element "+ a.get(i));
			
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Metalica");
		arrayList.add("Guns and Roses");
		arrayList.add("Black Sabbath");
		arrayList.add("Iron Maiden");
		arrayList.add("Metalica");
		
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(3));
		
		
		System.out.println(arrayList.size());
		//arrayList.remove("Metalica");
		//arrayList.remove(1);
		arrayList.set(4, "Mega Death");// 4. indexi guncellemis olduk
		
		System.out.println(arrayList.indexOf("Metalica"));
		System.out.println(arrayList.lastIndexOf("Metalica"));
		for (int i = 0; i<arrayList.size();i++) {
			System.out.println(arrayList.get(i));
		}
		yazdir(arrayList);
	}
}
