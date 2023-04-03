package in.ashokit;

public class Car {

	IEngine engine;
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	
	public void drive() {

		boolean start = engine.start();

		if (start) {
			System.out.println("Car ::Running");
		} else {

			System.out.println("Engine start first");
		}

	}
}
