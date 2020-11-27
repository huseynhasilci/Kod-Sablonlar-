
public class ProductManager {
	
	private BasseProductDao basseProductDao;
	
	public ProductManager(BasseProductDao basseProductDao ) {
		
		this.basseProductDao = basseProductDao;
		
	}
	
	
	public void add(Product product) {
		
		basseProductDao.add(product);
		
		System.out.println("Urun is katmani islemleri");
		
		System.out.println("Urun ismi "+ product.getName());
		
	}
	
}
