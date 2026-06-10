package in.nadeem;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean pay(double amt) {

		System.out.println("DebitCardPayment.pay() : Debit Card payment in progress");
		
		return true;
	}

}
