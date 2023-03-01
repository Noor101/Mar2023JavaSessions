package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Vennila");
		names.add("Priya");
		names.add("Aishu");
		names.add("Pavani");

		System.out.println(names.size());

		System.out.println(names);

		names.clear();
		System.out.println(names.size());
		System.out.println(names);
		
		
		//Clone method
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("A");
		ar.add("B");
		ar.add("C");
		
		System.out.println(ar);
		
		ArrayList<String> ar1 = (ArrayList<String>) ar.clone();
		System.out.println(ar1);	
		
		//contains
		
		System.out.println(ar.contains("C"));
		
		//index of
		
		System.out.println(ar.indexOf("B"));
		
		//ensure capactity - Wiil increase the virtual capacity
	
		ArrayList<String> ar2 = new ArrayList<String>(2);
		
		ar2.add("Test");
		ar2.add("Selenium");
		
		System.out.println(ar2);
		
		ar2.ensureCapacity(15); // It will increase the virtual capacity 
		
		// for each method
		
		ar2.forEach(f->System.out.println(f));
		
		//lowercase
		
		ar2.forEach(a->System.out.println(a.toLowerCase()));
		
		ArrayList<String> EmpList = new ArrayList<String>();
		EmpList.add("Tom");
		EmpList.add("Perry");
		EmpList.add("Raju");
		EmpList.add("Thomas");
		
		//Collections
		
		System.out.println(EmpList);
		
		//To sort in ascending  use collection class
		
		Collections.sort(EmpList);
		
		System.out.println(EmpList);
		
		//To sort in descending  use collection class
		
		Collections.sort(EmpList, Collections.reverseOrder());
		
		System.out.println(EmpList);
		
		
	
		

	}

}
