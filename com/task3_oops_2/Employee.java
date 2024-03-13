package com.task3_oops_2;

//Employee class implementing Taxable interface
public class Employee implements Taxable {
	
	//Attributes
	private int employeeID;
	private String name;
	private double salary;
	
	//Constructor for the Employee class
	public Employee(int employeeID, String name, double salary) {  
		super();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
	}
	
	// Getter and setter methods -->Starting Point
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}// Getter and setter methods -->Ending Point
	
	// Implementation of calcTax method for income tax calculation
	@Override
	public  double calcTax() {
		
		return  salary * incomeTax;
		
		
	}

}
