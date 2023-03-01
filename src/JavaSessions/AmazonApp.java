package JavaSessions;

public class AmazonApp {
	
	public AmazonApp login(String un, String pwd) {
		System.out.println("login with: " + un + pwd);
		return this;
	}

	public AmazonApp login(long ph, int otp) {
		System.out.println("Login with +" + ph + otp);
		return this;
	}
	
	public AmazonApp search(String name) {
		System.out.println("search with" + name);
		return this;
	}
	
	public AmazonApp addtoCart(String name) {
		System.out.println("Add to cart" + name);
		return this;
	}
	
	
	public AmazonApp payment(String cc) {
		System.out.println("Making the payment" + cc);
		return this;
	}
	
	public AmazonApp logout() {
		System.out.println("Logout from the application");
		return this;
	}
}
