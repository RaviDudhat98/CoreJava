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
		
		while ( i <= 10 ) { // Condition for print 1 to 10 no using while loop 
			System.out.print(i);  
			System.out.print(" ");
			i++; // Incerement value of i 
		}
		
		System.out.println("\nUsing do While loop..");
		int a = 1; 
		
		do { // Do while loop 
			System.out.print(a); 
			System.out.print(" ");
			a++; // Increment value of a 
		} while ( a <= 10 ); // Condition for print 1 to 10 no using do while loop 
	}

}
