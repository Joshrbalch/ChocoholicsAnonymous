package chocaholicsAnonymous;
/**
* The Member class holds all the information specific to members as well as accessing
* information from the Person class
*
* @author Liam Kelly
* @version 1.0
*/
public class Member extends Person{
	private String memberNum;
	
	private String memberStatus;
	
	
	 // Getter for memberNum
	  public String getmemberNum() {
	    return memberNum;
	  }

	  // Setter for memberNum
	  public void setmemberNum(String newmemberNum) {
	    this.memberNum = newmemberNum;
	  }
	  
	  // Getter for memberStatus
	  public String getmemberStatus() {
	    return memberStatus;
	  }

	  // Setter for memberStatus
	  public void setmemberStatus(String newmemberStatus) {
	    this.memberStatus = newmemberStatus;
	  }
}