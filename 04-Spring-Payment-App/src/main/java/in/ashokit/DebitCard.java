package in.ashokit;

public class DebitCard implements IPayment {

	
	public boolean payBill(Double amt) {
		System.out.println("Debit Card Payment Successful");
		return true;
	}
}
