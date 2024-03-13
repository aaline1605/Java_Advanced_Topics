package com.Task1_Branching_Looping;
import java.util.Scanner;

// USING NESTED FOR-LOOP FOR QUESTION6


public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the rows:");
		int k=sc.nextInt();
		
		// Nested loop for printing the pattern based on user input
		for(int i=k;i>=1;i--) { //Outer Loop
			
			for(int j=k;j>=1;j--) {  //Inner Loop
				
				if(j >=i) {                            // Checking if j is greater than or equal to i
					System.out.print(j+" ");
				}else {								   // Printing the value of i followed by a space
					System.out.print(i+" ");
				}
			}
			System.out.println();                      // Moving to the next line after printing each row
		}
		sc.close();                                    // Closing the Scanner to avoid resource leakage
		

	}

}
