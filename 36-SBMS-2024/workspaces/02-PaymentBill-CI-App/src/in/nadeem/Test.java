package in.nadeem;

public class Test {

	public static void main(String[] args) {

		CreditCardPayment ccd = new CreditCardPayment();

		DebitCardPayment debit = new DebitCardPayment();

		SodexoCardPayment scp = new SodexoCardPayment();

		// Constructor Injection
		PaymentProcessor processor = new PaymentProcessor(scp);
		processor.processPayment(1200.50);
	}
}
