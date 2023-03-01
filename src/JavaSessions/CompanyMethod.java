package JavaSessions;

import java.util.ArrayList;

public class CompanyMethod {

	String name;
	int age;

	public String getCEOName() {

		System.out.println("get names");
		return "Tom";
	}

	public int getTotalCount() {
		System.out.println("get total count of the shares");
		int totalShare = 2000;
		return totalShare;

	}

	public String[] getCoFounders() {

		System.out.println("Get Co-Founders name");

		String founder[] = new String[3];
		founder[0] = "Noor";
		founder[1] = "Naveen";
		founder[2] = "Subhash";

		return founder;

	}

	public ArrayList<String> customerList() { //Will be dynamic so that we are using array list
		
		System.out.println("Get total customer list");
		
		ArrayList<String> cust = new ArrayList<String>();
		cust.add("Kevin");
		cust.add("Tom");
		cust.add("Perry");
		cust.add("Jacob");
		cust.add("Raveena");
		
		
		return cust;
	}
	
	
	public ArrayList<String> usersList() {
		System.out.println("Enter users list");
		
		ArrayList<String> user = new ArrayList<String>();
		user.add("Noor");
		user.add("Kodi");
		user.add("Niroop");
		user.add("Nishant");
		user.add("Rosy");
		
		return user;
		
	}
	
	
	
	public static void main(String[] args) {
		
		CompanyMethod comp = new CompanyMethod();
		String ceoName = comp.getCEOName();
		System.out.println(ceoName);
		
		int shares = comp.getTotalCount();
		System.out.println(shares);

		
		String[] cofounder = comp.getCoFounders();
		System.out.println(cofounder.length);
		for(String e : cofounder) {
			System.out.println(e);
		}
		
		
		ArrayList<String> ar = comp.customerList();
		System.out.println(ar.size());
		for(String e : ar)
		{
			System.out.println(e);
		}
		
		ArrayList<String> userlist = comp.usersList();
		System.out.println(userlist.size());
		
		for(int i=0;i<userlist.size();i++) {
			System.out.println(userlist.get(i));
		}
	}

}
