package OOP_Inheritance;

public class Car extends Vehicle {

	int engine = 1000;
	
	public void start() {
		
		System.out.println("Car-start");
	}
	
	public void stop() {
		
		System.out.println("Car-stop");
	}
	
	public void reFuel() {
		
		System.out.println("Car- Refueling");
	}
	
	public static void SunRoof() {
		
		System.out.println("CAr-Sunrooof");
	}
	
	@Override
	public void engine() {
		System.out.println("Car -- Vehicle engine");
	}
}
