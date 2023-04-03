package in.ashokit;

public class PaymentService {

	private IPayment payment ;
	
	public PaymentService() {
		// TODO Auto-generated constructor stub
	}

	
	
	public PaymentService(IPayment payment) {
		super();
		this.payment = payment;
	}

	


	public void setPayment(IPayment payment) {
		this.payment = payment;
	}



	public void doPayment(Double amt) {
		
		boolean status = payment.payBill(amt);
		
		if(status) {
			System.out.println("Printing Bill...");
		}
		else {
			System.out.println("Transection failed.");
		}
	}
	
}
