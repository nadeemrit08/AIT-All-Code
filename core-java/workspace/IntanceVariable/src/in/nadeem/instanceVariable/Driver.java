package in.nadeem.instanceVariable;

class Student {

	int sId;
	String sname;
}

public class Driver {

	void print(Student s) {
		System.out.println("Student ID: " + s.sId + " , " + "Student Name : " + s.sname);

	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Student s = new Student();
		s.sId = 101;
		s.sname = "Nadeem";

		d.print(s);
	}
}
