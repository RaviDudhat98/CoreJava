package oopsconcepts;

/**
 * Practical:- 16 Write a program to demonstrate the compile-time and run-time polymorphism.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-25 
 */
class Addition {

	public void sum(int value1, int value2) {
		System.out.println("\nMehod overriding.....");
		int addition1 = value1 + value2;
		System.out.println("Addition in parent class:- " + addition1);
	}

}

class FirstShape extends Addition {

	double pi = 3.14;

	public void area(double radius) {
		System.out.println("Mehod overloading.....");
		double areaOfCircle = pi * radius * radius; // Area of circle
		System.out.println("Area of circle:- " + areaOfCircle);
	}

	public void area(double width, double height) {
		double areaOfRectangle = width * height; // Area of rectangle
		System.out.println("Area of rectangle:- " + areaOfRectangle);
	}

	public void sum(int value1, int value2) {
		int addition = value1 + value2;
		System.out.println("Addition in child class:- " + addition);
	}

	public static void main(String[] args) {
		FirstShape firstShape = new FirstShape(); // Create an object of class
		firstShape.area(20);
		firstShape.area(10, 20);

		Addition add = new Addition(); // Create an object of class
		add.sum(50, 50);
		firstShape.sum(101, 102);
	}

}