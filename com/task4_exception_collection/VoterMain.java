package com.task4_exception_collection;

import java.util.Scanner;

public class VoterMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in );
		
		System.out.println("Enter the Voters Details....!");
		
		//Storing Two Members
		for(int i=1;i<=2;i++) {
			System.out.print("\nEnter the person "+(i)+" voterId:");
			int voId=sc.nextInt();
			
			System.out.print("\nEnter the person "+(i)+" voter Name:");
			String name=sc.nextLine();
			sc.nextLine();
			
			System.out.print("\nEnter the person "+(i)+" age:");
			int age=sc.nextInt();
			
			//Stored data from user Input
			Voter vd=new Voter(voId, name, age);
			
			try {
				// Calling the ageCheck method to validate if the voter's age is 18 or above
				Voter.ageCheck(vd.getAge());  
				
			}catch(IllegalArgumentException e) {
				System.out.println(e);
				
			}
				
			
		}
		sc.close();  //To avoid resource Leaks
		
     }

}

/*OUTPUTS

Enter the Voters Details....!                                 				**INPUTS**

Enter the person 1 voterId:879561

Enter the person 1 voter Name:Guruvala Gupta

Enter the person 1 age:21 *(Mentioned Age)

Eligible for Voting.... :)											     ***OUTPUT FOR PERSON 1***

Enter the person 2 voterId:456978                                             **INPUTS**

Enter the person 2 voter Name:Palmoshi

Enter the person 2 age:16 *(Mentioned Age)
java.lang.IllegalArgumentException: invalid age for voter.... (:          ***OUTPUT FOR PERSON 2***


*/

