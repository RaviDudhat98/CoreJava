package oopsconcepts;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Practical:- 20 Write a program to add string values in the list and print all the values using an iterator.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-27
 */
public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(); // Create an object of arraylist
		arrayList.add("Hello"); // Add element in list
		arrayList.add("Welcome");
		arrayList.add("Ravi Dudhat");
		arrayList.add("Computer engineering");
		arrayList.add("Hi");

		Iterator<String> iterator = arrayList.iterator(); // Create an object of iterator
		System.out.println("-----ArrayList-----\n");

		while (iterator.hasNext()) { // Condition for elements
			System.out.println("Element is:- " + iterator.next());
		}
	}

}
