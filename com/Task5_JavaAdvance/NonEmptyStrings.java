package com.Task5_JavaAdvance;

import java.util.Arrays;
import java.util.List;


public class NonEmptyStrings {

	public static void main(String[] args) {
	  
	  // Given list of strings
      List<String> listStrings=Arrays.asList("abc","","bc","efg","abcd","","jkl");
      
      // Get the list with non-empty strings	   
      List<String> nonEmptyStringsList=getNonEmptyStringsList(listStrings);
		   System.out.println("\nList with non-Empty Strings:"+nonEmptyStringsList );
		
   }
	  // Method to filter non-empty strings from the input list
	  private static List<String> getNonEmptyStringsList(List<String>inputList){
		        return inputList.stream()
			           .filter(Str -> !Str.isEmpty())
			           .toList();
	}
}


/*OUTPUT FOR QUESTION 2 LIST WITH NON-EMPTY STRINGS
 *  
 List with non-Empty Strings:[abc, bc, efg, abcd, jkl]
 *
*/ 