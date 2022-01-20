package core_JAVA;

/**
 * Practicle 6 :- Write a prgram to demonstrate the example of break/continue Statement. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-20
 */
public class Break_continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Using Break..");
		for(int i = 1; i <= 10; i++) { // For loop for print 1 to 10 number
			if(i == 6) { // if condition for skip the number 
				break;
			}	
			System.out.print(i);
			System.out.print(" ");
		}
		
		System.out.println("\nUsing Continue");
		for(int i = 1; i <= 10; i++) { // For loop for print 1 to 10 number
			if(i == 8) { // if condition for continue the next number 
				continue;
			}	
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
