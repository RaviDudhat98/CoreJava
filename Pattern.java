package coreJAVA;

import java.util.Scanner;

/**
 * Practical 5:- Write a progeam to demonstrate example of "for" loop and prin pattern. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-20
 */

public class Pattern {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner scanner = new Scanner (System.in); // Take input from the user 
		System.out.println("Enter the no:- ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) { // For loop for variable i 
			for (int j = 1; j <= i; j++) { // For loop for variable j 
				System.out.print("* "); 
			}
			System.out.println();
		}
	}

}
