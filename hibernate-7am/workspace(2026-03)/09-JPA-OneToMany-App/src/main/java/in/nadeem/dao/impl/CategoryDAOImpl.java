package in.nadeem.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.nadeem.dao.CategoryDAO;
import in.nadeem.entities.CategoryEntity;

public class CategoryDAOImpl implements CategoryDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveCategory(CategoryEntity categoryEntity) {

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		try {
			entityManager.persist(categoryEntity);

			transaction.commit();

			System.out.println("Category with Products are persisted into Database");

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {

		EntityManager entityManager = factory.createEntityManager();

		CategoryEntity categoryEntity = entityManager.find(CategoryEntity.class, categoryId);

		entityManager.close();

		return categoryEntity;
	}

	@Override
	public void removeCategory(Integer categoryId) {

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		CategoryEntity categoryEntity = entityManager.find(CategoryEntity.class, categoryId);

		transaction.begin();

		try {
			if (categoryEntity != null) {

				entityManager.remove(categoryEntity);

				transaction.commit();

				System.out.println(
						"Category with products is removed from DB Successfully");

			} else {

				System.out.println(
						"Category not found with id : "
						+ categoryId);
			}
		} catch (Exception e) {

			transaction.rollback();

			e.printStackTrace();
		} finally {
			entityManager.close();
		}

	}

}
