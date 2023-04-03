package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		PaymentService paymentService = context.getBean(PaymentService.class);
		
		paymentService.doPayment(475.00);

	}

}
