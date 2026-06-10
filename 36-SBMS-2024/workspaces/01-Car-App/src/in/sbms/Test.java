package in.sbms;

public class Test {

	public static void main(String[] args) {

		// Constructor Injection
		Car c = new Car(new PetrolEngine());

		// Field Injection
		c.setEngine(new DiesalEngine());

		// setter injection
		c.setEngine(new DiesalEngine());
		c.drive();
	}
}
