
public class ProductManager {
	
	
	public void add(Product product, int databaseType) {
		
		if (databaseType == 1) {
			// mysql
			MysqlProductDao mysqlProductDao = new MysqlProductDao("Mysql String");
			mysqlProductDao.add(product);
		}
		else if (databaseType == 2) {
			// oracle
			OracleProductDao oracleProductDao = new OracleProductDao("ORacle String");
			oracleProductDao.add(product);
			
		}
		// Is katmani
		
		System.out.println("Urun is katmani islemleri");
		
		System.out.println("Urun ismi "+ product.getName());
		
	}
	
}
