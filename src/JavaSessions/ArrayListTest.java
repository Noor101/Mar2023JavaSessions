package JavaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add(200);
		ar.add("testing");
		ar.add('f');
		ar.add(12.33);

		for(Object o : ar) {
			System.out.println(o);
		}
		// Integer array

		ArrayList<Integer> markslist = new ArrayList<Integer>();
		markslist.add(200);
		markslist.add(300);
		markslist.add(400);

		System.out.println(markslist.get(2));
		System.out.println(markslist.size());
		
		//String Array
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Noor");
		names.add("Rajesh");
		names.add("Kodi");
		names.add("farhan");
		names.add("Naveen");
		
		// To remove the names
		
		//System.out.println(names.remove(1));
		System.out.println(names.size());
		System.out.println(names.get(1));
		
		//To print the names from the arraylist using for loop
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		//To print the names from the arraylist using for for each loop
		
		for(String s : names) {
			System.out.println(s);
			
			if(s.equals("Kodi")) {
				System.out.println("Kodi is found.......");
			}
		}
	}

}
