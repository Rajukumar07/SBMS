package in.ashokit;

public class SodexoCardPayment implements IPayment{

	@Override
	public boolean payBill(Double amt) {
		
		System.out.println("Sodexo Card :: Payment");
		
		return true;
	}

}
