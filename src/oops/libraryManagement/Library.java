package oops.libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	//To restrict access to librarian
	private Library() {}
	
	static Librarian librarian;
	
	static List<Book> booklist = new ArrayList<>();
	
	static{
		booklist.add(new Book("Merchant of Venice", "Shakespear", 800.0, "19-11-1987"));
		booklist.add(new Book("Around the World in 80 Days", "RabindraNath Tagore", 1800.0, "9-01-1965"));
		booklist.add(new Book("Algebra", "B.S. Grewal", 450.00, "12-03-1995"));
		booklist.add(new Book("Calculus", "Thomas", 500.00, "18-07-1992"));
		booklist.add(new Book("Python", "Mark Lutz", 650.00, "10-08-1990"));
		booklist.add(new Book("Java", "Herbert Schildt", 700.00, "22-01-1998"));
		booklist.add(new Book("Data", "Kathy Sierra", 550.00, "05-06-2001"));
		booklist.add(new Book("AI", "Stuart Russell", 900.00, "14-09-1996"));
		booklist.add(new Book("Logic", "Irving Copi", 400.00, "03-11-1985"));
		booklist.add(new Book("Poems", "Rabindranath Tagore", 300.00, "07-05-1910"));
		booklist.add(new Book("Wings", "A.P.J. Abdul Kalam", 350.00, "01-01-1999"));
		booklist.add(new Book("Stories", "Ruskin Bond", 280.00, "15-04-2000"));
	}
	
	//HasA RelationShip
	private static Librarian assignLibrarian()
	{
		if(librarian == null)
		{
			librarian = new Librarian("Sudeshna" , 22 , 'F' , 101);
		}
		return librarian;
	}
	
	public static Object borrow(String bookName)
	{
		for(Book b : booklist)
		{
			if(b.getTitle().equalsIgnoreCase(bookName)) 
			{
			    booklist.remove(b);
				return b;
			}
		}
		return "Book Not Available";
	}
	
	public static Object read(String bookName)
	{
		for(Book b : booklist)
		{
			if(b.getTitle().equalsIgnoreCase(bookName)) 
			{
			   return b;
			}
		}
		return "Book not Available for Reading";
	}
	
	
	public static boolean checkLibrarianAccess(int id)
	{
		assignLibrarian();
		return id == librarian.getId();
	}
	
	public static Book AddBook(String title, String author, double price, String publishedDate)
    {
		 Book b = new Book(title , author , price , publishedDate);
		 booklist.add(b);
		 return b;
    }
	
	public static void returnBook(String title, String author, double price, String publishedDate)
	{
		System.out.println("Book returned successfully: " + AddBook(title , author , price , publishedDate));
	}
	
}
