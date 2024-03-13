package com.task4_exception_collection;

import java.util.EmptyStackException;

public class StackData {
	
	private int maxSize;           // Maximum size of the stack
	private int top;               // Top index of the stack
	private int[]stackArray;       // Array to store stack elements
	
	// Constructor to initialize the stack with a given size
	public StackData(int size) {
		maxSize=size;
		stackArray=new int[maxSize];
		top=-1;          // Initialize top as -1 to indicate an empty stack
	}
	
	// Method to push an element onto the stack
	public void push(int element) {
		if(top<maxSize-1) {
			stackArray[++top]=element;
			System.out.println("Pushed:"+element);
		}else {
			System.out.println("Stack overflow. Cannot push element onto the stack.");
		}
	}
	
	// Method to pop an element from the stack
	public int pop() {
		if(!isEmpty()) {
			int elementPopped=stackArray[top--];
			System.out.println("Popped:"+elementPopped);
			return elementPopped;
			
		}else {
			throw new EmptyStackException();
		}
	}
	// Method to check if the stack is empty
	public boolean isEmpty() {
		return top == -1;
		
	}
	
	
	

}
