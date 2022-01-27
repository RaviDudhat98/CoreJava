package oopsconcepts;

import java.util.*;

/**
 * Practical:- 22 Write a program to prepare the list like(“A”, ”B”, ”C”, ”D”, ”A”, ”C”, ”E”, ”E”, ”E”) and remove duplicate values of the list.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-27
 */
public class Arraylist {

	public static void main(String[] args) {
		// Create an object of the list
		List<String> list = new ArrayList<String>();
		// Add elements in list
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");

		System.out.println("Elements are:- " + list);

		for (int i = 1; i < list.size(); i++) {
			for (int j = 2; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(list.get(i));
				}
			}
		}
		System.out.println("After removing duplicate elements are:- " + list);
	}

}
