package in.nadeem.client;

import in.nadeem.dao.ProductDAO;
import in.nadeem.dao.impl.ProductDAOImpl;
import in.nadeem.entity.ProductEntity;

public class Tester {

	public static void main(String[] args) {

		ProductDAO dao = new ProductDAOImpl();

		// insert Product record

		ProductEntity productEntity = new ProductEntity();
		productEntity.setProductId(101);
		productEntity.setProductName("Mouse");
		productEntity.setQuantity(15);
		productEntity.setUnitPrice(1000.0);

		// call insertProduct()  from DAO class
		dao.insertProduct(productEntity);
		
		//load(fetch) record based on id
		ProductEntity productById = dao.loadProductById(102);
		System.out.println("Fetched Record: Successfully :: " + productById);

		// updated the record
		ProductEntity updateProductById = dao.updateProductById(101, 1500.0);
		System.out.println(updateProductById);

		// deleted the record 
		dao.deleteProductById(104);

	}
}
