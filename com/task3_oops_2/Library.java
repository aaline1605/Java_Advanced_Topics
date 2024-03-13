package com.task3_oops_2;

public class Library {
	
	/* Declare a private instance variable
	 This array will be used to store Book objects in the Library.*/
	private Book[] books;
	
	
	public Library(int storageCapacity) {        //Constructor Library
		this.books=new Book[storageCapacity];
	}
	
	
	public void addbooks(Book book) {			//Method to add a book to the library
		
		for (int i=0;i<books.length;i++) {
			if(books[i]==null) {
				books[i]=book;
				
				System.out.println("\nYour Book is added Successfully....!");
				
				return;
		}
		}
		System.out.println("\nSorry, Our Library is full. You cannot add more books...!");
}
	public void removeBook(int bookID) {                   //Method to remove a book to the library
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null && books[i].getBookID()== bookID) {
				books[i]=null;
				
				System.out.println("Your entered Book ID is:"+bookID+"\nIs removed successfully..:)");
				return;
			}
		}
		System.out.println("\nYour entered book is not found in library, cannot remove it..!");
	}
	
	public Book searchBook(int bookID) {                    //Method to search a book to the library
		for(Book book: books) {
			if(book!=null && book.getBookID()==bookID) {
				return book;
			}
		}
		return null;
	}
	
	public void replaceBook(int bookID, Book newBook) {      //Method to replace a book to the library
		for(int i=0; i< books.length;i++) {
			if(books[i]!=null && books[i].getBookID()== bookID) {
				books[i]=newBook;
				System.out.println("\nYour Book is replaced Successfully.....!");
				return;
			}
		}
		System.out.println("\nAs you entered book is not available in this library, Cannot replace it! please mention available books..!");
	}

	public void displayBooks() {                             //Method to display all books to the library
		System.out.println("\nOur Library Books:");
		
		for(Book book:books) {
			if(book !=null) {
				System.out.print("-------------------------------");
				System.out.println("\nBook ID:"+book.getBookID());
				System.out.println("\nTitle of the Book is:"+book.getTitle());
				System.out.println("\nAuthor is:"+book.getAuthor());
				System.out.print("-------------------------------");
						
			}
		}
	}
	
	

}
