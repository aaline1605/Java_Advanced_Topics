package com.Task1_Branching_Looping;
import java.util.Scanner;

// USING IF-Else for Question2


public class Question2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number:");
		int Num=sc.nextInt();			 					// Read the input from the user
		
		
		// Check if the number is positive, negative, or zero using if-else
		if(Num>0) {
			
			System.out.println("\nThe given number is Positive and that number is:"+Num);
			
		}else if(Num<0) {
			
			System.out.println("\nThe given number is Negative and that number is:"+Num);
			
		}else {
			
			System.out.println("\nThe Given number is Zero or neutral.");
		}
		
		sc.close();												// Close the Scanner to avoid resource leaks
		
		
	}

}
