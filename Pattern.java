package corejava;

import java.util.Scanner;

/**
 * Practical 5:- Write a program to demonstrate an example of the "for" loop and print pattern. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-20
 */
public class Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in); // Take input from the user 
		System.out.println("Enter the no:- ");
		int number = scanner.nextInt();

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* "); 
			}
			System.out.println();
		}
	}

}
