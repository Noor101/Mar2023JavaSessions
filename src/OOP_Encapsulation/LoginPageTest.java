package OOP_Encapsulation;

public class LoginPageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage();
		
		lp.setUsername("noor@1234.com");
		lp.setPassword("noor123");
		
		
		lp.login(lp.getUsername(), lp.getPassword());
		
		lp.setPassword("Noornewpassword123");
		

		lp.login(lp.getUsername(), lp.getPassword());

	}

}
