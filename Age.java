package coreJAVA;

/**
 * Practical 2 :- Write a program to demonstrate the use of if/else statements. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-20
 */

public class Age {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int Age = 73;  
		
		if (Age < 18) { // Condition for candidate is child 
			System.out.println("Candidate is child......");
		} else if (Age > 18 && Age < 55) { // Condition for candidate is adult 
			System.out.println("Candidate is adult......");
		} else { // Condition for candidate is old age 
			System.out.println("Candidate is old Age......");
		}
	}
	
}
