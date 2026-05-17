package in.nadeem.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.nadeem.dao.ProductDAO;
import in.nadeem.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public ProductEntity insertProduct(ProductEntity product) {
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.persist(product);
			transaction.commit();
			System.out.println("Product is inserted to the Database....!!!");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Error in inserting a product" + e);
		} finally {
			entityManager.close();
		}
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer productId) {
		EntityManager entityManager = factory.createEntityManager();
		/*
		 * find() : early load getRefrence() : lazy load
		 */
		ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);

		entityManager.close();
		return productEntity;
	}

	@Override
	public ProductEntity updateProductById(Integer productId, Double new_Unit_Price) {

		EntityManager entityManager = factory.createEntityManager();
		ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		productEntity.setUnitPrice(new_Unit_Price);
		transaction.commit();
		entityManager.close();

		return productEntity;
	}

	@Override
	public void deleteProductById(Integer productId) {

		EntityManager entityManager = factory.createEntityManager();
		ProductEntity productEntity = entityManager.find(ProductEntity.class, productId);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		try {
			entityManager.remove(productEntity);
			transaction.commit();
			System.out.println("Record Based on id deleted succcessfully....!!");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Record did not deleted...Invalid operation");
		} finally {
			entityManager.close();
		}
	}

}
