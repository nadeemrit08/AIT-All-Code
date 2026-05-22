package in.nadeem.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import in.nadeem.dao.EmpDAO;
import in.nadeem.entity.EmployeeEntity;

public class EmpDAOImpl implements EmpDAO {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public List<EmployeeEntity> executeCriteriaQuery() {

		EntityManager entityManager = factory.createEntityManager();

		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

		CriteriaQuery<EmployeeEntity> criteriaQuery = criteriaBuilder.createQuery(EmployeeEntity.class);

		Root<EmployeeEntity> root = criteriaQuery.from(EmployeeEntity.class);

		// criteriaQuery.select(root).where(criteriaBuilder.gt(root.get("salary"),
		// 3000));

		criteriaQuery.select(root).where(criteriaBuilder.between(root.get("salary"), 3000, 6000));
		
		List<EmployeeEntity> resultList = entityManager.createQuery(criteriaQuery).getResultList();

		entityManager.close();

		return resultList;
	}

}
