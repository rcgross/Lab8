import java.util.Arrays;

public class Member extends Account{

    // instance variables
    private String name;
    private int memberID;

    // list of books (listed by ID number) currently checked out by the member
    private int[] checkedOut;

    // constructor
    public Member(String nme){

        name = nme;
        memberID = ID;
        // initialize list of checked out books to be empty
        checkedOut = new int[0];
    }
    
    // setters and getters for the members

    public String getName(){return name;}

    public void setName(String n){name = name;}

    public int getMemberID(){return memberID;}

    public void setMemberID(int id){memberID = id;}

    public int[] getCheckedOut(){return checkedOut;}

    // methods
    
    // checkout a book for the member
    public void checkout(Book b) {

        // check if the limit of checked out books is reached
        if (getCheckedOut().length >= 5){
            System.out.println("You have checked out the maximum number of books.\n Please return a book to check this one out.");
        }

        else {

            if (!b.getAvailable()){
                System.out.println("This book is currently not available. You will be added to the wait list for the book.");
                addToWaitList(b);
            }

            else {

                checkedOut = Arrays.copyOf(checkedOut, checkedOut.length + 1);
                checkedOut[checkedOut.length - 1] = b.getBookID();


                b.setAvailable(false);
            }
        }
    }
    
    // add the member to the wait list for an unavailable book
    public void addToWaitList(Book b){

        b.getWaitList().add(getMemberID());

    }

    // get the position on the wait list for a given book
    public int waitListStatus(Book b){
        int position = 0;

        for (int i = 0; i < b.getWaitList().size(); i++) {

            if (memberID == b.getWaitList().get(i)){
                position = i + 1;
            }

        }
        return position;
    }

}
