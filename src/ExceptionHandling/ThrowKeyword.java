package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
		
		throw new Exception("Exxcel data field is blank");
		}
		catch(Exception e){
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
	}

}
