package in.nadeem.instanceVariable8;

class University {

	int uid;
	String uname;
}

public class Driver {

	public University getData(int uid) {
		University u = new University();

		if (uid == 101) {
			u.uname = "Oxford";
		} else if (uid == 102) {
			u.uname = "Standford";
		}
		return u;
	}

	public static void main(String[] args) {

		Driver d = new Driver();

		University data = d.getData(102);

		System.out.println(data.uname);
	}
}
