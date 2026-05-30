package in.nadeem;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.nadeem.entity.DemoEntity;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

		EntityManager entityManager = factory.createEntityManager();

		DemoEntity demo = new DemoEntity();
		demo.setName("Nad");

		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();

		entityManager.persist(demo);

		transaction.commit();

		entityManager.close();

		factory.close();

	}
}
