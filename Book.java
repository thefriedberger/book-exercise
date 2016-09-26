/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Tyler Friedberg
 * @version 9/26/2016
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;    
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pageNum, int borrow)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pageNum;
        refNumber = "";
        borrowed = borrow;
        courseText = true;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
       public String getRefNumber()
    {
        return refNumber;
    }
    
    public void setRefNumber(String ref)//method that sets referene number
    {
        if (ref.length() == 3)//prints the reference number if it is 3 characters
        {
             refNumber = ref;
        }
        else//prints an error message if the ref number =/= 3
        {
            System.out.println("ERROR: You did something wrong.");
        }
    }
    
    public int getBorrowed()
    {
        borrowed = borrowed + 1;//adds 1 to the "borrowed" counter every time the method is called
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
   
    public void printAuthor()//prints the author of the book
    {
        System.out.println("The author of the book is " + author);
    }
    
    public void printTitle()//prints the title of the book
    {
        System.out.println("The title of the book is " + title);
    }
    
    public void printDetails()//prints all of the provided details of the book
    {
        if (refNumber.length() == 0)//prints the details with ref number as ZZZ if a ref number hasn't been added by user
        {
            System.out.println("Author: " + author + " . Title: " + title + " . Pages: " + pages + " . Reference number: 'ZZZ'" + " The book has been borrowed " + borrowed + " time(s)");
        }
        else//prints all details when refence number is added by user
        {
            System.out.println("Author: " + author + " . Title: " + title + " . Pages: " + pages + " . Reference number: " + refNumber + " The book has been borrowed " + borrowed + " time(s)");
        }
    }
        

    // Add the methods here ...
}
