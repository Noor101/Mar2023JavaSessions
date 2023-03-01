package JavaSessions;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "naveen";
		String s2 = "selenium";
		
		s1 = s1.concat(s2);
		
		System.out.println(s1); // String literal - Store in the string pool
		
		//
		String s3 = "naveen";
		String s4 = "naveen";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String s5 = new String("noor");
		String s6 = new String("noor");
		
		System.out.println(s5==s6);
		System.out.println(s5.equals(s6));
		
				

	}

}
 