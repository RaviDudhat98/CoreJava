package basicjava;

import java.util.Scanner;

/** 
 * Practical 8 :- Write a program to calculate EMI.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */

public class EmiCalulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Take input from the user 
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("Enter principal amount(Rs):- ");
		float principalAmount = scanner1.nextFloat();
		
		Scanner scanner2 = new Scanner (System.in);
		System.out.println("Enter intrest rate per manth(%):- ");
		float rate = scanner2.nextFloat();
		
		Scanner scanner3 = new Scanner (System.in);
		System.out.println("Enter no of months:- ");
		float months = scanner3.nextFloat();
		
		rate = rate/(12*100); // One month interest rate 
		
		// Formula of EMI - [p*r*(1+r)^n] / [(1+r)^n-1] 
		float emi = (principalAmount * rate * (float)Math.pow(1 + rate, months)) / (float)(Math.pow(1 + rate, months)-1);
		System.out.println("EMI is:- "+ emi);
	}

}
