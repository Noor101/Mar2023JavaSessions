package WebDriverArch;

public class GoogleAppTesting {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ChromeDriver driver  = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		//SafariDriver driver = new SafariDriver();
		
		//If you really want to achieve cross browser testing then  	
		
		String browser = "Safari";
		
		//Cross browser testing logic
		
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		
		else if (browser.equals("Firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if (browser.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			
			System.out.println("Please launch the correct browser");
		}
		
		driver.get("google.com");
		driver.findElement("xpath");
		driver.getPageUrl();
		driver.getTitle();
		driver.quit();
	}

}
