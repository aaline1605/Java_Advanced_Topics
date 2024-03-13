package com.Task5_JavaAdvance;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// Prompting the user to enter the list of strings
		System.out.print("""
				
				Enter the List of Strings that provided
				in your Question......!
				 
				(Note:Make sure enter space after each String!):
				""");
		String userInput=sc.nextLine();
		
		// Splitting the input into an array of strings
		String[] inputofStrings=userInput.split("\\s+");
		
		// Creating a stream from the array
		Stream<String> names= Stream.of(inputofStrings);
		
		// Converting the list of strings to uppercase using map() and collecting to a new list
		List<String> namesOfuppercaseList=names
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		// Displaying the list of strings from userInput
		System.out.print("\nOrginal List is: "+Stream.of(inputofStrings).collect(Collectors.toList()));
		
		// Displaying the list of strings in uppercase
		System.out.print("\n\n\nUPPERCASELIST from orginalList is:"+namesOfuppercaseList);
		
		sc.close();
		

	}

}



/* OUTPUT for UPPERCASE Using MAP()
 
Enter the List of Strings that provided
in your Question......!

(Note:Make sure enter space after each String!):
aBc d ef                                               **INPUT from User**

Orginal List is: [aBc, d, ef]                          **Orginal list from UserInput**


UPPERCASELIST from orginalList is:[ABC, D, EF]         ***OUTPUT***
 *  
 */
