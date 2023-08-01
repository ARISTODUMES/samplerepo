package LoggerGroup.productapp;

public class ProductinformationSystem {
	ProductDB productDB;
	public ProductinformationSystem(ProductDB productDB) {
		this.productDB = productDB;
	}
	public Product getProductInfo(int productID) {
		return productDB.getProduct(productID);
	}
}
