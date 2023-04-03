package in.ashokit.beans;

import org.springframework.stereotype.Component;

@Component
public class DebitCard implements CardPayment{

	 public boolean processPayment(Double amt) {
		 System.out.println("From Debit card...");
		System.out.println("Payment Successfull::"+amt);
		return true;
	}
}
