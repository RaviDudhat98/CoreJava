package corejava;

/**
 * Practical 11:-  Write a program to use super keywords.-
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */
class Parent { 

	String name = "Anil patel";

}

public class BaseClass extends Parent { 

	String collages = "GEC Dhahod, GEC Modasa";

	public void display() {
		System.out.println("Name of the student:- "+ collages);
		System.out.println("Name of the collage:- "+ super.name); // Access variable of parent class using Super keyword 
	}

	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		base.display();
	}

}