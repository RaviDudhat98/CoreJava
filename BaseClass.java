package basicjava;

/**
 * Practical 11 : Write a program to use of super keyword.-
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */

class Parent{

	/**
	 * @param args
	 */
	
	String name = "Anil patel";
	
}

public class BaseClass extends Parent { 
	
	String collage = "GEC, Modasa";
	
	public void display() { // display methods 
		System.out.println("Name of the student:- "+ collage);
		System.out.println("Name of the collage:- "+ super.name); // Access name from parent class using Super keyword s
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of base class 
		BaseClass base = new BaseClass ();
		base.display(); // calling base class method 
	}
}