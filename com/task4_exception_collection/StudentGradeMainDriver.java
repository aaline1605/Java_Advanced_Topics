package com.task4_exception_collection;

import java.util.Scanner;

public class StudentGradeMainDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentGrades studentGrades=new StudentGrades();
		
		// Display menu options to the user
		while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a new student(+)");
            System.out.println("2. Remove a student(-)");
            System.out.println("3. Display a student's grade(!)");
            System.out.println("4. Exit(*)");
            
            System.out.print("\nPlease enter your Choice:");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                	// Add a new student
                    System.out.print("Enter student name: ");
                    String addName = sc.nextLine();
                    System.out.print("Enter student grade: ");
                    int addGrade = sc.nextInt();
                    studentGrades.addStudent(addName, addGrade);
                    break;
                case 2:
                	// Remove a student
                    System.out.print("Enter student name to remove: ");
                    String removeName = sc.nextLine();
                    studentGrades.removeStudent(removeName);
                    break;
                case 3:
                	// Display a student's grade
                    System.out.print("Enter student name to display grade: ");
                    String displayName = sc.nextLine();
                    studentGrades.displayGrade(displayName);
                    break;
                case 4:
                	// Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    
                    sc.close(); //To avoid resource leaks
                    
                    System.exit(0);
                default:
                	 // Invalid choice
                    System.out.println("Invalid choice. Please choose again.");
            }
	
		}
	
	}

}

/* OUTPUTS
 
Choose an option:				                        **INPUTS**
1. Add a new student(+)
2. Remove a student(-)
3. Display a student's grade(!)
4. Exit(*)

Please enter your Choice:1                              **INPUTS**
Enter student name: Paresh
Enter student grade: 1
Student Paresh added with grade:1                       ***OUTPUT 1***

Choose an option:										 **INPUTS**
1. Add a new student(+)
2. Remove a student(-)
3. Display a student's grade(!)
4. Exit(*)

Please enter your Choice:1								  **INPUTS**
Enter student name: Goshwami
Enter student grade: 2
Student Goshwami added with grade:2                      ***OUTPUT 2***

Choose an option: 										  **INPUTS**
1. Add a new student(+)
2. Remove a student(-)
3. Display a student's grade(!)
4. Exit(*)

Please enter your Choice:1								   **INPUTS**
Enter student name: Jenasily
Enter student grade: 3
Student Jenasily added with grade:3                        ***OUTPUT 3***

Choose an option:											**INPUTS**
1. Add a new student(+)
2. Remove a student(-)
3. Display a student's grade(!)
4. Exit(*)

Please enter your Choice:2 									**INPUTS**
Enter student name to remove: Jenasily
Student Jenasily is removed Sucessfully....!               ***OUTPUT 4***

Choose an option:											 **INPUTS**
1. Add a new student(+)
2. Remove a student(-)
3. Display a student's grade(!)
4. Exit(*)

Please enter your Choice:3									 **INPUTS**
Enter student name to display grade: Paresh
Grade of student Paresh: 1                                  ***OUTPUT 5***

Choose an option:											 **INPUTS**
1. Add a new student(+)
2. Remove a student(-)
3. Display a student's grade(!)
4. Exit(*)

Please enter your Choice:3									  **INPUTS**
Enter student name to display grade: Goshwami
Grade of student Goshwami: 2                                 ***OUTPUT 6***

Choose an option:											   **INPUTS**
1. Add a new student(+)
2. Remove a student(-)
3. Display a student's grade(!)
4. Exit(*)

Please enter your Choice:4										**INPUTS**
Exiting program. Goodbye!                                     ***OUTPUT 7***

 * 
 * */
