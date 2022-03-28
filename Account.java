public class Account {

	// instance variables
    private String name;
    private int memberID;
    
    public Account (String name, int memberID) {
    	this.name = name;
    	this.memberID = memberID;
    }
    
    public String getName() {
    	return name;
    }

    public void setName(String n){
    	this.name = name;
    }

    public int getMemberID() {
    	return memberID;
    }

    public void setMemberID(int id) {
    	memberID = id;
    }
  
}
