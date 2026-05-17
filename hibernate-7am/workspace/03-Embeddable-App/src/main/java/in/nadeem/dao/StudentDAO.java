package in.nadeem.dao;

import in.nadeem.entity.StudentCompositeKey;
import in.nadeem.entity.StudentEntity;

public interface StudentDAO {

	public void insertStudent(StudentEntity entity);

	public StudentEntity fetchStudent(StudentCompositeKey compositeKey);

}
