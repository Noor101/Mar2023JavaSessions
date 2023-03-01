package JavaSessions;

import java.util.HashMap;

public class LoginPageHashMap {
	
	
	
	public static String getCrdentials(String role) {
		
		HashMap<String, String> credMap = new HashMap<String, String>();
		credMap.put("admin", "admin123@gmail.com;admin123");
		credMap.put("user", "user123@gmail.com;user123");
		credMap.put("seller", "seller123@gmail.com:seller123");
		credMap.put("distributor", "distributor123@gmail.com:distributor123");
		credMap.put("partner", "partner123@gmail.com:partner123");
		
		return credMap.get(role);
		
	}
	
	public static void doLogin(String un, String pwd) {
		
		System.out.println("Login with : "+ un + " : "+pwd);
		
	}

	public static void main(String[] args) {
		
		//RBAC - We can use hashmap in roll based Access control
		
		String cred[] = getCrdentials("admin").split(";");
		String un  = cred[0].trim();
		String pwd  = cred[1].trim();
		
		doLogin(un, pwd);
		
		
	}

}
