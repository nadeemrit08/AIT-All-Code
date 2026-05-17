package in.nadeem.instanceVariable1;

class Employee {
	int empId;
	String empName;
	double empSal;
}

public class Driver {

	public void printEmp(Employee emp) {
		System.out.println("Employee ID :" + emp.empId + " , " + "Employee Name : " + emp.empName + " , "
				+ "Employee Salary : " + emp.empSal);
	}

	public static void main(String[] args) {

		Driver d = new Driver();

		Employee emp = new Employee();
		emp.empId = 101;
		emp.empName = "Ahmad";
		emp.empSal = 15000.00;

		d.printEmp(emp);
	}
}
