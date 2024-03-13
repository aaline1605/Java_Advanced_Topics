package com.task2_oops_1;

import java.util.Scanner;


//Question_1.3


public class Account {	
	double Balance;  // Data member for balance
	
	// No-argument constructor
	public Account() {
		System.out.println("Zero-Argument Constructor");
	}
	// Parameterized constructor with initial balance
	public Account(double Balance) {
		
		this.Balance=Balance;
		
	}
	// Method to deposit the amount to the account
	void Deposit(double amount) {
		System.out.println("\nThe deposit amount is:"+amount);
		Balance +=amount;
	}
	 // Method to withdraw the amount from the account
	void withDraw(double amount) {
		System.out.println("\nThe Withdraw amount is:"+amount);
		if(amount <= Balance) {
			Balance -= amount;
		}else {
			System.out.println("Insufficient Funds unable to serve this transaction");
		}
	}
	// Method to display the balance
	void display() {
		System.out.println("\nAvailable Balance is:"+Balance);
		
	}
	
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	 // Create an Account object with an initial balance
	Account ac=new Account(1000.13);
	ac.display();
	
	System.out.print("\nEnter the Deposit amount:");
	double depositAmount=sc.nextDouble();
	ac.Deposit(depositAmount);
	ac.display();
	
	
	System.out.print("\nEnter the withdrawal amount:");
	double withdrawlAmount=sc.nextDouble();
	ac.withDraw(withdrawlAmount);
	ac.display();
	
	sc.close(); // Close the Scanner to prevent resource leaks
		
	}

}
