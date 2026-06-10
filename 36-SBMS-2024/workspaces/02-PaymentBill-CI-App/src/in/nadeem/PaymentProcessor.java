package in.nadeem;

public class PaymentProcessor {

	private IPayment payment = null;

	public PaymentProcessor(IPayment payment) {
		super();
		this.payment = payment;
	}

	void processPayment(double amt) {

		boolean status = payment.pay(amt);

		if (status) {
			System.out.println("Payment Completed... Thanyou...!!");
		} else {
			System.out.println("Payment Failed...");
		}

	}
}
