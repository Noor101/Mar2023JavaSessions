package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println(ar.size());

		ar.add(100);
		ar.add(200);

		System.out.println(ar.size());
		ar.add(300);
		ar.add(400);
		ar.add(500);

		System.out.println(ar.size());
		ar.add(600);
		ar.add(700);
		ar.add(800);

		System.out.println(ar.size());
		ar.add(900);
		ar.add(1000);
		System.out.println(ar.size());

		ar.add(1100);

		// how to print array using for loop

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));

		}
		// for each loop
		
		for(Integer e : ar ) {
			System.out.println(e);
		}
		
		ArrayList<String> ar1 = new ArrayList<String> (Arrays.asList("Lina", "vina", "Meena"));
		
		System.out.println(ar1.size());
		
		for(int i=0;i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		System.out.println("-----");
		
		ar1.add("Jalil");
		ar1.add("Dilip");
		
		for(String e : ar1) {
			System.out.println(e);
		}
	
		
	}

}
