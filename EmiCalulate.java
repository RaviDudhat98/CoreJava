package corejava;

import java.util.Scanner;

/** 
 * Practical 8:- Write a program to calculate EMI.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */
public class EmiCalulate {

	public static void main(String[] args) {
		// Take input from the user 
		Scanner scanner = new Scanner (System.in);

		System.out.println("Enter principal amount(Rs):- ");
		float principalAmount = scanner.nextFloat();

		System.out.println("Enter intrest rate per manth(%):- ");
		float intrestRate = scanner.nextFloat();

		System.out.println("Enter no of months:- ");
		float months = scanner.nextFloat();

		intrestRate = intrestRate / (12 * 100); // One month interest rate 

		// Formula of EMI - [p*r*(1+r)^n] / [(1+r)^n-1] 
		float emi = (principalAmount * intrestRate * (float)Math.pow(1 + intrestRate, months)) / (float)(Math.pow(1 + intrestRate, months) - 1);
		System.out.println("EMI is:- "+ emi);
	}

}
