package corejava;

/**
 * Practical 7:- Write a program to demonstrate the example of constructor and Parameterized constructor.
 * @author Ravi Dudhat 
 * @version 1.01 2022-01-20
 */

public class Constructor {

	int a; 
	int n1; 
	int n2; 
	
	public Constructor() { // Create a constructor 
		a = 1000; // Assigning a value to variable 
	}
	
	public Constructor(int x, int y) { 
		n1 = x;
		n2 = y;
	}
	
	public static void main(String[] args) {
		Constructor c1 = new Constructor(); // Create first object of class 
		System.out.println("Value of a is:- "+ c1.a); // Calling contructor 
		Constructor c2 = new Constructor(100, 20); // Create second object of class 
		System.out.println("Multiplication is:- "+ c2.n1 * c2.n2); // Calling parameterized constructor 
	}

}
