package com.Task5_JavaAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GiftForStudents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// Create a List to store the names of students
		List<String> nameOfStudents=new ArrayList<String>();
		
		System.out.println("\nEnter the name of Ten Students....!");
		
		// Input names for ten students and add them to the list
		for(int i=0;i<10;i++) {
			System.out.print("Student "+ (i+1)+":");
			String name=sc.nextLine();
			nameOfStudents.add(name);
		}
		// Use Stream API and lambda expression to filter students whose names start with 'A'
		List<String> specialGiftStudents= nameOfStudents.stream()
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());
		
		// Display the original list of students
		System.out.println("\nList of students from user input...!");
		System.out.println("\n"+nameOfStudents);
		
		// Display students eligible for special gifts (names starting with 'A')
		System.out.println("\n\nStudents eligible for special gifts (names starting with 'A'):");
		
		// Use forEach method to iterate over each name in the specialGiftStudents list and print it
		specialGiftStudents.forEach(System.out::println);
		
		sc.close(); // Close the Scanner
		
	}

}

/*OUTPUTS for GiftForStudents
 * 
 *													**INPUTS**
Enter the name of Ten Students....!
Student 1:Aditya Sharma
Student 2:Alisha Gupta
Student 3:Neha Chauhan
Student 4:Pooja Verma
Student 5:Amirta Joshi
Student 6:Rohan Kapoor
Student 7:Anjali Choudhary
Student 8:Vikrant kumar
Student 9:Akash verma
Student 10:Ankit Singh


												     **OUTPUTS**
List of students from user input...!

[Aditya Sharma, Alisha Gupta, Neha Chauhan, Pooja Verma, Amirta Joshi, Rohan Kapoor, Anjali Choudhary, Vikrant kumar, Akash verma, Ankit Singh]


Students eligible for special gifts (names starting with 'A'):
Aditya Sharma
Alisha Gupta
Amirta Joshi
Anjali Choudhary
Akash verma
Ankit Singh

* 
* 
* */
