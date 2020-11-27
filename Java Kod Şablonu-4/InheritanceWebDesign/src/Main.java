
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inheritance Bad Design");
		
		ProductManager productManager = new ProductManager();
		productManager.add(new Product(15,"Puskevit",3),1);
	}

}
