package oopsconcepts;

import java.util.Scanner;

/**
 * Practical:- 19 Write a program to find the index of an array element.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-26
 */
public class ArrayDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Take input from the user
		System.out.println("-----Array-----\n");
		System.out.print("Enter the number of elements you want to store:- ");
		int number = scanner.nextInt();

		int[] array = new int[50]; //creates an array
		System.out.println("Enter the elements of the array:- ");

		for (int i = 0; i < number; i++) { // Take array element from the user
			array[i] = scanner.nextInt();
		}

		System.out.println("Enter the element to find the index:- ");
		int element = scanner.nextInt();

		for (int i = 0; i < number; i++) {
			if (array[i] == element) {
				int index = i;
				System.out.println("Index of element " + element + " is:- " + index);
				break;
			}
		}
	}

}
