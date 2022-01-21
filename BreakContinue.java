package basicjava;

/**
 Practicle 6 :- Write a prgram to demonstrate the example of break/continue Statement. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-20
 */
public class BreakContinue {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Using break....");
		
		for (int i = 51; i <= 53; i++) { // For loop for print 51 to 53 no 
			for (int j = 1; j <= 5; j++) { // For loop for print 1 to 10 no 
				if (j == 5) { // If condition for break the loop 
					break;
				}	
				System.out.print(j);
				System.out.print(" ");
			}	
			System.out.println(i);
		}		
		
		System.out.println("\nUsing continue....");
		
		for (int a = 91; a <= 93; a++) { // For loop for print 91 to 93 no 
			for (int b = 1; b <= 5; b++) { // For loop for print 1 to 10 number 
				if (b == 3) { // If condition for skip the no
					continue;
				}
				System.out.print(b);
				System.out.print(" ");
			}	
			System.out.println(a);
		}
	}

}
