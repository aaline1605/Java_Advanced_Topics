package com.task4_exception_collection;

import java.util.EmptyStackException;
import java.util.Scanner;

public class StackDataMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the IntegerStack Capacity:");
		int stack=sc.nextInt();
		
		// Create an instance of the StackData class with the specified stack capacity
		StackData stacks=new StackData(stack);
		
		while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push(+)");
            System.out.println("2. Pop(-)");
            System.out.println("3. Check if stack is empty(?)");
            System.out.println("4. Exit(*)");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push onto the stack: ");
                    int elementToPush = sc.nextInt();
                    stacks.push(elementToPush);  // Call the push method of the StackData class
                    
                    break;
                case 2:
                    try {
                        stacks.pop();   // Call the pop method of the StackData class
                    } catch (EmptyStackException e) {
                        System.out.println("Stack underflow. Cannot pop from an empty stack.");
                    }
                    break;
                case 3:
                    System.out.println("Is stack empty? " + stacks.isEmpty());  // Check if the stack is empty
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    
                    sc.close();   //To Avoid Resource leaks
                    
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
		
		}
	}

}


/*OUTPUTS
 * 
 * Enter the IntegerStack Capacity:5           **INPUT**

Choose an operation:
1. Push(+)
2. Pop(-)
3. Check if stack is empty(?)
4. Exit(*)
1
Enter the element to push onto the stack: 25     **INPUT**

Pushed:25                                      ***OUTPUT 1***

Choose an operation:
1. Push(+)
2. Pop(-)
3. Check if stack is empty(?)
4. Exit(*)
1
Enter the element to push onto the stack: 56     **INPUT**

Pushed:56                                      ***OUTPUT 2***

Choose an operation:
1. Push(+)
2. Pop(-)
3. Check if stack is empty(?)
4. Exit(*)
1
Enter the element to push onto the stack: 65       **INPUT**

Pushed:65                                        ***OUTPUT 3***

Choose an operation:
1. Push(+)
2. Pop(-)
3. Check if stack is empty(?)
4. Exit(*)
2												   **INPUT**
Popped:65										  ***OUTPUT 4***

Choose an operation:
1. Push(+)
2. Pop(-)
3. Check if stack is empty(?)
4. Exit(*)
3													**INPUT**
Is stack empty? false							  ***OUTPUT 5***

Choose an operation:
1. Push(+)
2. Pop(-)
3. Check if stack is empty(?)
4. Exit(*)
4													**INPUT**
Exiting program.								  ***OUTPUT 5***

 * 
 * 
 * */
