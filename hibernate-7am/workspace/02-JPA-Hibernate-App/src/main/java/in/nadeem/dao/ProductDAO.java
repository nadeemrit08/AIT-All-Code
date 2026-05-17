package in.nadeem.dao;

import in.nadeem.entity.ProductEntity;

public interface ProductDAO {

	ProductEntity insertProduct(ProductEntity productEntity);

	ProductEntity loadProductById(Integer productId);

	ProductEntity updateProductById(Integer productId, Double new_Unit_Price);

	public void deleteProductById(Integer productId);
}
