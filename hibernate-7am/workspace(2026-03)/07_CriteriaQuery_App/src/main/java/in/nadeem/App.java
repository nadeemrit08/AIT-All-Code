package in.nadeem;

import java.util.List;

import in.nadeem.dao.EmpDAO;
import in.nadeem.dao.impl.EmpDAOImpl;
import in.nadeem.entity.EmployeeEntity;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		/*
		 * Object is created for IMPL class but stored in DAO Interface
		 */
		EmpDAO dao = new EmpDAOImpl();

		List<EmployeeEntity> list = dao.executeCriteriaQuery();

		list.forEach(System.out::println);
	}
}
