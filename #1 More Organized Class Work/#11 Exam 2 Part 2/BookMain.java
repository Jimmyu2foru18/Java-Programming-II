/**
 * @author James McGuigan
 * CS 5210
 * Test 2 Part 2
 * Programming 2
 */

public class BookMain {

	public static void main(String[] args) 
	{
		BookCode book1= new BookCode();
		System.out.println(book1.getbookName());
		System.out.println(book1.getcurrentPageReaderIsOn());
		System.out.println(BookCode.GetNumberOfPages());
		BookCode book2= new BookCode("The Bat in the Cat",34);
		System.out.println(book2.getcurrentPageReaderIsOn());
		System.out.println(book2.getcurrentPageReaderIsOn());
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		book1.setCurrentPage(-2);
		System.out.println(book1.getcurrentPageReaderIsOn());
		System.out.println(book1.toString());
		
	}

}
