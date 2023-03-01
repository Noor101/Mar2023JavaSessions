package ExceptionHandling;

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m4();
		
	}
	

	public void m1() {
		System.out.println("M1");
	}
	

	public void m2() {
		System.out.println("M2");
	}

	public void m3() {
		System.out.println("M3");
	}

	public void m4() {
		System.out.println("M4");
		try {
		booking();
		}
		catch(ArithmeticException e){
			
			System.out.println("Bypoass the booking");
			
		}
	}
	
	public void booking() throws ArithmeticException {
		System.out.println("Book the cab");
		int i = 9/0;
		
	}

}
