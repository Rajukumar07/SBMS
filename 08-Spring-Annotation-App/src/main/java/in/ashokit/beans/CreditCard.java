package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CreditCard implements CardPayment {

	public boolean processPayment(Double amt) {
		System.out.println("From Credit card...");
		System.out.println("Payment successfull::"+amt);
		return true;
	}

}
