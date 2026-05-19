package in.nadeem;

import java.util.List;

import in.nadeem.dao.EmployeeDAO;
import in.nadeem.dao.impl.EmployeeDAOImpl;
import in.nadeem.entity.EmployeeEntity;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAOImpl();

		// fetch single employee
		EmployeeEntity emp = dao.fetchEmployeeById(7788);

		System.out.println(emp);

		// for all emps
		List<EmployeeEntity> list = dao.fetchEmployees();
		list.forEach(System.out::println);

		List<Object[]> list2 = dao.fetchNamesAndSalaries();
		list2.forEach(obj -> {
			System.out.println(obj[0] + " , " + obj[1]);
		});
	}
}
