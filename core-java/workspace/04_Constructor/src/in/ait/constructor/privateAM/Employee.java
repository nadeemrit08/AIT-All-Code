package in.ait.constructor.privateAM;

public class Employee {

	private int id;
	private String name;

	private Employee() {
		System.out.println("Employee.Employee() :: Constructor called");
	}

	private void m1() {
		System.out.println("Employee.m1()");
		System.out.println(id + " " + name);
	}

	public void m2() {
		m1();
		Employee e = new Employee();
		e.id = 101;
		e.name = "Nadeem";
		System.out.println(e.id + " " + e.name);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.m1();
		e.m2();
	}
}
