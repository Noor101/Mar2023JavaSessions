package JavaAssignments;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		/*
		 * Question 1: Write a program to print the following pattern using for loop:
		 * 
		 * 
		 * 00 01 02 03 04 05 06 07 08 09  10 11 12 13 14 15 16 17 18 19  20 21 22 23 24
		 * 25 26 27 28 29  30 31 32 33 34 35 36 37 38 39 
		 */

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 9; j++) {
				System.out.print(i + "" + j + "\t");
			}
			System.out.println();
		}

		/*
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data: --name(String), age(age), team name(String), DOB(String),
		 * gender(char), Strike Rate(Double), isActive(boolean) --Try to create multiple
		 * Object Arrays for different players  --Try to print all the values of each
		 * player on the console using normal for/while loop and for each loop
		 */

		String name[] = new String[1];
		name[0] = "Noor";
		int age[] = new int[1];
		age[0] = 26;
		String teamname[] = new String[1];
		teamname[0] = "CSK";
		int dob[] = new int[1];
		dob[0] = 22061995;
		char gen[] = new char[1];
		gen[0] = 'M';
		double strike[] = new double[1];
		strike[0] = 35.66;
		boolean flag[] = new boolean[1];
		flag[0] = true;

		System.out.println("Name" + "  " + name[0]);
		System.out.println("Age" + "   " + age[0]);
		System.out.println("Teamname" + "    " + teamname[0]);
		System.out.println("DOB" + "     " + dob[0]);
		System.out.println("Gender" + "     " + gen[0]);
		System.out.println("Strike" + "     " + strike[0]);

		Object player1[] = new Object[6];
		player1[0] = "Kiran";
		player1[1] = 26;
		player1[2] = "CSK";
		player1[3] = 36.66;
		player1[4] = 'M';
		player1[5] = "Cricket";

		Object player2[] = new Object[6];

		player2[0] = "Ram Kumar";
		player2[1] = 27;
		player2[2] = "RRK";
		player2[3] = 369.66;
		player2[4] = 'M';
		player2[5] = "Cricket";

		System.out.println(player1.length);

		for (int i = 0; i < player1.length; i++) {
			System.out.println(player1[i]);
		}

		int j = 0;
		while (j < 6) {
			System.out.println(player2[j]);
			j++;
		}
		System.out.println("---------------");

		for (Object e : player2) {
			System.out.println(e);
		}

		/*
		 * Question 3: Try to print the following pattern on the console:      n = 4
		 *  n =3
		 *   n = 2
		 *    n = 1
		 *     n = 0
		 */

		int a[] = new int[5];
		a[0] = 4;
		a[1] = 3;
		a[2] = 2;
		a[3] = 1;
		a[4] = 0;
		
	for(int i=0; i<a.length; i++) {
		System.out.println("n=" + "  "+a[i]);
	}
	
	
	
for(int i=1;i<=5;i++) {
	System.out.println(i);
}
 	}

}
