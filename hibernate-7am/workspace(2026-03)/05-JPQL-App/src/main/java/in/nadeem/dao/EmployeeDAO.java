package in.nadeem.dao;

import java.util.List;

import in.nadeem.entity.EmployeeEntity;

public interface EmployeeDAO {

	public EmployeeEntity fetchEmployeeById(Integer empno);

	public List<EmployeeEntity> fetchEmployees();

	public List<Object[]> fetchNamesAndSalaries();
}
