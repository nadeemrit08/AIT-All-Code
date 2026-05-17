package in.nadeem.instanceVariable10;

public class Person {

	int id;
	String name;

	public Person[] getPersons() {

		Person p1 = new Person();
		p1.id = 101;
		p1.name = "Nadeem";

		Person p2 = new Person();
		p2.id = 102;
		p2.name = "Ahmad";

		Person p3 = new Person();
		p3.id = 103;
		p3.name = "Raja";

		return new Person[] { p1, p2, p3 };

	}

	public static void main(String[] args) {

		Person p = new Person();

		Person[] persons = p.getPersons();

		for (Person person : persons) {
			System.out.println("Person ID " + person.id + " , " + "Person Name: " + person.name);
		}
	}
}
