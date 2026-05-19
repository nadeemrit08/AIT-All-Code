package in.nadeem.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import in.nadeem.constants.AppConstants;
import in.nadeem.dao.EmployeeDAO;
import in.nadeem.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public EmployeeEntity fetchEmployeeById(Integer empno) {

		EntityManager entityManager = factory.createEntityManager();

		TypedQuery<EmployeeEntity> typedQuery = entityManager.createQuery(AppConstants.QUERY1, EmployeeEntity.class);

		typedQuery.setParameter(1, empno);

		EmployeeEntity empEntity = typedQuery.getSingleResult();

		entityManager.close();

		return empEntity;
	}

	@Override
	public List<EmployeeEntity> fetchEmployees() {

		EntityManager entityManager = factory.createEntityManager();

		TypedQuery<EmployeeEntity> typedQuery = entityManager.createQuery(AppConstants.QUERY2, EmployeeEntity.class);

		List<EmployeeEntity> listOfEmployees = typedQuery.getResultList();

		entityManager.close();

		return listOfEmployees;
	}

	@Override
	public List<Object[]> fetchNamesAndSalaries() {

		EntityManager entityManager = factory.createEntityManager();

		TypedQuery<Object[]> typedQuery = entityManager.createQuery(AppConstants.QUERY3, Object[].class);

		List<Object[]> resultList = typedQuery.getResultList();

		entityManager.close();

		return resultList;
	}

}
