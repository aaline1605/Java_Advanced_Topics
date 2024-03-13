package com.task4_exception_collection;

import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
	
	private Map<String, Integer> studentGrades;
	
	//Constructor to initialize the HashMap
	public StudentGrades() {
		this.studentGrades=new HashMap<>();
		
	}
	
	// Method to add a new student with a given name and grade
	public void addStudent(String name,int grade) {
		studentGrades.put(name, grade);
		System.out.println("Student "+name+" added with grade:"+grade);
	}
	
	// Method to remove a student with a given name
	public void removeStudent(String name) {
		if(studentGrades.containsKey(name)) {
			studentGrades.remove(name);
			System.out.println("Student "+name+" is removed Sucessfully....!");
		}else {
			System.out.println("Student "+name+" is not found....!");
		}
	}
	// Method to display the grade of a student with a given name
	public void displayGrade(String name) {
		if(studentGrades.containsKey(name)) {
			int grade=studentGrades.get(name);
			System.out.println("Grade of student " + name + ": " + grade);
		}else {
			System.out.println("Student "+name+" not found");
		}
	}

}
