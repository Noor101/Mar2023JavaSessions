package JavaSessions;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int w = 1000;
		int x = 200;
		int y = 3000;
		int z = 400;

		// To find the greatest number with th given 4 different number

		if (w > x && w > y && w > z) { // true & false & True - False
			System.out.println("W is the greatest");
		} else if (x > y && x > z) {  //False && False - False
			System.out.println("X is the greatest");
		} else if (y > z) { // True
			System.out.println("y is the greatest");
		} else { //true
			System.out.println("Z is the greatest");
		}

	}

}