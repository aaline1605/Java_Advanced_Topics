package com.task4_exception_collection;


@SuppressWarnings("serial")
public class AgeNotWithinRangeException extends Exception {
	
	//Constructor to display a message
	public AgeNotWithinRangeException(String message) {
		super(message);
		
	}

}
