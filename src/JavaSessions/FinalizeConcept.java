package JavaSessions;

public class FinalizeConcept {

	public static void main(String[] args) {
//		FinalizeConcept obj = new FinalizeConcept();
//		obj =  null;
		
		Employee emp = new Employee();
		emp = null;
		
		System.gc();
		
		System.out.println("Bye");
		
		
		
		

	}

	
	
	public void finalize() {
		
		System.out.println("Come inside this finalize method before object deletion");
		
	}
}
