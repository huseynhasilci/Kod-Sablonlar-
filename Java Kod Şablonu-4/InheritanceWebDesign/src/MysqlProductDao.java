
public class MysqlProductDao {
	private String connectionString;

	public MysqlProductDao(String connectionString) {
		
		this.connectionString = connectionString;
	}
	
	public void add(Product product) {
		
		System.out.println("Mysql database: "+ product.getName()+" eklendi");
		
	}
}
