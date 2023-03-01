package ExceptionHandling;

public class TryCatchBlock {

	String name;
	public static void main(String[] args) {

		int base = 0;
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		
		//try and catch exception
		
		try {
			TryCatchBlock  obj = new TryCatchBlock();
			//obj = null;
			obj.name = "Tom";
					
			
		int i = 9/base;
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		}
		catch(ArithmeticException e) {
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			System.out.println("Some exception is coming");
			e.printStackTrace();
		}
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		

	}

}
