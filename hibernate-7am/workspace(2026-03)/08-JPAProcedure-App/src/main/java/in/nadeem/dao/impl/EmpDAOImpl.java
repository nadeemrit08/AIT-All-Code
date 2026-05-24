package in.nadeem.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import in.nadeem.dao.EmpDAO;

public class EmpDAOImpl implements EmpDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void executeProcedure(int empno) {

		EntityManager entityManager = factory.createEntityManager();

		StoredProcedureQuery storedProcedureQuery = entityManager.createNamedStoredProcedureQuery("pro1");

		storedProcedureQuery.setParameter("ENO", empno);

		storedProcedureQuery.execute();

		String s1 = (String) storedProcedureQuery.getOutputParameterValue("NAME");

		double d = (Double) storedProcedureQuery.getOutputParameterValue("EXPERIENCE");

		System.out.println("Name :: " + s1);
		System.out.println("Experience :: " + d);

		entityManager.close();

		factory.close();
	}

}
