package basicjava;

/**
 Practicle 6 :- Write a prgram to demonstrate the example of break/continue Statement. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-20
 */
public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("Using break....");
		
		for (int i = 51; i <= 53; i++) { 
			for (int j = 1; j <= 5; j++) {
				if (j == 5) { 
					break;
				}	
				System.out.print(j);
				System.out.print(" ");
			}	
			System.out.println(i);
		}		

		System.out.println("\nUsing continue....");

		for (int a = 91; a <= 93; a++) { 
			for (int b = 1; b <= 5; b++) { 
				if (b == 3) { 
					continue;
				}
				System.out.print(b);
				System.out.print(" ");
			}	
			System.out.println(a);
		}
	}

}
