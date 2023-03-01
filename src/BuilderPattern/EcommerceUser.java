package BuilderPattern;

public class EcommerceUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ecommerce shop = new Ecommerce();
		
		
		shop
		.login("Noor@gmaill.com", "naveen123")
		.doSearch("Macbook")
		.addCart("Macbook")
		.doPayment("ICICI bank", "test123")
		.getMail()
		.logout()
		.login()
		.doSearch("Nike Shoes", 1000)
		.doPayment("ICCI bank", "Noor122")
		.logout();
		
		
		System.out.println("------------");
		
		shop.login()
		.addCart("Iphone")
		.doPayment("ICCIC Noor", "Noor@1223")
		.logout();
		
		
		shop.login().doSearch("Mobile phone", 150000).logout();
		
		
		
	}

}
