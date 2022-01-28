package corejava;

/**
 * Practical:- 12 Write a program to demonstrate static methods, variables and blocks.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-24
 */
public class StaticDemo {

	int number; 
	static String name = "Raj Patel";

	public StaticDemo(int number1) {
		number = number1;
	}

	static void showName() {
		name = "Raj Shah";
	}

	public void display() {
		System.out.println("Number of student:- "+ number);
		System.out.println("Name of student:- "+ name);
	}

	static { // Static block 
		System.out.println("Static block is invoked....");
	}

	public static void main(String[] args) {
		showName();
		StaticDemo staticDemo = new StaticDemo(10);
		staticDemo.display();
	}

}
