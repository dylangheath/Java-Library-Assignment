import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new Book("651651651651","JK Rowling", "Harry Potter", 99.99));
        library.add(new Book("65465466948", "J.R.R. Tolkien","The Lord of the Rings", 49.99));
        library.add(new Book("6456463454", "C.S. Lewis", "The Chronicles of Narnia", 19.99));
        library.add(new Book("46191616161", "Rick Riodran","Percy Jackson and the Lightning Thief", 9.99));
        library.add(new Book("000000000000","Dylan Heath", "How to be bad at Java", 0.00));
        library.add(new Book()); //Nothing input, will show you the default values

        for(Book i: library) //For Loop runs thru the list and prints out what is in it
        {
            System.out.println(i);
        }
    }
}