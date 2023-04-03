package in.ashoit;

public class Test {

	public static void main(String[] args) {

		Car c = new Car();
		
		//setting the engine type
		c.setEngine(new PetrolEngine());
		c.drive();

	}

}
