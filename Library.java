import java.util.ArrayList;

public class Library {
  private ArrayList<Book> listOfBooks; //list of books in Library
  private ArrayList<Book> waitlist; //waitlist of BOOKS
  
  public Library () {
	listOfBooks = new ArrayList<Book>();
    waitlist = new ArrayList<Book>();
  }
  
  public ArrayList<Book> getLOB() { //get list of books
	  return listOfBooks;
  }
  
  public void setLOB(ArrayList<Book> b) { //set a list of books
	  listOfBooks = b;
  }
  
  public ArrayList<Book> getWaitlist() { //get waitlist
	  return this.waitlist;
  }
  
  public void setWaitList(ArrayList<Book> b) { //sets waitlist
	  waitlist = b;
  }
  
  public void addwaitList(Book b) {
	  waitlist.add(b);
  }
  
  
  
  public static void main(String[] args) {
	  
	Book b1 = new Book (12345, 2, "Amor Towles", "The Sun Also Rises", 2);
	Book b2 = new Book (54321, 1, "John Sandford", "The Investigator", 1);
	Book b3 = new Book (33333, 2, "Danielle Steele", "High Stakes", 1);
	
	Library l1 = new Library();
	
	Librarian lb1 = new Librarian("Rebecca Gross", 2000851234, l1);
	
	Member m1 = new Member("Deja Pierce", 2000854321, l1);
	Member m2 = new Member ("Elizabeth Jiang", 2000858524, l1);
	
	lb1.addBook(b1);
	lb1.addBook(b2);
	lb1.addBook(b3);
	
	m1.checkout(b2);
	m2.checkout(b2);
	b2.addtoWL(m2);
	
    System.out.println("The waitlist for " + b2.getTitle() + " by " + b2.getAuthor() + " contains the following members: " + b2.printwaitList());

  } 
}
