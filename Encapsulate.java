package oopsconcepts;

import java.util.Scanner;

/**
 * Practical:- 14 Write a program to demonstrate data encapsulation
 * @author Ravi Dudhat
 * @version 1.01 2022-01-24
 */
public class Encapsulate {

	private int number;
	private String name;
	private String collage;

	// Get and Set methods
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}

	public static void main(String[] args) {
		Encapsulate encapsulate = new Encapsulate(); // Create an object of the class 
		
		Scanner scanner = new Scanner(System.in); // Take input from the user
		System.out.println("Enter number of Student:-");
		encapsulate.setNumber(scanner.nextInt());
		System.out.println("Enter name of Student:-");
		encapsulate.setName(scanner.next());
		System.out.println("Enter collage of Student:-");
		encapsulate.setCollage(scanner.next());

		encapsulate.getNumber();
		System.out.println("Number of Student:- "+ encapsulate.getNumber());
		encapsulate.getName();
		System.out.println("Name of Student:- "+ encapsulate.getName());
		encapsulate.getCollage(); 
		System.out.println("Collage of Student:- "+ encapsulate.getCollage());
		scanner.close();
	}

}
