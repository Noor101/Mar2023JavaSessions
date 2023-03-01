package JavaSessions;

import java.util.Arrays;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
		//int array
		
		int a[] = new int[4];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//to find the length of the array
		
		int len = a.length;
		System.out.println("Highest index is" + (len-1));
		
		//to print the array values using for loop
		
		for (int b=0; b<a.length;b++) {
			System.out.println(a[b]);
		}
		
		
		//for-each loop
		
		for(Integer e : a) {
			System.out.println(e);
		}
		
		// double array
		
		//String array
		
		String s[] = new String[3];
		s[0] ="Java";
		s[1] = "Python";
		s[2] = "C++";
		
		for(int p=0; p<s.length; p++)
		{
			System.out.println(s[p]);
		}
		
		
		double d[] = new double[3];
		d[0] = 154.33;
		d[1] = 2585.55;
		d[2] = 589.99;
		
		for(int g=0;g<d.length;g++) {
			System.out.println(d[g]);
		}

		
		for(Double e : d) {
			System.out.println(e);
		}
		
		System.out.println("---------");
		System.out.println(Arrays.toString(d));
		
		
	}

}
