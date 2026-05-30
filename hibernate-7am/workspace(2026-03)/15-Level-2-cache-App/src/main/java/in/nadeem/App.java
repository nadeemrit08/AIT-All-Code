package in.nadeem;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import in.nadeem.entity.EmployeeEntity;

public class App {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

		/*
		 * EntityManager em1 = factory.createEntityManager();
		 * 
		 * EntityManager em2 = factory.createEntityManager();
		 * 
		 * EmployeeEntity e1 = em1.find(EmployeeEntity.class, 101);
		 * System.out.println("-------------------------------------------");
		 * 
		 * try { Thread.sleep(19000); } catch (Exception e) {
		 * 
		 * }
		 * 
		 * EmployeeEntity e4 = em2.find(EmployeeEntity.class, 102);
		 */
		
		
		EntityManager em1 = factory.createEntityManager();
		TypedQuery<EmployeeEntity> query =
		        em1.createQuery(
		                "SELECT e FROM EmployeeEntity e WHERE e.sal > ?1",
		                EmployeeEntity.class);
		query.setParameter(1, 5000.0);
		query.setHint("org.hibernate.cacheable", true);
		List<EmployeeEntity> lst = query.getResultList();
		//lst.forEach(System.out :: println);
		em1.close();

		System.out.println("==============================================");

		EntityManager em2= factory.createEntityManager();
		TypedQuery<EmployeeEntity> query2 =
		        em2.createQuery(
		                "SELECT e FROM EmployeeEntity e WHERE e.sal > ?1",
		                EmployeeEntity.class);
		query2.setParameter(1, 2000.0);
		query2.setHint("org.hibernate.cacheable", true);
		List<EmployeeEntity> lst2 = query2.getResultList();
		//lst2.forEach(System.out :: println);
		em2.close();

		factory.close();
	}
}
