package com.nadeem.dao;

import com.nadeem.entities.Student;

public interface StudentDAO {

	public void saveStudent(Student student);

	public Student loadStudent(int sid);

	public Student updateStudent(int sid, int marks);

	public void deleteStudent(int sid);

	public void level1CacheTest();
}
