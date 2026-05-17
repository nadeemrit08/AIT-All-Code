package com.nadeem.client;

import com.nadeem.dao.StudentDAO;
import com.nadeem.dao.impl.StudentDAOImpl;
import com.nadeem.entities.Student;

public class Tester {

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAOImpl();

		Student student = new Student();

		/*
		 * creating student object
		 */
		
		/*
		 * student.setSid(103); student.setSname("Shashi");
		 * student.setGender("Fe-male"); student.setMarks(560);
		 * 
		 * dao.saveStudent(student);
		 */
		
		/*
		 * Student student2 = dao.loadStudent(1101); System.out.println(student2);
		 */

		/*
		 * Student s = dao.updateStudent(101, 799); System.out.println(s);
		 * 
		 * dao.deleteStudent(102);
		 */
		
		dao.level1CacheTest();
		
	}
}
