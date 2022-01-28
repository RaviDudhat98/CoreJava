package oopsconcepts;

import java.util.Scanner;

/**
 * Practical 15-3 Write a program to demonstrate hierarchical inheritance.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-25
 */
class Employee {

	double employeeSalary;
	double internSalary;

	Scanner scanner = new Scanner(System.in); // Take input from the user 

	public void getEmployeeSalary() { // Method for get full time employee salary
		System.out.println("Enter employee salary:-  ");
		employeeSalary = scanner.nextDouble();
		System.out.println("Employee salary:- " + employeeSalary);
	}

	public void getInternSalary() { // Method for get intern salary 
		System.out.println("Enter intern salary:- ");
		internSalary = scanner.nextDouble();
		System.out.println("Intern salary:- " + internSalary);
	}

}

class FullTimeEmployee extends Employee {

	double increment = 0.25;

	public void employeeSalary() {
		employeeSalary = employeeSalary + (employeeSalary * increment);
		System.out.println("Employee increment salary:- " + employeeSalary);
	}

}

public class Intern extends Employee {

	double increment = 0.10;

	public void internSalary() {
		internSalary = internSalary + (internSalary * increment); 
		System.out.println("Intern increment salary:- " + internSalary);
	}

	public static void main(String[] args) {
		int choice = 0;

		Scanner scanner = new Scanner(System.in); // Take input from the user
		System.out.println("Hierarchical inheritance\n");
		System.out.println("Select employee");
		System.out.println("Enter 1 for full time employee");
		System.out.println("Enter 2 for intern\n");
		System.out.println("Enter your choice:- "); // Enter choice for employee / intern
		choice = scanner.nextInt();

		if (choice == 1) { // Condition for choose for employee 
			FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(); // Create an object of class
			fullTimeEmployee.getEmployeeSalary();
			fullTimeEmployee.employeeSalary();
		} else if (choice == 2) { // Condition for choose for intern
			Intern intern = new Intern(); // Create an object of class
			intern.getInternSalary();
			intern.internSalary();
		} else {
			System.out.println("Wrong choice....");
			System.exit(0);
		}

		scanner.close();
	}

}
