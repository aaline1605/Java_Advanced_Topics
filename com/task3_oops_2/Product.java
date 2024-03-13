package com.task3_oops_2;

//Product class implementing Taxable interface
public class Product implements Taxable {
	
	//Attributes
	private int pid;
	private double price;
	private int quantity;
	
	//constructor for the Product class
	public Product(int pid, double price, int quantity) {   
		super();
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter and setter methods -->Starting point
    public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}  // Getter and setter methods -->Ending point
	
	// Implementation of calcTax method for sales tax calculation
    @Override
	public double calcTax() {
		
		return price * quantity;
		
		
	}
}
