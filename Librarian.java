
public class Librarian extends Account{

	private String name; //name of librarian
	private int memberID; //id of librarian
	private Library library; //elements from library
	
	public Librarian (String name, int memberID, Library library) { //take constructor from Account class
		super(name, memberID);
		this.library = library;
	}
	
	public void addBook (Book b) { //add a book to the library
		library.getLOB().add(b);
	}
	
	public void removeBook (Book b) { //remove a book from the library
		for (int i = 0; i < library.getLOB().size(); i++) {
			if (library.getLOB().get(i) == b) {
				library.getLOB().remove(i);
			}
		}
	}
	
	
	
	
	
	
}
