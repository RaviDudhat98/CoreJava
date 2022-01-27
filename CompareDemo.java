package oopsconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Practical:- 23 Write a program to demonstrate comparable and comparator interface.
 * @author Ravi Dudhat
 * @version 1.01 2022-01-27
 */
class Person implements Comparable<Person> {

	int number;
	String name;

	public Person (int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int compareTo(Person person) {
		return (this.name).compareTo(person.name);
	}

	public String showPersonInfo() {
		return this.number + "\t " + this.name;
	}

}

public class CompareDemo implements Comparator<CompareDemo> {

	String department;
	int number;

	public CompareDemo(String department, int number) {
		this.department = department;
		this.number = number;
	}

	public CompareDemo() {
	}

	public int compare(CompareDemo compare1, CompareDemo compare2) {
		return compare1.department.compareTo(compare2.department);
	}

	public String showDepartment() {
		return this.department;
	}

	public int showNumber() {
		return this.number;
	}
	
	public static void main(String[] args) {
		// Create an object of the list for comparable
		List<Person> list = new ArrayList<Person>();
		// Add element in list
		list.add(new Person(1, "Rahul"));
		list.add(new Person(4, "Abhinav"));
		list.add(new Person(2, "Kabir"));
		list.add(new Person(5, "Jeet"));
		list.add(new Person(3, "Chintan"));

		System.out.println("------Using Comparable------\n");
		System.out.println("Sorted list by name:-");
		Collections.sort(list); // Sorting elements
		System.out.println("Number.	Department");

		for (Person personObj : list) {
			System.out.println(personObj.showPersonInfo());
		}

		// Create an object of the list for comparator
		List<CompareDemo> listDepartment = new ArrayList<CompareDemo>();
		// Add element in list
		listDepartment.add(new CompareDemo("Computer", 8));
		listDepartment.add(new CompareDemo("Mechanical", 9));
		listDepartment.add(new CompareDemo("Electrical", 4));

		System.out.println("\n------Using Comparator------\n");
		System.out.println("Sorted list by department name:-");
		Collections.sort(listDepartment, new CompareDemo()); // Sorting elements
		System.out.println("Department.	Number");

		for (CompareDemo compareObj : listDepartment) {
			System.out.println(compareObj.showDepartment() + "\t" + compareObj.showNumber());
		}
	}

}
