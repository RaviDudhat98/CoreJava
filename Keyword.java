package basicjava;

/**
 * Practical 11 :- Write a program to use of this keyword.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */

public class Keyword {

	int no;
	String name;
	
	public Keyword(int stdNo, String stdName) { // Parameterized constructor
		this.no = stdNo; 
		this.name = stdName;
	}

	public void show() { // Show method
		System.out.println("Roll no of student:- "+ no);
		System.out.println("Name no of student:- "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of class 
		Keyword keyOb = new Keyword(100, "Shivam shah"); 
		keyOb.show(); // Show method calling
	}

}
