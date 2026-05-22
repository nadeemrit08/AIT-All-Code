package in.nadeem.dao;

import java.util.List;

import in.nadeem.entity.EmployeeEntity;

public interface EmpDAO {

	List<EmployeeEntity> executeCriteriaQuery();
}
