package in.nadeem.constructor;

public class Employee {

	String name;
	double salary;

	public Employee(String name_, double salary_) {
		this.name = name_;
		this.salary = salary_;
		System.out.println(name + "  " + salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Nadeem", 25000);
	}
}
