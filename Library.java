public class Library{
    private Book[] Books = new Book[5];

    //Return the data from the Library Index
    public Book get(int index)
    {
        return Books[index];
    }
    //Setter
    public void setBooks(Book[] books) {
        Books = books;
    }

    //Getter
    public Book[] getBooks() {
        return Books;
    }

    // Constructor
    public Library()
    {
        Books[0] = new Book("09723450712460", "JK Rowling", "Harry Potter", 8.99);
        Books[1] = new Book("65465466948","J.R.R. Tolkien","The Lord of the Rings", 49.99);
        Books[2] = new Book("6456463454","C.S. Lewis","The Chronicles of Narnia", 19.99);
        Books[3] = new Book("46191616161","Rick Riodran","Percy Jackson and the Lightning Thief", 9.99);
        Books[4] = new Book("000000000000","Dylan Heath","How to be bad at Java", 0.00);
    }
}