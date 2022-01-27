package oopsconcepts;

import java.util.Scanner;

/**
 * Practical:- 18 Write a program to handle exceptions using try, catch, finally, throw and throws keywords.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-26
 */
public class ExceptionDemo {

	static int age;
	public void validateAge() { 
		if (age < 18) {
			throw new ArithmeticException("Not eligible for vote!!");  
		} else {
			System.out.println("Eligible for vote!!");  
		}
	}

	public static void main(String[] args) {
		System.out.println("-----Exception handling-----\n");
		Scanner scanner = new Scanner(System.in); // Take input from the user
		System.out.println("Enter number for division:- ");
		int number = scanner.nextInt();

		try {
			System.out.println("------Try Block------\n");
			int result = number / 0;
			System.out.println ("Result:" + result);
		} catch (ArithmeticException e) {
			System.out.println("Catch exception--");
			System.out.println(e); // Print exception if there any exception 
		}
		finally {
			System.out.println("\n------Finally Block------");
		}

		System.out.println("\nEnter your age:- ");
		age = scanner.nextInt();

		ExceptionDemo exception = new ExceptionDemo(); // Create an object of the class
		exception.validateAge();
		scanner.close();
	}

}
