package JavaSessions;

public class IncrementalAndDecrementalOpeartors {

	public static void main(String[] args) {

		// post increment - increase the value later
		
		int a = 1;
		int b = a++;
		System.out.println(a); //2
		System.out.println(b); //1
		
		
		int c = -124;
		int d = c++;
		System.out.println(c); //-123
		System.out.println(d); //-124
		
		int g = -1000;
		int h = g++;
		System.out.println(g); //-999
		System.out.println(h); //-1000
		
		//pre increment 
		
		int x = 1;
		int y = ++x;
		System.out.println(x); //2
		System.out.println(y); //2
		
		
		int u = -99;
		int o = ++u;
		System.out.println(u); //-98
		System.out.println(o); //-98
		
		//post decrement
		
		int i = 1;
		int j = i--;
		System.out.println(i); //0
		System.out.println(j); //1 
		
		//pre decrement
		int q = 3;
		int z = --q;
		System.out.println(q); //2
		System.out.println(z); //2
	
		
		int total = 100;
		System.out.println(total++);
		System.out.println(total);
		
		int bal = 999;
		System.out.println(++bal);//1000
		System.out.println(bal); //1000
		
		double d1 = 99.99;
		System.out.println(d1++); // 99.99
		System.out.println(++d1); //101.99
		System.out.println(d1++); // 101.99
		
		char c1 = 'a'; // 97
		System.out.println(++c1); //98
		
		
		int q1 = 100;
		System.out.println(++q1);//101
		System.out.println(q1); //101
		
		
		int y1 = 1;
		System.out.println(y1++);//1
		System.out.println(y1);//2
		
		int p = 5;
		System.out.println(p++);


	}

}
