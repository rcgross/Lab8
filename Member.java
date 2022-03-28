import java.util.ArrayList;

public class Member extends Account{

    // instance variables
    private String name;
    private int memberID;
    private Library library;

    // list of books currently checked out by the member
    private ArrayList<Book> checkedOut;

    // constructor
    public Member(String nme, int ID, Library library){

        super(nme, ID);
        this.library = library;
        // initialize list of checked out books to be empty
        checkedOut = new ArrayList<>();
    }
    
    // setters and getters for the members

    public ArrayList<Book> getCheckedOut() {
    	return checkedOut;
    }

    // methods
    
    // checkout a book for the member
    public void checkout(Book b) {

        // check if the limit of checked out books is reached
        if (getCheckedOut().size() >= 5) {
            System.out.println("You have checked out the maximum number of books.\n Please return a book to check this one out.");
        }

        else if (b.getAmount() == 0) { //if the book is unavailable
                System.out.println("This book is currently not available. You will be added to the wait list for the book.");
                addToWaitList(b);
            }

        else { //check out the book
                checkedOut.add(b); //add book to checkout list for member
                library.getLOB().remove(b); //remove book from the list of books
                b = new Book(b.getBookID(), b.getRackNumber(), b.getAuthor(), b.getTitle(), b.getAmount() - 1); 
                // update number of books left
         }
     }
    
    // add the member to the wait list for an unavailable book
    public void addToWaitList(Book b){
        library.getWaitlist().add(b);
    }

    // get the position on the wait list for a given book
    public int waitListStatus(Book b){
        int position = 0;

        for (int i = 0; i < library.getWaitlist().size(); i++) {

            if (b == library.getWaitlist().get(i)){
                position = i + 1;
            }

        }
        return position;
    }

}
