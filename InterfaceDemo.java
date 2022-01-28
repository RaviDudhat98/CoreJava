package oopsconcepts;

/**
 * Practical:- 17 Write a program to demonstrate the interface.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-26
 */
interface VehicleDemo {

	// Abstract methods.
	void changeGear(int gear);
	void currentSpeed(int speed);

}

class Bicycle implements VehicleDemo { // Implemente interface 

	int speed;
	int gear;
	int newSpeed;

	public void changeGear(int newGear) { // Implement abstract mehod of interface
		gear = newGear;
	}

	public void currentSpeed(int speed) { // Implemenet abstract mehod of interface
		this.speed = speed;
	}

	public void speedUp() {
		int increment = 10;
		newSpeed = speed + increment;
	}

	public void currentStates() {
		System.out.println("Gear is:- " + gear);
		System.out.println("Current speed is:- " + speed);
	}

	public void newStates() {
		System.out.println("New Speed is:- " + newSpeed);
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(); // Create an object of bicycle
		bicycle.changeGear(5);
		bicycle.currentSpeed(20);
		bicycle.speedUp();

		System.out.println("-----Interface-----\n");
		System.out.println("Bicycle current state:- ");
		bicycle.currentStates();

		System.out.println("\nBicycle new state:- ");
		bicycle.newStates();
	}

}
