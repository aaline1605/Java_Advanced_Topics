package com.task4_exception_collection;

public class Voter {
	
	private int voterId;
	private String name;
	private int age;
	
	//Parameterized Constructor
	public Voter(int id,String name,int age) {
		this.voterId=id;
		this.name=name;
		this.age=age;
		
	}
	
	//Getters Setters
	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//Method For ageCheck
	public static void ageCheck(int age) {
		
		//Logic for Exception
		if(age>=18) {
			System.out.println("\nEligible for Voting.... :)");
			
		}else {
			throw new IllegalArgumentException("invalid age for voter.... (:");
		}
	}

}
