package in.ashokit;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean payBill(Double amt) {
	
		System.out.println("CreditCard :: Payment");
		
		return true;
	}

}
