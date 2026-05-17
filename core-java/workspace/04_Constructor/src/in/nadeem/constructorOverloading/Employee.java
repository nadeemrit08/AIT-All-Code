package in.nadeem.constructorOverloading;

public class Employee {

	String name;
	double salary;

	public Employee(String name_, double salary_) {
		this.name = name_;
		this.salary = salary_;
		System.out.println(this.name + "  " + this.salary);
	}

	public Employee(String name) {
		super();
		this.name = name;
		System.out.println(this.name + "  " + this.salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Nadeem", 25000);

		Employee employee2 = new Employee("Ahmad");
	}
}
