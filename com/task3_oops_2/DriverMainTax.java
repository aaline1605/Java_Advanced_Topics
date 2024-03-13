package com.task3_oops_2;

import java.util.Scanner;

//DriverMainTax class for testing and interaction with the user
public class DriverMainTax {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Accept the number of employees
		System.out.print("Enter your Number of Employees Details:");
		int numEmployees=sc.nextInt();
		Employee[] emp=new Employee[numEmployees]; //storing into array
		
		
		for (int i=0;i<numEmployees;i++) {
			
			System.out.println("\nEnter Your "+(i+1)+" employee info..!");
			
			System.out.print("\nEmployee ID is:");
			int empId=sc.nextInt();
			sc.nextLine();
			
			System.out.print("\nEnter Employee Name with Initial:");
			String name=sc.nextLine();
			
			System.out.print("\nEnter your mentioned Employee Salary for an Year:");
			double salary=sc.nextDouble();
			
			// Accept employee details into Array
			emp[i]=new Employee(empId,name,salary);
			}
		
		    // Accept the number of products
			System.out.print("\nNote:Enter the Number of products:");
			int numpro=sc.nextInt();
			Product[]pro=new Product[numpro];
			
			
			for(int i=0;i<numpro;i++) {
				System.out.println("\nEnter the respective product "+(i+1)+" Information:");
				System.out.print("Product ID: ");
				int pid=sc.nextInt();
				
				System.out.print("Price: ");
				double price=sc.nextDouble();
				
				System.out.print("Quantity: ");
				int quantity=sc.nextInt();
				
				// Accept product details
				pro[i]=new Product(pid, price, quantity);
				
			}
			
			System.out.print("------------------------");
			System.out.println("\nIncome tax for Employees:");  // Display income tax for employees
			for(Employee employees:emp) {
				System.out.print("\nEmployee ID: "+ employees.getEmployeeID());
				System.out.print("\nEmployee Name: "+ employees.getName());
				System.out.print("\nIncome Tax for Respective employee: "+ employees.calcTax()+"\n");
			}
			System.out.println("------------------------");
			System.out.println("\nSales Tax for Products:");    // Display sales tax for products
			for(Product products:pro) {
				System.out.print("\nProduct ID is: "+products.getPid()+"\n");
				System.out.print("\nSales Tax is: "+products.calcTax()+"\n");
			}
			
			sc.close(); //close the scanner to avoid resource leaks
	}
}

/* INPUTS AND OUTPUTS
 
Enter your Number of Employees Details:2		**INPUT FOR EMPLOYEES DETAIL**	

Enter Your 1 employee info..!					    *INPUT-1

Employee ID is:156

Enter Employee Name with Initial:Magesh S

Enter your mentioned Employee Salary for an Year:500000

Enter Your 2 employee info..!						*INPUT-2

Employee ID is:896

Enter Employee Name with Initial:Sharan S

Enter your mentioned Employee Salary for an Year:600000

Note:Enter the Number of products:2					**INPUT FOR PRODUCTS**

Enter the respective product 1 Information:         *INPUT-1
Product ID: 568
Price: 6541.36
Quantity: 5

Enter the respective product 2 Information:         *INPUT-1
Product ID: 741
Price: 65879.36
Quantity: 15
------------------------
Income tax for Employees:                          ****OUTPUT FOR EMPLOYEES IN INCOME-TAX****

Employee ID: 156
Employee Name: Magesh S
Income Tax for Respective employee: 52500.0

Employee ID: 896
Employee Name: Sharan S
Income Tax for Respective employee: 63000.0
------------------------

Sales Tax for Products:							    ****OUTPUT FOR PRODUCTS IN SALES-TAX****

Product ID is: 568

Sales Tax is: 32706.8

Product ID is: 741

Sales Tax is: 988190.4

 */
