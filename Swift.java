package oopsconcepts;

import java.util.Scanner;

/**
 * Practical:- 15-4 Write a program to demonstrate hybrid inheritance.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-25
 */
class Vehicle {

	static String color;
	Scanner scanner = new Scanner(System.in); // Take input from the user 

	public void vehicleInfo() {
		System.out.println("----Hybrid inheritance----\n");
		System.out.println("Enter color of vehicle:- ");
		color = scanner.next();
	}

}

class Car extends Vehicle {

	static int tyresCar;

	Scanner scanner = new Scanner(System.in); // Take input from the user 

	public void carDetails() {
		System.out.println("Enter no of tyres for car:- ");
		tyresCar = scanner.nextInt();
	}

}

class Bike extends Vehicle {

	int tyresBike;

	Scanner scanner = new Scanner(System.in); // Take input from the user 

	public void bikeDetails() { // Method for get bike details 
		System.out.println("Enter number of tyres for bike:- ");
		tyresBike = scanner.nextInt();
	}

	public void displayBikeData() { // Method for display bike data 
		System.out.println("Number of tyres of bike:- " + tyresBike);
		System.out.println("Color of vehicle:- " + color);
	}

}

public class Swift extends Car {

	public void displayCarData() { // Method for display car details
		System.out.println("Number of tyres of car:- " + tyresCar);
		System.out.println("Color of vehicle:- " + color);
	}

	public static void main(String[] args) {
		int choice = 0;

		Swift swift = new Swift();
		swift.vehicleInfo();

		Scanner scanner = new Scanner(System.in); // Take input from the user
		System.out.println("Select your vehicle...");
		System.out.println("Enter 1 for car");
		System.out.println("Enter 2 for bike\n");
		System.out.println("Enter your choice:- "); // Enter choice for car / bike
		choice = scanner.nextInt();

		if (choice == 1) { // Condition for choose car 
			Car car = new Car();
			car.carDetails();
			swift.displayCarData();
		} else if (choice == 2) { // Condition for choose bike
			Bike bike = new Bike();
			bike.bikeDetails();
			bike.displayBikeData();
		} else {
			System.out.println("Wrong choice....");
			System.exit(0);
		}
		scanner.close();
	}

}
