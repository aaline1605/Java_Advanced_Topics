package com.Task1_Branching_Looping;
import java.util.Scanner;  

//	USING FOR_Loop for Question1


public class Question1 {
public static void main(String[]args) {
		
		 Scanner sc=new Scanner(System.in);  			//Creating Scanner object for User input
		
		 int num,i;                          			//Declaration of Integer Variables
		
		 System.out.print("Enter your For_loop input:");
		
		 num=sc.nextInt();                  			// Reading the user input and storing it in the variable 'num'
		
				   
		
		
		 System.out.println("\nThe output from user input is:");
		 for(i=10;i<=num;i++) {              			// For loop to iterate from 10 to the user input 'num'
			
		 System.out.print(i+" ");
		 
		 sc.close();                        			// Close the Scanner to avoid resource leaks
		}
	
}

}
