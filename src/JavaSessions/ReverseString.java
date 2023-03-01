package JavaSessions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Automation";

		String rev = "";

		// Need to reverse the string

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		System.out.println(reverseString("NoorMohammed"));

		System.out.println(reverseString("t"));

		System.out.println(reverseString(null));
		
		String str = "haroon";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
	}

	// write a fucntion for reversestring

	public static String reverseString(String value) {

		if (value == null) {
			return null;
		}

		int leng = value.length();

		// To automize the code

		if (leng == 1) {
			return value;
		}

		String r = "";

		for (int j = leng - 1; j >= 0; j--) {

			r = r + value.charAt(j);

		}
		return r;
	}

}
