package JavaSessions;

public class AmazonAppShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AmazonApp shop = new AmazonApp();
		shop.login(8989898, 125)
		.search("Apple Macbook")
		.addtoCart("Apple Macbook")
		.payment("565666464646")
		.logout();
			
		
		System.out.println("-------------");
		
		shop.login("noor@gmail.com", "noor123")
		.addtoCart("Samsung phone")
		.payment("8974 5897 5886")
		.logout();

	}

}
