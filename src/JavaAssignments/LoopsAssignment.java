package JavaAssignments;

public class LoopsAssignment {

	public static void main(String[] args) {

		/*
		 * 1. WAP to print the follwing output I am Batman I am Batman I am Batman I am
		 * Batman I am Batman
		 */

		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");
		}

		System.out.println(" -------------");

		/*
		 * 2. WAP to print the follwing output I am Batman 1 I am Batman 2 I am Batman 3
		 * I am Batman 4 I am Batman 5 I am Batman 6 I am Batman 7 I am Batman 8
		 */

		for (int j = 1; j <= 9; j++) {
			System.out.println("I am Batman" + " " + j);
		}

		System.out.println(" -------------");

		// 3. WAP to print 10 to 1 using for, while and do-while loop
		// for loop
		for (int x = 10; x >= 1; x--) {
			System.out.println(x);
		}

		System.out.println(" -------------");
		// while loop
		int y = 10;
		while (y >= 1) {
			System.out.println(y);
			y--;

		}
		System.out.println(" -------------");
		// do-while loop
		int z = 10;
		do {
			System.out.println(z);
			z--;
		} while (z >= 1);

		System.out.println(" -------------");

		// 4. 4. Write a program in Java to print "Hello World" ten times using while
		// loop
		int q = 10;
		while (q >= 1) {
			System.out.println("Hello World");
			q--;
		}

		System.out.println(" -------------");


		// 5. Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered

		int f = 1;
		while(f<=10) {
			System.out.println(f);
			if(f % 7 == 0) {
				break;
			}
			f++;
		}
	}

}
