package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Payment {

	private CardPayment payment;

	@Autowired
	public void setPayment(CardPayment payment) {
		this.payment = payment;
	}
	
	public void doPayment(Double amt) {
		
		boolean status = payment.processPayment(amt);
		
		if(status) {
			System.out.println("printing reciepts...");
		}
		else {
			System.out.println("transaction failed..");
		}
	}
	
	
}
