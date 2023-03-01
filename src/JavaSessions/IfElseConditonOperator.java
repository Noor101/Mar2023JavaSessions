package JavaSessions;

public class IfElseConditonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// = Assignment operator
		// == comparison operator
		int a = 10;
		int b = 10;

		System.out.println(a == b);

		if (a == b) {
			System.out.println("Hi");
		} else {
			System.out.println("Bye");
		}

		if (true)// you can also delibrately give boolean value
		{
			System.out.println("Hello");
		} else {
			System.out.println("Dead code"); // Dead code
		}

		String s = "Selenium";
		String n = "selenium";

		// Java is case sensitive

		// To compare String use equal method

		if (s.equals(n)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}
		// In this case we can use another equalsignorecase

		if (s.equalsIgnoreCase(n)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		// nested if

		int marks = 100;

		if (marks >= 90) {
			System.out.println("A Grade");
			if (marks <= 70) {
				System.out.println("B Grade");
			}
		} else {
			System.out.println("FAIL");
		}
		// else if

		String browser = "Safari";
		// here the problem is it will exceute all lines so we are using else if
		if (browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}
		if (browser.equals("Firfox")) {
			System.out.println("Launch Firefox");
		}
		if (browser.equals("Safari")) {
			System.out.println("Lauch Safari");
		}

		// else if - This also execute each condition until it becomes true so in that
		// case we are using switch condition.
		if (browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		} else if (browser.equals("Firefox")) {
			System.out.println("Lauch Firefox");
		} else if (browser.equals("Safari")) {
			System.out.println("Lauch Safari");
		} else {
			System.out.println("Please upate the browser.....");
		}

		// WAP to find the max number where three numbers are given.

		int x = 700;
		int y = 1000;
		int z = 400;

		if (x > y && x > z) { // false && true = false
			System.out.println("X is the greatest");
		} else if (y > z) { // true
			System.out.println("y is the greatest");
		} else {
			System.out.println("Z is the greatest");
		}

		char c = 'a';
		char c1 = 'b';
		if (c == c1) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");

		}
		if(c==97)
		{
			System.out.println("Hey this line will get execute");
		}
		
		int a1 = 10;
		int a2 = 44640;
		
		if (a1==a2) {
			System.out.println("Enter number are same");
		}else 
			System.out.println("Numbers are not same");
	
	}
}
