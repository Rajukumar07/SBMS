package in.ashokit;

public class DebitCardPayment implements IPayment  {

	@Override
	public boolean payBill(Double amt) {
		
		System.out.println("Debit Card :: Payment");
		
		return true;
		
	}

}
