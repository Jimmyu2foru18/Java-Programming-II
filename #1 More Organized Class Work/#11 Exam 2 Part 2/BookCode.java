/**
 * @author James McGuigan
 * CS 5210
 * Test 2 Part 2
 * Programming 2
 */
public class BookCode 
{

	private String bookName;
	private int currentPageReaderIsOn;
	
	private int flipPageFoward = 0;
	private static final int numberOfPages=44;
	//default Constructor
	public BookCode()
	{
		bookName="The Cat in The Hat";
		currentPageReaderIsOn=0;
	}
	
	public BookCode(String BN,int CP)
	{
	 if(BN.length() !=0)
		 bookName=BN;
	 else
	 {
		 bookName = "The Cat in The Hat";
	 }
	 
	 if (CP>0 && CP<= numberOfPages)
		 currentPageReaderIsOn=CP;
	 else
	 {
		 currentPageReaderIsOn=10;
	 }
	 flipPageFoward++;
	}
	
	//Getter
	
	public String getbookName()
	{
		return bookName;
	}
	
	public int getcurrentPageReaderIsOn()
	{
	return currentPageReaderIsOn;	
	}
	
	public static int GetNumberOfPages() 
	{
		return numberOfPages;
	}


	//Setter
	public void setbookName(String BN_S)
	{
		if(BN_S.length() !=0)
		{
			bookName=BN_S;
		}
		else
		{
			System.out.println("Invalid, Please Enter Book Name ");
		}
	}
	public void setCurrentPage(int SP)
	{
		if(SP >0)
		{
		currentPageReaderIsOn=SP;

		}
		else
		{
		 currentPageReaderIsOn=10;
		}
		flipPageFoward++;
	}
	
	//toString
	public String toString()
	{
		return "You are Reading " + bookName + " you are on page " + currentPageReaderIsOn + " Of " + GetNumberOfPages()+ " you are " + currentPageReaderIsOn +"/"+ numberOfPages + " pages read!";
	}

}
