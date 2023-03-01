package JavaAssignments;

public class Printing_3Digit_numbers {

	public static void main(String[] args) {

		/*
		 * 000 001 002 003 004 005 //100 101 102 103 104 105 //200 201 202 203 204 205
		 * //300 301 302 303 304 305
		 * 
		 * 
		 * for(int i=0;i<=5;i++) { for(int j=0; j<=5;j++) { for(int k=0;k<=5;k--) {
		 * System.out.println(i+""+ j+""+k); } } }
		 */

		
		
		Printing_3Digit_numbers obj = new Printing_3Digit_numbers();
		obj.checkOddEven(98);
		obj.checkOddEven(17);
		obj.checkOddEven(214);
		
		System.out.println("-------");
		
		
		obj.voteEligibility(18);
		obj.voteEligibility(25);
		obj.voteEligibility(9);
		
		System.out.println("-------");
		
		
		int n = 13;
		boolean flag = false;
		
		for(int i=2; i<=n;i++) {
			if(n%i==0) {
				flag = true;
				break;
			}
		}
		System.out.println("");
		
		
		
		

	}
	// Define a program to find out whether a given number is even or odd.

	public void checkOddEven(int a) {

		if (a % 2 == 0) {
			System.out.println("Given number is even " + a);
		} else {
			System.out.println("Given number is odd" + a);
		}

	}
	// A person is elligible to vote if his/her age is greater than or equal to 18.
	// Define a method to find out if he/she is elligible to vote.

	public void voteEligibility(int a) {

		if (a >= 18) {
			System.out.println("Candidate to eligible to vote" + a);
		} else {
			System.out.println("Candidate to not eligible to vote" + a);
		}
	}

}
