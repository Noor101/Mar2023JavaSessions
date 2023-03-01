package JavaSessions;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is my java code and i'm so happy and so right";

		// To find the length

		System.out.println(str.length());

		int len = str.length();
		int li = 0;
		System.out.println(li);

		int hi = len - 1;
		System.out.println(hi);

		System.out.println(str.charAt(2));

		System.out.println(str.indexOf('j'));

		System.out.println(str.indexOf('d'));

		System.out.println(str.charAt(3)); // 1st occurence of s

		System.out.println(str.indexOf("happy"));

		System.out.println(str.indexOf("hello"));

		// To find the second occurence of s

		System.out.println(str.indexOf('s', str.indexOf('s') + 1));
		
		System.out.println("--------");
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));

		System.out.println(str.indexOf("s", str.indexOf('s') + 1));

		// to find the 3rd occurence of s

		System.out.println(str.lastIndexOf('s'));

		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());

		System.out.println(str.lastIndexOf("s", str.indexOf('s') + 1));

		String s = "      Hello World 1      ";
		System.out.println(s.trim());

		if (s.contains("Hello")) {
			System.out.println("Come inside the loop");
		}

		if (s.equals("Hello"))
			
		{
			System.out.println("Print hello");
		}

		String d = "22/06/1995";

		System.out.println(d.replace('/', '-'));

		String d1 = "I love java";
		System.out.println(d1.replace("love", "write"));

		String s1 = "Welcome admin";
		System.out.println(s1.contains("admin"));

		if (s1.contains("admin")) {
			System.out.println("Welcome");
		}

		// concat

		String s2 = "Hello";
		String s3 = "Selenium";

		System.out.println(s2.concat(s3));

		// comparison

		String s4 = "This is my java code";
		String s5 = "This is my Java code";

		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));

		String s6 = "this is my order id 123456";
		System.out.println(s6.substring(7));

		System.out.println(s6.substring(0, 9));
		System.out.println(s6.length());
		System.out.println(s6.substring(s6.indexOf("id") + 3, s6.length()));
		System.out.println();

		String test = "Java;python;c;c++;ruby";
		String arr[] = test.split(";");
		System.out.println(arr[0]);

		for (String e : arr) {
			System.out.println(e);
		}

		System.out.println("-----------");
		// split method

		String userData = "Tom:peter:30:London:UK:9999999";
		String user[] = userData.split(":");
		System.out.println(user[0]);

		for (int i = 0; i < user.length; i++) {
			System.out.println(user[i]);
		}

		System.out.println("----------");

		String x = "xXtestingXxXxpostingxX";
		String x1[] = x.split("xX");
		System.out.println("0th value is" + x1[0]);
		System.out.println("1st value is" + x1[1]);
		System.out.println("1st value is" + x1[2]);

		String t = "100";
		System.out.println(t + 20);

		int i = Integer.parseInt(t);
		System.out.println(i + 20);

		String r = "12.33";
		System.out.println(r + 100);

		// int to string

		int f = 1000;
		System.out.println(f + 20);

		// o/p should 100020

		String t1 = String.valueOf(f);
		System.out.println(t1 + 20);

		String ds = "12.33";
		System.out.println(ds + 100);// 12.33100

		// string to double

		double db = Double.parseDouble(ds);
		System.out.println(db + 100);

		// int to string

		int total = 1000;
		System.out.println(total + 20);
		
		System.out.println("------");

		System.out.println(total + "" + 20);

		String we = String.valueOf(total); // "1000"
		System.out.println(we + 1000);
		
		// Assignment - Remove A

		String w = "200A";
		
		String w2 = w.substring(0, 3);
		System.out.println(w2);
		
		int w3 = Integer.parseInt(w2);
		System.out.println(w3+100);
		
		String S = "200A";
		String result = S.replace("A", "");
		System.out.println(result);
		
	
		String S1 = "naveen";
		String S2 = "naveen";
		
		System.out.println(S1.concat(S2));
		System.out.println(S1==S2);
		System.out.println(S1.equals(S2));
			
	}

}
