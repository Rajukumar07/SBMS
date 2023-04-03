package in.ashokit;

public class PaymentProccessor {

	IPayment payment;
	
	public PaymentProccessor(IPayment payment) {
		
		this.payment = payment;
	}
	
	public void doPayment(double amt) {
		
		boolean payBill = payment.payBill(amt);
		if(payBill) {
			
			System.out.println("printing reciepts....");
		}
		else {
			System.out.println("payment declined...");
		}
		
	}
	
	
}
