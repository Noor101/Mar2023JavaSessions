package OOP_Inheritance;

public class DominorBike extends Bike {

	@Override
	public void Ignition() {
		System.out.println("Dominor Bike Ignition");
	}
	
	
	@Override
	public void GearShift() {
		System.out.println("This is the Dominor GearShift");
	}
	
}
