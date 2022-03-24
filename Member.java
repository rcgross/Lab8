import java.util.ArrayList;

public class Member extends Account{

    // instance variables
    private String name;

    // list of books (listed by ID number) currently checked out by the member
    private ArrayList<Integer> checkedOut;

    // constructor
    public Member(String nme){

        name = nme;
        // initialize list of checked out books to be empty
        checkedOut = new ArrayList<Integer>();
    }

    // methods

    public void checkOut(int ID){

        // check if the limit of books checked out is reached
        if (checkedOut.size() >= 5){
            System.out.println("You have checked out the maximum number of books.\n Please return a book to check this one out.");
        }

        else{

            // this is where the availability of the book itself would be checked
        }
    }

}
