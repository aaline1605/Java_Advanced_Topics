package com.Task1_Branching_Looping;
import java.util.Scanner;

// USING IF-ELSE FOR QUESTION5


public class Question5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your Purchase amount:");
		double Purchase_amount=sc.nextDouble();
		
		double Discount=0;
		
		
		if(Purchase_amount < 500) {
			System.out.println("\nSorry,your purchase amount is less than 500, Discount is not applied.");
			System.out.println("\nYou have to pay full bill amount:Rs."+Purchase_amount);
			
			
		}else if(Purchase_amount<=1000) {       // Calculating a 10% discount if the purchase amount is less than or equal to 1000
			Discount=Purchase_amount * 0.1;     // 10% Discount
			double payable_amount=Purchase_amount-Discount;
			
			System.out.println("\nCongrats,Discount applied 10%:Rs."+Discount);
			System.out.println("\nTotal payable amount:Rs."+payable_amount);
			
	    
	    }else if (Purchase_amount>1000) {         // Calculating a 20% discount if the purchase amount is greater than 1000
		Discount=Purchase_amount * 0.2;           // 20% Discount
		
        double payable_amount=Purchase_amount-Discount;
		
		System.out.println("\nCongrats,Discount applied 20%:Rs."+Discount);
		System.out.println("\nTotal payable amount:Rs."+payable_amount);
		
	  }
		
   sc.close();                    // Closing the Scanner object to prevent resource leaks
			

}}
