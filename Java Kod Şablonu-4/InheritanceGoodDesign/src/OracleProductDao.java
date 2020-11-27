
public class OracleProductDao extends BasseProductDao{
	
	public OracleProductDao(String connectionString) {
		super(connectionString);
		
		
		
	}
	
	@Override
	public void add(Product product) {
		
		System.out.println("Oracle databe: " + product.getName()+ " eklendi");
		
	}
	
	
}
