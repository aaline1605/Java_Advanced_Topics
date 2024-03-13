package com.Task1_Branching_Looping;
import java.util.Scanner;

//	USING WHILE-LOOP FOR QUESTION3 


public class Question3 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("Enter the number from given Question:");
		int num=sc.nextInt(); //Input is 876
		
		int Fliping=0;                                    // Initialization
		
		while(num !=0) {	                             // Using a palindrome technique for flipping the number using a While-Loop.
			
			int sum=num%10;                                
			
			Fliping=Fliping*10+sum;                    
			
			num/=10;		                               
			
		}
		System.out.print("The Given reversed number is:"+Fliping);
		
		sc.close();                                         // Close the Scanner to avoid resource leaks
	}
	

}
