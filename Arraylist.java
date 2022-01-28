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
		List<String> listCharacter = new ArrayList<String>();
		// Add elements in list
		listCharacter.add("A");
		listCharacter.add("B");
		listCharacter.add("C");
		listCharacter.add("D");
		listCharacter.add("A");
		listCharacter.add("C");
		listCharacter.add("E");
		listCharacter.add("E");
		listCharacter.add("E");

		System.out.println("Elements are:- " + listCharacter);

		for (int i = 1; i < listCharacter.size(); i++) {
			for (int j = 2; j < listCharacter.size(); j++) {
				if (listCharacter.get(i).equals(listCharacter.get(j))) {
					listCharacter.remove(listCharacter.get(i));
				}
			}
		}
		System.out.println("After removing duplicate elements are:- " + listCharacter);
		Collections.sort(listCharacter);
		System.out.println("Sorting elements:- " + listCharacter);
	}

}
