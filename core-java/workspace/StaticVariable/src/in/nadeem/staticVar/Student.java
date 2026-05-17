package in.nadeem.staticVar;
// Lecture-32
public class Student {

	int rollNo;
	String name;
	String email;
	double phoneNo;
	static String institute;

	public static void main(String[] args) {

		Student.institute = "Kodewala Academy";

		Student nadeem = new Student();
		System.out.println("Roll No : " + (nadeem.rollNo = 101));
		System.out.println("Email ID :" + (nadeem.email = "nadeem.ahmad88592@gmail.com"));
		System.out.println("Phone No : " + (nadeem.phoneNo = 8859245475l));
		System.out.println("Institute Name is : " + Student.institute);
	}
}
