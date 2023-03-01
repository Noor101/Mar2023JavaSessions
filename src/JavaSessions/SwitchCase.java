package JavaSessions;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "linino";

		switch (browser) {
		case "Chrome":
			System.out.println("Lauch Chrome");
			break;
		case "Safari":
			System.out.println("Lauch Safari");
			break;
		case "Firefox":
			System.out.println("Lauch Firefox");
			break;
		case "Opera":
			System.out.println("Lauch Opera");
			break;

		default:
			System.out.println("Please lauch the correct brower" + browser);
			break;
		}

		int marks = 100;
		int discount = 0;

		switch (marks) {
		case 100:
			System.out.println("A Grade");
			discount = 1000;
			break;
		case 90:
			System.out.println("B Grade");
			discount = 900;
			break;
		case 80:
			System.out.println("C Grade");
			discount = 800;
			break;

		default:
			System.out.println("FAIL");
			break;
		}
		System.out.println("your marks are:" + marks + "and discount is " + discount);

		int age = 51;

		switch (age) {
		case 50:
			System.out.println("Print the age" + age);
			break;

		case 40:
			System.out.println("Print the age" + age);
			break;

		case 25:
			System.out.println("Print the age" + age);
			break;

		default:

			System.out.println("No person present on that age" + age);
			break;
		}

		int val = 45;
		int offer = 0;

		switch (val) {
		case 100:
			System.out.println("Print the val" + val);
			offer = 100;
			break;

		case 70:
			System.out.println("Print the val" + val);
			offer = 90;
			break;
			
			default:
				
				System.out.println("Fail");

		}
		System.out.println("your value is" + ""+ val+ "the discount is " + offer);
		
		

	}

}
