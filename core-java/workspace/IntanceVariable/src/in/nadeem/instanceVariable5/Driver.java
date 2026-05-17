package in.nadeem.instanceVariable5;

class Person {
	int id;
	String name;
	int age;
}

public class Driver {

	public Person geData(int id) {
		Person p = new Person();
		if (id == 101) {
			p.id = 101;
			p.name = "Raju";
			p.age = 30;
		} else if (id == 102) {
			p.id = 102;
			p.name = "Rani";
			p.age = 32;
		}
		return p;
	}
	public static void main(String[] args) {

		Driver d = new Driver();
		Person person = d.geData(102);
		System.out.println(person.id + " -- " + person.name);
		
	}
}
