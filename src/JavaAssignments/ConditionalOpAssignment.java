package JavaAssignments;

public class ConditionalOpAssignment {

	public static void main(String[] args) {

		/*
		 * 1. Take three numbers from the user and print the greatest number. 
		 * 
		 * 
		 * Test Data Input the 1st number: 25  Input the 2nd number: 78  Input the 3rd
		 * number: 87 Expected Output :
		 * 
		 * 
		 * The greatest: 87
		 */

		int a = 25;
		int b = 78;
		int c = 87;

		if (a > b && a > c) {
			System.out.println("The greatest" + a);
		} else if (b > c) {
			System.out.println("The greatest" + b);
		} else {
			System.out.println("The greates" + c);
		}

		/*
		 * 2. Write a Java program to test a number is positive or negative.
		 * 
		 * 
		 * Test Data Input number: 35 -- positive number Input number: -11 -- negative
		 * number
		 */
		
		int x = 35;
		int y = -11;
		
		if(x>0) {
			System.out.println(x + "positive number");
		}
		else{
			System.out.println(x + "Negative number");
		}
		if(y<0) {
			System.out.println(y + "Negative number");
		}
		else {
			System.out.println(y+ "Postive number");
		}
	
	}

}
