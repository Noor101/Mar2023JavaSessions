package OOP_Abstraction;

public class LoginPage extends Page {

	
	public LoginPage() {
		
		
		System.out.println("Login page - Constructor");
	}
	@Override
	public void title() {
		System.out.println("Login page load");

	}

	@Override
	public void URL() {
		System.out.println("Login url");

	}

	@Override
	public void loading() {

		System.out.println("Login loading");
	}
	
	public void dologin(String un, String pwd) {
		
		
		System.out.println("login with:" + un + pwd);
	}
	
	
	

}
