package oopsconcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Practical:- 24 Write a program to create a text file(The file name is “myTestFile”) and add your personal details to the test file.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-27
 */
public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fileWrite = null;

		try {
			System.out.println("-----File Handling-----\n");
			File file = new File("E:\\BE\\8th Sem Intenship\\File.txt");
			boolean result = file.createNewFile(); // Create a new file 

			if(result) {
				System.out.println("File is created.......\n" + file.getName()); // Return the name of file
			} else {
				System.out.println("File already exists at location:- \n" + file.getCanonicalPath()); // Return the path of file
			}

			fileWrite = new FileWriter(file);// Create an object for write data
			fileWrite.write("Enrollnment:- 190163107010\n");
			fileWrite.write("Name:- Ravi Dudhat\n");
			fileWrite.write("Branch:- Computer Engineering\n");
			fileWrite.write("Collage:- Government Engineering Collage, Modasa\n");
			
			System.out.println("\nWrote in file successfully....");
		} catch (IOException exception) {
			System.out.println("Exception occure:-\n" + exception);
		} finally {
			fileWrite.close();
		}
	}

}
