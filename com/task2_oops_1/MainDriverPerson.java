package com.task2_oops_1;

import java.util.Scanner;


//Question 1.4


class Persons { 
	
	String name;
	int age;
	
	public Persons(String name, int age) {  // Parameterized constructor for the Persons class
		
		this.name = name;
		this.age = age;
	}

	
	
}
	
class Employee extends Persons{ // Definition of subclass Employee, inherits from Persons
	
   int employeeId;
   int salary;
   

// Constructor for the Employee class 
public  Employee(String name,int age,int employeeId,int salary){
	   
	   super(name,age);        // Call the default constructor of the superclass (Persons)
	   
	   this.employeeId=employeeId;
	   this.salary=salary;
}
   
}

//Main driver class
public class MainDriverPerson{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter your name:");
		String name=sc.nextLine();
		
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		
		System.out.print("Enter your employeeId:");
		int empId=sc.nextInt();
		
		System.out.print("Enter your Salary:");
		int sal=sc.nextInt();
		
		Employee ec=new Employee(name,age,empId,sal); // Create Employee object with user-input values
		
		
		System.out.println("\nConfirm your employee Details:");
		System.out.println("Name:"+ec.name+"\nAge:"+ec.age+"\nemployeeId:"+ec.employeeId+
				            "\nMonthly Salary:"+ec.salary);
				
		sc.close();
	
	}

}
