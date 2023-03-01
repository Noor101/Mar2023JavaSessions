package JavaSessions;

public class Browser {
	
	String name;
	String vendor;
	double version;
	
	public void getInfo(Browser br) {
		System.out.println(br.name + " "+ br.vendor + " "+ br.version);
	}
	
	
	public void sum(int a , int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser b = new Browser();
		b.name = "Chrome";
		b.vendor = "Google";
		b.version = 91.1;
		b.getInfo(b); //Call by reference // pass by reference
		b.sum(25, 74); // Call by value// Pass by value
		
		
		
		
		

	}

}
