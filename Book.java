/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
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
    
    public void setRefNumber(String ref)
    {
        if (ref.length() == 3)
        {
             refNumber = ref;
        }
        else
        {
            System.out.println("You did something wrong.");
        }
    }
    
    public int getBorrowed()
    {
        borrowed = borrowed + 1;
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void printAuthor()
    {
        System.out.println("The author of the book is " + author);
    }
    
    public void printTitle()
    {
        System.out.println("The title of the book is " + title);
    }
    
    public void printDetails()
    {
        if (refNumber.length() == 0)
        {
            System.out.println("Author: " + author + " . Title: " + title + " . Pages: " + pages + " . Reference number: 'ZZZ'" + " The book has been borrowed " + borrowed + "times");
        }
        else
        {
            System.out.println("Author: " + author + " . Title: " + title + " . Pages: " + pages + " . Reference number: " + refNumber + " The book has been borrowed " + borrowed + " time(s)");
        }
    }
        

    // Add the methods here ...
}
