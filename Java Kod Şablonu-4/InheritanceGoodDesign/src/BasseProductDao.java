
public class BasseProductDao {
	
	private String connectionString;

	public BasseProductDao(String connectionString) {
		
		this.connectionString = connectionString;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	
	public void add(Product product) {
		System.out.println("Default Databes: " + product.getName());
	}
	
}
