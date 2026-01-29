package oops.libraryManagement;

import java.util.Scanner;
public class Driver {
	static Scanner sc = new Scanner(System.in);
	static String title;
	static String author;
	static double price;
	static String publishedDate;
	
	public static void fetchBookDetails()
	{
		System.out.println("Enter Book name: ");
		title = sc.nextLine();
		System.out.println("Enter Author: ");
		author = sc.nextLine();
		System.out.println("Enter price: ");
		price = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Published Date: ");
		publishedDate = sc.nextLine();
	}

	public static void main(String[] args) {
		int n = -1;
		while(n != 5)
		{
			System.out.println("Enter the operations to perform: \n"
					+ "1. Borrow Book \n"
					+ "2. Read Book \n"
					+ "3. Return Book \n"
					+ "4. Add Book \n"
					+ "5. Quit \n");
			n = sc.nextInt();
			sc.nextLine();
			switch(n)
			{
				 case 1 : 
				 {
					System.out.println("Enter Book name: ");
					String bookName = sc.nextLine();
					System.out.println(Library.borrow(bookName));
					break;
				 }
				 case 2 :
				 {
					 System.out.println("Enter Book name: ");
					 String bookName = sc.nextLine();
					 System.out.println(Library.read(bookName)); 
					 break;
				 }
				 case 3 :
				 {
					 fetchBookDetails();
					 Library.returnBook(title , author , price , publishedDate);
					 break;
				 }
				 case 4: 
				 {
					 System.out.println("Enter your ID:");
					 int id = sc.nextInt();
					 sc.nextLine();
					 if(Library.checkLibrarianAccess(id))
					 {
						 fetchBookDetails();
						 System.out.println("Book Added Successfully: " + Library.AddBook(title, author, price, publishedDate));
					 }
					 else System.out.println("NOT AUTHORIZED TO ADD BOOK, REQUIRES LIBRARIAN ACCESS");
					 break;
				 }
				 case 5: 
					 {
						 System.out.println("Thank you for accessing our Library Management System");
						 break;
					 }
				}
		}	
	}
}
