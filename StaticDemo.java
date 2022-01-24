package corejava;

/**
 * Practical:- 12 Write a program to demonstrate static methods, variables and blocks.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-24
 */
public class StaticDemo {

	int number; 
	static String name = "Raj Patel"; // Static variable

	public StaticDemo(int number1) { // Constructor to initialize variable 
		number = number1;
	}

	static void show() { // Static method for change the value of static variable 
		name = "Raj Shah";
	}
	public void display() { // Method for display values 
		System.out.println("Number of student:- "+ number);
		System.out.println("Name of student:- "+ name);
	}

	static { // Static block 
		System.out.println("Static block is invoked....");
	}

	public static void main(String[] args) {
		StaticDemo.show(); // Calling static block  
		StaticDemo staticDemo = new StaticDemo(10); // Create an object of class 
		staticDemo.display();
	}

}
