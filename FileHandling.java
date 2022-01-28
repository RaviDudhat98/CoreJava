package oopsconcepts;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Practical:- 25 Write a program to read the data from a myTestFile file (Using File handling, Input Handling, Loops, String Handling, and Exception Handling).
 * @author Ravi Dudhat
 * @version 1.01 2022-01-28
 */
public class FileHandling {

	public static void main(String[] args) throws IOException {
		Scanner scanner = null;
		FileReader fileRead = null;
		FileWriter out = null;

		File file1 = new File("E:\\BE\\8th Sem Intenship\\FileDemo.txt");
		File file2 = new File("E:\\BE\\8th Sem Intenship\\newTestFile.txt");
		File file3 = new File("E:\\BE\\8th Sem Intenship\\File.txt");

		try {
			scanner = new Scanner(System.in); // Take input from the user 
			fileRead = new FileReader(file1);

			out = (new FileWriter(file2));
			System.out.println("For file information check file...\n");

			int character;
			while ((character = fileRead.read()) != -1) {
				character = Character.toUpperCase(character);
				out.write(character);
			}

		} catch (IOException exception) {
			System.out.println("Exception occurred" + exception);
		} finally {
			out.close();
			fileRead.close();
		}

		System.out.println("\nYou want to delete your file?\n");
		System.out.println("Enter your choice (Yes / No):- ");
		String choice = scanner.next();

		if ("Yes".equals(choice)) {
			if(file3.delete()) { // Condition for delete file
				System.out.println(file2.getName() + " is deleted..");
			} else {
				System.out.println("File deletion failed...");
			}
		}

		scanner.close();
	}

}
