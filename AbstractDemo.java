package oopsconcepts;

/**
 * Practical:- 13 Write a program to demonstrate data abstraction.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-24
 */
abstract class Shape {

	abstract void show();

}

public class AbstractDemo extends Shape {

	float width;
	float height;

	public AbstractDemo(float width, float height) { // Parameterized constructor
		this.width = width;
		this.height = height;
	}

	public void show() {
		System.out.println("Show mehod of AbstractDemo class");
	}

	public void areaOfRectangle() { 
		float area = width * height;
		System.out.println("Area of rectangle:- "+ area);
	}

	public static void main(String[] args) {
		AbstractDemo abstractObject = new AbstractDemo(60, 12);
		abstractObject.areaOfRectangle();
		abstractObject.show();
	}

}