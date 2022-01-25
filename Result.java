package oopsconcepts;

import java.util.Scanner;

/**
 * Practical:- 15-2 Write a program to demonstrate multi-level inheritance.
 * @author Ravi Dudhat
 * @version 1.01 22022-01-25
 */
class Student {

	int number;
	Scanner scanner = new Scanner(System.in); // Take input from the user 

	public void getData() { // Method for get data from user
		System.out.println("Multi-level inheritance\n");
		System.out.println("Enter enrollnment number:- ");
		number = scanner.nextInt();
	}

}

class Marks extends Student {

	int marks1;
	int marks2;
	int total;

	Scanner scanner = new Scanner(System.in); // Take input from the user

	public void getMarks() { // Method for get data from user
		System.out.println("Enter marks of subject 1:- ");
		marks1 = scanner.nextInt();

		System.out.println("Enter marks of subject 2:- ");
		marks2 = scanner.nextInt();

		total = marks1 + marks2;
	}

	public void show() { // Method for display data to user
		System.out.println("Enrollnment number is:- " + number);
		System.out.println("Marks of subject 1:- " + marks1);
		System.out.println("Marks of subject 2:- " + marks2);
		System.out.println("Total of marks:- " + total);
	}
}

public class Result extends Marks {

	public void average() {
		float average = total / 2;
		System.out.println("Average is:- " + average + "%");
	}

	public static void main(String[] args) {
		// Create an object of class
		Result result = new Result();
		result.getData();
		result.getMarks();
		result.show();
		result.average();
	}

}