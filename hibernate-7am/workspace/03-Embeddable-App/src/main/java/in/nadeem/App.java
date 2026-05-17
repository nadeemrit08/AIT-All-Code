package in.nadeem;

import in.nadeem.dao.StudentDAO;
import in.nadeem.dao.impl.StudentDAOImpl;
import in.nadeem.entity.StudentCompositeKey;
import in.nadeem.entity.StudentEntity;

public class App {
	public static void main(String[] args) {

		StudentDAO dao = new StudentDAOImpl();

		/*
		 * insert student record
		 */
		StudentCompositeKey compositeKey = new StudentCompositeKey();
		compositeKey.setRollNumber(102);
		compositeKey.setSection("ECE");

		StudentEntity entity = new StudentEntity();
		entity.setCompositeKey(compositeKey);
		entity.setStudentName("Naeem");
		entity.setMarks(950);

		dao.insertStudent(entity);
		
		/*
		 * Fetch student record
		 */
		compositeKey.setRollNumber(102);
		compositeKey.setSection("ECE");
		
		StudentEntity fetchStudent = dao.fetchStudent(compositeKey);
		System.out.println(fetchStudent);
	}
}
