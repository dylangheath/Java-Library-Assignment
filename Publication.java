public class Publication {
    private String Title;
    private Double Price;
    
    public void setTitle(String title)     // Setter 
    {
        this.Title = title;
    }
    public void setPrice(double price)  //Setter
    {
        this.Price = price;
    } 

    public String getTitle() {     //Getters
        return Title;
    }

    public double getPrice() {     //Getters
        return Price;
    }

    // Constructors
    public Publication() //Default
    {
        Title = "No Book Scanned";
        Price = 0.00;
    }

    public Publication(String Title, double Price) //Non Default
    {
        this.Title = Title;
        this.Price = Price;
    }
    //Method which prints the title and price nicely for user to read
    public String toString()
    {
        return "Book title: " + Title + "\nThe price is: " + Price;
    }
}
