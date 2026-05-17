package in.nadeem.instanceVariable3;

class Person {
	int id;
	String name;
	int age;
}

public class Driver {

	public Person print() {
		Person p = new Person();
		p.id = 201;
		p.name = "Raja";
		p.age = 24;
		//System.out.println(p.id + "--" + p.name + "--" + p.age);
		return p;

	}

	public static void main(String[] args) {
		Driver d = new Driver(); // object creation

		Person p = d.print();
		System.out.println(p.id + "--" + p.name + "--" + p.age);

	}
}
