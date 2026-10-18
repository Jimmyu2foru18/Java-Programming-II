/**
 * @author James McGuigan 
 * CS 5211 Programming 2
 * Prof. B 
 * Test Corrections EXAM 2
 */
public class BookMain 
{
	    public static void main(String[] args) 
	    {

	        BookCode defaultBook = new BookCode();
	        System.out.println(defaultBook);


	        BookCode valuedBook = new BookCode("Sample Book", 100);
	        System.out.println(valuedBook);


	        valuedBook.setBookName("New Book");
	        valuedBook.setNumberOfPages(120);
	        System.out.println("Updated book title: " + valuedBook.getBookName());
	        System.out.println("Updated number of pages: " + valuedBook.getNumberOfPages());


	        valuedBook.flipPageForward();
	        valuedBook.flipPageForward();
	        System.out.println("After flipping pages: " + valuedBook);


	        System.out.println("Percent of book completed: " + valuedBook.percentOfBookCompleted());
	    }
}