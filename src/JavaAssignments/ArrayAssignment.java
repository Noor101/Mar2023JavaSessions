package JavaAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayAssignment {

	public static void main(String[] args) {
		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection

		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Blue");
		colors.add("Green");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Violet");
		colors.add("Orange");

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}

		System.out.println("-----------");

		/*
		 * 2. Write a Java program to insert  *  an element into the array list at the
		 * first and last positions.
		 */

		colors.add(0, "Black");
		colors.add(colors.size(), "pink");
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}

		System.out.println("-----------");

		/*
		 * 3. Write a Java program to retrieve an element* (at a specified index) from a
		 * given array list.
		 */

		System.out.println(colors.indexOf("Violet"));
		System.out.println(colors.indexOf("pink"));

		System.out.println(colors.get(7));

		System.out.println("-----------");

		// 4. Write a Java program to update specific array element by given element

		colors.add(2, "NoColor");

		colors.add(3, "Rose");

		System.out.println(colors.size());

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}

		System.out.println("-----------");

		// 5.Write a Java program to remove the third element from a array list

		colors.remove(3);

		System.out.println(colors.size());

		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
		System.out.println("-----------");
		//6. Write a Java program to search an element in a array list.
		
		if(colors.contains("Violet")) {
			System.out.println("Violet is found......");
		}
		else {
			System.out.println("Violet is not found.....");
		}
		System.out.println("-----------");
		
		//7. Write a Java program to reverse elements in a array list
		
		Collections.sort(colors);
		System.out.println(colors);
		
		//Collections.sort(colors, Collections.reverseOrder());
		//System.out.println(colors);
		
		Collections.reverse(colors);
		System.out.println(colors);
	}

}
