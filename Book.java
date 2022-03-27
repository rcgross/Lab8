public class Book {
    private int BookID; // Book ID number
    private int RackNumber; // Book Section/Rack number
    private boolean available = true; // this will indicate if a book is available, set to true if the book is available
                                        // for the library class if it is not available then put on waitlist in main class
                                        // if it is available then member can check out the book

    // All the setter and getters for the instance variables
    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public int getBookID()
    {
        return BookID;
    }

    public void setRackNumber(int RackNumber) {
        this.RackNumber= RackNumber;
    }

    public int getRackNumber()
    {
        return RackNumber;
    }

    // constructor for a book, since each book has an ID number as well as a Rack Number
    public Book (int bookID, int RackNumber) {
        this.BookID = BookID;
        this.RackNumber = RackNumber;
    }

}
