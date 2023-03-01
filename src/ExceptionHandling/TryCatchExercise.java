package ExceptionHandling;

public class TryCatchExercise {
	
	int val = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TryCatchExercise ty =new TryCatchExercise();
		
	try {
		int j = 11%ty.val;
		System.out.println(j);
	}catch(Error e) {
		System.out.println("If ArithmeticException is coming please print that");
		e.printStackTrace();
		
	}
	}

}
