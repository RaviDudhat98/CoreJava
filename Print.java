package core_JAVA;

/**
 * Practical 4:- Write a program to demonstrate the use of while looop and do while loop.
 * @author Perfect
 * @version 1.01 2022-01-20
 */
public class Print {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using While loop..");
		int i = 1; // initialization of i
		while ( i <= 10 ) { // Condition for print 1 to 10 no using while loop
			System.out.print(i); // Print no
			System.out.print(" ");
			i++; // Incerement value of i
		}
		
		System.out.println("\nsUsing do While loop..");
		int a = 1; // initialization of a
		do { // Do while loop
			System.out.print(a); // Print no
			System.out.print(" ");
			a++; // Increment value of a
		} while ( a <= 10 ); // Condition for print 1 to 10 no using do while loop
	}

}
