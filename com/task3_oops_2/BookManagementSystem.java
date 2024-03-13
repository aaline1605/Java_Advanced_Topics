package com.task3_oops_2;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Library lib=new Library(2000);
		boolean exitFlag=false;        // Declare a boolean variable 'exitFlag' and initialize it to false.
		
		
		while(!exitFlag) {             // The loop will continue until the user chooses to exit the program.
			
			System.out.print("----------------------------------------------------");
			System.out.println("\nMenu of Library,Please enter your choice:");
			System.out.println("1. Add Book(+)");
			System.out.println("2. Remove Book(-)");
			System.out.println("3. Search Book(?)");
			System.out.println("4. Replace Book(--><--) )");
			System.out.println("5. Display Books(:)");
			System.out.println("6. Exit(x)");
			System.out.print("\nYour Choice is:");
		
			
			
			int choice=sc.nextInt();		
			sc.nextLine();               // consume newline

			
			switch(choice) {
			
			case 1:
				System.out.print("\nEnter your Book ID:");
				int bookID=sc.nextInt();
				sc.nextLine();                     //Consume new line After INT entry to String to avoid line skipping
				System.out.print("Enter Title:");
				String heading=sc.nextLine();
				System.out.print("Enter Author Name:");
				String author=sc.nextLine();
				
				Book freshBook=new Book(bookID,heading,author,null); 
				lib.addbooks(freshBook);
				
				break;
				
				
			case 2:
				System.out.print("\nEnter the book ID to remove from Library:");
				int idRemove=sc.nextInt();
				lib.removeBook(idRemove);
				
				break;
				
			case 3:
				System.out.print("\nEnter your BookID to search:");
				int bookIdSearch=sc.nextInt();
				Book bookResult=lib.searchBook(bookIdSearch);
				if(bookResult !=null) {
					System.out.println("\nBook Found-Title:"+bookResult.getTitle()+
							"\nAuthor is:"+bookResult.getAuthor()+"\nBookID is:"+bookResult.getBookID());
				}else {
					System.out.print("Your entered book is not available in our Library.");
				}
				
				break;
			case 4:
				System.out.print("\nEnter BookID to replace:");
				int idReplace=sc.nextInt();
				sc.nextLine();
				System.out.print("\nEnter New Title:");
				String newTitle=sc.nextLine();
				System.out.print("\nEnter Enter NewAuthor:");
				String newAuthor=sc.nextLine();
				Book bookReplacement=new Book(idReplace, newTitle, newAuthor, null);
				lib.replaceBook(idReplace, bookReplacement);
				
				break;
				
			case 5:
				lib.displayBooks();
				break;
				
				
			case 6:
				System.out.print("\nOut-Of Library System, Thank you visit again...!");
				System.exit(0);
				
				break;
				
				default:
					System.out.println("\nYou have entered invalid entry! Please entry valid Choice...:)");
				}
			
			

			
		}
		sc.close();
		
	}
}

/*INPUTS AND OUTPUTS
 * 
 * ----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:1									*INPUT

Enter your Book ID:1011                             
Enter Title:RichDadPoorDad                          
Enter Author Name:Robert T. Kiyosaki                

Your Book is added Successfully....!              ***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:1                                      *INPUT

Enter your Book ID:1112                               
Enter Title:The Secret Teacher                        
Enter Author Name:Emily Dickinson                     

Your Book is added Successfully....!                ***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:1                                        *INPUT

Enter your Book ID:1113                                 
Enter Title:A Prisoner of Birth                         
Enter Author Name:Jeffrey Archer                        

Your Book is added Successfully....!                  ***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:1                                        *INPUT

Enter your Book ID:1605
Enter Title:Love Sees No Reason
Enter Author Name:Reshma Ranjan

Your Book is added Successfully....!					***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:1											 *INPUT

Enter your Book ID:7085
Enter Title:War and Peace
Enter Author Name:Leo Tolstoy

Your Book is added Successfully....!						***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:1												*INPUT

Enter your Book ID:9045
Enter Title:The Psychology of Money
Enter Author Name:Morgan Housel

Your Book is added Successfully....!							***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:2												*INPUT

Enter the book ID to remove from Library:1113
Your entered Book ID is:1113
Is removed successfully..:)										***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:2												*INPUT

Enter the book ID to remove from Library:999					*INPUT

Your entered book is not found in library, cannot remove it..!   ***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:3													*INPUT

Enter your BookID to search:9045

Book Found-Title:The Psychology of Money							***OUTPUT***
Author is:Morgan Housel
BookID is:9045
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:3                                                      *INPUT

Enter your BookID to search:2999
Your entered book is not available in our Library.----------------------------------------------------	***OUTPUT***
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:4													*INPUT

Enter BookID to replace:1605

Enter New Title:You Are the BEST WIFE

Enter Enter NewAuthor:Ajay K Pandey

Your Book is replaced Successfully.....!							***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:4                                                   *INPUT

Enter BookID to replace:3999

Enter New Title:Polytell

Enter Enter NewAuthor:Organil

As you entered book is not available in this library, Cannot replace it! please mention available books..!       ***OUTPUT***
----------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:5                                                  *INPUT

Our Library Books:
-------------------------------
Book ID:1011                                   						***OUTPUT-1***

Title of the Book is:RichDadPoorDad

Author is:Robert T. Kiyosaki
--------------------------------------------------------------
Book ID:1112													  ***OUTPUT-2***

Title of the Book is:The Secret Teacher

Author is:Emily Dickinson
--------------------------------------------------------------
Book ID:1605														***OUTPUT-3***

Title of the Book is:You Are the BEST WIFE

Author is:Ajay K Pandey
--------------------------------------------------------------
Book ID:7085														***OUTPUT-4***

Title of the Book is:War and Peace

Author is:Leo Tolstoy
--------------------------------------------------------------
Book ID:9045														***OUTPUT-5***

Title of the Book is:The Psychology of Money

Author is:Morgan Housel
-----------------------------------------------------------------------------------
Menu of Library,Please enter your choice:
1. Add Book(+)
2. Remove Book(-)
3. Search Book(?)
4. Replace Book(--><--) )
5. Display Books(:)
6. Exit(x)

Your Choice is:6														*INPUT

Out-Of Library System, Thank you visit again...!						***OUTPUT***
 * 
 */

