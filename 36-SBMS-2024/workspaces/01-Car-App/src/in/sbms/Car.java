package in.sbms;

public class Car {

	private Engine engine = null;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void drive() {

		int status = engine.start();

		if (status >= 1) {
			System.out.println("Journey Started.....");
		} else
			System.out.println("Engine Problem");
	}
}
