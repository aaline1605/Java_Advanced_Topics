package com.task3_oops_2;

public class Book {
	
	//Attributes
	private int bookID;
	private String title;
	private String author;
	private boolean isAvailable;
	
	

	public int getBookID() {							          //Getter-setter start-point
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

    public String getTitle() {
		return title;
	}

    public void setTitle(String title) {
		this.title = title;
	}

    public String getAuthor() {
		return author;
	}

    public void setAuthor(String author) {
		this.author = author;
	}

    public boolean getIsAvailable() {
		return isAvailable;
	}

    public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}																  //Getter-setter End-point

    public Book(int id,String title, String author, Boolean status){  //Parametrized-Constructors
		
		this.bookID=id;
		this.title=title;
		this.author=author;
		this.isAvailable=true;
		
		
		
		
	}

}
