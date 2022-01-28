package corejava;

/**
 * Practical 11:- Write a program to use of this keyword.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */
public class Keyword {

	int number;
	String name;

	public Keyword(int number, String name) { // Parameterized constructor
		this.number = number; 
		this.name = name;
	}

	public void show() { // Show method
		System.out.println("Roll no of student:- "+ number);
		System.out.println("Name no of student:- "+ name);
	}

	public static void main(String[] args) {
		// Create an object of class 
		Keyword keywordObject = new Keyword(100, "Shivam Shah"); 
		keywordObject.show();
	}

}
