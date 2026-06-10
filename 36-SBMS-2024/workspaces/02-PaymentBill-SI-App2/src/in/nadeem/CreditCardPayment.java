package in.nadeem;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean pay(double amt) {
		System.out.println("CreditCardPayment.pay() : Credit Card Payment in Progress");

		// logic

		return true;
	}

}
