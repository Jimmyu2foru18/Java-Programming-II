public class BookCode {
    private String bookName;
    private int numberOfPages;
    private int currentPageReaderIsOn;

    // Valued constructor
    public BookCode(String bookName, int numberOfPages) 
    {
        this.bookName = bookName;
        if (numberOfPages > 0) {
            this.numberOfPages = numberOfPages;
        } 
        else 
        {
            this.numberOfPages = 10; 
        }
        this.currentPageReaderIsOn = 0;
    }

   
    public BookCode() 
    {
        this.bookName = "The Cat in The Hat";
        this.numberOfPages = 44;
        this.currentPageReaderIsOn = 0;
    }

    // Getters and Setters
    public String getBookName() 
    {
        return bookName;
    }

    public void setBookName(String bookName) 
    {
        this.bookName = bookName;
    }

    public int getNumberOfPages() 
    {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) 
    {
        if (numberOfPages > 0) 
        {
            this.numberOfPages = numberOfPages;
        }
    }

    public int getCurrentPageReaderIsOn() 
    {
        return currentPageReaderIsOn;
    }


    public void flipPageForward() 
    {
        if (currentPageReaderIsOn < numberOfPages) 
        {
            currentPageReaderIsOn++;
        }
    }

    public double percentOfBookCompleted() 
    {
        if (numberOfPages == 0) 
        {
            return 0.0;
        }
        return (double) currentPageReaderIsOn / numberOfPages;
    }


    public String toString() 
    {
        return bookName + ", " + currentPageReaderIsOn + "/" + numberOfPages + " pages read";
    }
}




