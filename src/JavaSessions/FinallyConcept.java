package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p = 10;
		
		try {
			int div = 10/2;
		}
		catch(ArithmeticException e) {
			System.out.println("Skip the exception");
		}
		finally {
			System.out.println("Print the finally blockm whatever the exception is");
		}

		System.out.println(getMarks("Tom"));
		
	}
	
	public static int getMarks(String name) {
		if(name.equals("Tom")) {
			try {
				int i = 10/0;
			}
			catch(Exception e){
				System.out.println("It wiil not reach here");
				return 98;
			}
			finally {
				return 90;
			}
			
		}
		else if(name.equals("peter")) {
			System.out.println("Print peter");
		}
		return 0;
		
	}

}
