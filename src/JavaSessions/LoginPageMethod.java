package JavaSessions;

public class LoginPageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LoginPageMethod lp = new LoginPageMethod();
		lp.dopayment("Phonepe");
		lp.login("noormohammed",123, 950064647);
		lp.dopayment(656565, 899);
	}

	// Method overloading
	public void login() {
		System.out.println("login into application");
	}

	public void login(int a) {
		System.out.println("login into application");
	}

	public void login(int a, int b) {
		System.out.println("login into application");
	}

	public void login(String a, int b) {
		System.out.println("login into application");
	}

	public void login(String un, int pwd, long ph) {

	}

	public void login(String un, int pwd, long ph, int otp) {

	}

	//
	public void dopayment(String upi) {

	}

	public void dopayment(String upi, long phone) {

	}

	public void dopayment(String upi, long phone, int cvv) {

	}
	
	public void dopayment(long cc, int cvv) {
		
		
		System.out.println("Make the payment "+ cc + "and"    + "     " + cvv);
		
	}
}
