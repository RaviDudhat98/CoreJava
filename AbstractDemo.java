package oopsconcepts;

/**
 * Practical:- 13 Write a program to demonstrate data abstraction.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-24
 */
abstract class Shape { // Abstract class 

	abstract void show(); // Abstract method 

}

public class AbstractDemo extends Shape { // parent class extend child class 

	float width;
	float height;
	
	public AbstractDemo(float w, float h) { // Parameterized constructor
		this.width = w;
		this.height = h;
	}

	public void show() { // Method for show message 
		System.out.println("Show mehod of AbstractDemo class");
	}
	public void areaOfRectangle() { // Method for area of rectangle
		float area = width * height; // Formula of area of rectangle 
		System.out.println("Area of rectangle:- "+ area);
	}

	public static void main(String[] args) {
		AbstractDemo abstractObject = new AbstractDemo(60, 12); // Object of "AbstractDemo" class 
		abstractObject.areaOfRectangle(); // Calling "areaOfRectangle" method
		abstractObject.show(); // Calling show method
	}

}
