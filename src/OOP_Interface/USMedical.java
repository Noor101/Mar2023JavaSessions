package OOP_Interface;

public interface USMedical extends WHO {
	
	
	
	int min_fee = 10;
	
	public void orthoService();
	
	public void physioServive();
	
	public void cardioService();
	
	//1. Static methods have method body
	public static void hospitalAdmin() {
		System.out.println("US - hospitalAdmin");
	}
	
	//2. you can have default methods
	
	public default void billing() {
		System.out.println("Us billing");
	}
	
	
	

}
