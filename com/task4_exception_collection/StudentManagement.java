package com.task4_exception_collection;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Welcome to the Student Management System.....!");
		 for (int studentCount = 1; studentCount <= 2; studentCount++) {
		
		 System.out.print("\nEnter the Rollno for Student " + studentCount + ":");
		 int rollno=sc.nextInt();
		
		 System.out.print("Enter the Name for Student " + studentCount + ":");
		 String StuName=sc.next();
		 sc.nextLine();
		
		 System.out.print("Enter the age for Student " + studentCount + ":");
		 int age=sc.nextInt();
		 sc.nextLine();
		
		 System.out.print("Enter the Course for Student " + studentCount + ":");
		 String course=sc.nextLine();
		
		
		
		 Student stdObj=new Student(rollno, StuName, age, course);  //Intializing Object Via Parameterized Constructor
		
		
		//For NameNotValidException try, catch
		 try {																
			stdObj.namenot();
			
		 }catch(NameNotValidException e) {
			System.out.println("\nName Error for Student " + studentCount + ": " + e.getMessage());
		}
		
		//For AgeNotWithinRangeException
		 try {
			stdObj.agenot();
			
			
		 }catch(AgeNotWithinRangeException e ) {
			System.out.println("\nAge Error for Student " + studentCount + ": " + e.getMessage());
			
		}
		
		}
		
		sc.close();
		
		
	}

}


/*OUTPUT
 * 
 * Welcome to the Student Management System.....!

Enter the Rollno for Student 1:1023					***INPUT****
Enter the Name for Student 1:Dayalan
Enter the age for Student 1:23
Enter the Course for Student 1:BA English

Your name is valid...!								**OUTPUT FOR ENTERED CORRECT DETAILS**

You're eligible for this course                     **OUTPUT FOR ENTERED CORRECT DETAILS**




Enter the Rollno for Student 2:5689                     ***INPUT***
Enter the Name for Student 2:Anu;'
Enter the age for Student 2:19
Enter the Course for Student 2:BDS

Name Error for Student 2: 								
NameNotValidException found: Name contains special symbols or numbers.  **OUTPUT FOR ENTERED INCORRECT DETAILS**

Age Error for Student 2: 
AgeNotWithinRangeException found: Age is not suitable for this course.  **OUTPUT FOR ENTERED INCORRECT DETAILS**


 */











