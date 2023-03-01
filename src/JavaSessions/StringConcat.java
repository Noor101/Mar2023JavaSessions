package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {
		
		
		String s = "Hello";
		System.out.println(s);
		
		String s2="1000";
		System.out.println(s2);
		
		int a = 100;
		int b = 250;
		
		double d = 12.33;
		double d1 = 14.33;
		
		System.out.println(a+b);
		
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(d+d1);;
		System.out.println(x+y+a+b+d+d1);
		System.out.println(d+d1+a+b+x+y);
		
		//char
		// char - Java will consider ascii value of the char.
		
		char c = 'a';
		char c1 = 'b';
		System.out.println(c+c1);
		System.out.println(c);
		System.out.println(c1-c);
		System.out.println(c*c1);
		System.out.println(c*c);
		
		System.out.println(4/2);
		System.out.println(5/2);
		System.out.println(5.0/2);
		System.out.println(5/2.0);
		System.out.println(5.0/2.0);
		
		//System.out.println(9/0); // arithmetic exception
		System.out.println(0/11);
				
		

	}

}
