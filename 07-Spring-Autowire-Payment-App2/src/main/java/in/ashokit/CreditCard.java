package in.ashokit;

public class CreditCard implements IPayment {

	@Override
	public boolean payBill(Double amt) {
		
		System.out.println("Credit Card Payment ::");
		return true;
	}

}
