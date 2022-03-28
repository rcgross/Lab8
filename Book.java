import java.util.ArrayList;

public class Book {
    private int BookID; // Book ID number
    private int RackNumber; // Book Section/Rack number
    private String author; //Author name
    private String title; //Title of book
    private int amount; //# of books available
    									// this will indicate if a book is available, set to true if the book is available
                                        // for the library class if it is not available then put on waitlist in main class
                                        // if it is available then member can check out the book
    
    private ArrayList<Member> waitList; // creates a list of PEOPLE waiting for the book
    
    // All the setter and getters for the instance variables

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
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
            return author;
    }
    
    public void setTitle(String title) {
            this.title = title;
    }
    
    public String getTitle() {
            return title;
    }
    
    public int getAmount() {
    	return amount;
    }
    
    public void setAmount(int amount) {
    	this.amount = amount;
    }
    
    public ArrayList <Member> getWL() { //get waitlist
    	return waitList;
    }
    
    public void addtoWL(Member m) { //add member to waitlist on a specific book
    	waitList.add(m);
    }
    
    public String printwaitList() {
      String result = "";
  	  for (int i = 0; i < waitList.size(); i++) {
  		  if (i == waitList.size() - 1) {
  			  result.concat("and " + waitList.get(i).getName());
  		  }
  		  else {
  			result.concat(waitList.get(i).getName() + ", "); 
  		  }
  	  }
  	  return result;
    }
    
 

    // constructor for a book, since each book has an ID number as well as a Rack Number
    public Book (int bookID, int RackNumber, String author, String title, int amount) {
        this.BookID = BookID;
        this.RackNumber = RackNumber;
        this.author = author;
        this.title = title;
        this.amount = amount;
        waitList = new ArrayList<>();
    }

}
