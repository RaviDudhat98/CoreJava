package oopsconcepts;

/**
 * Practical:- 15-1 Write a program to demonstrate single-level inheritance.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-24
 */
class Calculate {

	public void additionOfNumber(int number1, int number2) {
		int addition = number1 + number2; 
		System.out.println("Addition is:- "+ addition);
	}

}

public class Area extends Calculate {

	public void subtractionOfNumber(int number1, int number2) {
		int subtraction = number1 - number2;
		System.out.println("Subtraction is:- "+ subtraction);
	}

	public static void main(String[] args) {
		Area area = new Area(); // Create an object of class 
		area.additionOfNumber(80, 20);
		area.subtractionOfNumber(50, 10);
	}

}
