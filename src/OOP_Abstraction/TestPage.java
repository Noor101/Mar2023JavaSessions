package OOP_Abstraction;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp = new LoginPage();
		
		lp.header();
		Page.logo();
		lp.title();
		lp.dologin("noormohammed", "Noor123");
		lp.URL();
		
		
		//Top casting
		
		Page p = new LoginPage();
		p.title();
		
		

	}

}
