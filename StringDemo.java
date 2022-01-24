package corejava;

import java.util.Scanner;

/**
 * Practical 10:- Write a program to perform all string methods.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */
public class StringDemo {

	public static void main(String[] args) {
		String  string1 = "    Hi_Welcome_Home     ";
		
		System.out.println("Length of String 1:- "+ string1.length()); // Length of string 
		System.out.println("Specific value of String 1(Index 0):- "+ string1.charAt(0)); // Return specific value 
		System.out.println("ASCII value of String 1(Index 0):- "+ string1.codePointAt(0)); // Return ASCII value 
		
		System.out.println("Upper case of String 1:- "+ string1.toUpperCase()); // Upper case string 
		System.out.println("Lower case of String 1:- "+ string1.toLowerCase()); // lower case string 
		
		System.out.println("Remove white space from both side of String 1:- "+ string1.trim()); // Remove space 
		
		System.out.println("String 1 start with (Hi) or not:- "+ string1.startsWith("Hi")); // Check string start with "Hi"
		System.out.println("String 1 end with (e) or not:- "+ string1.endsWith("e")); // Check string start with "Hi"
		
		System.out.println("Last index of character(H) of String 1:- "+ string1.lastIndexOf("H")); // Return last index of "H"
		System.out.println("Index of character(H) of String 1:- "+ string1.indexOf("H")); // Return index of "H"
		
		System.out.println("String 1 is empty or not:- "+ string1.isEmpty()); // Check string is empty or not
		System.out.println("Hashcode of String 1:- "+ string1.hashCode()); // Return hashcode
		
		System.out.println("All (o) replace with (q):- "+ string1.replace('o', 'q')); // Replace string 
		
		// Take string as input from the user
		Scanner scanner = new Scanner (System.in);
		System.out.println("\nEnter a first string:- ");
		String string2 = scanner.next();
		
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("Enter a second string:- ");
		String string3 = scanner1.next();
		
		System.out.println("String comparision using compare to method:- "+ string2.compareTo(string3)); // compare to method
		System.out.println("String comparision using equals method:- "+ string2.equals(string3)); // equals method
		System.out.println("String concatanation :- "+ string2.concat(string3)); // String concates
	}

}
