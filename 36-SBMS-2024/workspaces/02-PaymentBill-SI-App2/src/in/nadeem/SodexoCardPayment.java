package in.nadeem;

public class SodexoCardPayment implements IPayment {

	@Override
	public boolean pay(double amt) {
		System.out.println("SodexoCardPayment.pay() : SodexoCardPayment is in Progress");
		return true;
	}

}
