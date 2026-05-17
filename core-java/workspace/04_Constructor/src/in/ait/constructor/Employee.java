package in.ait.constructor;

public class Employee {

	public Employee() {
		System.out.println("Employee.Employee() :: Constructor.....!!!!");
	}

	private void getEmp() {
		System.out.println("Employee.getEmp() :: calling mehtod...!!!!!!");
	}

	public void m2() {
		getEmp();
	}
}
