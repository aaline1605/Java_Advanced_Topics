package com.task4_exception_collection;

import java.util.Scanner;

public class WeekDays {
	
	    public static void main(String[] args) {
	    
	    // Array to store names of weekdays
		String[] weekDay= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

		Scanner sc=new Scanner(System.in);
		
		// Loop for two users
		for(int user=1;user<=2;user++) {
			System.out.print("\n\nUser "+user+": Enter the day position (0-6):");
			
			try {
				int dayIndex=sc.nextInt();
				
				// Check if the dayIndex is within the valid range
				if(dayIndex>=0 && dayIndex<=6) {
					// Retrieve the name of the day at the specified position
					String nameOfDay=weekDay[dayIndex];
					System.out.print("\nDay at position "+dayIndex+" is:"+nameOfDay);
				}else {
					 // Throw an exception for invalid dayIndex
					throw new ArrayIndexOutOfBoundsException("Enter the days 0-6 only...!");
					
				}
				// Handle ArrayIndexOutOfBoundsException and print an error message
			    }catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			         }
				
			}
		        
		     sc.close();
		}

}

/*OUTPUTS

User 1: Enter the day position (0-6):5                                                     **INPUTS**

Day at position 5 is:Friday									                          ***OUTPUT for User 1***


User 2: Enter the day position (0-6):10                                                    **INPUTS**
java.lang.ArrayIndexOutOfBoundsException: Enter the days 0-6 only...!                  ***OUTPUT for User 2***

 * 
 */
