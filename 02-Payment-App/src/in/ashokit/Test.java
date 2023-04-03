package in.ashokit;

public class Test {

	public static void main(String[] args) {
		
		PaymentProccessor p = new PaymentProccessor(new DebitCardPayment());

		p.doPayment(2000);
	}

}
