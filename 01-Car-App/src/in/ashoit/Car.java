package in.ashoit;

public class Car  {

	IEngine engine ;
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		
		int start = engine.start();
		if(start==1) {
			System.out.println("Car is :: running");
		}
		else {
			System.out.println("Engine start first");
		}
	}
}
