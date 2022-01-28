package corejava;

/**
 * Practical 7:- Write a program to demonstrate the example of constructor and Parameterized constructor.
 * @author Ravi Dudhat 
 * @version 1.01 2022-01-20
 */
public class Constructor {

	int number; 
	int value1; 
	int value2; 

	public Constructor() {
		number = 1000;
	}

	public Constructor(int x, int y) { 
		value1 = x;
		value2 = y;
	}

	public static void main(String[] args) {
		Constructor consrtuctor1 = new Constructor(); // Create an object of class 
		System.out.println("Value of a is:- "+ consrtuctor1.number);

		Constructor consrtuctor2 = new Constructor(100, 20);
		System.out.println("Multiplication is:- "+ consrtuctor2.value1 * consrtuctor2.value2);
	}

}
