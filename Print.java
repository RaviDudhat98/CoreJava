package corejava;

/**
 * Practical 4:- Write a program to demonstrate the use of while loop and do while loop.
 * @author Perfect
 * @version 1.01 2022-01-20
 */
public class Print {

	public static void main(String[] args) {
		System.out.println("Using While loop..");
		int i = 1;

		while (i <= 10) {
			System.out.print(i);
			System.out.print(" ");
			i++;
		}

		System.out.println("\nUsing do While loop..");
		int a = 100;

		do {
			System.out.print(a);
			System.out.print(" ");
			a++;
		} while (a <= 110);
	}

}
