package WebDriverArch;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Lauch Firefox  Browserr");
	}

	@Override
	public void get(String url) {
		System.out.println("lauching url" + url);

	}

	@Override
	public void getTitle() {
		System.out.println("title is + google");

	}

	@Override
	public void getPageUrl() {
		System.out.println("Url Is :" + "goole.com");

	}

	@Override
	public void findElement(String locator) {
		System.out.println("Find the element" + locator);

	}

	@Override
	public void quit() {
		System.out.println("Quit browserr");

	}

	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		
	}

}
