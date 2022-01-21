package basicjava;

import java.util.Scanner;

/**
 * pracical8 9:- Write a Program to campare  two variables of wrapper class. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Wrapper class
		Double n1 = new Double (25.2);
		Double n2 = new Double (20.2);
		
		System.out.println("Comparision using compare to method :- "+ n1.compareTo(n2)); // Compareto method
		System.out.println("Comparision using equals method:- "+ n1.equals(n2)); // equals method
	}

}
