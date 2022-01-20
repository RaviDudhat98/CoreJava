package core_JAVA;

/**
 * Practical 7:- Write a program to demonstrate the example of constructor and Parameterized constructor.
 * @author Ravi Dudhat 
 * @version 1.01 2022-01-20
 */
public class Constructor {

	/**
	 * @param args
	 */
	int a; // Initialization of a
	int n1; // Initialization of n1
	int n2; // Initialization of n2
	public Constructor() { // Create a constructor
		a = 1000; // Assigning a value to variable
	}
	public Constructor(int x, int y) { // Create a parameterized constructor
		n1 = x;
		n2 = y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c1 = new Constructor(); // Create first object of class
		System.out.println("Value of a is:- "+ c1.a); // Calling contructor
		Constructor c2 = new Constructor(100, 20); // Create second object of class
		System.out.println("Multiplication is:- "+ c2.n1 * c2.n2); // Calling Parameterized constructor
	}

}
