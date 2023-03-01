package OOP_Encapsulation;

public class GoogleChrome {


	
	public void launchChrome() {
		
		System.out.println("Check google chrome");
		checkOsCompatability();
		windowVersion();
		checkBrowserVersion();
		checkBroswerUpdates();
		
		
		System.out.println("Launch Google chrome");
		
	}
	
	private void checkOsCompatability() {
		
		System.out.println("checkOsCompatability");
	}
	
	private void windowVersion() {
		System.out.println("windowVersion");
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
	}

	
	private void checkBroswerUpdates() {
		System.out.println("checkBroswerUpdates");
	}

}
