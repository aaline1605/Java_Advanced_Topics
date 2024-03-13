package com.task4_exception_collection;


public class Student {
	
	//Attributes
    private int rollNo;
	private String name;
	private int age;
	private String course;
	
    //Parameterized Constructor	
    public Student(int rollno,String name,int age,String course) {
		this.rollNo=rollno;
		this.name=name;
		this.age=age;
		this.course=course;
}

	                            //Getters and Setters--->Start point
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	
	}                               //Getters and Setters--->End point
	

	//Method for AgeNotWithinRangeException
	 public void agenot()throws AgeNotWithinRangeException {
		
		if(age >=15 && age <=21) {
			throw new AgeNotWithinRangeException("\nAgeNotWithinRangeException found: Age is not suitable for this course.");
		
		}else {
			System.out.println("\nYou're eligible for this course");
		}
 }
	
     //Method for NameNotValidException
	 public void namenot() throws NameNotValidException {
	    if (name.matches(".*[^a-zA-Z ].*")) {
	    	throw new NameNotValidException("\nNameNotValidException found: Name contains special symbols or numbers.");
	    	
	    } else {
	        System.out.println("\nYour name is valid...!");
	    }
	}

}
