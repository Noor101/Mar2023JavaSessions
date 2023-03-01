package ConstructorConcepts;

public class RegTestClass {

	public static void main(String[] args) {
			
		Registration r1 = new Registration("Noor", "Mohammed", "noormohammed1050@gmail.com", "Noor@123");
		System.out.println(r1.getFirstName()+ " " + r1.getLastName()+ " "+ r1.getEmailId()+ " " + r1.getPassword());
		
		r1.setLastName("Abdul Kadar");
		r1.setPassword("Noor@100");
		
		
		System.out.println(r1.getFirstName()+ " " + r1.getLastName()+ " "+ r1.getEmailId()+ " " + r1.getPassword());

	}

}
