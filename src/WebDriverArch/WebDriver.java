package WebDriverArch;

public interface WebDriver extends SearchContext  {

	public void get(String url);
	
	public void getTitle();
	
	public void getPageUrl();
	
	public void findElement(String locator);
	
	public void quit();
	
	
	
	
	
	
}
