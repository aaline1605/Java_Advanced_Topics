package com.task2_oops_1;

import java.util.Scanner;



//Question_1.1

public class Person {
	

	String name;             // Instance Variable
	static int age=18;       // Static variable
	
	
	//Constructor
	public Person(String name) {
	this.name = name;
	}
	
	// Method to display name and age of person
	public void display() {              
		System.out.println("Name:"+this.name);
		System.out.println("Age:"+Person.age);
		
		
	}
	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter your name:");
		String name=sc.nextLine();     
        

       
    
		Person ps=new Person(name);     // Create a Person object with the provided User name
		
		
		
		// Display the name and default age
		ps.display(); 
		
		sc.close(); // Close the Scanner to prevent resource leaks
		
		
		
		
		
		
	}

}
