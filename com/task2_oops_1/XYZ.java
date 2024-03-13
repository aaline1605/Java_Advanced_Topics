package com.task2_oops_1;


import java.util.Scanner;

//Question_1.2


//Definition of the Product class
class Product {

	int pId,quantity;
	double price;


	// Parameterized Constructor
	public Product(int pId,int quantity,double price){
	
		this.pId=pId;
		this.quantity=quantity;
		this.price=price;
		
}
	
// Method to display product information
    void getProductData() {    
	
	System.out.println("\nYour ProductId is:"+pId);
	System.out.println("\nYour product Quantity is:"+quantity);
	System.out.println("\nYour product price is:"+price);
	
	
}
}

//Main class XYZ
public class XYZ{
	
	  // Method to find the product with the highest price
	    static int findProductWithHighestPrice(Product[]ps) {
		int highestprice=0;
		
		
		// Loop through the array to find the product with the highest price
		for(int k=1; k< ps.length;k++) {
			if(ps[k].price>ps[highestprice].price) {
				highestprice=k;
			}
		}
		return ps[highestprice].pId;
	}
	    
	    // Method to calculate the total amount spent on all products
        static double calculateTotalPrice(Product[]ps) {
    	   
    	   double overallAmountSpent=0;
    	   
    	   // Loop through the array to calculate the total amount spent
    	   for(Product product:ps) {
    		   overallAmountSpent +=product.price * product.quantity;
    	   }
    	   
    	   return overallAmountSpent;
       }
        
        
       // Main method	
        public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your five Product Information(ProductId,price,quantity)!");
		
		int n=5;
		
		// intializes an array to store the value
		Product []ps=new Product[n];
		
		   for(int i=0;i<n;i++){
			System.out.print("\nEnter product "+(i+1)+" ID:");
			int PId=sc.nextInt();
			
			System.out.print("\nEnter product"+(i+1)+" Quantity:");
			int quantity=sc.nextInt();
			
			System.out.print("\nEnter product"+(i+1)+" Price:");
			double price=sc.nextDouble();
			
			
			
			ps[i]=new Product(PId, quantity, price);
			
		}
		
		
		
		System.out.println("\nConfirm your Product Information:");
		 
	    // Display product information
		for(Product product: ps) {
			product.getProductData();
		}
		
		 // Find the product with the highest price and calculate the overall amount spent
		int highestProductId=findProductWithHighestPrice(ps);
		double overallAmountSpent=calculateTotalPrice(ps);
		
		
		System.out.println("\nThe product with Highest price has ID:"+highestProductId);
		System.out.println("\nOverall amount could spent on all products:"+overallAmountSpent);
		
		
		sc.close();  // Close the Scanner to prevent resource leaks
		
		
		
		
		
		
		
		

	}}


