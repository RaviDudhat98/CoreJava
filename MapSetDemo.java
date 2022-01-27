package oopsconcepts;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Practical:- 21 Write a program using Map and Set concepts.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-27
 */
public class MapSetDemo {

	public static void main(String[] args) {
		// Create an object of hashmap
		HashMap<Integer, String> dataMap = new HashMap<Integer, String>();
		// Put value in hashmap
		dataMap.put(1901601001, "Anil Shah");
		dataMap.put(1901601002, "Vipul Patel");
		dataMap.put(1901601003, "Aman Varma");
		dataMap.put(1901601004, "Kabir Vyas");
		dataMap.put(1901601005, "Raj shah");

		System.out.println("-----Hashmap-----\n");
		System.out.println("Size of hashSet is:- " + dataMap.size()); // Print size of hashmap
		System.out.println();

		for (Integer i : dataMap.keySet()) { // Condition for print key-value pair
			System.out.println("Key:- " + i + " Value:- " + dataMap.get(i));
		}

		// Create an object of hashset
		HashSet<String> subjectSet = new HashSet<String>();
		// Add value in hashset
		subjectSet.add("Information and Network Security");
		subjectSet.add("Mobile Application Development");
		subjectSet.add("Cloud Computing");
		subjectSet.add("Compiler Design");
		subjectSet.add("Artificial Intelligence");
		subjectSet.add("Python");

		System.out.println("\n-----Hashset-----\n");
		System.out.println("Subjects are:- ");

		for (String i : subjectSet) {
			System.out.println("-> " + i);
		}

		subjectSet.remove("Python"); // Remove item form the set
		System.out.println("\nRemove (Python) form the set ");
		System.out.println("\nRemaining subjects are:- ");

		for (String i : subjectSet) {
			System.out.println("-> " + i);
		}

		System.out.println("\nSize of Set is:- " + subjectSet.size());
		}

}
