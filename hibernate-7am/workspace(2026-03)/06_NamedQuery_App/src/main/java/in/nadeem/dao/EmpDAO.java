package in.nadeem.dao;

import java.util.List;

import in.nadeem.entity.EmployeeEntity;

public interface EmpDAO {

	public List<EmployeeEntity> executeNamedQuery(int deptNo);

	List executeNamedNativeQuery(int sal);
}
