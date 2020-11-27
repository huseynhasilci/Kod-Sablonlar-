
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product suProduct = new Product(1,"Su",2);
		
		ProductManager pManager = new ProductManager(new OracleProductDao("Oracle"));
		pManager.add(new Product(2,"Cikolata",5));
		
		ProductManager pManager1 = new ProductManager(new MysqlProductDao("Mysql"));
		pManager1.add(suProduct);
	}

}
