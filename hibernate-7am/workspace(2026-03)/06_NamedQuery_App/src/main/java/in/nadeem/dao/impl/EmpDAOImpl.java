package in.nadeem.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import in.nadeem.dao.EmpDAO;
import in.nadeem.entity.EmployeeEntity;

public class EmpDAOImpl implements EmpDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public List<EmployeeEntity> executeNamedQuery(int deptNo) {

		EntityManager entityManager = factory.createEntityManager();

		TypedQuery<EmployeeEntity> typedQuery = entityManager.createNamedQuery("query1", EmployeeEntity.class);

		typedQuery.setParameter(1, deptNo);

		List<EmployeeEntity> resultList = typedQuery.getResultList();

		entityManager.close();

		return resultList;
	}

	@Override
	public List executeNamedNativeQuery(int sal) {

		EntityManager entityManager = factory.createEntityManager();

		Query query = entityManager.createNamedQuery("query2");

		query.setParameter(1, sal);

		List resultList = query.getResultList();

		entityManager.close();

		return resultList;
	}

}
