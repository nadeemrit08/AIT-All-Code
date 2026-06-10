package in.sbms;

public class PetrolEngine implements Engine {

	@Override
	public int start() {
		System.out.println("PetrolEngine.start()");
		return 1;
	}

}
