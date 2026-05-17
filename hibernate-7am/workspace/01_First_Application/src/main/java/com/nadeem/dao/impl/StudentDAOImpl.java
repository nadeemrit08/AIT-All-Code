package com.nadeem.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.nadeem.dao.StudentDAO;
import com.nadeem.entities.Student;

public class StudentDAOImpl implements StudentDAO {

	SessionFactory sessionFactory;

	public StudentDAOImpl() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		sessionFactory = metadata.getSessionFactoryBuilder().build();
	}

	@Override
	public void saveStudent(Student student) {

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		try {
			session.save(student);
			System.out.println("Student object is persisted in Database");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Issue in persisting Student object....");
			System.out.println(e);
		} finally {
			session.close(); // VERY IMPORTANT
			// sessionFactory.close();
		}

	}

	@Override
	public Student loadStudent(int sid) {
		/*
		 * load() : lazy loading get() : early loading args : 1. classname.class 2. id
		 * value
		 */

		Session session = sessionFactory.openSession();

		// Student student = session.get(Student.class, sid);
		Student student = session.load(Student.class, sid);

		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}

		System.out.println(student.getSname());

		session.close();

		return student;
	}

	@Override
	public Student updateStudent(int sid, int marks) {
		Session session = sessionFactory.openSession();

		Student student = session.get(Student.class, sid);

		Transaction transaction = session.beginTransaction();

		try {
			student.setMarks(marks);
			session.update(student);
			transaction.commit();
			System.out.println("Object is updated");
		} catch (Exception e) {
			transaction.rollback();
			System.out.println("Object is not updated");
		} finally {
			session.close();
		}

		return student;
	}

	@Override
	public void deleteStudent(int sid) {

		Session session = sessionFactory.openSession();

		Student student = session.get(Student.class, sid);

		Transaction t = session.beginTransaction();

		try {
			session.delete(student);
			System.out.println("Object Deleted...");
			t.commit();
		} catch (Exception e) {
			t.rollback();
			System.out.println("Object not deleted");
		}

		finally {
			session.close();
		}

	}

	@Override
	public void level1CacheTest() {
		Session session = sessionFactory.openSession();
		Session other_session = sessionFactory.openSession();

		Student s1 = session.get(Student.class, 101);
		//Student s2 = session.get(Student.class, 103);
		
		session.evict(s1);
		
		Student s3 = session.get(Student.class, 101);
		//Student s4 = other_session.get(Student.class, 101);

		session.close();
		other_session.close();

	}

}
