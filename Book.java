public class Book extends Publication{
    private String ISBN;
    private String Author;

    public void setISBN(String isbn) //Setter
    {
        ISBN = isbn;
    }
    public void setAuthor(String author) //Setter
    {
        Author = author;
    }

    public String getISBN() //Getters
    {     
        return ISBN;
    }

    public String getAuthor() //Getters
    {     
        return Author;
    }

    //Constructors
    public Book() //Default
    {
        super();
        ISBN = "No Book Scanned";
        Author = "Please scan a book to know the Author!";
    }

    public Book(String ISBN, String Author, String Title, double Price) //Non Default
    {
        super(Title,Price);
        this.ISBN = ISBN;
        this.Author = Author;
    }
    //to String builds with the toString from Publication class to expand even more information 
    public String toString() 
    {
        return super.toString() + "\nThe ISBN is: " + ISBN + "\nThe Author is: " + Author;
    }

}
