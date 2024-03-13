package com.Task5_JavaAdvance;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Prompt the user to enter their birthdate
		System.out.print("\nEnter your birthdate (yyyy-mm-dd): ");
		String birthdateInput= sc.nextLine();
		
		//Parse the user input as a LocalDate object
		LocalDate birthDate=LocalDate.parse(birthdateInput);
		
		//Calculate the age using Period.between() method
		Period agePeriod=Period.between(birthDate, LocalDate.now());
		
		//Display the calculated age to the user
		System.out.println("\nYour age is:"+agePeriod.getYears()+" Years, "
		+agePeriod.getMonths()+" months, and "+agePeriod.getDays()+" days.");

		sc.close();

	}

}

/*OUTPUT for AgeCalculatorApp 
 * 
 * 
Enter your birthdate (yyyy-mm-dd): 1990-05-15       **INPUT**

Your age is:33 Years, 9 months, and 27 days.		**OUTPUT**

 * 
 * 
 * */

