package in.nadeem.instanceVariable4;

class College {
	int id;
	String name;
}

public class Driver {

	public College getCollegeData() {
		College college = new College();
		college.id = 101;
		college.name = "Nadeem Ahmad";
		System.out.println("College ID: " + college.id + " , " + "College Name: " + college.name);
		return college;
	}

	public static void main(String[] args) {

		Driver driver = new Driver();
		driver.getCollegeData();
	}
}
