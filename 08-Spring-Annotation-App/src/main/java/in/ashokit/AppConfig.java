package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.beans.Payment;

@Configuration
@ComponentScan
public class AppConfig {

	public static void main(String[] args) {

		ApplicationContext contxt = new AnnotationConfigApplicationContext(AppConfig.class);

		Payment payment = contxt.getBean(Payment.class);
		payment.doPayment(475.00);
		
	}

}
