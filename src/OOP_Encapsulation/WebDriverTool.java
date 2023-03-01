package OOP_Encapsulation;

public class WebDriverTool {

	
	public void launchBrowser(String browser) {
		if(browser.equals("Chrome")){
			launChrome();
		}
		else if(browser.equals("Firefox")) {
			launFirefox();
		}
		else {
			System.out.println("Launch default browser");
		}
	}
		
		private void launChrome(){
			System.out.println("Check chrome version");
			System.out.println("Check OS Version");
			System.out.println("Launch Chrome");
		}
	
		private void launFirefox(){
			System.out.println("Check firefox version");
			System.out.println("Check OS Version");
			System.out.println("Launch firefox");
		}
	
}
