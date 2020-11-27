
public class MysqlProductDao extends BasseProductDao{
	
	
	public MysqlProductDao(String connectionString) {
		super(connectionString);
		
		
		
	}
	
	@Override
	public void add(Product product) { // productin icindekileri bu sayede aliyoruz asagida oldugu gibi
		
		System.out.println("MySql databe: " + product.getName()+ " eklendi");
		
	}
	
}
