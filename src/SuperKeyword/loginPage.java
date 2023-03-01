package SuperKeyword;

public class loginPage extends page {



	public loginPage(int time) {
		super(time);
		System.out.println("Login page Constructor");
		
		
	}

	
	int loadtime = 20;

	void loading() {
		System.out.println("login page loadtime"  +" " +  loadtime);
		System.out.println("Page load time"+ "  "+ super.loadtime);

		pageTitle();
		super.pageTitle();
		
	}

	public void pageTitle() {
		System.out.println("Login Page title.....");
	}
}
