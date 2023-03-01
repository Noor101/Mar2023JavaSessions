package JavaAssignments;

public class DataTypesAssignment {

	public static void main(String[] args) {

		/*
		 * 1. Write a Java program to print 'Hello' on screen and then print your name
		 * on a separate line. Expected Output : Hello  Naveen K
		 */

		System.out.println("Hello");
		System.out.println("Noor Mohammed");

		/*
		 * 2. Write a Java program to print the sum of two numbers.  Test Data:   74 +
		 * 36  Expected Output : 110
		 */

		int i = 74;
		int j = 36;
		System.out.println(i + j);

		/*
		 * 3. Write a Java program to divide two numbers and print on the screen.  Test
		 * Data :  50/3 Expected Output : 16
		 */

		int q = 50;
		int e = 3;

		System.out.println(q / e);

		/*
		 * 4. Write a Java program to print the result of the following operations.
		 * Change your test data accordingly. Test Data: a. -5 + 8 * 6 b. (55+9) % 9  c.
		 * 20 + -3*5 / 8  d. 5 + 15 / 3 * 2 - 8 % 3  Expected Output : 43  1  19  13
		 */

		int a = 5;
		int b = 15;
		int c = 3;
		int d = 2;
		int e1 = 8;

		System.out.println(a + (b / c * d) - e1 % c);

		/*
		 * 5. Write a Java program to compute the specified expressions and print the
		 * output. Go to the editor Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 -
		 * 4.5))  Expected Output 2.138888888888889
		 */

		double p = 25.5;
		double q1 = 3.5;
		double r = 40.5;
		double z = 4.5;

		System.out.println((p * q1 - q1 * q1) / (r - z));

		/* 6. Try to concat "Hello Selenium" with a character 't' */

		String s = "Hello Selenium";
		char t = 't';

		System.out.println(s + t);

		/*
		 * 7. Create three int variables having values like : 100, 200, 3400. Add them
		 * and concatenate and generate this output String : 
		 * "Your Toal amount is. 3700".
		 */

		int m = 100;
		int n = 200;
		int o = 3400;

		System.out.println("Your Toal amount is" + (m + n + o));

		/*
		 * 8. What should be the output for :
		 * 
		 * 
		 * byte b3 = 065;  System.out.println(b3);
		 */
		
		byte b3 = 065;
		System.out.println(b3);

	}

}
