package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("Launch the browser");
		checkVersion();
		checkOsVersion();
		checkRam();
		System.out.println("Browser is Launched");
		
	}
	
	private void checkVersion() {
		
		System.out.println("Check the browser version");
	}
	
	private void checkOsVersion() {
		
		System.out.println("Check the OS version");
	}

	
	private void checkRam() {
		
		System.out.println("Check the Ram of the OS");
	}
}
