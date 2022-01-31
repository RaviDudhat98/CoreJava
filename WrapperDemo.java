package corejava;

/**
 * pracical8 9:- Write a Program to compare two variables of the wrapper class. 
 * @author Ravi Dudhat
 * @version 1.01 2022-01-21
 */
public class WrapperDemo {

	public static void main(String[] args) {
		Integer integer = 200;
		Character character = 'A';
		Float floatNo = 100.20f;

		Double double1 = new Double (25.2);
		Double double2 = new Double (20.2);

		System.out.println("---Wrapper class---");
		System.out.println("Comparision using compare to method :- "+ double1.compareTo(double2)); // Compare to method
		System.out.println("Comparision using equals method:- "+ double1.equals(double2)); // Equals method

		System.out.println("\nGet the value of Integer class:- " + integer.intValue());
		System.out.println("Get the value of Character class:- " + character.charValue());
		System.out.println("Get the value of Float class:- " + floatNo.floatValue());

		String string = integer.toString();
		System.out.println("Length of String:- " + string.length());
	}

}
