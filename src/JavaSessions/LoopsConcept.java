package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {


		//while loops
		int i = 1;
		while(i<=100) {
			System.out.println(i);
			i++;
		}

		//for loop

		System.out.println("------------");

		for(int j=1; j<=10; j++) {
			System.out.println(j);

		}

		System.out.println("---------");


		//Print a to z using for loop

		for (char c = 'a'; c<='z'; c++ )
		{
			System.out.println(c);
		}

		for(double d = 1.1; d<10; d++) {
			System.out.println(d);
		}

		//Dead code
		/*	 while(false) {
		System.out.println("Hi");
		 }*/

		//do-while loop
		System.out.println("-----------------------------");
		int a = 1;
		do {
			System.out.println(a);
			a++;
		}
		while(a<=10);

		//foreach loop

		int marks[]= new int[5];

		marks[0] = 100;
		marks[1] = 200;
		marks[2] = 300;
		marks[3] = 400;
		marks[4] = 500;

		for(Integer e : marks) {
			System.out.println(e);
		}


		System.out.println("---------");


		int b = 1;
		while(b<10) {
			System.out.println(b);
			b++;
		}

		System.out.println("---------");

		int d = 1;

		do {
			System.out.println(d);
			break;
		}while(d<=10);


		String e[] = new String[3];
		e[0] = "Noor";
		e[1] = "Praveen";
		e[2] = "Suresh";


		System.out.println(e.length);

		for(String t : e) {
			System.out.println(t);
		}


		int w =1;
		while(w<10) {
			System.out.println(w);
			w++;
		}
		System.out.println("---------");

		int u =1; 
		do {
			System.out.println(u);
			u++;
		}while(u<=10);


		System.out.println("------------");


		int r = 1;
		while(r<10) {
			System.out.println(r);
			r++;
		}


		//		It will execute the code infinite times
		//		for(; ;) {
		//			System.out.println("hello");
		//		}



		for(char v = 'a'; v<='z'; v++) {
			System.out.println(v);
		}

		int l = 1;
		while(l<=100) {
			System.out.println(l);
			l++;
		}
	}
}
