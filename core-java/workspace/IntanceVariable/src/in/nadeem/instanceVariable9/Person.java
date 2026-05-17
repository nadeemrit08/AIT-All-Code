package in.nadeem.instanceVariable9;

public class Person {

	int id;
	String name;

	public void getPersons(Person p1, Person p2) {
		System.out.println(p1.id + "--" + p1.name);
		System.out.println(p2.id + "--" + p2.name);
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		Person p1 = new Person();
		p1.id=101;
		p1.name="Nadeem";
		
		Person p2 = new Person();
		p2.id=102;
		p2.name="Ahmad";
		
		p.getPersons(p1, p2);
	}
}
