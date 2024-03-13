package com.task3_oops_2;



public interface Taxable {
	
	 double salesTax=0.07;      //7%
     double incomeTax=0.105;    //10.5%
	
	abstract double calcTax();

}
