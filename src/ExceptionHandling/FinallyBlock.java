package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("A");
		
		
		System.out.println(getMarks("Devi"));
		
		try{
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is here");
		}
		finally {
			System.out.println("Bye.......");
		}
		
		
		
	}
	
	

	
	public static int getMarks(String name) {

		if(name.equals("Sonam")) {
			return 90;
		}
		else if (name.equals("Devi")) {
			try {
				int i = 9/3;
				return 45;
			}
			catch(Exception e){
				return 50;
			}
			finally {
					return 10;
			}
			
		}
		else if(name.equals("Roshini")) {
			return 70;
		}
		
		return -1;
		
			
	}
}
