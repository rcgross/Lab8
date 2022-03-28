
public class Library {
  private Book book;
  private Account account;
  
  public Library (Book book, Account account) {
    this.book = book;
    this.account = account;
  }
  
  public static void main(String[] args) {
    Member mem1 = new Member("Harriet", 4);
    Book book1 = new Book(3, 34, false);
    Member mem2 = new Member("j", 2);

    mem1.checkout(book1);
    mem2.checkout(book1);

    System.out.println("The wait list includes members: " + book1.getWaitList());
    System.out.println("You are in place " + mem2.waitListStatus(book1) + " on the wait list");

  } 
}
