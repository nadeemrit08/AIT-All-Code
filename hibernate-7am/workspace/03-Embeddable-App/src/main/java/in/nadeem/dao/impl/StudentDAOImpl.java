package in.nadeem.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.nadeem.dao.StudentDAO;
import in.nadeem.entity.StudentCompositeKey;
import in.nadeem.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void insertStudent(StudentEntity entity) {
		EntityManager entityManager = factory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		try {
			entityManager.persist(entity);
			transaction.commit();
			System.out.println("Record Inserted Sucessfully..!!!");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Issued in inserting the record...!!!");
		} finally {
			entityManager.close();
		}

	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositeKey) {

		EntityManager entityManager = factory.createEntityManager();

		StudentEntity studentEntity = entityManager.find(StudentEntity.class, compositeKey);

		entityManager.close();

		return studentEntity;
	}

}
