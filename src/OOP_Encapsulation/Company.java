package OOP_Encapsulation;

public class Company {

	
	public String name;
	public int count;
	private int sharePrice;
	
	public String getCEOName() {
		return "Tom";
	}
	
	private int totatSharePrice() {
		return 1000; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company obj = new Company() ;
		obj.name = "IBM";
		obj.count = 25;
		obj.sharePrice = 250;
		
		
		obj.getCEOName();
		obj.totatSharePrice();
		

	}

}
