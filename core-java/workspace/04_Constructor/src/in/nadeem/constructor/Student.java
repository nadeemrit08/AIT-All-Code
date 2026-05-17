package in.nadeem.constructor;

public class Student {

	int id;
	String name;
	int age;
	String gender;

	public Student(int id_, String name_, int age_, String gender_) {
		super();
		this.id = id_;
		this.name = name_;
		this.age = age_;
		this.gender = gender_;

		System.out.println("Student.Student(int id_, String name_, int age_, String gender_)");

		System.out.println(this.id + " " + this.name + " " + this.age + " " + this.gender);
	}

	public static void main(String[] args) {

		Student nadeem = new Student(101, "Nadeem", 24, "Male");
		Student ahmad = new Student(102, "Ahmad", 18, "Male");
	}
}
