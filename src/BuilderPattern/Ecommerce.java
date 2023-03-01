package BuilderPattern;

public class Ecommerce {

	
	//Every method will give the same obj so we are using return this keyword.
	public Ecommerce login() {
		System.out.println("Defualt login");
		return this;
	}
	
	public Ecommerce login(String un, String pwd) {
		
		System.out.println("login with : "+ un+ ":"+ pwd);
		return this;
	}
	
	public Ecommerce doSearch(String productname) {
		System.out.println("Search with" + productname );
		return this;
	}
	
	public Ecommerce doSearch(String productname, int price) {
		System.out.println("Search with" + productname+ "Price is"+ price );
		return this;
	}
	
	public Ecommerce selectProduct (String product) {
		System.out.println("Select the product" + product);
		return this;
	}
	
	public Ecommerce addCart(String productname) {
		System.out.println("adding the product in cart"+  productname );
		return this;
	}
	
	public Ecommerce doPayment(String acctname, String pwd)
	{
		System.out.println("Payment done viaL:" + acctname+  ""+ pwd);
		return this;
	}
	
	public int generateOrderID() {
	return 1002;
	}
	
	public Ecommerce getMail() {
		System.out.println("email is sent successfully");
		return this;
	}
	
	
	public Ecommerce logout() {
		System.out.println("Logout from app");
		return this;
	}
	
	
}
