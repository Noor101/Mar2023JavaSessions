package OOP_Inheritance;

public class BMW extends Car{
	
	@Override
	public void start() {
		System.out.println("BMW -Self start");
	}
	
	
	public void autoParking() {
		
		System.out.println("BMW - AutoParking");
	}

	public static void SunRoof() {
		
		System.out.println("BMW-Sunrooof");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- Vehicle engine");
	}
}
