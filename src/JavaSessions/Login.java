package JavaSessions;

public class Login {

	
	String username;
	String password;
	String title;
	String url;
	
		
	public static void main(String[] args) {
		
	Login googlelogin = new Login();
	googlelogin.username = "Noor@gmail.com";
	googlelogin.password = "noor123";
	googlelogin.title = "Google";
	googlelogin.url = "google.com";
	
	Login amazonlogin = new Login();
	amazonlogin.username = "Noor@gmail.com";
	amazonlogin.password = "noor12";
	amazonlogin.url = "amazon.com";
	
	System.out.println(amazonlogin.password);
	
	
	System.out.println(googlelogin.username);

	}

}
