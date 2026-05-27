package in.nadeem.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.nadeem.dao.BookDAO;
import in.nadeem.entities.Book;

public class BookDAOImpl implements BookDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveBook(Book book) {

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		try {

			entityManager.merge(book);

			transaction.commit();

			System.out.println("Book is inserted successfully...");

		} catch (Exception e) {

			transaction.rollback();

			e.printStackTrace();

		} finally {
			entityManager.close();
		}
	}

	@Override
	public Book findBook(Integer bookId) {

		EntityManager entityManager = factory.createEntityManager();

		Book book = entityManager.find(Book.class, bookId);

		entityManager.close();

		return book;
	}

	@Override
	public void removeBook(Integer bookId) {

		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		try {

			Book book = entityManager.find(Book.class, bookId);

			entityManager.remove(book);

			transaction.commit();

			System.out.println("Book is deleted....");

		} catch (Exception e) {
			
			transaction.rollback();
			e.printStackTrace();
			
		} finally {
			
			entityManager.close();
		}
	}

}
