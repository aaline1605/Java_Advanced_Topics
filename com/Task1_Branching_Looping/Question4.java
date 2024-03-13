package com.Task1_Branching_Looping;
import java.util.Scanner;

// USING NESTED TERNARY FOR Question4


public class Question4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,num3,Leastnumber; // Initializing variables
		
		
		System.out.print("(1)Enter your First number:");
		num1=sc.nextInt();
		System.out.print("(2)Enter your Second number:");
		num2=sc.nextInt();
		System.out.print("(3)Enter your Third number:");
		num3=sc.nextInt();
		
		Leastnumber=num3<(num1<num2 ? num1:num2) ?num3: ((num1<num2)? num1:num2); //Nested Ternary operator
		
		System.out.println("\nThe Least number from user:"+Leastnumber);
		
		sc.close();       //Close the Scanner to avoid resource leaks
		
		
		
		
		
		
		
		
	}

}
